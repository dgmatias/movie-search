import { Component, Input } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CategoryModel } from 'src/app/model/category-model';
import { MovieModel } from 'src/app/model/movie-model';
import { MovieService } from 'src/app/service/movie-service';

@Component({
  selector: 'mov-info',
  templateUrl: './info.component.html',
  styleUrls: ['./info.component.css']
})
export class InfoComponent {

  @Input() movie!: MovieModel;
  @Input() category!: CategoryModel;

}
