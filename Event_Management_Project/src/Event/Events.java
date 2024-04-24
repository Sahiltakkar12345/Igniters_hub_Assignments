package Event;

public abstract class Events {
    private String title;
    private String description;

    public Events(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public abstract void displayDetails();

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
