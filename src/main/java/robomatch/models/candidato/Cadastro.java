package robomatch.models.candidato;

import robomatch.models.candidato.cadastro.Habilidade;

import java.util.List;

public class Cadastro {

    private String nome;
    private String email;

    private String cidade;
    private String estado;

    private String linkedin;
    private String senioridadePreferencial;
    private String formacao;

    private List<Habilidade> habilidades;




    public Cadastro(
            String nome,
            String email,

            String cidade,
            String estado,

            String linkedin,
            String senioridadePreferencial,
            String formacao,

            List<Habilidade> habilidades
    ) {
        this.nome = nome;
        this.email = email;

        this.cidade = cidade;
        this.estado = estado;

        this.linkedin = linkedin;
        this.senioridadePreferencial = senioridadePreferencial;
        this.formacao = formacao;

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

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

}
