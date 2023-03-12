import { Component } from '@angular/core';
import { Celular } from '../types/Celular';

@Component({
  selector: 'app-renderizador-listas',
  templateUrl: './renderizador-listas.component.html',
  styleUrls: ['./renderizador-listas.component.css']
})
export class RenderizadorListasComponent {
  celulares: Celular [] = [
    {id: 1, nome: `Celular XL`, descricao: `Um celular grande`, esgotado: false},
    {id: 2, nome: `Celular Normal`, esgotado: false},
    {id: 3, nome: `Celular Mini`, descricao: `Um celular pequeno`, esgotado: true},
  ]
}
