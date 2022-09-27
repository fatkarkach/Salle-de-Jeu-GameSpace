import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Reservation {
    public  String code;
    Game game=new Game();
    PostActive postActive=new PostActive();
    public static   java.util.Date date = new java.util.Date();
    public static   Timestamp timestamp1 = new Timestamp(date.getTime());

    // create a calendar and assign it the same time
    public static   Calendar cal = Calendar.getInstance();

    // Creating a SimpleDateFormat object
    // to parse time in the format HH:MM:SS

    public static int time_select;

    public void saisir() throws ParseException {
//        if(postActive.q.size()<8){
        if(postActive.q.size()<2){
            Poste poste= new Poste();
            System.out.println("Choisie un horaire");
            System.out.println("1)30min      2)1h     3)2h     4)5h     5)24h");
            poste.saisirHoraire();
            time_select = poste.horaire;
            cal.setTimeInMillis(timestamp1.getTime());

            // add a bunch of seconds to the calendar
            cal.add(Calendar.MINUTE, time_select);

            // create a  second time stamp
            Timestamp timestamp2 = new Timestamp(cal.getTime().getTime());

            // get time difference in seconds
//            System.out.println(String.valueOf(timestamp2).substring(11,19));
            int hour = Integer.valueOf(String.valueOf(timestamp2).substring(11,13));
            int minute = Integer.valueOf(String.valueOf(timestamp2).substring(14,16));
            int second = Integer.valueOf(String.valueOf(timestamp2).substring(17,19));

            LocalTime time1 = LocalTime.of(hour, minute, second);
            LocalTime time2 = LocalTime.of(20, 00, 00);
            LocalTime time3 = LocalTime.of(12, 00, 00);
            // Calculating the difference in Hours
            long hours = ChronoUnit.HOURS.between(time1, time2);

            // Calculating the difference in Minutes
            long minutes = ChronoUnit.MINUTES.between(time1, time2) % 60;

            // Calculating the difference in Seconds
            long seconds = ChronoUnit.SECONDS.between(time1, time2) % 60;
            //time 12

            // Calculating the difference in Hours
            long hours1 = ChronoUnit.HOURS.between(time1, time3);

            // Calculating the difference in Minutes
            long minutes1 = ChronoUnit.MINUTES.between(time1, time3) % 60;

            // Calculating the difference in Seconds
            long seconds1= ChronoUnit.SECONDS.between(time1, time3) % 60;

            // Printing the difference
//            System.out.println(
//                    "Difference is " + hours + " hours " + minutes
//                            + " minutes " + seconds + " seconds.");

            if ( hours>=0 && minutes>=0 ||  hours1>=0 && minutes1>=0 ){
                System.out.println("Saisir le Nom :");
                Scanner sc = new Scanner(System.in);
                String nom = sc.nextLine();
                poste.nom = nom;
                System.out.println("Saisir le Prénom :");
                String prenom = sc.nextLine();
                poste.prenom = prenom;
                System.out.println( "Saisir le console :");
                System.out.println("1)Xbox      2)PlayStation5     3)Nintendo switch");
                poste.saisirConsol();
                System.out.println( "Saisir le  type d'ecran :");
                System.out.println("1)Dell      2)HP     3)Asus     4)Samsung");
                poste.saisirEcran();
                System.out.println( "Saisir le jeux :");
                System.out.println("1)football      2)Guerre ");
                poste.saisirjeux();
                System.out.println("le code de joueure est :");
                code=poste.getMd5Hash(nom+prenom).substring(0,6);
//            if(postActive.postes.size()<9){
                if(postActive.postes.size()<2){
                    postActive.Postecourant(code);
                    postActive.Time_courant(String.valueOf(timestamp2).substring(11,19));
                    poste.add_info();
//            }else if(postActive.q.size()<8){
                }else if(postActive.q.size()<2){
                    poste.add_info();
                    postActive.FileD(code);
                    postActive.Time_FileD(time_select);
                }
                System.out.println(code);
            }
            else {
                System.out.println("tan ghda  wrj3");
            }
        }else{
            System.out.println("n'a pas de places dans fille d'attend");
        }
        game.Afficher();
    }

}

