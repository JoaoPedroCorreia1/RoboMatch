package models.candidato;

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

    @Override
    public String toString()
    {
        String s = "### Vaga ###";
        s += "\n";

        s += "Email: " + getEmail();
        s += "\n";

        s += "Cargos Desejados: ";
        for(String cargoDesejado : getCargosDejesados())
        {
            s += cargoDesejado + ", ";
        }
        s += "\n";

        s += "Senioridade preferencial: " + getSenioridade();
        s += "\n";

        s += "Disponibilidades Local/Remoto: ";
        for(String localRemoto : getDisponibilidadeLocalRemoto())
        {
            s += localRemoto + ", ";
        }
        s += "\n";

        s += "Períodos disponíveis: ";
        for(String periodo : getPeriodosDisponiveis())
        {
            s += periodo + ", ";
        }
        s += "\n";

        return s;

    }


}
