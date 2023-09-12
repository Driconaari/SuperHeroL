import java.util.ArrayList;

public class Controller {
    private Database db;

    public Controller(Database db) {
        this.db = db;
    }

    public void addSuperhero(String name, String realName, boolean isHuman, int creationYear, String strength) {
        Superhero superhero = new Superhero(name, realName, isHuman, creationYear, strength);
        db.addSuperhero(superhero);
    }

    public ArrayList<Superhero> getAllSuperheroes() {
        return db.getAllSuperheroes();
    }
}
