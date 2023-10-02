import { Component, Input } from '@angular/core';
import { MovieModel } from 'src/app/model/movie-model';

@Component({
  selector: 'mov-info-banner',
  templateUrl: './info-banner.component.html',
  styleUrls: ['./info-banner.component.css']
})
export class InfoBannerComponent {

  @Input() movie!: MovieModel;

}
