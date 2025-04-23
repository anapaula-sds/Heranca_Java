import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //CADASTRO DE ALUNOS DO PRIMARIO

        Primario alunoPrimario = new Primario();

        System.out.println("Entre com o nome do Aluno: ");
        alunoPrimario.nome = sc.nextLine();

        System.out.println("Entre com a Matricula do Aluno: ");
        alunoPrimario.matricula = sc.nextInt();
        sc.nextLine(); // Limpa o Enter

        System.out.println("Entre com a Idade do Aluno: ");
        alunoPrimario.idade = sc.nextInt();
        sc.nextLine(); // Limpa o Enter

        System.out.println("Entre com o Curso do Aluno: ");
        alunoPrimario.curso = sc.nextLine();

        System.out.println("O Aluno usa fraldas? ");
        alunoPrimario.usaFraldas = sc.nextBoolean();
        sc.nextLine(); // Limpa o Enter

        System.out.println("O Aluno participa da Contação de Historia? ");
        alunoPrimario.contacaoHistoria = sc.nextBoolean();
        sc.nextLine(); // Limpa o Enter antes de usar nextLine()

        System.out.println("Qual Alimentação do Aluno? ");
        alunoPrimario.alimentacao = sc.nextLine();


        System.out.println("O Primeiro Aluno do Primario é: \n" + "Nome: " + alunoPrimario.nome + "\n"
        + "Idade: " + alunoPrimario.idade + "\n" + "Está cursando o: " + alunoPrimario.curso + "\n" + "Usa Fraldas? " + alunoPrimario.usaFraldas +
                "\n" + "Participa da Hora da Historia? " + alunoPrimario.contacaoHistoria + "\n" + "Tipo de Alimentação: " + alunoPrimario.alimentacao);

        System.out.println("**************************************************************");

        Fundamental_I alunoFundamentalI = new Fundamental_I();

        System.out.println("Entre com o nome do Aluno: ");
        alunoFundamentalI.nome = sc.nextLine();

        System.out.println("Entre com a Matricula do Aluno: ");
        alunoFundamentalI.matricula = sc.nextInt();
        sc.nextLine(); // Limpa o Enter

        System.out.println("Entre com a Idade do Aluno: ");
        alunoFundamentalI.idade = sc.nextInt();
        sc.nextLine(); // Limpa o Enter

        System.out.println("Entre com o Curso do Aluno: ");
        alunoFundamentalI.curso = sc.nextLine();

        System.out.println("Qual o Nível de Leitura do Aluno? ");
        alunoFundamentalI.nivelDeLeitura = sc.nextLine();

        System.out.println("O Aluno Participa de Reforço Escolar? ");
        alunoFundamentalI.participaReforcoEscolar = sc.nextBoolean();
        sc.nextLine(); // Limpa o Enter antes de usar nextLine()

        System.out.println("O Aluno Pode Sair Sozinho? ");
        alunoFundamentalI.podeSairSozinho = sc.nextBoolean();
        sc.nextLine();


        System.out.println("O Primeiro Aluno do Fundamental I é: \n" + "Nome: " + alunoFundamentalI.nome + "\n"
                + "Idade: " + alunoFundamentalI.idade + "\n" + "Está cursando o: " + alunoFundamentalI.curso + "\n" + "Nível Leitura? " + alunoFundamentalI.nivelDeLeitura +
                "\n" + "Participa de Reforço Escolar? " + alunoFundamentalI.participaReforcoEscolar + "\n" + "Pode Sair Sozinho? : " + alunoFundamentalI.podeSairSozinho);

        System.out.println("**************************************************************");

        Fundamental_II alunoFundamentalII = new Fundamental_II();

        System.out.println("Entre com o nome do Aluno: ");
        alunoFundamentalII.nome = sc.nextLine();

        System.out.println("Entre com a Matricula do Aluno: ");
        alunoFundamentalII.matricula = sc.nextInt();
        sc.nextLine(); // Limpa o Enter

        System.out.println("Entre com a Idade do Aluno: ");
        alunoFundamentalII.idade = sc.nextInt();
        sc.nextLine(); // Limpa o Enter

        System.out.println("Entre com o Curso do Aluno: ");
        alunoFundamentalII.curso = sc.nextLine();

        System.out.println("Qual Orientação Vocacional do Aluno? ");
        alunoFundamentalII.orientacaoVocacional = sc.nextLine();

        System.out.println("O Aluno Participa de Projetos Sociais? ");
        alunoFundamentalII.participaDeProjetosSociais = sc.nextBoolean();
        sc.nextLine(); // Limpa o Enter

        System.out.println("Qual Nivel de Raciocinio Lógico do Aluno? ");
        alunoFundamentalII.nivelDeRaciocinioLogico = sc.nextLine();

        System.out.println("O Primeiro Aluno do Fundamental II é: \n" + "Nome: " + alunoFundamentalII.nome + "\n"
                + "Idade: " + alunoFundamentalII.idade + "\n" + "Está cursando o: " + alunoFundamentalII.curso + "\n" + "Orientação Vacacional do Aluno? " + alunoFundamentalII.orientacaoVocacional +
                "\n" + "Participa de Projetos Sociais? " + alunoFundamentalII.participaDeProjetosSociais + "\n" + "Raciocinio Lógico? : " + alunoFundamentalII.nivelDeRaciocinioLogico);

        System.out.println("**************************************************************");

        Medio alunoMedio = new Medio();

        System.out.println("Entre com o nome do Aluno: ");
        alunoMedio.nome = sc.nextLine();

        System.out.println("Entre com a Matricula do Aluno: ");
        alunoMedio.matricula = sc.nextInt();
        sc.nextLine(); // Limpa o Enter

        System.out.println("Entre com a Idade do Aluno: ");
        alunoMedio.idade = sc.nextInt();
        sc.nextLine(); // Limpa o Enter

        System.out.println("Entre com o Curso do Aluno: ");
        alunoMedio.curso = sc.nextLine();

        System.out.println("O Aluno Trabalha? ");
        alunoMedio.trabalha = sc.nextBoolean();

        System.out.println("Qual o Curso Integrado? ");
        alunoMedio.CursoIntegrado = sc.nextLine();
        sc.nextLine(); // Limpa o Enter

        System.out.println("O Aluno realiza ENEM? ");
        alunoMedio.realizaEnem = sc.nextBoolean();
        sc.nextLine(); // Limpa o Enter

        System.out.println("O Primeiro Aluno do Ensino Médio é: \n" + "Nome: " + alunoMedio.nome + "\n"
                + "Idade: " + alunoMedio.idade + "\n" + "Está cursando o: " + alunoMedio.curso + "\n" + "O ALuno Trabalha? " + alunoMedio.trabalha +
            "\n" + "Qual o Curso Integrado? " + alunoMedio.CursoIntegrado + "\n" + "Realiza ENEM? : " + alunoMedio.realizaEnem);

    }
}