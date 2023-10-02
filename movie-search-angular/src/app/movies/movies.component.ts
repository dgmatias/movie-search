import { Component } from '@angular/core';
import { MovieModel } from '../model/movie-model';
import { ActivatedRoute } from '@angular/router';
import { MovieService } from '../service/movie-service';
import { CategoryModel } from '../model/category-model';
import { CategoryService } from '../service/category-service';

@Component({
  selector: 'mov-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent {

  movies: MovieModel[] = [];
  category!: CategoryModel;
  id: number;

  constructor(private route: ActivatedRoute, private movieService: MovieService, private categoryService: CategoryService) {

    this.id = this.route.snapshot.params['id'];

    this.categoryService.listCategoryById(this.id).subscribe(data => this.category = data);
    this.movieService.listMovieByCategoryId(this.id).subscribe(data => this.movies = data);

  }

}
