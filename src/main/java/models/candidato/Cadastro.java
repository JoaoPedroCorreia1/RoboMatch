package models.candidato;

import models.candidato.cadastro.Habilidade;

import java.util.List;

public class Cadastro {

    private final String nome;
    private final String email;

    private final String cidade;
    private final String estado;

    private final String linkedin;
    private final String senioridadePreferencial;
    private final String formacao;

    private final String curriculo;

    private final List<Habilidade> habilidades;

    public Cadastro(
            String nome,
            String email,

            String cidade,
            String estado,

            String linkedin,
            String senioridadePreferencial,
            String formacao,

            String curriculo,

            List<Habilidade> habilidades) {
        this.nome = nome;
        this.email = email;

        this.cidade = cidade;
        this.estado = estado;

        this.linkedin = linkedin;
        this.senioridadePreferencial = senioridadePreferencial;
        this.formacao = formacao;

        this.curriculo = curriculo;

        this.habilidades = habilidades;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public String getSenioridadePreferencial() {
        return senioridadePreferencial;
    }

    public String getFormacao() {
        return formacao;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    @Override
    public String toString() {
        String s = "### Cadastro ###";
        s += "\n";

        s += "Nome: " + getNome();
        s += "\n";

        s += "Email: " + getEmail();
        s += "\n";

        s += "Cidade: " + getCidade();
        s += "\n";

        s += "Estado: " + getEstado();
        s += "\n";

        s += "Linkedin: " + getLinkedin();
        s += "\n";

        s += "Senioridade Preferêncial: " + getSenioridadePreferencial();
        s += "\n";

        s += "Formação: " + getFormacao();
        s += "\n";

        s += "Curriculo: " + getCurriculo();
        s += "\n";

        for (Habilidade habilidade : habilidades) {
            s += habilidade.toString();
        }

        return s;
    }
}
