import { Injectable } from "@angular/core";
import { HttpClient} from "@angular/common/http";
import { Observable } from "rxjs";
import { CategoryModel } from "../model/category-model";
import { PRO_API } from "../app-api";
import { MovieModel } from "../model/movie-model";

@Injectable()
export class CategoryService {

    constructor(private http: HttpClient) {}

    listCategories(): Observable<CategoryModel[]> {
        return this.http.get<CategoryModel[]>(`${PRO_API}/movie-search/rest/category/list`);
    }

    listCategoryById(id: number): Observable<CategoryModel> {
        return this.http.get<CategoryModel>(`${PRO_API}/movie-search/rest/category/category/${id}`);
    }

    listCategoryByMovieId(movie: MovieModel): Observable<CategoryModel> {
        // console.log(`${PRO_API}/movie-search/rest/category/category/${movie.id}`);
        return this.http.get<CategoryModel>(`${PRO_API}/movie-search/rest/category/category/${movie.category_id}`);

    }

    addCategory(category: CategoryModel) {
        return this.http.post(`${PRO_API}/movie-search/rest/category/category/`, category);
    }

}