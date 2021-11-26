package robomatch.models.candidato;

import java.util.List;

public class Vaga {

    private String email;

    private List<String> cargosDejesados;
    private String senioridade;
    private List<String> disponibilidadeLocalRemoto;
    private List<String> periodosDisponiveis;

    public Vaga(
            String email,

            List<String> cargosDejesados,
            String senioridade,
            List<String> disponibilidadeLocalRemoto,
            List<String> periodosDisponiveis
    ) {
        this.email = email;

        this.cargosDejesados = cargosDejesados;
        this.senioridade = senioridade;
        this.disponibilidadeLocalRemoto = disponibilidadeLocalRemoto;
        this.periodosDisponiveis = periodosDisponiveis;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getCargosDejesados() {
        return cargosDejesados;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public List<String> getDisponibilidadeLocalRemoto() {
        return disponibilidadeLocalRemoto;
    }

    public List<String> getPeriodosDisponiveis() {
        return periodosDisponiveis;
    }

}
