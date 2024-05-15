import java.util.Scanner;
public class CadastroAluno {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Aluno[] alunos = new Aluno[5];

      
        for (int i=0; i < alunos.length; i++){
            System.out.println("Digite o nome do aluno: "+(i+1)+":");
            String nome = scanner.nextLine();
            System.out.println("Digite a idade do aluno: "+(i+1)+":");
            int idade = Integer.parseInt(scanner.nextLine());
            alunos[i] = new Aluno(nome, idade);
        }

      
        System.out.println("A lista de alunos é:");
        for(Aluno aluno: alunos){
            System.out.println("Nome aluno:"+aluno.getNome()+", Idade aluno:"+aluno.getIdade());
        }
    }
}
