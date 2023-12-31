import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { BannerComponent } from './home/banner/banner.component';
import { CategoriesComponent } from './home/categories/categories.component';
import { CategoryComponent } from './home/categories/category/category.component';
import { CategoryService } from './service/category-service';
import { HttpClientModule } from '@angular/common/http';
import { MoviesComponent } from './movies/movies.component';
import { MovieComponent } from './movies/movie/movie.component';
import { MovieService } from './service/movie-service';
import { MovieInfoComponent } from './movie-info/movie-info.component';
import { InfoComponent } from './movie-info/info/info.component';
import { InfoBannerComponent } from './movie-info/info-banner/info-banner.component';
import { AddCategoryComponent } from './add-category/add-category.component';
import { FormsModule } from '@angular/forms';
import { AddMovieComponent } from './add-movie/add-movie.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { PopUpComponent } from './pop-up/pop-up.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    BannerComponent,
    CategoriesComponent,
    CategoryComponent,
    MoviesComponent,
    MovieComponent,
    MovieInfoComponent,
    InfoComponent,
    InfoBannerComponent,
    AddCategoryComponent,
    AddMovieComponent,
    PopUpComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    BrowserAnimationsModule,
  ],
  providers: [CategoryService, MovieService],
  bootstrap: [AppComponent]
})
export class AppModule { }
