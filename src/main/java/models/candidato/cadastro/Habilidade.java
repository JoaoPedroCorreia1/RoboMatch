package models.candidato.cadastro;

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

    @Override
    public String toString()
    {
        String s = "### Habilidade ###";
        s += "\n";

        s += "Nome: " + getNome();
        s += "\n";

        s += "Nível: " + getNivel();
        s += "\n";

        return s;
    }
    
}
