import java.util.Optional;

public class ex5 {
    public static void main(String[] args) {
   
        Integer valeurInitiale = null;
        
       
        Integer resultat = Optional.ofNullable(valeurInitiale).orElse(42);
        
        System.out.println("La valeur finale est : " + resultat);
    }
}
