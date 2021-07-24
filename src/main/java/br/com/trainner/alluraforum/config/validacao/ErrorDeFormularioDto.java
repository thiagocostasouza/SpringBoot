package br.com.trainner.alluraforum.config.validacao;

public class ErrorDeFormularioDto {

    private String campo;
    private String erro;

    public ErrorDeFormularioDto(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }

    public String getCampo() {
        return campo;
    }

    public String getErro() {
        return erro;
    }
}
