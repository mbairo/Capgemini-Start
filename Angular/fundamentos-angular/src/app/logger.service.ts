import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoggerService {
  mensagens: string[] = [];
  logar(mensagem: string) {
    console.log(`Log de apenas uma msg: ${mensagem}`);
    this.mensagens.push(mensagem);
  }

  exibeTodosOsLogs() {
    console.log(`Log de todas as msg: ${this.mensagens}`);
  }
}
