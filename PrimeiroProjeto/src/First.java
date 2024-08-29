public class First {
    public static void main(String[] args) {
        System.out.println("Hello Word!"); // println serve para pular uma linha apos o texto

        String xdb = "teste";
        System.out.println(xdb);
        int idade = 20;
        Double media = 1.5;
        boolean aprovado = false;

        if (idade >= 18) {
            System.out.println("ja pode ser preso!");
        } else if (idade <18 && idade >= 16){
            System.out.println("Só soco no estomago");
        } else {
            System.out.println("Vai para o conselho");
        }

        switch (xdb){
            case "a":
                aprovade = true;
                break;
            default:
                aprovado = false;
                break;
        }

    }
}
