package appstuio60.billardboard.model;

/**
 * Created by Nicolaj Pedersen on 16-12-2017.
 */
public class Person {

    String name;
    String id;

    public Person(String name) {
        this.name = name;
        this.id = generateId();
    }

    private String generateId() {
        //TODO: generate Id;
        return "player Id";
    }


}
