import java.util.Scanner;

public class IMC {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String nome;
        float peso,
              altura,
              imc;

        System.out.print("Qual seu nome ? ");
        nome = input.nextLine();

        System.out.print("Informe seu peso: ");
        peso = input.nextFloat();

        System.out.print("Informe sua altura: ");
        altura = input.nextFloat();
        
        imc = peso / (altura * altura);

        System.out.printf("%s, seu IMC \u00e9: %.2f", nome,  imc);
    
        if (imc >= 40) {
            System.out.printf(" e voce esta no estagio de Obesidade grau III (Morbida)");
        } else if (imc >= 35 && imc < 40) {
            System.out.printf(" e voce esta no estagio de Obesidade grau II (Severa)");
        } else if (imc >= 30 && imc < 35) {
            System.out.printf(" e voce esta no estagio de Obesidade grau I");
        } else if (imc >= 25 && imc < 30) {
            System.out.printf(" e voce esta Sobrepeso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.printf(" e voce esta Saudavel");
        } else if (imc >= 17 && imc < 18.5) {
            System.out.printf(" e voce esta no estagio de Magreza leve");
        } else if (imc >= 16 && imc < 17) {
            System.out.printf(" e voce esta no estagio de Magreza moderada");
        } else if (imc < 16) {
            System.out.printf(" e voce esta no estagio de Magreza grave");
        }
    }
}