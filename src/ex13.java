public class ex13 {
    public static void main(String[] args) {
        // Déclaration des variables initiales
        int a = 24;
        int b = 42;
        
        // Affichage des valeurs initiales
        System.out.println("Avant l'échange : a = " + a + ", b = " + b);
        
        // Échange des valeurs avec une variable temporaire
        int temp = a;
        a = b;
        b = temp;
        
        // Affichage des valeurs après échange
        System.out.println("Après l'échange : a = " + a + ", b = " + b);
    }
}  
