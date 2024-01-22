import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Event event1 = new Event("Concert", 250.0);
        Event event2 = new Event("Rock concert", 350.0);
        List<Event> eventList = new ArrayList<>();
        eventList.add(event1);
        eventList.add(event2);
        TicketShop ticketShop = new TicketShop(eventList);

        try {
            ticketShop.process("Concert", 150);
            ticketShop.process("Theatre", 150);
            ticketShop.process("Rock concert", 350);
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}