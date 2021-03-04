public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private int cpf;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getSobrenome(){
        return sobrenome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public int getCpf(){
        return cpf;
    }
}
