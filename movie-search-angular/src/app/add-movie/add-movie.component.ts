import { Component } from '@angular/core';
import { MovieModel } from '../model/movie-model';

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

}
