import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Controller controller = new Controller(database);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tilføj Superhelt");
            System.out.println("2. Vis alle Superhelte");
            System.out.println("3. Søg efter Superhelt");
            System.out.println("4. Afslut");

            int valg = scanner.nextInt();
            scanner.nextLine(); // Læs en linje for at håndtere Enter-tasten

            switch (valg) {
                case 1:
                    System.out.print("Navn: ");
                    String name = scanner.nextLine();
                    System.out.print("Rigtige navn: ");
                    String realName = scanner.nextLine();
                    System.out.print("Er menneske (ja/nej): ");
                    boolean isHuman = scanner.nextLine().equalsIgnoreCase("ja");
                    System.out.print("Skabelsesår: ");
                    int creationYear = scanner.nextInt();
                    scanner.nextLine(); // Læs en linje for at håndtere Enter-tasten
                    System.out.print("Styrke: ");
                    String strength = scanner.nextLine();
                    controller.addSuperhero(name, realName, isHuman, creationYear, strength);
                    break;
                case 2:
                    ArrayList<Superhero> superheroes = controller.getAllSuperheroes();
                    if (superheroes.isEmpty()) {
                        System.out.println("Der er ingen superhelte i databasen.");
                    } else {
                        System.out.println("Liste over superhelte:");
                        for (Superhero superhero : superheroes) {
                            System.out.println("Navn: " + superhero.getName());
                            System.out.println("Rigtige navn: " + superhero.getRealName());
                            System.out.println("Er menneske: " + (superhero.isHuman() ? "Ja" : "Nej"));
                            System.out.println("Skabelsesår: " + superhero.getCreationYear());
                            System.out.println("Styrke: " + superhero.getStrength());
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    // Implementer søgning efter superhelte, hvis nødvendigt
                    break;
                case 4:
                    System.out.println("Farvel!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ugyldigt valg. Prøv igen.");
            }
        }
    }
}
