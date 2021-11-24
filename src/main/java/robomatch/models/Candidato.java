package robomatch.models;

import robomatch.models.candidato.Cadastro;
import robomatch.models.candidato.Vaga;
import robomatch.models.candidato.cadastro.Habilidade;

import java.util.List;

public class Candidato {

    private Cadastro cadastro;

    private List<Vaga> vagas;

    public Candidato(
            Cadastro cadastro,
            List<Vaga> vagas
    ) {
        this.cadastro = cadastro;
        this.vagas = vagas;
    }

    public Cadastro getCadastro() {
        return cadastro;
    }

    public List<Vaga> getVagas() {
        return vagas;
    }
}
