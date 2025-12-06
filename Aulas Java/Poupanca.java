class Poupanca extends Conta {

public Poupanca (String numero) {
  super(numero);
}

public void renderJuros(double taxa) {
// errado:  double juros = this.saldo * taxa;
// errado:  this.saldo = this.saldo + juros;
  double juros = this.getSaldo() * taxa;
  this.creditar(juros);
}

}
