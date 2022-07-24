/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_prog;
import java.util.Scanner;

public class Mtv {
	
    
    public static void vergi_hesap(){
    //Egemen Güçlü N21236839
    int yas = 1;    
    int motor_hacmi = 0;
    int kolon = 0;
    int satir = 0;
    
    int[][] vergi_tablo = { // vergi tutar tablosu
    {861, 600, 336, 255, 90},
    {1500, 1124, 653, 461, 177},
    {2647, 2069, 1218, 743, 289},
    {3011, 3212, 1888, 1124, 444},
    {6254, 4541, 2837, 1696, 671},
    {8720, 7586, 4739, 2550, 936},
    {13280, 11948, 7197, 3593, 1319},
    {20878, 18028, 10618, 4739, 1888},
    {34171, 25624, 15176, 6821, 2647}};
    
    Scanner keyboard = new Scanner(System.in);// Scanner objesi oluþturma
    System.out.println("Taþýt vergisi hesaplama programýna hoþgeldiniz.");
    System.out.println("Lütfen aracýn yaþýný ve motor silindir hacmini giriniz.");
    System.out.println();
    System.out.println();
    System.out.print("Aracýn yaþý: ");
    
    yas = keyboard.nextInt(); // yaþ girdisini almak icin olusturulan komut
    keyboard.nextLine();// enter (/n) den kacinmak icin
    
    System.out.println();
    System.out.print("Motor silindir hacmi: ");
    
    motor_hacmi = keyboard.nextInt(); //motor hacmini almak icin olusturulan komut
    keyboard.nextLine();// enter (/n) den kacinmak icin 
    keyboard.close();
 
    if( 1<=yas && yas <= 3){
        kolon = 0;
    }
    if( 4<=yas && yas <= 6){
        kolon = 1;
    }
    if( 7<=yas && yas <= 11){
        kolon = 2;
    }
    if( 12<=yas && yas <= 15){
        kolon = 3;
    }
    if( 16<=yas){
        kolon = 4;
    }
    
    if( 0<motor_hacmi && motor_hacmi <= 1300){
        satir = 0;
    }
    if( 1301<=motor_hacmi && motor_hacmi <= 1600){
        satir = 1;
    }
    if( 1601<=motor_hacmi && motor_hacmi <= 1800){
        satir = 2;
    }
    if( 1801<=motor_hacmi && motor_hacmi <= 2000){
        satir = 3;
    }
    if( 2001<=motor_hacmi && motor_hacmi <= 2500){
        satir = 4;
    }
    if( 2501<=motor_hacmi && motor_hacmi <= 3000){
        satir = 5;
    }
    if( 3001<=motor_hacmi && motor_hacmi <= 3500){
        satir = 6;
    }
    if( 3501<=motor_hacmi && motor_hacmi <= 4000){
        satir = 7;
    }
    if( 4001<=motor_hacmi){
        satir = 8;
    }
    
    int tutar = vergi_tablo[satir][kolon];//tablodan fiyat bilgisi cekmek icin 2D array'den eleman cekilmesi
    System.out.println();
    System.out.println();
    System.out.print("Ödeyeceðiniz yýllýk taþýt vergisi ");
    System.out.print(tutar);
    System.out.println(" TLdir.");
    }
}
