package Maven.Maven;

public class Curso {
    private String nome;
    private String descricao;
    private String link;

    public Curso(String nome, String descricao, String link) {
        this.nome = nome;
        this.descricao = descricao;
        this.link = link;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
    
}
