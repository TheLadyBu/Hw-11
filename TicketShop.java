import java.util.List;

public class TicketShop {
    private List<Event> events;
    private int soldAmount;

    public TicketShop(List<Event> events) {
        this.events = events;
        this.soldAmount = 0;
    }

    public void process(String eventName, double ticketPrice) {
        Event selectedEvent = null;

        for (Event event : events) {
            if (event.getName().equals(eventName)) {
                selectedEvent = event;
                break;
            }
        }

        if (selectedEvent == null) {
            throw new IllegalArgumentException("Event not found");
        }

        if (selectedEvent.getPrice() > ticketPrice) {
            throw new IllegalStateException("Ticket price is too low");
        }

        soldAmount++;
        System.out.println("Ticket for " + eventName + " sold successfully. Sold Amount: " + soldAmount);
    }
}