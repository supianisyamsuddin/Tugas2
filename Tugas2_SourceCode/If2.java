/*	NIM   		: 13020210085
	Nama   		: Supiani Syamsuddin
	Hari/Tanggal	: Rabu, 22 Maret 2023
	Waktu Pengerjaan  : 11.53 */

import java.util.Scanner;

public class If2 {
/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */
int a;
Scanner masukan=new Scanner(System.in);
/* Program */
System.out.print ("Contoh IF dua kasus \n");
System.out.print ("Ketikkan suatu nilai integer :"); 
a=masukan.nextInt();
if (a >= 0){
System.out.println ("Nilai a positif "+ a);
}else /* a< 0 */
{
System.out.println ("Nilai a negatif "+ a);
}
}
}