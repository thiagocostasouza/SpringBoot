package br.com.trainner.alluraforum.controller.form;

import br.com.trainner.alluraforum.controller.repository.CursoRepository;
import br.com.trainner.alluraforum.modelo.Curso;
import br.com.trainner.alluraforum.modelo.Topico;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class TopicoForm {

    @NotEmpty @NotNull @Length(min = 5)
    private String titulo;
    @NotEmpty @NotNull @Length(min = 10)
    private String mensagem;
    @NotEmpty @NotNull
    private String nomeCurso;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Topico converter(CursoRepository cursoRepository) {
        Curso curso = cursoRepository.findByNome(nomeCurso);
        return new Topico(titulo, mensagem, curso);
    }
}
