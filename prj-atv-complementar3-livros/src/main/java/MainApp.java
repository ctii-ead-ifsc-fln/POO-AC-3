public class MainApp {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setId(1);
        livro1.setTitulo("Java como programar");
        livro1.setEditora("Bookman");
        livro1.setIsbn("1231233");
        livro1.setAutor("Deitel");
        livro1.setPrecoCusto(125.0f);
        livro1.setMargemLucro(50.0f);
        //System.out.println("Livro 1: " + livro1.toString());

        Livro livro2 = new Livro(30.0f, 200.0f, "Atica", "Tanenbaum", "123213", "Redes de Computadores", 2);

        //System.out.println("Livro 2: " + livro2);

        print(livro1);
        print(livro2);
    }

    public static void print(Livro livro) {
        System.out.println(" **** DADOS DO LIVRO **** ");
        System.out.println("Título......: " + livro.getTitulo());
        System.out.println("Autor.......: " + livro.getAutor());
        System.out.println("Valor Venda.: " + livro.getPrecoVenda());
        System.out.println();
    }
}
