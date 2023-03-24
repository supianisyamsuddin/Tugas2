/*	NIM   		: 13020210085
	Nama   		: Supiani Syamsuddin
	Hari/Tanggal	: Kamis, 23 Maret 2023
	Waktu Pengerjaan  : 09.55 */

import java.util.Scanner;

public class Konstant {



public static void main(String[] args) {


final float PHI = 3.1415f;
float r;
Scanner masukan=new Scanner(System.in);

System.out.print ("Jari-jari lingkaran ="); 
r = masukan.nextFloat();

System.out.print ("Luas lingkaran = "+ (PHI * r * r)+"\n");
System.out.print ("Akhir program \n");
}
}