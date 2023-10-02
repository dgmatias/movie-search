import { Component } from '@angular/core';
import { CategoryModel } from '../model/category-model';

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
    console.log(this.category);
  }

}
