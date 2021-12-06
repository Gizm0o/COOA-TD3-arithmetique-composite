
public class NoeudInterne extends Expression {
    private char operateurBinaire;
    private Expression premierOperande;
    private Expression deuxiemeOperande;

    public char getOperateurBinaire() {
        return operateurBinaire;
    }

    public void setOperateurBinaire(char operateurBinaire) {
        this.operateurBinaire = operateurBinaire;
    }

    public NoeudInterne(char operateurBinaire, Expression premierOperande, Expression deuxiemeOperande) {
        this.operateurBinaire = operateurBinaire;
        this.premierOperande = premierOperande;
        this.deuxiemeOperande = deuxiemeOperande;
    }

    public Expression getPremierOperande() {
        return premierOperande;
    }

    public void setPremierOperande(Expression premierOperande) {
        this.premierOperande = premierOperande;
    }

    public Expression getDeuxiemeOperande() {
        return deuxiemeOperande;
    }

    public void setDeuxiemeOperande(Expression deuxiemeOperande) {
        this.deuxiemeOperande = deuxiemeOperande;
    }

    double calculerValeur()
    {
        if(operateurBinaire == '-'){
            return premierOperande.calculerValeur() - deuxiemeOperande.calculerValeur();
        }
        if(operateurBinaire == '+'){
            return premierOperande.calculerValeur() + deuxiemeOperande.calculerValeur();
        }
        if(operateurBinaire == '*'){
            return premierOperande.calculerValeur() * deuxiemeOperande.calculerValeur();
        }
        if(operateurBinaire == '/'){
            return premierOperande.calculerValeur() / deuxiemeOperande.calculerValeur();
        }
        else
            exit;
        }
    }
}