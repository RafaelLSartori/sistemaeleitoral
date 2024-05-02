import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Votacao votacao[] = new Votacao();

        for(int i = 0; i < 200; i++){
            votacao[i] = new Votacao();
        }

        int opc = 0;
        int select = 0;
        while (opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar voto \n 2 - Cassificar os registros \n 3 - Gravar dados \n 4 - Mostrar indicadores" );
            case 1: votacao = m.FCadastra(votacao);
                break;
            case 2: votacao = m.FClassifica(votacao);
                break;
            case 3: votacao = m.FGrava(votacao);
                break;
            case 4: while (select != 9){
                select = Integer.parseInt(JOptionPane.showInputDialog("1 - Qtd ele p seção \n 2 - Nº seção com M M \n 3 - Qtd de votos p c \n 4 - 10 mais votados");
            }
                break;
            case 9: JOptionPane.showMessageDialog(null,"Programa finalizado");
                break;
            default: JOptionPane.showMessageDialog(null,"Opção Inválida");
        }

    }
}