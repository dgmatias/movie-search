import { Component } from '@angular/core';
import { MovieModel } from '../model/movie-model';
import { CategoryModel } from '../model/category-model';
import { MovieService } from '../service/movie-service';
import { CategoryService } from '../service/category-service';

@Component({
  selector: 'mov-add-movie',
  templateUrl: './add-movie.component.html',
  styleUrls: ['./add-movie.component.css']
})
export class AddMovieComponent {

  
  movie: MovieModel = {
    id: 0,
    name: "",
    sinopse: "",
    duration: "",
    img_small: "",
    img_banner: "",
    category_id: 0
  }
  
  categories: CategoryModel[] = []
  
  constructor(private movieService: MovieService, private categoryService: CategoryService) {
    this.categoryService.listCategories().subscribe(data => this.categories = data);
  }
  
  onFileSelected(event: any) {
    const selectedFile = event.target.files[0];
    if (selectedFile) {
      // Você pode acessar informações sobre o arquivo selecionado, se necessário.
      console.log('Nome do arquivo:', selectedFile.name);
      
      // Aqui, você pode fazer o que precisa com o arquivo selecionado, como fazer o upload para um servidor.
      // Você também pode atribuir o nome do arquivo ao objeto evento, se desejar:
      this.movie.img_small = selectedFile.name;
    }
  }

  onFileSelected2(event: any) {
    const selectedFile = event.target.files[0];
    if (selectedFile) {
      // Você pode acessar informações sobre o arquivo selecionado, se necessário.
      console.log('Nome do arquivo:', selectedFile.name);
      
      // Aqui, você pode fazer o que precisa com o arquivo selecionado, como fazer o upload para um servidor.
      // Você também pode atribuir o nome do arquivo ao objeto evento, se desejar:
      this.movie.img_banner = selectedFile.name;
    }
  }


  onSubmit() {
    console.log(this.movie);

    this.movieService.addMovie(this.movie).subscribe(()=>this.movieService.listMovies() );
  }

}
