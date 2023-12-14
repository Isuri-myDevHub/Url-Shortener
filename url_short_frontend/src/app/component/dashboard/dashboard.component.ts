// Import required modules and services
import { Component, OnInit } from '@angular/core';
import { UrlShortenerService } from '../../shared/urlshort.service';

// Component decorator with metadata
@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  // Component properties
  url: string = "";                     // Input URL to be shortened
  originalUrl: string = "";             // Original URL fetched from the server
  isUrlGenerated: boolean = false;      // Flag indicating whether a short URL is successfully generated
  isErrorGenerated: boolean = false;     // Flag indicating whether an error occurred during URL generation
  shortUrl: string = "";                 // Shortened URL obtained from the server

  // Constructor with dependency injection of the UrlShortenerService
  constructor(private urlShortenerService: UrlShortenerService) { }

  // Lifecycle hook executed when the component is initialized
  ngOnInit(): void {
    this.isUrlGenerated = false;  // Initialize the flag indicating URL generation status
  }

  // Method to generate a short URL using the UrlShortenerService
  generateShortUrl() {
    // Call the UrlShortenerService to get a short URL
    this.urlShortenerService.getShortUrl(this.url).subscribe(
      // Success callback
      res => {
        // Check if the response is null, indicating an error
        if (res == null) {
          this.isErrorGenerated = true;  // Set the error flag
        } else {
          // Populate properties with the result from the server
          this.isUrlGenerated = true;
          this.isErrorGenerated = false;
          this.shortUrl = res.shorturl;
          this.originalUrl = res.originalurl;
        }
      },
      // Error callback
      err => {
        // Set flags to indicate error status
        this.isUrlGenerated = false;
        this.isErrorGenerated = true;
      }
    );
  }
}
