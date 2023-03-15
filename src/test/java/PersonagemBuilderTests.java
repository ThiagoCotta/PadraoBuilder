import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemBuilderTests {

    @Test
    void deveRetornarExcecaoParaPersonagemSemId() {
        try {
            PersonagemBuilder personagemBuilder = new PersonagemBuilder();
            Personagem personagem = personagemBuilder
                    .setNome("ThorTheBeagle")
                    .setClasse("Guerreiro")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Id inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPersonagemSemNome() {
        try {
            PersonagemBuilder personagemBuilder = new PersonagemBuilder();
            Personagem personagem = personagemBuilder
                    .setId(1)
                    .setClasse("Mago")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarPersonagemValido() {
        PersonagemBuilder personagemBuilder = new PersonagemBuilder();
        Personagem personagem = personagemBuilder
                .setId(1)
                .setNome("ThorTheBeagle")
                .setClasse("Lutador")
                .build();

        assertNotNull(personagem);
    }
}