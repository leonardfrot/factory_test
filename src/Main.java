import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("--test Animal");
        System.out.println();

        try {
            Animal chien = FabriqueAnimal.getInstance().getAnimal("chien");
            chien.MyName();
            Animal chat = FabriqueAnimal.getInstance().getAnimal("chat");
            chat.MyName();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println();



        System.out.println("--test Calcul");
        System.out.println();

        double a = 10;
        double b = 15;
        List<Double> list = new ArrayList<>();

        try {
            double resAddition = Calcul.addition(a, b).getResultat();
            double resSoustraction = Calcul.soustraction(a, b).getResultat();
            double resMultiplication = Calcul.multiplication(a, b).getResultat();
            double resDivision = Calcul.division(a, b).getResultat();
            list.add(resAddition);
            list.add(resSoustraction);
            list.add(resMultiplication);
            list.add(resDivision);
        }catch(Exception e){
            e.printStackTrace();
        }

        for (double res : list){
            System.out.println(res);
        }
    }
}
