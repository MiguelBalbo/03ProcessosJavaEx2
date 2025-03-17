package controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KillController {
	public KillController() {
		super();
	}
	
	private static String sistemaOperacional(){
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append(System.getProperty("os.name"));
		sBuffer.append(" ");
		sBuffer.append(System.getProperty("os.version"));
		sBuffer.append(" ");
		sBuffer.append(System.getProperty("os.arch"));
		
		return sBuffer.toString();
	}
	
	private static void executaComando(String cmd){
		
		String[] recProc = cmd.split(" ");
		
		try {
			Process retProc = Runtime.getRuntime().exec(recProc);
			InputStream iStream = retProc.getInputStream();
			InputStreamReader irStream = new InputStreamReader(iStream);
			BufferedReader bReader = new BufferedReader (irStream);
			String liLinha = bReader.readLine();
			
			while(liLinha != null) {
				System.out.println(liLinha);
				liLinha = bReader.readLine();
			}
			
		} catch (Exception err) {
			System.err.println(err);
		}
		
	}
	
	public static void listaProcesso() {
		String SO = sistemaOperacional();
		String cmd;
		
		if (SO.contains("Windows")) {
			cmd = "TASKLIST /FO TABLE";
		}
		else {
			cmd = "ps -ef";
		}
		
		executaComando(cmd);
	}
	
	public static void mataPid(int PID) {
		String SO = sistemaOperacional();
		String cmd;
		StringBuffer sBuffer = new StringBuffer();
		
		if (SO.contains("Windows")) {
			sBuffer.append("TASKKILL /F /PID ");
			sBuffer.append(PID);
			cmd = sBuffer.toString() ;
		}
		else {
			sBuffer.append("kill -9 ");
			sBuffer.append(PID);
			cmd = sBuffer.toString() ;
		}
		
		executaComando(cmd);
	}
	
	public static void mataNome(String proc) {
		String SO = sistemaOperacional();
		String cmd;
		StringBuffer sBuffer = new StringBuffer();
		
		if (SO.contains("Windows")) {
			sBuffer.append("TASKKILL /F /IM ");
			sBuffer.append(proc);
			cmd = sBuffer.toString() ;
		}
		else {
			sBuffer.append("pkill -f ");
			sBuffer.append(" ");
			sBuffer.append(proc);
			cmd = sBuffer.toString() ;
		}
		
		executaComando(cmd);
	}
}
