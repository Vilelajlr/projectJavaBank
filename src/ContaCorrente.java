public class ContaCorrente extends Conta{

    public ContaCorrente(User titular){
        super(titular);
        System.out.println("Seja Bem Vindo! " + getTitular());
        titular.mostrarInfo();
    }



    public boolean transferirParaPoupanca(double valor){
        if(valor > 0 && balanceCorrente >= valor){
            balanceCorrente -= valor;
            balancePoupanca += valor;
            System.out.println("Dinheiro transferido com sucesso para a conta Poupanca.");
            return true;
        } else {
            System.out.println("Ocorreu um erro na sua transferencia entre contas. Verifique com o seu banco.");
            return false;
        }
    }

    public boolean resgatarPoupanca(double valor){
        if(valor > 0 && balancePoupanca >= valor){
            balancePoupanca -= valor;
            balanceCorrente += valor;
            System.out.println("Dinheiro resgatado com sucesso para sua Conta Corrente.");
            return true;
        } else {
            System.out.println("Ocorreu um erro no resgate do valor informado. Verifique a sua conta.");
            return false;
        }
    }

    @Override
    public void depositar(double valor){
        if(valor >= 2){
            balanceCorrente += valor;
            System.out.println("Deposito de R$" + valor + " realizado com sucesso");
        } else {
            System.out.println("Valor de deposito invalido!");
        }
    }

    @Override
    public boolean sacar(double valor){
        if(valor >= 5 && balanceCorrente >= valor){
            balanceCorrente -= valor;
            System.out.println("Efetuando saque de R$" + valor + " da sua conta.");
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque, consulte a sua conta bancaria!");
            return false;
        }
    }

}
