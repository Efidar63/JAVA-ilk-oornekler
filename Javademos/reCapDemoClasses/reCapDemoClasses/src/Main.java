public class Main {
    public static void main(String[] args) {

        DortIslem dortIslem=new DortIslem();
        int toplasonuc=dortIslem.Topla(8,4);
        int carpsonuc=dortIslem.Carp(8,9);
        int bolsonuc=dortIslem.Bol(15,5);
        int cıkarsonuc=dortIslem.Cikar(71,70);
        System.out.println(toplasonuc);
        System.out.println(bolsonuc);
        System.out.println(cıkarsonuc);
        System.out.println(carpsonuc);
    }
}