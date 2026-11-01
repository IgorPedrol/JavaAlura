package Aula010_Heranca_Polimorfismo.Mensagens_Sobrecarga;

public class Main {
    public static void main(String[] args) {
        Notificador notificacao = new Notificador();

        notificacao.enviarMensagem("Olá!");
        notificacao.enviarMensagem("João", "Bom dia!");
        notificacao.enviarMensagem("Maria", "Atenção!", 2);
    }
}
