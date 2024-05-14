package Lista04.Cenario01;

public class Programa {
    public static void main(String[] args) {
        Livro livro1 = new Livro("1598FHK", "Core Java 2", new String[] { "Cay S. Horstmann", "Gary Cornell" },
                "0130819336", 2005);
        Livro livro2 = new Livro("9865PLO", "Java, Como programar", new String[] { "Harvey Deitel" }, "0130341517",
                2015);

        apresentarDados(livro1);
        apresentarDados(livro2);
    }

    public static void apresentarDados(Livro livro) {
        System.out.println("Código: " + livro.codigo);
        System.out.println("Título: " + livro.titulo);
        System.out.print("Autores: ");
        for (int i = 0; i < livro.autores.length; i++) {
            System.out.print(livro.autores[i]);
            if (i < livro.autores.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("ISBN: " + livro.isbn);
        System.out.println("Ano: " + livro.ano);
        System.out.println();
    }
}