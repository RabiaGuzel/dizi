/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package array;
import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
   
Scanner scan = new Scanner(System.in);
		System.out.println("Dizi Boyutunu giriniz: ");
		int girilen = scan.nextInt();
		System.out.println(girilen+" "+"tane sayı giriniz. ");
		
		int[]sayilar = new int[girilen];
		
		
		for(int j=0;j<sayilar.length;j++) {
			sayilar[j]= scan.nextInt();
			
		}
		
		for(int j=0;j<sayilar.length;j++) {
			System.out.println("Dizinin "+j+". indisi: "+sayilar[j]);
			
		
    }

}}
