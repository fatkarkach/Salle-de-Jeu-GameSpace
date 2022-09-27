import java.text.ParseException;
import java.util.Scanner;
public class Game {
    public void Afficher() throws ParseException {
        System.out.println("--------------------Bienvenue dans le salon FAHOWORLD---------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir votre choix : 1)Reservation     2)Bénéfices   3)users  4)list 5)Quitter");
        int str = sc.nextInt();
        int choix = str;
        switch (choix) {

            case 1:
                System.out.println("--------------------Résérvation---------------1------------------");
                Reservation reservation = new Reservation();
                reservation.saisir();
                break;

            case 2:
                System.out.println("--------------------Bénéfices--------------------");
                Benefices benefices = new Benefices();
                Benefices.get_beefices_today();
                Benefices.get_beefices_month();
                Benefices.get_beefices_year();
                break;
            case 3:
                System.out.println("----------- users --------");
                Poste information =new Poste();
                information.print_all_users();
                break;
            case 4:
                System.out.println("----------- all post active and post fill d'attend --------");
                PostActive posts_active =new PostActive();
                posts_active.get_allpostactive();
                break;
            case 5:
                System.out.println("Quitter");
                System.exit(0);
                break;
            default:
                System.out.println("Choix incorrect");
                break;
        }
    }

}
