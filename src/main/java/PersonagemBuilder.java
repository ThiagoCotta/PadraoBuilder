import java.util.Date;

public class PersonagemBuilder {

    private Personagem personagem;

    public PersonagemBuilder() {
        personagem = new Personagem();
    }

    public Personagem build() {
        if (personagem.getId() == 0) {
            throw new IllegalArgumentException("Id inválido");
        }
        if (personagem.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return personagem;
    }

    public PersonagemBuilder setId(int id) {
        personagem.setId(id);
        return this;
    }

    public PersonagemBuilder setNome(String nome) {
        personagem.setNome(nome);
        return this;
    }

    public PersonagemBuilder setClasse(String classe) {
        personagem.setClasse(classe);
        return this;
    }

    public PersonagemBuilder setGenero(String genero) {
        personagem.setGenero(genero);
        return this;
    }
    public PersonagemBuilder setRaca(String raca) {
        personagem.setRaca(raca);
        return this;
    }

    public PersonagemBuilder setFaccao(String faccao) {
        personagem.setFaccao(faccao);
        return this;
    }

    public PersonagemBuilder setNivel(int nivel) {
        personagem.setNivel(nivel);
        return this;
    }
}
