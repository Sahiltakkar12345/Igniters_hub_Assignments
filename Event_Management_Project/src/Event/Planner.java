package Event;

import java.util.ArrayList;
import java.util.List;

public class Planner {
    private List<User> users;
    private List<Events> events;

    public Planner() {
        users = new ArrayList<>();
        events = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void addEvent(Events event) {
        events.add(event);
    }

    public void removeEvent(Events event) {
        events.remove(event);
    }

    public User findUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public Events findEventByTitle(String title) {
        for (Events   event : events) {
            if (event.getTitle().equals(title)) {
                return event;
            }
        }
        return null;
    }

}
