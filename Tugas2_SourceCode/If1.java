/*	NIM   		: 13020210085
	Nama   		: Supiani Syamsuddin
	Hari/Tanggal	: Rabu, 22 Maret 2023
	Waktu Pengerjaan  : 11.49 */

import java.util.Scanner;
public class If1 {
/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */
Scanner masukan=new Scanner(System.in); 
int a;
/* Program */
System.out.print ("Contoh IF satu kasus \n"); 
System.out.print ("Ketikkan suatu nilai integer : "); 
a = masukan.nextInt();
if (a >= 0)
System.out.print ("\nNilai a positif "+ a);
}
}
