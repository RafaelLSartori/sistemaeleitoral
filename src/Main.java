import javax.swing.JOptionPane;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Votacao votacao[] = new Votacao[200];
        ClasseMetodos m = new ClasseMetodos();

        for(int i = 0; i < 200; i++){
            votacao[i] = new Votacao();
        }

        int opc = 0;
        int opcStatistics = 0;
        while (opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar voto \n 2 - Cassificar os registros \n 3 - Gravar dados \n 4 - Mostrar indicadores \n 9 - FIM"  ));
            switch (opc){
                case 1: votacao = m.FCadastra(votacao);
                    break;
                case 2: votacao = m.FClassificaSecao(votacao);
                    break;
                case 3: votacao = m.FGravaVotacao(votacao);
                    break;
                case 4:
                    while (opcStatistics != 9){
                        opcStatistics = Integer.parseInt(JOptionPane.showInputDialog("1 - Qtd ele p seção \n 2 - Nº seção com M M \n 3 - Qtd de votos p c \n 4 - 10 mais votados \n 9 - FIM"));
                        switch(opcStatistics){
                            case 1: m.PQtdEleitoresPorSecao(votacao);
                                break;
                            case 2: m.PMaiorEMenor();
                                break;
                            case 3: m.PVotosPorCandidato(votacao);
                                break;
                            case 4: m.PDezPrimeirosColocados();
                                break;
                            case 9: JOptionPane.showMessageDialog(null,"Programa finalizado");
                                System.exit(0);
                                break;
                            default: JOptionPane.showMessageDialog(null,"Opção Inválida");
                        }
                    }
                    break;
                case 9: JOptionPane.showMessageDialog(null,"Programa finalizado");
                    break;
                default: JOptionPane.showMessageDialog(null,"Opção Inválida");
            }
        }
    }
}