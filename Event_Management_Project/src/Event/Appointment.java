package Event;

public class Appointment extends Events {
    private String location;
    private String date;

    public Appointment(String title, String description, String location, String date) {
        super(title, description);
        this.location = location;
        this.date = date;
    }

    @Override
    public void displayDetails() {
        System.out.println("Appointment: " + getTitle());
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
    }

}
