/*	NIM   		: 13020210085
	Nama   		: Supiani Syamsuddin
	Hari/Tanggal	: Kamis, 23 Maret 2023
	Waktu Pengerjaan  : 10.22 */

import java.util.Scanner;


public class PrintWhile1 {



public static void main(String[] args) {


int N;
int i = 1;
Scanner masukan=new Scanner(System.in);

System.out.print ("Nilai N >0 = "); 
N = masukan.nextInt();
System.out.print ("Print i dengan WHILE (ringkas): \n");
while (i <= N){
System.out.println (i++);
} 
}
}
