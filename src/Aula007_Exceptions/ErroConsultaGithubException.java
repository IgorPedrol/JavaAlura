package Aula007_Exceptions;

public class ErroConsultaGithubException extends RuntimeException {

    private String message;

    public ErroConsultaGithubException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
