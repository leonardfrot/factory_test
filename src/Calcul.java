public class Calcul {

    private double resultat;

    public double getResultat() {
        return resultat;
    }

    public static Calcul addition(double a, double b){
        return new Calcul(a, b, "addition");
    }

    public static Calcul soustraction(double a, double b){
        return new Calcul(a, b, "soustraction");
    }

    public static Calcul multiplication(double a, double b){
        return new Calcul(a, b, "multiplication");
    }

    public static Calcul division(double a, double b){
        return new Calcul(a, b, "division");
    }


    private Calcul(double a, double b, String type){
        switch(type){
            case "addition": this.resultat = a + b;
            break;
            case "soustraction": this.resultat = a - b;
            break;
            case "multiplication": this.resultat = a * b;
            break;
            case "division": this.resultat = a / b;
            break;
            default: this.resultat = 0;
            break;
        }
    }
}
