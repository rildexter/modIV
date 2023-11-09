package aula06;
//aula dia 07/11
//ligada a classe calculadora
public class Calcular {
    public static void main(String[] args) {
        double raio1 = 5.0;
        double raio2 = 7.5;

        double area1 = Calculadora.calcularAreaCirculo(raio1);
        double area2 = Calculadora.calcularAreaCirculo(raio2);

        System.out.println("Área do primeiro círculo: " + area1);
        System.out.println("Área do segundo círculo: " + area2);
    }
}
