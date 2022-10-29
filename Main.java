import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner sc1 = new Scanner (System.in);
    double comissao = 0.17, venda, comissaoObtida;

  System.out.println("Olá, parabéns por mais uma venda! Nos informe o valor de sua venda para que possamos calcular sua comissão: ");
    venda = sc1.nextDouble();
    comissaoObtida = venda * comissao;
  System.out.println("Parabéns, sua comissão é de R$ " + comissaoObtida);
  }
}