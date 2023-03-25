public class Main {
    public static void main(String[] args) {
        int[] sayilar= new int[]{1,2,5,7,9,0};
        int aranacak=5;
        boolean varmi=false;

        for(int sayi:sayilar){
            if(sayi==aranacak){
                varmi=true;
                break;
            }
        }
        if(varmi){
            System.out.println("sayı mevcuttur.");
        }else{
            System.out.println("sayı mevcut değildir.");
        }

    }
}