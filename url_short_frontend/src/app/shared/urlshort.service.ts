// Import necessary modules for service implementation
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

// Injectable decorator to make the service injectable throughout the application
@Injectable({
  providedIn: 'root'
})
export class UrlShortenerService {

  // Base URL for the URL shortening service
  serviceUrl: string = '';

  // Constructor with dependency injection of the HttpClient service
  constructor(private http: HttpClient) { 
    // Initialize the service URL
    this.serviceUrl = "http://localhost:8080/url/shortener";
  }

  // Method to request a short URL from the server
  // Returns an Observable containing the response
  getShortUrl(url: string): Observable<any> {
    // Send a POST request to the server with the provided URL
    return this.http.post<any>(this.serviceUrl, url);
  }
}
