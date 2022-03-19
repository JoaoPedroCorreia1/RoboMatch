package models;

import models.candidato.Cadastro;
import models.candidato.Vaga;

import java.util.List;

public class Candidato {

    private final Cadastro cadastro;

    private final List<Vaga> vagas;

    public Candidato(
            Cadastro cadastro,
            List<Vaga> vagas) {
        this.cadastro = cadastro;
        this.vagas = vagas;
    }

    public Cadastro getCadastro() {
        return cadastro;
    }

    public List<Vaga> getVagas() {
        return vagas;
    }

    @Override
    public String toString() {
        String s = "### Candidato ###";
        s += "\n";

        s += cadastro.toString();

        for (Vaga vaga : vagas) {
            s += vaga.toString();
        }

        return s;
    }

}
