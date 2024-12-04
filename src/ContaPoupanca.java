public class ContaPoupanca extends Conta{

    public ContaPoupanca(User titular){
        super(titular);
    }


    @Override
    public void depositar(double valor){
        if(valor >= 2){
            balancePoupanca += valor;
            System.out.println("Deposito de R$" + valor + " realizado com sucesso");
        } else {
            System.out.println("Valor de deposito invalido!");
        }
    }

    @Override
    public boolean sacar(double valor){
        if(valor >= 5 && balancePoupanca >= valor){
            balancePoupanca -= valor;
            System.out.println("Efetuando saque de R$" + valor + " da sua conta.");
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque, consulte a sua conta bancaria!");
            return false;
        }
    }

}
