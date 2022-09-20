
package java_3x3matris;

import java.util.Scanner;
import java.util.Random;

public class Java_3x3matris {

    static Scanner input = new Scanner(System.in);
    static Random  rand = new Random();
    static int x,kısım1,kısım2,kısım3,sonuc1,sonuc2,sonuc3;
    static int ters_kısım1,ters_kısım2,ters_kısım3;
    static int minör1,minör2,minör3,minör4,minör5,minör6,minör7,minör8,minör9;
    static int kof1,kof2,kof3,kof4,kof5,kof6,kof7,kof8,kof9;
    static int formul1,formul2,formul3,formul4,formul5,formul6,formul7,formul8,formul9;
    
    static int line(int line_draw) {
        for (int i = 0; i < 50; i++) {
        System.out.print("-");
        } return line_draw;
    }
    
    static int line_2 (int line_draw2) {
        for (int i = 0; i < 6; i++) {
            System.out.println("|");     
        } return line_draw2;
    }
    
    public static void main(String[] args) {
        line(0);
        System.out.printf("\nMATRİSİN adını giriniz . . . :");
        String name = input.next();
        int matris [] = new int [9];
        System.out.println("\n3X3 matris");
        line(0);
        System.out.println(""); 
        // matris determinantı ve minörü bulan kısım buradadır
        for (int i = 0; i < matris.length; i++) {
            System.out.printf("[%d] degerini gir . . .:",i);
            matris[i] = input.nextInt();
             kısım1 = matris[0]*matris[4]*matris[8];
             kısım2 = matris[3]*matris[7]*matris[2];
             kısım3 = matris[6]*matris[1]*matris[5];
             ters_kısım1 = matris[2]*matris[4]*matris[6];
             ters_kısım2 = matris[5]*matris[7]*matris[0];
             ters_kısım3 = matris[8]*matris[1]*matris[3];
             minör1 = matris[4]*matris[8]-matris[5]*matris[7]; //
             minör2 = matris[3]*matris[8]-matris[5]*matris[6]; //
             minör3 = matris[3]*matris[7]-matris[4]*matris[6]; //
             minör4 = matris[1]*matris[8]-matris[2]*matris[7]; //
             minör5 = matris[0]*matris[8]-matris[2]*matris[6]; //
             minör6 = matris[0]*matris[7]-matris[1]*matris[6]; //
             minör7 = matris[1]*matris[5]-matris[2]*matris[4]; // 
             minör8 = matris[0]*matris[5]-matris[2]*matris[3]; //
             minör9 = matris[4]*matris[0]-matris[1]*matris[3]; //
        }
        line(0);
        System.out.printf("\n3X3 MATRİS ");
        System.out.printf("\n[%d] [%d] [%d]\n[%d] [%d] [%d]\n[%d] [%d] [%d]",matris[0],matris[1],matris[2],matris[3],matris[4],matris[5],matris[6],matris[7],matris[8]);
        System.out.println("");
        sonuc1 = kısım1+kısım2+kısım3;
        sonuc2 = ters_kısım1+ters_kısım2+ters_kısım3;
        sonuc3 = sonuc1-sonuc2;
        // sonuc3 determinant degeridir
        if (sonuc3 == 0) {
            System.out.printf("MATRİSİN determinantı 0'dır");
            for(;;);
        }
        else{
            System.out.printf("MATRİSİN determinantı %d dir",sonuc3);
        }
        // minör bulan kısım 
        System.out.println("");
        line(0);
        System.out.println("");
        System.out.printf("%s MATRİSİN MİNÖR DEGERİ",name);
        System.out.printf("\n[%d] [%d] [%d]\n[%d] [%d] [%d]\n[%d] [%d] [%d]\n",minör1,minör2,minör3,minör4,minör5,minör6,minör7,minör8,minör9);
        line(0);
        System.out.println("");
        System.out.printf("%s MATRİSİN KOFAKTÖR DEGERİ",name);        
        kof1=minör1*1; kof2=minör2*-1; kof3=minör3*1; kof4=minör4*-1; kof5=minör5*1; kof6=minör6*-1; kof7=minör7*1; kof8=minör8*-1; kof9=minör9*1;
        System.out.printf("\n[%d] [%d] [%d]\n[%d] [%d] [%d]\n[%d] [%d] [%d]\n",kof1,kof2,kof3,kof4,kof5,kof6,kof7,kof8,kof9);
        line(0);
        System.out.println("");
        System.out.printf("%s MATRİSİNİN TRANSPÖZE DEGERİ",name);
        System.out.printf("\n[%d] [%d] [%d]\n[%d] [%d] [%d]\n[%d] [%d] [%d]\n",kof1,kof4,kof7,kof2,kof5,kof8,kof3,kof6,kof9);
        line(0);
        // formul1=sonuc3/4; formul2=sonuc3*kof4/4; formul3=sonuc3*kof7/4; formul4=sonuc3*kof2/4; formul5=sonuc3*kof5/4; formul6=sonuc3*kof8/4; formul7=sonuc3*kof3/4; formul8=sonuc3*kof6/4; formul9=sonuc3*kof9/4;
        line(0);
        System.out.println("");
        System.out.printf("%s MATRİSİNİN TERSİ\n",name);
        if(kof1 <= 0) {
            int kof1reel = kof1 * -1;  int sonuc3x = sonuc3 * -1;
            System.out.printf("[%d/%d]",kof1reel,sonuc3x);
        }
        else if(kof1 > 0){
            int kof1reel1 = kof1 * -1; int sonuc3y = sonuc3 * -1;
            System.out.printf("[%d/%d]",kof1reel1,sonuc3y);
        }
        if(kof4 <= 0) {
            int kof4reel = kof4*-1;  int sonuc3x = sonuc3 * -1;
            System.out.printf("[%d/%d]",kof4reel,sonuc3x);
        }
        else if(kof4 > 0){
            int kof1reel4 = kof4 * -1;  int sonuc3y = sonuc3 * -1;
            System.out.printf("[%d/%d]",kof1reel4,sonuc3y);
        }
        if(kof7 <= 0) {
            int kof7reel = kof7*-1;  int sonuc3x = sonuc3 * -1;
            System.out.printf("[%d/%d]\n",kof7reel,sonuc3x);
        }
        else if(kof7 > 0){
            int kof1reel7 = kof7 * -1;  int sonuc3y = sonuc3 * -1;
            System.out.printf("[%d/%d]\n",kof1reel7,sonuc3y);
        }
        // birinci ve ikinci elemanları birbirinden ayıran bölüm
        if(kof2 <= 0) {
            int kof2reel = kof2*-1;  int sonuc3x = sonuc3 * -1;
            System.out.printf("[%d/%d]",kof2reel,sonuc3x);
        }
        else if(kof2 > 0){
            int kof1reel2 = kof2 * -1;   int sonuc3y = sonuc3 * -1;
            System.out.printf("[%d/%d]",kof1reel2,sonuc3y);
        }
        if(kof5 <= 0) {
            int kof5reel = kof5*-1;  int sonuc3x = sonuc3 * -1;
            System.out.printf("[%d/%d]",kof5reel,sonuc3x);
        }
        else if(kof5 > 0){
            int kof1reel5 = kof5 * -1;  int sonuc3y = sonuc3 * -1;
            System.out.printf("[%d/%d]",kof1reel5,sonuc3y);
        }
        if(kof8 <= 0) {
            int kof8reel = kof8*-1;  int sonuc3x = sonuc3 * -1;
            System.out.printf("[%d/%d]\n",kof8reel,sonuc3x);
        }
        else if(kof8 > 0){
            int kof1reel8 = kof8 * -1;  int sonuc3y = sonuc3 * -1;
            System.out.printf("[%d/%d]\n",kof1reel8,sonuc3y);
        }
        // ikinci bölüm ile üçüncü bölümü ayıran kısım burasıdır.
        if(kof3 <= 0) {
            int kof3reel = kof3*-1;  int sonuc3x = sonuc3 * -1;
            System.out.printf("[%d/%d]",kof3reel,sonuc3x);
        }
        else if(kof3 > 0){
            int kof1reel3 = kof3 * -1;  int sonuc3y = sonuc3 * -1;
            System.out.printf("[%d/%d]",kof1reel3,sonuc3y);
        }
        if(kof6 <= 0) {
            int kof6reel = kof6*-1;  int sonuc3x = sonuc3 * -1;
            System.out.printf("[%d/%d]",kof6reel,sonuc3x);
        }
        else if(kof6 > 0){
            int kof1reel6 = kof6 * -1;  int sonuc3y = sonuc3 * -1;
            System.out.printf("[%d/%d]",kof1reel6,sonuc3y);
        }
        if(kof9 <= 0) {
            int kof9reel = kof9*-1;  int sonuc3x = sonuc3 * -1;
            System.out.printf("[%d/%d]\n",kof9reel,sonuc3x);
        }
        else if(kof9 > 0){
            int kof1reel9 = kof9 * -1;  int sonuc3y = sonuc3 * -1;
            System.out.printf("[%d/%d]\n",kof1reel9,sonuc3y);
        }
        line(0);
        System.out.println("");
    }
}
