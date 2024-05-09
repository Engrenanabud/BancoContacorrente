

public class Banco {

   public static void main(String[] args){


       ContaCorrente contaA = new ContaCorrente();

       contaA.numero = "123456";
       contaA.saldo = 500;
       contaA.limiteEspecial = 1000;


     // Método saque: O método retorna um booleano, deu certo, veio true
     //esse true é armazenado em saldopossaque que vai exibir o que foi retornado.
    boolean saldopossaque = contaA.saque(150);
    if (saldopossaque){

        System.out.println(contaA.saldo);
    } else {
        System.out.println("Você não tem saldo suficiente.");

    }

    //puxa o método depositar direto, sem retorno nenhum (void)
    contaA.depositar(200);












   }



}
