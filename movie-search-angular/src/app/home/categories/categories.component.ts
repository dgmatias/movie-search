import { Component } from '@angular/core';
import { CategoryModel } from 'src/app/model/category-model';
import { CategoryService } from 'src/app/service/category-service';

@Component({
  selector: 'mov-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.css']
})
export class CategoriesComponent {

  categories: CategoryModel[] = [];

  constructor(private service: CategoryService) {

    this.service.listCategories().subscribe(data => this.categories = data);

  }

}
