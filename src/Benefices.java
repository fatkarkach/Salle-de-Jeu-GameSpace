import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;

public class Benefices {

    //Tue Sep 27 09:31:37 WEST 2022
    public static   java.util.Date date = new java.util.Date();
    // //2022-09-27 09:40:37.767
    public static Timestamp timestamp1 = new Timestamp(date.getTime());
    public static int month =Integer.parseInt(timestamp1.toString().substring(5,7));
    public static int day = Integer.parseInt(timestamp1.toString().substring(8,10));
    public static int year = Integer.parseInt(timestamp1.toString().substring(0,4));
    public static int vertexCount = 12;
    public static int some_of_Benefits_month = 0;
    public static int some_of_Benefits_year = 0;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>(vertexCount);
    public static Game game=new Game();

    public static void first_day_execute_code_fatma(){
        for(int i=0; i < vertexCount; i++) {
            graph.add(new ArrayList());
        }

        for(int i=0; i < vertexCount; i++) {
            for(int j=0; j<=31; j++){
                graph.get(i).add(0);
            }
        }
    }
    public static void addprix(int prix){
        int aa = graph.get(month).get(day);
        graph.get(month).add(day,aa+prix);
    }
    public static void get_beefices_today()  {
        System.out.println(" Benefits of this day : "+day+" =======>>>> "+graph.get(month).get(day) +"DH");
    }

    public static void get_beefices_month(){
        for(int i=0; i < graph.get(month).size(); i++) {
                some_of_Benefits_month += graph.get(month).get(i);
        }
        System.out.println(" Benefits of this month : "+month+" =======>>>> "+some_of_Benefits_month+"DH");
    }
    public static void get_beefices_year() throws ParseException {
        for(int i=0; i < graph.size(); i++) {
            for(int j=0; j<graph.get(i).size(); j++){
                some_of_Benefits_year += graph.get(i).get(j);
            }
        }
        System.out.println(" Benefits of this year : "+year+" =======>>>> "+some_of_Benefits_year+"DH");
        game.Afficher();
    }


}
