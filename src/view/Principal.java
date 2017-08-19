package view;

import controller.Proc;

public class Principal {

	public static void main(String[] args) {
		Proc p = new Proc();
//		String os = p.os();
//		System.out.println(os);
//		p.propriedades();
//		String caminho = "TRACERT www.google.com.br";
//		p.chamaProcessos(caminho);
//		p.leProcesso(caminho);
		String processo = "cmd.exe";
		p.mataProcesso(processo);
		
	}

}
