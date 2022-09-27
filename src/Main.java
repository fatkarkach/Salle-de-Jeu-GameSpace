import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main extends TimerTask {
    public static PostActive time_all_post_instance = new PostActive();
    //  //Tue Sep 27 09:31:37 WEST 2022
    public static   java.util.Date date = new java.util.Date();
    //constructeur (year,month,day,millise):2022-09-27 10:15:15.026
    public static   Timestamp timestamp1 = new Timestamp(date.getTime());

    // create a calendar and assign it the same time est un classe abstratie
    public static   Calendar cal = Calendar.getInstance();

    public void run() {
        //heure locale
        LocalTime ltime = LocalTime.now();

        //ajouter un temps a aux cal
        cal.setTimeInMillis(timestamp1.getTime());

        int value = 0;
        //les heures des joeurs
        for (int i = 1; i <= time_all_post_instance.time_all_post.size(); i++) {
            //convertire a une string tous les heurs des joeurs actives
            LocalTime time1 = LocalTime.parse(time_all_post_instance.time_all_post.get(i-1));
            //comparer l'heure de joeur avec  heure actuelle
            value = time1.compareTo(LocalTime.parse(String.valueOf(ltime).substring(0, 8)));
            if (value <= 0){
                System.out.println("LocalTime1 is equal to" + " LocalTime2 or" + "LocalTime2 is greater");
                //va suppeimer dans le fils d'atteds dans le temps en min en calendrier
                cal.add(Calendar.MINUTE, time_all_post_instance.time_list_q.remove());

                Timestamp timestamp2 = new Timestamp(cal.getTime().getTime());
                System.out.println(String.valueOf(timestamp2).substring(11,19));
                time_all_post_instance.time_all_post.set(i-1,String.valueOf(timestamp2).substring(11,19));
                time_all_post_instance.postes.set(i-1, time_all_post_instance.q.remove());
            }
        }
    }
    public static void main(String[] args) throws NoSuchAlgorithmException, ParseException {
        Benefices benefices = new Benefices();
        Benefices.first_day_execute_code_fatma();
        Main myclass = new Main();
        Timer mytimer=new Timer();
        mytimer.schedule(myclass,2000,10000);
        Game game=new Game();
        game.Afficher();
    }
}