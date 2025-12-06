public class TestaConta {
  public static void main(String[] args) throws SIException {
    // Conta c = new Conta("123-X", 8.0);
    Conta c = new Conta("123-X");
    System.out.println("Conta "+c.getNumero());
    System.out.println(" saldo "+c.getSaldo());
    System.out.println();
    c.creditar(10.0);
    c.debitar(5.0);
    System.out.println("Conta "+c.getNumero());
    System.out.println(" saldo "+c.getSaldo());

    Poupanca  poupanca;
    poupanca = new Poupanca("21.342-7");
    poupanca.creditar(500.87);
    poupanca.debitar(45.00);
    System.out.println(poupanca.getSaldo());
  } 
}