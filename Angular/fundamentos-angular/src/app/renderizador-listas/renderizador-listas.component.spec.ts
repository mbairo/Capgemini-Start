import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RenderizadorListasComponent } from './renderizador-listas.component';

describe('RenderizadorListasComponent', () => {
  let component: RenderizadorListasComponent;
  let fixture: ComponentFixture<RenderizadorListasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RenderizadorListasComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RenderizadorListasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
