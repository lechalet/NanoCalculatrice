import java.util.Arrays;
import java.util.Scanner;

class app {

    public static void main(String[] args) {
        System.out.println("------------");
        System.out.println("CALCULATRICE");
        System.out.println("------------");

        Boolean responce = true;

        while (responce) {
            Scanner scan = new Scanner(System.in);
            Scanner res = new Scanner(System.in);
            String operation;
    
            System.out.print("Ton opération : ");
            // Saisie de l'opération
            operation = scan.nextLine();
    
            // Découpe la saisie
            String[] operations = operation.split(" ");
    
            if (!isNumeric(operations[0]) || !isNumeric(operations[2])) {
                System.out.print("Ton opération n'est pas logique");
                System.out.println();
            }
            if (operations.length > 3) {
                System.out.print("Navré mais je ne peux faire que des opérations à 2 entiers !");
                System.out.println();
            }
            if (operations.length <= 2) {
                System.out.print("Utilise les espaces sinon je ne peux pas faire le calcul !");
                System.out.println();
            } 
            if (isNumeric(operations[0]) && isNumeric(operations[2])) {
            
                int nbr1 = Integer.parseInt(operations[0]);
    
                int nbr2 = Integer.parseInt(operations[2]);
                // Addition
                if (operations[1].equalsIgnoreCase("+") && operations.length <= 3) {
                    // Division
                    int resultat = nbr1 + nbr2;
                    System.out.println("Résultat de l'opération :" + resultat);
                }
                // Division
                if (operations[1].equalsIgnoreCase("/") && operations.length <= 3) {
                    int resultat = nbr1 / nbr2;
                    System.out.println("Résultat de l'opération :" + resultat);
                }
                // Multiplication
                if (operations[1].equalsIgnoreCase("*") && operations.length <= 3) {
                    // Division
                    int resultat = nbr1 * nbr2;
                    System.out.println("Résultat de l'opération :" + resultat);
                }
                // Soustraction
                if (operations[1].equalsIgnoreCase("-") && operations.length <= 3) {
                    // Division
                    int resultat = nbr1 - nbr2;
                    System.out.println("Résultat de l'opération :" + resultat);
                }
            }
            // Refaire l'oppération
            System.out.print("Veux-tu effectuer une nouvelle opération ? true or false");
            System.out.println();
    
            Boolean response = res.nextBoolean();
    
            if (!response) {
                System.out.println("La calculatrice à bien été fermé ! :)");
            }
        }

    }

    public static boolean isNumeric(String strNum) {
        return strNum.matches("-?\\d+(\\.\\d+)?");
    }
}