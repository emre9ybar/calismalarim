package rr;

import java.io.FileOutputStream;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class customer {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<Integer, String> rezerve = new HashMap<>();

        rezerve.put(1, "emre aybar ");
        rezerve.put(2, "furkan erenoğlu");
        rezerve.remove(1);
        System.out.println(rezerve);
        ArrayList<String[]> customer = new ArrayList<>();
        String ad;
        String soy;
        String no;
        while (true) {
            System.out.print("isim :");
            ad = scan.next();
            System.out.print("mail :");
            soy = scan.next();
            System.out.print("no :");
            no = scan.next();

            String[] musteri = {ad, soy, no};
            customer.add(musteri);
            for (String[] A : customer) {
                System.out.println("MÜŞTERİ ADI :" + A[0]);
                System.out.println("GMAİL ADI :" + A[1]);
                System.out.println("NUMARA ADI :" + A[2]);
            }

        }
    }

}

