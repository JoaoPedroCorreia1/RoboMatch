# Robo Match
Feito pelo time Base2 no TechHunter 2021-2.

## Introdução
Serviço desenvolvido para obter matchs Candidato x Vaga, utiliza dados de planilhas google obtidas de formulários google.

## Requisitos
- Java 11
- Maven 3.6.3

## How to run
Utilize a função RoboMatch.getMatch() em src/main/java/RoboMatch/RoboMatch.java.

### Method Parameters
```java
public static List<String> getMatch(
            List<String> cargosFiltrar,

            List<String> senioridadesFiltrar,

            List<String> disponibilidadesLocalRemotoFiltrar,

            List<String> disponibilidadesPeriodoFiltrar,

            List<Habilidade> habilidadesFiltrar)
```
### Example
```java
List<String> emails = RoboMatch.getMatch(
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
## Candidato
- Cadastro
- Vagas

## Vagas
https://forms.gle/2ChAbYnsfbLHozEK9
```java
public Vaga(
            String email,

            List<String> cargosDejesados,
            String senioridade,
            List<String> disponibilidadeLocalRemoto,
            List<String> periodosDisponiveis)
```

## Cadastro
https://forms.gle/2ChAbYnsfbLHozEK9
```java
public Cadastro(
            String nome,
            String email,

            String cidade,
            String estado,

            String linkedin,
            String senioridadePreferencial,
            String formacao,

            String curriculo,

            List<Habilidade> habilidades)
```

### Habilidade
- nome
- nível (0 (nenhum) a 2 (avançado))
