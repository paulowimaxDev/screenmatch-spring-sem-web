package br.com.serius.screemmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SerieDados(
        @JsonAlias("Title") String Titulo,
        @JsonAlias("Year") String Ano,
        @JsonAlias("imdbRating") String avaliacao
) {
}
