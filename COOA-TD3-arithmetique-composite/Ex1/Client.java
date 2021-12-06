public class Client {
    public static void main(String[] args) {
        Nombre Uno = new Nombre (1);
        Nombre Dos = new Nombre (2);
        Nombre Tres = new Nombre (3);
        Expression Racine = new NoeudInterne(+, Uno, new NoeudInterne(-,Tres, Dos));
        Systeme.out.println(calculerValeur(Racine));
    }
}