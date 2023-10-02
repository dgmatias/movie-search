import { Component } from '@angular/core';
import { MovieModel } from '../model/movie-model';
import { ActivatedRoute } from '@angular/router';
import { MovieService } from '../service/movie-service';

@Component({
  selector: 'mov-movie-info',
  templateUrl: './movie-info.component.html',
  styleUrls: ['./movie-info.component.css']
})
export class MovieInfoComponent {

  movie!: MovieModel;
  id: number

  constructor(private route: ActivatedRoute, private movieService: MovieService) {
    this.id = this.route.snapshot.params['id'];

    this.movieService.listMovieById(this.id).subscribe(data => this.movie = data);


  }

}
