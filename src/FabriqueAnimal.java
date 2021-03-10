public class FabriqueAnimal {

    private static FabriqueAnimal INSTANCE;


    private FabriqueAnimal() {}

    public synchronized static FabriqueAnimal getInstance(){
        if (INSTANCE == null){
            INSTANCE = new FabriqueAnimal();
        }
        return INSTANCE;
    }

    public Animal getAnimal(String typeAnimal)
    {
        if (typeAnimal.equals("chat"))
            return new Chat();
        else if (typeAnimal.equals("chien"))
            return new Chien();
        else
            System.out.println("Impossible de créer un " + typeAnimal);
            return null;
    }

}
