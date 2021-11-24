package robomatch.models.candidato.cadastro;

public class Habilidade {

    private String nome;

    private int nivel;

    public Habilidade(String nome, int nivel)
    {
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome()
    {
        return nome;
    }

    public int getNivel()
    {
        return nivel;
    }
    
}
