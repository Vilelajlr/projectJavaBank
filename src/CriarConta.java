import java.util.Scanner;

public class CriarConta {

    Scanner scaner = new Scanner(System.in);

    public CriarConta(){

        System.out.println("Digite o seu Nome: ");
        String name = scaner.nextLine();
        System.out.println("Digite seu cpf: (Apenas numeros) ");
        long cpf = scaner.nextLong();

        scaner.nextLine();

        System.out.println("Digite seu endereco.");
        System.out.println("Rua");
        String rua = scaner.nextLine();

        System.out.println("Numero");
        int numero = scaner.nextInt();
        scaner.nextLine();

        System.out.println("Bairro");
        String bairro = scaner.nextLine();

        System.out.println("Cidade");
        String cidade = scaner.nextLine();

        System.out.println("Complemento");
        String complemento = scaner.nextLine();

        System.out.println("Criando a sua conta no banco!");

        Endereco endereco = new Endereco(rua,numero,bairro,cidade,complemento);
        User user1 = new User(name,cpf,endereco);
        ContaCorrente conta = new ContaCorrente(user1);

    }



}
