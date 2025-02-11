public class ex9 {
    public static void main(String[] args) {
        // Génération d'un nombre aléatoire entre 1 et 42
        int rand = (int)(Math.random() * 42) + 1;
        
        // Vérification si le nombre est égal à 42 (sans condition)
        boolean isEqual42 = Integer.valueOf(rand).equals(42);
        
        // Affichage des résultats
        System.out.println("Nombre généré : " + rand);
        System.out.println("Est égal à 42 : " + isEqual42);
    }
}
