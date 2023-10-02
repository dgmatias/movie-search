import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { MovieModel } from "../model/movie-model";
import { HttpClient } from "@angular/common/http";
import { PRO_API } from "../app-api";

@Injectable()
export class MovieService {

    constructor(private http: HttpClient) {}

    listMovieByCategoryId(id: number): Observable<MovieModel[]> {
        return this.http.get<MovieModel[]>(`${PRO_API}/movie-search/rest/movie/listByCategoryId/${id}`);
    }

}