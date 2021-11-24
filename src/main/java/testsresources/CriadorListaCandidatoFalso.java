package testsresources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import robomatch.models.Candidato;
import robomatch.models.candidato.cadastro.Habilidade;

public class CriadorListaCandidatoFalso
{
    static List<Candidato> candidatos;

    public static List<Candidato> criar()
    {
        candidatos = new ArrayList<Candidato>();

        // Candidatos
        candidatos = adicionarJoao();

        candidatos = adicionarMatheus();

        candidatos = adicionarEduardo();
        
        return candidatos;
    }

    private static List<Candidato> adicionarJoao()
    {

        candidatos = CriadorCandidatoFalso.adicionarCandidato(
                            
            candidatos,

            // Email
            "joao@gmail.com",

            // Cargos desejados
            Arrays.asList(
                new String("Analista de Testes Manuais")
            ),

            // Habilidades
            Arrays.asList(
                new Habilidade("Programação", 1),

                new Habilidade("SQL", 1)
            )

        );

        return candidatos;

    }

    private static List<Candidato> adicionarMatheus()
    {

        candidatos = CriadorCandidatoFalso.adicionarCandidato(
                            
            candidatos,

            // Email
            "matheus@gmail.com",

            // Cargos desejados
            Arrays.asList(
                new String("Analista de Testes Automatizados")
            ),

            // Habilidades
            Arrays.asList(
                new Habilidade("Programação", 1),

                new Habilidade("Testes Automáticos", 1)
            )

        );

        return candidatos;

    }

    private static List<Candidato> adicionarEduardo()
    {

        candidatos = CriadorCandidatoFalso.adicionarCandidato(
                            
            candidatos,

            // Email
            "eduardo@gmail.com",

            // Cargos desejados
            Arrays.asList(
                new String("Analista de Testes Automatizados")
            ),

            // Habilidades
            Arrays.asList(
                new Habilidade("Programação", 1),

                new Habilidade("Testes Manuais", 1)
            )

        );

        return candidatos;

    }

}