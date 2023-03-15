
import java.util.Date;
public class Personagem {
    private int id;
    private String nome;
    private String classe;
    private String genero;
    private String raca;
    private String faccao;
    private int nivel;

    public Personagem() {
        this.id = 0;
        this.nome = "";
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getFaccao() {
        return raca;
    }
    public void setFaccao(String faccao) {
        this.faccao = faccao;
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
