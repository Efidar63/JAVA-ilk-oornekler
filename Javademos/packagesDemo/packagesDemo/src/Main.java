import matematik.Dortislem;
import matematik.Logaritma;
//import matematik.*; //matematik klasördündeki her şey

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Adınız:  ");
        String isim=scanner.nextLine();
        System.out.println("merhaba"+isim);

        Dortislem dortislem=new Dortislem();
        dortislem.topla(5,9);
        Logaritma logaritma=new Logaritma();


    }
}