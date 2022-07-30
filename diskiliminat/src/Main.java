import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        Scanner k =new Scanner(in);



        System.out.print("Mahluq hujumlari => ");
        int mahu=k.nextInt();
        System.out.print("Mahluq himoyasi => ");
        int mahim= k.nextInt();
        System.out.print("Mahluq yetgazgan talofat => ");
        int majoka= k.nextInt();
        System.out.print("Mahluq jon qoldig'i => ");
        int majoqo = k.nextInt();



        //o'zim haqimda malumot
        System.out.println();

        System.out.print("Mening hujumlari => ");
        int Mehu=k.nextInt();
        System.out.print("Mening himoyasi => ");
        int Mehim= k.nextInt();
        System.out.print("Mening yetgigan talofatin => ");
        int Meyeta= k.nextInt();
        System.out.print("Mening jon qoldig'i => ");
        int Mejoqo = k.nextInt();

        Random tasotif = new Random();
        do {
            boolean hujumchi = tasotif.nextBoolean();
            if (hujumchi) {
                System.out.println();
                System.out.println("Siz hujumdasiz");
                int narta = tasotif.nextInt(6) + 1 + tasotif.nextInt(6) + 1;
                int hujhissob = Mehu + narta;
                System.out.println("Tushgan qimatlar => " + narta);
                System.out.println("Sizning hujumingiz hissobi => " + hujhissob);
                if (hujhissob > mahim) {
                    System.out.println();
                    majoqo = majoqo - Meyeta;
                    System.out.println("Mahluq jon qoldig'i => " + majoqo);
                    System.out.println("Bizning hujumimiz mufaqqiyatli!");
                } else {
                    System.out.println("Hujumimiz mofaqiyatsiz");
                }
            } else {
                System.out.println();
                System.out.println("Mahluq hujumda");
                int narta = tasotif.nextInt(6) + 1 + tasotif.nextInt(6) + 1;
                int hujhissob = mahu + narta;
                System.out.println("Tushgan qimatlar => " + narta);
                System.out.println("Sizning hujumingiz hissobi => " + hujhissob);
                if (hujhissob > Mehim) {
                    System.out.println();
                    Mejoqo = Mejoqo - majoka;
                    System.out.println("Mening jon qoldig'i => " + Mejoqo);
                    System.out.println("Mahluqning hujumimiz mufaqqiyatli!");
                } else {
                    System.out.println("Hujumimiz mofaqiyatsiz");
                }
            }
            System.out.println();
            System.out.println("ENTER");
            k.nextLine();
            System.out.println();
        } while (Mejoqo>0&&majoqo>0);
        if (majoqo>0){
            System.out.println("Inson halok bo'ldi");
        }
        if (Mejoqo>0){
            System.out.println("Mahluq o'di");
        }








    }
}