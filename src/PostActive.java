import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PostActive {
    public static ArrayList < String> postes = new ArrayList<String>();
    public static ArrayList < String> time_all_post = new ArrayList<String>();
    public static Queue<String> q = new LinkedList<>();
    public static Queue<Integer> time_list_q = new LinkedList<>();
    static Game game=new Game();
    public static void Postecourant(String  postactive) {
        postes.add(postactive);
    }
    public static void Time_courant(String  time_courant) {
        time_all_post.add(time_courant);
    }
    public static void FileD(String postactive ){
            q.add(postactive);
    }
    public static void Time_FileD(int postactive ){
        time_list_q.add(postactive);
    }
    public static void get_allpostactive() throws ParseException {
        System.out.println("postactive " +postes);
        System.out.println("time  " +time_all_post);
        System.out.println("fill d'attend "+q);
        System.out.println("time  fill d'attend" +time_list_q);
        game.Afficher();
    }
}