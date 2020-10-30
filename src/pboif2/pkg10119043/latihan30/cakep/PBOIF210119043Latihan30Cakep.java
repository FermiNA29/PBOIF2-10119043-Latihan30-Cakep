/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan30.cakep;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program cek latihan
 */
public class PBOIF210119043Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
        public static final String NORMAL = "\u001b[0m";
        public static final String BLACK = "\u001b[30m";
        public static final String RED = "\u001b[31m";
        public static final String GREEN = "\u001b[32m";
        public static final String YELLOW = "\u001b[33m";
        public static final String BLUE = "\u001b[34m";
        public static final String MAGENTA = "\u001b[35m";
        public static final String CYAN = "\u001b[36m";
        public static final String WHITE = "\u001b[37m";

        public static final String BLINK = "\u001b[5m";
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println(RED + "kamu " + GREEN + "ngerjain sendiri " + YELLOW + "latihan 17 sampe " + BLUE + " latihan 30 ini?");
        System.out.print(BLUE + "jawab " + RED + "(Yoi/Engga) ");
        String jawab = scanner.nextLine();
        System.out.print("");
        jawab = jawab.toLowerCase();
        if(jawab.equals("yoi")) {
            System.out.println();
            System.out.println(RED + "Cakep bener."+ MAGENTA +" Good Job");
        } else {
            System.out.println();
            System.out.println(RED + "Tetep cakep sih.");
            System.out.println(CYAN + "Sing penting paham konsep nya yee.");
            System.out.println("keep the code works dude.");
        }
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Developed by : Fermi Naufal Akbar");
    }
    
}
