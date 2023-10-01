import { Component, Input } from '@angular/core';
import { CategoryModel } from 'src/app/model/category-model';

@Component({
  selector: 'mov-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent {
  @Input() category!: CategoryModel;
}
