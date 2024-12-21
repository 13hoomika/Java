public class Applications {
	static int eventId;
    static String startDate;
    static String endDate;
    static String who;
    static String description;
    static EventType eventType;
    static boolean allDayEvent;
	
    Events Apps[] = new Apps[4];
    int index;
    //Add Events
    public boolean addEvent(Events event){
        boolean isAdded = false;

        if(event.getEventId() > 0
                && event.getWho() != null && event.getEventType() != null
                && index < this.event.length)
        {
            this.event[index++] = event;
            isAdded = true;
            //System.out.println("Event added: " + isAdded);
        } else
        if(index >= this.event.length){
            System.out.println("Cannot add event: The calendar is full!!");
        }else
            System.out.println("Invalid event data!!");

        return isAdded;
    }
	
	public Events getEventById(int id){
        Events eventToBeReturned =null;
        for (Events eId: event){
            if (eId != null && eId.getEventId() == id){
                eventToBeReturned = eId;

                System.out.println("Event Id: " + eId.getEventId());
                System.out.println("Event by Who: " + eId.getWho());
                System.out.println("Event Start date: " + eId.getStartDate() );
                System.out.println("Event Start date: " + eId.getEndDate() );
                System.out.println("Event Type: "+ eId.getEventType());
                System.out.println("Event Description: " + eId.getDescription());
                System.out.println("All Day Event: " + eId.isAllDayEvent());
                System.out.println("---------------------");
            }
        }
        if (eventToBeReturned == null){
            System.out.println("Given Event Id " + id + " not found");
        }
        return eventToBeReturned;
    }