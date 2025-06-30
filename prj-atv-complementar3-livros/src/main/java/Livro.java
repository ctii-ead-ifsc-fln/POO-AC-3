public class Livro {
    private int id;
    private String titulo;
    private String isbn;
    private String autor;
    private String editora;
    private float precoCusto;
    private float precoVenda;
    private float margemLucro;

    public Livro() {
    }

    public Livro(float margemLucro, float precoCusto, String editora, String autor, String isbn, String titulo, int id) {
        this.margemLucro = margemLucro;
        this.precoCusto = precoCusto;
        this.editora = editora;
        this.autor = autor;
        this.isbn = isbn;
        this.titulo = titulo;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public float getPrecoVenda() {
        return precoVenda = calcularPrecoVenda();
    }

    public float getMargemLucro() {
        return margemLucro;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public void setMargemLucro(float margemLucro) {
        this.margemLucro = margemLucro;
    }

    public float calcularPrecoVenda() {
        //float valorDeVenda = precoCusto + (precoCusto * margemLucro / 100.0f);
        //return valorDeVenda;
        return precoCusto + (precoCusto * margemLucro / 100.0f);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", precoCusto=" + precoCusto +
                ", precoVenda=" + getPrecoVenda() +
                ", margemLucro=" + margemLucro +
                '}';
    }
}
