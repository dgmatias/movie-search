import { Component, Input } from '@angular/core';
import { CategoryModel } from 'src/app/model/category-model';
import { MovieModel } from 'src/app/model/movie-model';

@Component({
  selector: 'mov-info',
  templateUrl: './info.component.html',
  styleUrls: ['./info.component.css']
})
export class InfoComponent {

  @Input() movie!: MovieModel;
  @Input() category!: CategoryModel;

  constructor() {
    // console.log(this.movie.id);
  }

}
