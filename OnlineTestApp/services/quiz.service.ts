import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class QuizService {
  constructor(private http: HttpClient) {}

  get(url: string) {
    return this.http.get(url);
  }

  getAll() {
    return [
      {
        id: 'data/javascript.json',
        name: 'JavaScript',
        description:
          "Let's Play javascript quiz .",
        imageUrl: 'assets/images/JS.png',
      },
      {
        id: 'data/aspnet.json',
        name: 'Asp.Net',
        description:
          "Let's Play Asp.Net quiz .",
        imageUrl: 'assets/images/ASP.png',
      },
      {
        id: 'data/csharp.json',
        name: 'C Sharp',
        description:
          "Let's Play C# quiz.",
        imageUrl: 'assets/images/CSHARP.png',
      },
    ];
  }
}
