package aula06.projeto;

public class Main {
       public static void main(String[] args) {
           double num1 = 10.0;
           double num2 = 5.0;
           char operador = Constantes.ADICAO; // Pode ser alterado para outros operadores

           double resultado = Calculadora.calcular(num1, num2, operador);

           System.out.println("Resultado: " + resultado);
       }
   }

