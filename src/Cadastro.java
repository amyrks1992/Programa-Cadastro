import java.util.Scanner;
public class Cadastro {
    public static void main(String[] args) {

        Scanner userTeclado = new Scanner(System.in);

        Pessoa pes01 = new Pessoa();

        System.out.println("Digite o seu nome: ");
        String nome = userTeclado.nextLine();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = userTeclado.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = userTeclado.nextInt();

        System.out.println("Digite o seu CPF: ");
        int cpf = userTeclado.nextInt();

        System.out.println(nome + " " + sobrenome);
        System.out.println(idade + " anos ");
        System.out.println("CPF: " + cpf);
        System.out.println("O seu cadastro foi feito com sucesso!");


    }
}
