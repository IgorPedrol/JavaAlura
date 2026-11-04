package Aula013_Optional;

public enum CodigoErro {

    BAD_REQUEST(400, "Bad Request - A requisição enviada possui sintaxe inválida ou não pode ser processada."),
    UNAUTHORIZED(401, "Unauthorized - A requisição requer autenticação do usuário."),
    FORBIDDEN(403, "Forbidden - O servidor entendeu a requisição, mas se recusa a autorizá-la (sem permissão)."),
    NOT_FOUND(404, "Not Found - O recurso solicitado não foi encontrado no servidor."),
    TEAPOT(418, "I'm a teapot - O servidor recusa-se a coar café porque é um bule de chá (Easter egg do protocolo HTTP)."),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error - O servidor encontrou uma condição inesperada e falhou.");

    private final int codigo;
    private final String descricao;

    // Construtor
    CodigoErro(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
