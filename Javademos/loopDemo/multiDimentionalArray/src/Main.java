public class Main {
    public static void main(String[] args) {
        String[][] sehirler=new String[3][3];

        sehirler[0][0]="ankara";
        sehirler[0][1]="istanbul";
        sehirler[0][2]="şanlıurfa";
        sehirler[1][0]="gaziantep";
        sehirler[1][1]="hatay";
        sehirler[1][2]="malatya";
        sehirler[2][0]="adıyaman";
        sehirler[2][1]="siirt";
        sehirler[2][2]="diyarbakır";

        for(int i=0;i<=2;i++){
            System.out.println("*********************");
            for(int j=0;j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }

    }
}