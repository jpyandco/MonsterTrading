package at.technikum.apps.mtcg.entity;

public abstract class Entity {
    //von private auf protected 30.11
    protected String id;

    protected String name;

    protected String description;

    protected String password;

    protected boolean done;

    public Entity() {
    }

    public Entity(String id, String name, String description, boolean done) {
        this.id = id; //id muss noch automatisch generiert werden
        this.name = name;
        this.description = description;
        this.done = done;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

}
