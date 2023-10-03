import { Component } from '@angular/core';
import { CategoryModel } from '../model/category-model';
import { CategoryService } from '../service/category-service';

@Component({
  selector: 'mov-add-category',
  templateUrl: './add-category.component.html',
  styleUrls: ['./add-category.component.css']
})
export class AddCategoryComponent {

  category: CategoryModel = {
    id: 0,
    name: "",
    img: "",
  }

  constructor(private categoryService: CategoryService) {}

  onFileSelected(event: any) {
    const selectedFile = event.target.files[0];
    if (selectedFile) {
      // Você pode acessar informações sobre o arquivo selecionado, se necessário.
      console.log('Nome do arquivo:', selectedFile.name);
      
      // Aqui, você pode fazer o que precisa com o arquivo selecionado, como fazer o upload para um servidor.
      // Você também pode atribuir o nome do arquivo ao objeto evento, se desejar:
      this.category.img = selectedFile.name;
    }
  }

  onSubmit() {
    if (this.category.name.trim() !== "" && this.category.img.trim() !== "") {
      console.log(this.category);
  
      this.categoryService.addCategory(this.category).subscribe(() => this.categoryService.listCategories());
      alert("Gênero adicionando com sucesso");
    } else {
      console.error("Os campos name e img não podem estar vazios.");
      alert("Ocorreu algum erro");
    }
  }
  

}
