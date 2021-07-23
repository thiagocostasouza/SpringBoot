package br.com.trainner.alluraforum.controller;

import br.com.trainner.alluraforum.controller.dto.TopicoDto;
import br.com.trainner.alluraforum.modelo.Curso;
import br.com.trainner.alluraforum.modelo.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class TopicosController {

    @RequestMapping("/topicos")

    public List<TopicoDto> list() {
        Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programação"));

        return TopicoDto.converter(Arrays.asList(topico));
    }
}
