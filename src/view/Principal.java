package view;

import controller.ThreadJoKenPo;

public class Principal {
	public static int totalA;
	public static int totalB;

	public static void main(String[] args) {
		String nomesA[] = {"henrique","pedro","luiz","augusto","vagner","lucas"};
		String nomesB[] = {"gustavo","denis","paulo","adryen","colevati","satoshi"};

		Thread t1 = new ThreadJoKenPo(nomesA[4], nomesB[0]);
		Thread t2 = new ThreadJoKenPo(nomesA[3], nomesB[1]);
		Thread t3 = new ThreadJoKenPo(nomesA[2], nomesB[2]);
		Thread t4 = new ThreadJoKenPo(nomesA[1], nomesB[3]);
		Thread t5 = new ThreadJoKenPo(nomesA[0], nomesB[4]);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		while((t1.isAlive() || t2.isAlive() || t3.isAlive() || t4.isAlive() || t5.isAlive())) {
		}
		
		if(totalA>totalB) {
			System.out.println(totalA+" do time A, ganhou");
		}else {
			System.out.println(totalB+" do time B, ganhou");
		}
	}

}
