import { Component, Input } from '@angular/core';
import { MovieModel } from 'src/app/model/movie-model';

@Component({
  selector: 'mov-movie',
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.css']
})
export class MovieComponent {

  @Input() movie!: MovieModel;

}
