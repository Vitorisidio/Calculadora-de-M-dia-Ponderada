import java.util.Scanner;


public class Calculadora {

double nota1, nota2, nota3, notaFinal;
int peso1, peso2, peso3;
String nome;

    public void obterdados() {

        Scanner leitordouble = new Scanner(System.in);
        Scanner leitorString = new Scanner(System.in);
        Scanner leitorint = new Scanner(System.in);


        System.out.print("Digite o nome do Aluno: ");
        nome= leitorString.nextLine();

        System.out.print("Digite a NOTA da PRIMEIRA atividade do Aluno(A) " + nome + ": ");
        nota1= leitordouble.nextDouble();

        System.out.print("Digite o PESO da PRIMEIRA atividade do Aluno(A) " + nome + ": ");
        peso1= leitorint.nextInt();

        System.out.print("Digite a NOTA da SEGUNDA atividade do Aluno(A) " + nome + ": ");
        nota2= leitordouble.nextDouble();

        System.out.print("Digite o PESO da SEGUNDA atividade do Aluno(A) " + nome + ": ");
        peso2= leitorint.nextInt();

        System.out.print("Digite a NOTA da TERCEIRA atividade do Aluno(A) " + nome + ": ");
        nota3= leitordouble.nextDouble();

        System.out.print("Digite o PESO da TERCEIRA atividade do Aluno(A) " + nome + ": ");
        peso3= leitorint.nextInt();

        calcularMediaPonderada();

    }


    public void calcularMediaPonderada(){

        notaFinal  =  (nota1 * peso1 + nota2 * peso2 + nota3 * peso3)/ (peso1 + peso2 + peso3);


        exibirResultados();
    }
    public void exibirResultados(){

        System.out.println("ETAPA 1: MULTIPLIQUE A PRIMEIRA NOTA " + nota1 + " POR SEU PESO " + peso1 +" ");
        System.out.println("ETAPA 2: MULTIPLIQUE A SEGUNDA NOTA " + nota2 + " POR SEU PESO " + peso2 +" ");
        System.out.println("ETAPA 3: MULTIPLIQUE A TERCEIRA NOTA " + nota3 + " POR SEU PESO " + peso3 +" ");
        System.out.println("ETAPA 4: SOME TODOS OS RESULTADOS DA NOTA: " + (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) +" ");
        System.out.println("ETAPA 5: SOME TODOS OS RESULTADOS DO PESO: " + (peso1 + peso2 + peso3) +" ");
        System.out.println("ETAPA 6: DIVIDA A SOMA DOS PRODUTOS PELA SOMA DOS PESOS: " + (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) + "/" + (peso1 + peso2 + peso3) + " = " + notaFinal);

        System.out.print("MÉDIA FINAL DO ALUNO(A) "+ nome + " É DE: " + notaFinal);

    }

}
