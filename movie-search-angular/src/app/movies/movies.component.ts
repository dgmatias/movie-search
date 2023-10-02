import { Component } from '@angular/core';
import { MovieModel } from '../model/movie-model';
import { ActivatedRoute } from '@angular/router';
import { MovieService } from '../service/movie-service';

@Component({
  selector: 'mov-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent {

  movies: MovieModel[] = [];
  id: number;

  constructor(private route: ActivatedRoute, private movieService: MovieService) {

    this.id = this.route.snapshot.params['id'];

    this.movieService.listMovieByCategoryId(this.id).subscribe(data => this.movies = data);

  }

}
