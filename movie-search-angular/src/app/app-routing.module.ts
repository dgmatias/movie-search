import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { MoviesComponent } from './movies/movies.component';
import { MovieInfoComponent } from './movie-info/movie-info.component';

const routes: Routes = [
  {path: "", component: HomeComponent},
  {path: "movies/:id", component: MoviesComponent},
  {path: "movie-info/:id", component: MovieInfoComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
