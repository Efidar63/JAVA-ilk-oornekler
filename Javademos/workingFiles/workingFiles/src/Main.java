import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //getFileInfo();
        readFile();
        writeFile();
        readFile();
        File file=new File("C:\\Javademos\\files\\students.txt");
        try {
            if (file.createNewFile()){
                System.out.println("dosya oluşturuldu.");
            }else {
                System.out.println("dosya zaten var");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void getFileInfo(){
        File file=new File("C:\\Javademos\\files\\students.txt");
        if (file.exists()){
            System.out.println("dosya adı: "+file.getName());
            System.out.println("dosya yolu: "+file.getPath());
            System.out.println("dosya yazılabilirliği: "+file.canWrite());
            System.out.println("dosya okunabilir mi: "+file.canRead());
            System.out.println("dosya boyutu(byte): "+file.length());
        }

    }

    public static void readFile(){
        File file=new File("C:\\Javademos\\files\\students.txt");
        try {
            Scanner reader =new Scanner(file);
            while (reader.hasNextLine()){
                String line=reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }


    public static void writeFile(){
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Javademos\\files\\students.txt",true));
           // FileWriter file= new FileWriter("C:\\Javademos\\files\\students.txt");  bu şekilde de olur...
            writer.newLine();
            writer.write("ahmet");
            System.out.println("dosyaya yazıldı.");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
