/*	NIM   		: 13020210085
	Nama   		: Supiani Syamsuddin
	Hari/Tanggal	: Kamis, 23 Maret 2023
	Waktu Pengerjaan  : 10.24 */

import java.util.Scanner;

public class PrintXinterasi {

public static void main(String[] args) {

int Sum=0; 
int x;
Scanner masukan=new Scanner(System.in);

System.out.print ("Masukkan nilai x (int), akhiri dg 999: ");
x = masukan.nextInt(); 
if (x == 999){
System.out.print ("Kasus kosong \n");
}else{ 

Sum = x; 
for (;;){
System.out.print ("Masukkan nilai x (int),akhiri dg 999 : ");
x = masukan.nextInt(); 
if(x==999)
break;
else{
Sum = Sum + x;
}
}
}
System.out.println("Hasil penjumlahan = "+ Sum);

}
}