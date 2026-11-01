package Aula001;

public class Ordenacao {

    public int lucroMaximo(int[] A) {
        if (A.length < 2) return 0;

        int menorPrecoVisto = A[0];
        int lucroMaximo = 0;

        for (int i = 1; i < A.length; i++) {
            System.out.println("Iteração "+ i + ": " + menorPrecoVisto + " e " + lucroMaximo);
            // Qual seria o lucro se eu vendesse hoje?
            int lucroAtual = A[i] - menorPrecoVisto;

            // Atualiza o lucro máximo se necessário
            if (lucroAtual > lucroMaximo) {
                lucroMaximo = lucroAtual;
            }

            // Atualiza o menor preço visto para os próximos dias
            if (A[i] < menorPrecoVisto) {
                menorPrecoVisto = A[i];
            }
        }
        return lucroMaximo;
    }
}
