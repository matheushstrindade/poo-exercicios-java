package listas.lista1_classes.ex4;

public class Gabarito {
    private char[] respostas = new char[15];

    public Gabarito() {
        respostas[0] = 'A';
        respostas[1] = 'B';
        respostas[2] = 'C';
        respostas[3] = 'D';
        respostas[4] = 'E';
        respostas[5] = 'A';
        respostas[6] = 'B';
        respostas[7] = 'C';
        respostas[8] = 'D';
        respostas[9] = 'E';
        respostas[10] = 'A';
        respostas[11] = 'B';
        respostas[12] = 'C';
        respostas[13] = 'D';
        respostas[14] = 'E';
    }

    public char respostaQuestao(int numeroQuestao) {
        if (numeroQuestao < 1 || numeroQuestao > 15) {
            throw new IllegalArgumentException("Número da questão deve estar entre 1 e 15");
        }
        return respostas[numeroQuestao - 1];
    }
}