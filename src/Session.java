public class Session {
    public  String console ;
    public String ecran;
    public int horaire;
    public  int prix;
    public String prenom;
    public String nom;
    public String code;
    public String jeux;
    public String Tjeux;
    public Session(String nom,String prenom,String console, String ecran, int horaire, int prix, String jeux,String Tjeux,String code) {
        this.nom = nom;
        this.prenom= prenom;
        this.console = console;
        this.ecran= ecran;
        this.horaire= horaire;
        this.jeux= jeux;
        this.Tjeux= Tjeux;
        this.prix= prix;
        this.code = code;
    }

    public void printlist() {
        System.out.println("nom : "+this.nom + "\nprenom : " + this.prenom + "\nconsole : " +this.console + "\necran : " + this.ecran + "\nhoraire : " +this.horaire+ "\nprix : " +this.prix+ "\njeux : " +this.jeux + "\ntype_jeux : " +this.Tjeux+ "\ncode : " +code);
    }

}
