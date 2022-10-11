import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminMedicineRetrieveComponent } from './admin-medicine-retrieve.component';

describe('AdminMedicineRetrieveComponent', () => {
  let component: AdminMedicineRetrieveComponent;
  let fixture: ComponentFixture<AdminMedicineRetrieveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminMedicineRetrieveComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminMedicineRetrieveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
