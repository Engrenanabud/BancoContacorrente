public class ContaCorrente {

    String numero;
    String agencia;
    float saldo;
    boolean especial;
    float limiteEspecial;
    float valorSaque;


    boolean saque(double valorSaque) {

        if (valorSaque <= saldo) {

            saldo -= valorSaque;
            return true;

        } else {

            if (especial) {
                //armazena o valor que vc ficou de limite em caso da conta negativa.
                double limite = (limiteEspecial - saldo); //ex:-10 reais c 500 de limite, sobra 490 para usar de especial
                if (limite >= valorSaque) {
                    saldo -= valorSaque;
                    return true;
                } else {

                    return false;
                }


            }
        }
       return false;
    }

        void depositar(double valorDeposito){

        saldo += valorDeposito;
         System.out.println("Seu saldo é de"+ " "+ saldo);
        }

}





