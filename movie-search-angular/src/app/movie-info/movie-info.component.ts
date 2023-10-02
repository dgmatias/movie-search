import { Component } from '@angular/core';
import { MovieModel } from '../model/movie-model';
import { ActivatedRoute } from '@angular/router';
import { MovieService } from '../service/movie-service';
import { CategoryModel } from '../model/category-model';
import { CategoryService } from '../service/category-service';

@Component({
  selector: 'mov-movie-info',
  templateUrl: './movie-info.component.html',
  styleUrls: ['./movie-info.component.css']
})
export class MovieInfoComponent {

  movie!: MovieModel;
  category!: CategoryModel
  id: number

  constructor(private route: ActivatedRoute, private movieService: MovieService, private categoryService: CategoryService) {
    this.id = this.route.snapshot.params['id'];

    this.categoryService.listCategoryById(this.id).subscribe(data => this.category = data);
    this.movieService.listMovieById(this.id).subscribe(data => this.movie = data);


  }

}
