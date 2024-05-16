import java.io.*;
import java.util.Random;
public class ClasseMetodos{
    Random random = new Random();
    int qtdEleitores[] = new int[10];
    int qtdVotos[] = new int[300];
    public Votacao[] FCadastra(Votacao[] votacao){
        for (int i = 0; i < 200; i++){
            votacao[i].numeroSecao = random.nextInt(10);
            votacao[i].numeroCandidato = random.nextInt(300);
        }
        return votacao;
    }
    public Votacao[] FClassificaSecao(Votacao[] votacao){
        for (int i = 0; i < 9; i++){
            for (int j = (i+1); j < 10; j++){
                if (votacao[i].numeroSecao > votacao[j].numeroSecao){
                    int aux = votacao[i].numeroSecao;
                    votacao[i].numeroSecao = votacao[j].numeroSecao;
                    votacao[j].numeroSecao = aux;
                }
            }
        }
        return votacao;
    }
    public Votacao[] FGravaVotacao(Votacao[] votacao) throws IOException {
        String fileName = "Votação2021.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        for (int i = 0; i < 200; i++){
            writer.write(Integer.toString(votacao[i].numeroSecao));
            writer.write(Integer.toString(votacao[i].numeroCandidato));
        }
        System.out.println("GRAVAÇÃO FEITA COM SUCESSO!");
        writer.close();
        return votacao;
    }

    public void PQtdEleitoresPorSecao(Votacao[] votacao){
        for (int i = 0; i < 200; i++){
            qtdEleitores[votacao[i].numeroSecao]++;
        }

        for(int i = 0; i < 10; i++){
            System.out.println("A quantidade de eleitores na seção " +i+ " é: " +qtdEleitores[i]);
        }
    }
    public void PMaiorEMenor(){
        int maior = 0, menor = 9999, maiorI = 0, menorI = 0;
        for (int i = 0; i < 10; i++) {
            if (qtdEleitores[i] > maior) {
                maior = qtdEleitores[i];
                maiorI = i;
            }
            if (qtdEleitores[i] < menor) {
                menor = qtdEleitores[i];
                menorI = i;
            }
        }
        System.out.println("maior = " + maior + " - menor = " + menor);
    }
    public void PVotosPorCandidato(Votacao[] votacao){
        for (int i = 0; i < 200; i++){
            qtdVotos[votacao[i].numeroCandidato]++;
        }
        for (int i = 0; i < 300; i++){
            System.out.println("A quantidade de votos do candidato de número " +(i + 1)+ " é: " +qtdVotos[i]);
        }
    }
    public void PDezPrimeirosColocados(){

    }

}
