package robomatch.models.candidato;

import java.util.List;

public class Vaga {

    private List<String> cargosDejesados;
    private List<String> senioridades;
    private List<String> disponibilidadeLocalRemoto;
    private List<String> periodosDisponiveis;

    public Vaga(
            List<String> cargosDejesados,
            List<String> senioridades,
            List<String> disponibilidadeLocalRemoto,
            List<String> periodosDisponiveis
    ) {
        this.cargosDejesados = cargosDejesados;
        this.senioridades = senioridades;
        this.disponibilidadeLocalRemoto = disponibilidadeLocalRemoto;
        this.periodosDisponiveis = periodosDisponiveis;
    }

    public List<String> getCargosDejesados() {
        return cargosDejesados;
    }

    public List<String> getsenioridades() {
        return senioridades;
    }

    public List<String> getDisponibilidadeLocalRemoto() {
        return disponibilidadeLocalRemoto;
    }

    public List<String> getPeriodosDisponiveis() {
        return periodosDisponiveis;
    }

}
