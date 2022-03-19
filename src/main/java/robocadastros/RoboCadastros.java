package robocadastros;

import java.util.ArrayList;
import java.util.List;

import models.candidato.Cadastro;
import models.candidato.cadastro.Habilidade;
import sheetapi.service.CadastrosService;
import utils.CriadorHabilidades;
import utils.SeparadoCidadeEstado;

public class RoboCadastros {

    public static List<Cadastro> obterCadastros() {
        // obter dados
        List<String> nomeColuna = CadastrosService.getNomeColuna();

        List<String> emailColuna = CadastrosService.getEmailColuna();

        List<String> linkedinColuna = CadastrosService.getLinkedinColuna();

        List<String> senioridadePreferencialColuna = CadastrosService
                .getSenioridadePreferencialColuna();

        List<String> cidadeEstadoColuna = CadastrosService.getCidadeEstadoColuna();

        List<String> habilidadeNenhumaColuna = CadastrosService
                .getHabilidadeNenhumaColuna(
                        emailColuna.size());

        List<String> habilidadeConceitualColuna = CadastrosService
                .getHabilidadeConceitualColuna(
                        emailColuna.size());

        List<String> habilidadePraticanteColuna = CadastrosService
                .getHabilidadePraticanteColuna(
                        emailColuna.size());

        List<String> formacaoColuna = CadastrosService.getFormacaoColuna();

        List<String> curriculoColuna = CadastrosService.getCurriculoColuna();

        // iterar por linha

        List<Cadastro> cadastros = new ArrayList<>();

        int quantidadeCadastros = emailColuna.size();

        for (int i = 0; i < quantidadeCadastros; i++) {
            String nome = nomeColuna.get(i);

            String email = emailColuna.get(i);

            String linkedin = linkedinColuna.get(i);

            String senioridadePreferencial = senioridadePreferencialColuna.get(i);

            // cidadeEstado
            List<String> cidadeEstado = SeparadoCidadeEstado
                    .obterCidadeEstado(cidadeEstadoColuna.get(i));

            String cidade = cidadeEstado.get(0);
            String estado = cidadeEstado.get(1);

            // habilidades
            List<Habilidade> habilidades = CriadorHabilidades.criar(
                    habilidadeNenhumaColuna.get(i),
                    habilidadeConceitualColuna.get(i),
                    habilidadePraticanteColuna.get(i));

            String formacao = formacaoColuna.get(i);

            String curriculo = curriculoColuna.get(i);

            // para cada valor
            cadastros.add(
                    new Cadastro(
                            nome,
                            email,

                            cidade,
                            estado,

                            linkedin,
                            senioridadePreferencial,
                            formacao,

                            curriculo,

                            habilidades));
        }

        return cadastros;

    }

}
