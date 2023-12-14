// Import necessary modules for testing
import { TestBed } from '@angular/core/testing';

// Import the service to be tested
import { UrlShortenerService } from './urlshort.service';

// Describe block for testing UrlShortenerService
describe('UrlShortenerService', () => {
  let service: UrlShortenerService;  // Instance of the UrlShortenerService

  // Setup before each test case
  beforeEach(() => {
    // Configure the testing module
    TestBed.configureTestingModule({});

    // Inject the UrlShortenerService instance
    service = TestBed.inject(UrlShortenerService);
  });

  // Test case: Check if the service is successfully created
  it('should be created', () => {
    // Expect the service instance to be truthy (i.e., successfully created)
    expect(service).toBeTruthy();
  });
});
