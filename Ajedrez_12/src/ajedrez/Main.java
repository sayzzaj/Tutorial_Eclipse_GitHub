package ajedrez;

import java.util.Scanner;

public class Main {

	static final int N = 8;
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Introduzca la posicion: ");
	int pos = sc.nextInt();

	int fila = (pos-1)/N;
	int columna = (pos-1) % N;

	char [][]tablero=new char[N][N];
	//dibujaTablero(tablero);
	dibujaTablero2(tablero);
	muestraTablero(tablero);
	dibujaTorre(tablero, fila, columna);
	System.out.println();
	muestraTablero(tablero);
	System.out.println();
	dibujaTablero2(tablero); 
	System.out.println();
	muestraTablero(tablero);
	dibujaAlfil(tablero,fila,columna);
	System.out.println();
	muestraTablero(tablero);
	System.out.println();
	dibujaDama(tablero,fila,columna);
	muestraTablero(tablero);
	System.out.println();
	dibujaRey(tablero,fila,columna);
	muestraTablero(tablero);
	System.out.println();
	dibujaCaballo(tablero, fila, columna);
	muestraTablero(tablero);
	System.out.println();
	


	}
	private static void dibujaCaballo(char[][] tablero, int fila, int columna) {
		tablero[fila][columna]='C';
		for (int i=0;i<tablero.length;i++) {
			for (int j=0;j<tablero[0].length;j++) {
				if ((i==fila-2)&&((j==columna-1)||(j==columna+1))) {
					tablero[i][j]='C';
				}
				if ((i==fila-1)&&((j==columna-2)||(j==columna+2))) {
					tablero[i][j]='C';
				}
				if ((i==fila+2)&&((j==columna-1)||(j==columna+1))) {
					tablero[i][j]='C';
				}
				if ((i==fila+1)&&((j==columna-2)||(j==columna+2))) {
					tablero[i][j]='C';
				}
			}
		}
	}
	private static void dibujaRey(char[][] tablero, int fila, int columna) {
		for (int i=0;i<tablero.length;i++) {
			for (int j=0;j<tablero.length;j++) {
				if ((fila+columna)==(i+j)){
					tablero[i][j]='K';
				}else if ((fila-columna)==(i-j)) {
					tablero[i][j]='K';
				}
				if ((fila==i) || (columna == j)) {
					tablero[i][j]='K';
				}
			}
		}
	}
	private static void dibujaDama(char[][] tablero, int fila, int columna) {
		for (int i=0;i<tablero.length;i++) {
			for (int j=0;j<tablero.length;j++) {
				if ((fila+columna)==(i+j)){
					tablero[i][j]='R';
				}else if ((fila-columna)==(i-j)) {
					tablero[i][j]='R';
				}
				if ((fila==i) || (columna == j)) {
					tablero[i][j]='R';
				}
			}
		}
		
	}
	private static void dibujaAlfil(char[][] tablero,int fila,int columna) {
		for (int i=0;i<tablero.length;i++) {
			for (int j=0;j<tablero[0].length;j++) {
				if ((fila+columna)==(i+j)){
					tablero[i][j]='A';
				}else if ((fila-columna)==(i-j)) {
					tablero[i][j]='A';
				}
			}
		}

	}
	private static void dibujaTorre(char[][] tablero, int fila, int columna) {
		for (int i=0;i<tablero.length;i++) {
			for (int j=0;j<tablero[0].length;j++) {
				if ((fila==i) || (columna == j)) {
					tablero[i][j]='T';
				}
			}
		}

	}
	private static void dibujaTablero2(char[][] tablero) {
		for (int i=0;i<tablero.length;i++) {
			for (int j=0;j<tablero[0].length;j++) {
				if (i%2==0) {
					tablero[i][j] = (j % 2 != 0)?'N':'B';
				}else {
					tablero[i][j] = (j % 2 == 0)?'N':'B';
				}
			}
		}

	}
	private static void muestraTablero(char[][] tablero) {
		for (int i=0;i<tablero.length;i++) {
			for (int j=0;j<tablero[0].length;j++) {
				System.out.print(tablero[i][j]+" ");
			}
			System.out.println();
		}

	}
	private static void dibujaTablero(char[][] tablero) {
		for (int i=0;i<tablero.length;i++) {
			for (int j=0;j<tablero[0].length;j++) {
				if (i % 2 == 0) {
					if (j % 2 != 0) {
						tablero[i][j]='N';
					}else {
						tablero[i][j]='B';
					}
				}else {
					if (j % 2 == 0) {
						tablero[i][j]='N';
					}else {
						tablero[i][j]='B';
					}
				}
			}
		}
	}
}

	/* Nota Santiago
	* Jagged Array
	* int [][] ja;

	ja = new int[5][];

	ja[0] = new int[3];
	ja[1] = new int[5];

	for (int i=0;i<ja.length;i++)
	{
	for (int j=0;j<ja[i].length;j++)
	{
	print ja[i][j];
	}
	}

	*
	* */

