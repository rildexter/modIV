public class Frutas {
    public static void main(String[] args) {
        // Declaração da matriz de frutas e cores
        String[][] frutasECores = {
            {"Maçã", "Vermelha"},
            {"Banana", "Amarela"},
            {"Uva", "Roxa"},
            {"Laranja", "Laranja"},
            {"Pera", "Verde"}
        };

        // Exibição das frutas e cores armazenadas
        System.out.println("Frutas e suas Cores:");
        for (int i = 0; i < frutasECores.length; i++) {
            String fruta = frutasECores[i][0];
            String cor = frutasECores[i][1];
            System.out.println("Fruta: " + fruta + ", Cor: " + cor);
        }
    }
}
