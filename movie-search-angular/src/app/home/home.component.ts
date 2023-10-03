import { Component } from '@angular/core';
import { MovieService } from '../service/movie-service';
import { MovieModel } from '../model/movie-model';

@Component({
  selector: 'mov-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

  movie!: MovieModel;

  constructor(private movieService: MovieService) {
    this.movieService.listMovieRandom().subscribe(data => this.movie = data);
  }

  ngOnInit() {

    setInterval( ()=>{
      console.log("A imagem do banner foi trocada");
      this.movieService.listMovieRandom().subscribe(data => this.movie = data);
    }, 5000 )

  }

}
