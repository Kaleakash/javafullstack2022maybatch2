import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserMedicineRetrieveComponent } from './user-medicine-retrieve.component';

describe('UserMedicineRetrieveComponent', () => {
  let component: UserMedicineRetrieveComponent;
  let fixture: ComponentFixture<UserMedicineRetrieveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UserMedicineRetrieveComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UserMedicineRetrieveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
