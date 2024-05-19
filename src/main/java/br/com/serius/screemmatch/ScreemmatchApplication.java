package br.com.serius.screemmatch;

import br.com.serius.screemmatch.model.SerieDados;
import br.com.serius.screemmatch.service.ComsumeApi;
import br.com.serius.screemmatch.service.GeraDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreemmatchApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScreemmatchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ComsumeApi api = new ComsumeApi();
        var json = api.pegarDados("https://www.omdbapi.com/?t=smallville&apikey=308fd0e0");
        System.out.println(json);
        GeraDados geraDados = new GeraDados();
        SerieDados serie = geraDados.converteDados(json, SerieDados.class);
        System.out.println("Title: " + serie.Titulo());
        System.out.println("Year: " + serie.Ano());
        System.out.println("imdbRating: " + serie.avaliacao());

    }
}

