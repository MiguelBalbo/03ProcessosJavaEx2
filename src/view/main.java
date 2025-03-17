package view;
import javax.swing.JOptionPane;
import controller.KillController;

public class main {
	public static void main(String[] args) {
		int opc=0;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção: \n 1 - Ver processos \n 2 - Matar por PID \n 3 - Matar por nome \n 9 - Sair"));
			switch(opc) {
			case 1:
				KillController.listaProcesso();
				break;
			case 2:
				int PID = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do PID"));
				KillController.mataPid(PID);
				break;
			case 3:
				String processo = JOptionPane.showInputDialog("Digite o nome do processo");
				KillController.mataNome(processo);
			case 9:
				break;
			default:
				JOptionPane.showMessageDialog(null,"Verifique a opção digitada");
				break;
			}
		}while(opc != 9);
	}
}
