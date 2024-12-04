

public class User {

    private String name;
    private long cpf;
    private String email;
    private Endereco endereco;



    public User(String nome, long cpf, Endereco endereco){
        this.setName(nome);
        this.setCpf(cpf);
        this.setEndereco(endereco);
    }


    public void mostrarInfo(){
        System.out.println("Nome: " + getName());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereco: " + getEndereco());
    }


    public String getName() {
        return name;
    }


    private void setName(String name) {
        this.name = name;
    }


    public long getCpf() {
        return cpf;
    }


    private void setCpf(long cpf) {
        this.cpf = cpf;
    }


    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
