package aula01;
class hello{
    public static void main(String[] args) {
        int idade = 18;
        boolean temPermissao = true;
if (temPermissao) {
    if (idade >= 18) {
        System.out.println("Você pode entrar na festa.");
    } else {
        System.out.println("Você não tem idade suficiente para entrar na festa.");
    }
} else {
    System.out.println("Você não tem permissão para entrar na festa.");
}

    }
}