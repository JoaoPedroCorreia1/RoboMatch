# Robo Match
Aplicativo desenvolvido para obter matchs candidato x vaga.
Feito pelo time Base2 no TechHunter 2021.

# Requisitos
- Java 1.8
- Maven 3.6.3

# How to run
É Possível obter um match acessando o método "getEmailsMatch" em src/main/java/RoboMatch que retorna uma lista de emails.

# Match
## Method Parameters
```
public static List<String> getEmailsMatch(
            List<String> cargosFiltrar,

            List<String> senioridadesFiltrar,

            List<String> disponibilidadesLocalRemotoFiltrar,

            List<String> disponibilidadesPeriodoFiltrar,

            List<Habilidade> habilidadesFiltrar)
```
## Example
```
List<String> emails = RoboMatch.getEmailsMatch(
                Arrays.asList(
                        "analista de segurança da informação"
                ),
                Arrays.asList(
                        "estagiário"
                ),
                Arrays.asList("Híbrido"),
                Arrays.asList("Manhã"),
                Arrays.asList(
                        new Habilidade(
                                "programação",
                                1),
                        new Habilidade(
                                "sql",
                                2)
                )
        );
```
# Habilidade
- nome
- nível (0 (nenhum) a 2 (avançado))