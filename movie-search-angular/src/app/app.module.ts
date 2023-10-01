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

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    BannerComponent,
    CategoriesComponent,
    CategoryComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
  ],
  providers: [CategoryService],
  bootstrap: [AppComponent]
})
export class AppModule { }
