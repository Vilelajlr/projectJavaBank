import java.util.Random;

public abstract class  Conta {

    protected double balanceCorrente;
    protected double balancePoupanca;
    protected int agency;
    protected int numberOfAccount;
    protected User titular;
    private Random rand;



    protected Conta(User titular){
        this.titular = titular;
        this.balanceCorrente = 0.0;
        this.balancePoupanca = 0.0;
        this.agency = 3;
        rand = new Random();
        this.numberOfAccount = rand.nextInt(10000001);
    }


    public abstract void depositar(double valor);
    public abstract boolean sacar(double valor);



    public String getTitular(){
        return titular.getName();
    }

  public double getBalanceCorrente(){
        return balanceCorrente;
  }

    public double getBalancePoupanca(){
        return balancePoupanca;
    }





}
