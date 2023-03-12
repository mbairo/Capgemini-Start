import { Component } from '@angular/core';
import { LoggerService } from '../logger.service';

@Component({
  selector: 'app-exemplo-servicos2',
  templateUrl: './exemplo-servicos2.component.html',
  styleUrls: ['./exemplo-servicos2.component.css']
})
export class ExemploServicos2Component {
  descricao = "";

  constructor(public logger: LoggerService){}
  adicionarProduto(){
    console.log(`A descrição do produto ${this.descricao} foi adicionada com sucesso!`)

      this.logger.logar(`O nome ${this.descricao} foi adicionado`);
  }

}
