
import java.math.BigInteger;
import java.security.*;
import java.text.ParseException;
import java.util.*;
import java.util.Scanner;
public class Poste {
    public static Queue<String> queue = new PriorityQueue<String>();
    public static ArrayList<Session> info = new ArrayList<>();
    public static Benefices benefices = new Benefices();
    public  String console ;
    public String ecran;
    public int horaire;
    public  int prix;
    public String nom;
    public String prenom;
    public static String code;
    public String jeux;
    public String Tjeux;
    public void saisirConsol() {
        Scanner sc = new Scanner(System.in);
        int str = sc.nextInt();
        int choix = str;
        switch(choix){

            case 1:
                this.console="XBOX";
                break;
            case 2:
                this.console="PlayStation5";
                break;
            case 3:
                this.console="Nintendo";
                break;
            default:
                System.out.println("Choix incorrect");
                break;
        }
    }
    //saisire l'ecran
    public void saisirEcran() {
        Scanner sc = new Scanner(System.in);
        int str = sc.nextInt();
        int choix = str;
        switch(choix){

            case 1:
                this.ecran="Dell";
                break;
            case 2:
                this.ecran="HP";
                break;
            case 3:
                this.ecran="Asus";

                break;
            case 4:
                this.ecran="Samsung";
                break;
            default:
                System.out.println("Choix incorrect");
                break;
        }
    }
//sasire le  jeux
public void saisirjeux() {
    Scanner sc = new Scanner(System.in);
    int str = sc.nextInt();
    int choix = str;
    switch(choix){

        case 1:
            this.jeux="FIFA";
            System.out.println("Choisir quelle jeux:1)FIFA      2)PES");
            int j = sc.nextInt();
            int choix1 = j;
            switch(choix1) {
                case 1:
                    this.Tjeux="FIFA";
                    break;
                case 2:
                    this.Tjeux="PES";
                    break;
                default:
                    System.out.println("Choix incorrect");
            }
            break;
        case 2:
            this.jeux="Guerre";
            System.out.println("Choisir quelle jeux: 1)Counter-Strike   2)Assassin's Creed");
            int j2 = sc.nextInt();
            int choix2 = j2;
            switch(choix2) {
                case 1:
                    this.Tjeux="Counter-Strike";
                    break;
                case 2:
                    this.Tjeux="Assassin's Creed";
                    break;
                default:
                    System.out.println("Choix incorrect");
            }
            break;
        default:
            System.out.println("Choix incorrect");
            break;
    }
}

//saisir horaire
    public void saisirHoraire(){
        Scanner sc = new Scanner(System.in);
        int str = sc.nextInt();
        int choix = str;
        switch(choix){
            case 1:
                this.horaire=30;
                this.prix =5;
                break;
            case 2:
                this.horaire=60;
                this.prix =10;
                break;
            case 3:
                this.horaire=120;
                this.prix =18;
                break;
            case 4:
                this.horaire=300;
                this.prix =40;
                break;
            case 5:
                this.horaire=1440;
                this.prix =65;
                break;
            default:
                System.out.println("Choix incorrect");
                break;
        }
    }

        public static String getMd5Hash(String input)
        {
            try
            {
//static getInstance() method is called with hashing MD5
                MessageDigest md = MessageDigest.getInstance("MD5");
//calculating message digest of an input that return array of byte
                byte[] messageDigest = md.digest(input.getBytes());
//converting byte array into signum representation
                BigInteger no = new BigInteger(1, messageDigest);
//converting message digest into hex value
                String hashtext = no.toString(16);
                while (hashtext.length() < 32)
                {
                    hashtext = "0" + hashtext;
                }
                code = hashtext.substring(0,6);
                return hashtext;
            }
//for specifying wrong message digest algorithms
            catch (NoSuchAlgorithmException e)
            {
                throw new RuntimeException(e);
            }
        }
    public void add_info(){
        info.add(new Session(this.nom,this.prenom,this.console, this.ecran,this.horaire, this.prix,this.jeux,this.Tjeux ,code));
        benefices.addprix(this.prix);
    }
    public void print_all_users() throws ParseException {

        int i = 1;
        for(Session car: info) {
            System.out.println(" ==================  "+i+" =====================");
            car.printlist();
            i++;
        }
        Game game=new Game();
        game.Afficher();
    }
}
