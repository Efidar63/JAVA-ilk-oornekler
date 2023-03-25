public class Main {
    public static void main(String[] args) {

      sayibulmaca();



    }
    public static void sayibulmaca(){
        int[] sayilar=new int[]{1,2,7,9,0};
        int aranacak=6;
        boolean varMi=false;
        for(int sayi:sayilar){
            if(sayi==aranacak){
                varMi=true;
                break;
            }
        }

        String mesaj=" ";
        if(varMi){
            mesaj="SAYI MEVCUTTUR: "+aranacak;
            mesajVer(mesaj);
        }else{
            mesajVer("sayı mevcut değildir: "+aranacak);

        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}