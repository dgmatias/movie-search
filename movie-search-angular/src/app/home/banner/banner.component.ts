import { Component, Input } from '@angular/core';
import { MovieModel } from 'src/app/model/movie-model';

@Component({
  selector: 'mov-banner',
  templateUrl: './banner.component.html',
  styleUrls: ['./banner.component.css']
})
export class BannerComponent {
  @Input() movie!: MovieModel;
}
