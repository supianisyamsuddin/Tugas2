/*	NIM   		: 13020210085
	Nama   		: Supiani Syamsuddin
	Hari/Tanggal	: Kamis, 23 Maret 2023
	Waktu Pengerjaan  : 10.18 */

import java.util.Scanner;
public class PrintRepeat {


public static void main(String[] args) {

int N;
int i;
Scanner masukan=new Scanner(System.in);

System.out.print ("Nilai N >0 = ");

N = masukan.nextInt();
i = 1;

System.out.print ("Print i dengan REPEAT: \n");
do{
System.out.print (i+"\n");  
i++; 
}
while (i <= N); 
}
}