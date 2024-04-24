package Event;

public class RecurrentEvent extends Events {
    private String frequency;

    public RecurrentEvent(String title, String description, String frequency) {
        super(title, description);
        this.frequency = frequency;
    }

    @Override
    public void displayDetails() {
        System.out.println("Recurrent Event: " + getTitle());
        System.out.println("Frequency: " + frequency);
    }

}
