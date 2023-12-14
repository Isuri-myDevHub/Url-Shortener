// Import necessary modules for testing
import { ComponentFixture, TestBed } from '@angular/core/testing';

// Import the component to be tested
import { DashboardComponent } from './dashboard.component';

// Describe block for testing DashboardComponent
describe('DashboardComponent', () => {
  let component: DashboardComponent;            // Instance of the DashboardComponent
  let fixture: ComponentFixture<DashboardComponent>;  // Fixture for testing the DashboardComponent

  // Async setup before each test suite
  beforeEach(async () => {
    // Configure the testing module with the DashboardComponent
    await TestBed.configureTestingModule({
      declarations: [ DashboardComponent ]
    })
    .compileComponents();  // Compile the component templates
  });

  // Sync setup before each test case
  beforeEach(() => {
    // Create a fixture for the DashboardComponent
    fixture = TestBed.createComponent(DashboardComponent);
    
    // Retrieve the component instance from the fixture
    component = fixture.componentInstance;

    // Trigger change detection to update the component's view
    fixture.detectChanges();
  });

  // Test case: Check if the component is successfully created
  it('should create', () => {
    // Expect the component instance to be truthy (i.e., successfully created)
    expect(component).toBeTruthy();
  });
});
