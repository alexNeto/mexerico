package com.chatter.cliente;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Ouvidor implements Runnable{

	private final InputStream servidor;

	public Ouvidor(InputStream servidor) {
		this.servidor = servidor;
	}

	@Override
	public void run() {
		Scanner leitor = new Scanner(this.servidor);
		while(leitor.hasNextLine()) {
			System.out.println(leitor.nextLine());
		}
		leitor.close();
	}

}