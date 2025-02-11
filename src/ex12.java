public class ex12 {
    public static void main(String[] args) {
        // Création de la chaîne initiale
        String nombreInit = "42424242";
        
        // Remplacement de tous les "42" par "quarante-deux"
        String nombreFinal = nombreInit.replaceAll("42", "quarante-deux ");
        
        // Affichage du résultat
        System.out.println("Résultat : " + nombreFinal);
    }
}
