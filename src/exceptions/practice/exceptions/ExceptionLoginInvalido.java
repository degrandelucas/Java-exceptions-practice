package exceptions.practice.exceptions;

public class ExceptionLoginInvalido extends RuntimeException {
    private String mensagem;

    public ExceptionLoginInvalido(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return mensagem;
    }
}
