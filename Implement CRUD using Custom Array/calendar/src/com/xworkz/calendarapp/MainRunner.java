package com.xworkz.calendarapp;

import com.xworkz.calendarapp.calender.Calendar;
import com.xworkz.calendarapp.constants.EventType;
import com.xworkz.calendarapp.event.Events;

public class MainRunner {
    public static void main(String[] args) {
//        //@Builder annotation  -> helps to create object without using new keyword
//        Events events = Events.builder().eventId(1)
//                .who("Bhoomika C P")
//                .eventType(EventType.HOLIDAY)
//                .allDayEvent(true)
//                .startDate("22-11-2024").endDate("24-11-2024")
//                .description("Christmas Eve")
//                .build();
//
//        System.out.println("Event Id: " + events.getEventId());
//        System.out.println("Event by Who: " + events.getWho());
//        System.out.println("Event Start date: " + events.getStartDate() );
//        System.out.println("Event Start date: " + events.getEndDate() );
//        System.out.println("Event Type: "+ events.getEventType());
//        System.out.println("Event Description: " + events.getDescription());
//        System.out.println("is this Event all day Event: " + events.isAllDayEvent());
//        System.out.println("---------------------------------------------------------");

        Events event1 = new Events();
        event1.setEventId(1);
        event1.setWho("Chris");
        event1.setStartDate("19-11-2024");
        event1.setEndDate("21-11-2024");
        event1.setEventType(EventType.HOLIDAY);
        event1.setDescription("Christmas");
        event1.setAllDayEvent(true);

        Events event2 = new Events();
        event2.setEventId(2);
        event2.setWho("Karan");
        event2.setStartDate("20-11-2024");
        event2.setEndDate("25-11-2024");
        event2.setEventType(EventType.TRAVEL);
        event2.setDescription("Traveling to HomeTown ");
        event2.setAllDayEvent(true);

        Events event3 = new Events();
        event3.setEventId(3);
        event3.setWho("Han");
        event3.setStartDate("20-11-2024");
        event3.setEndDate("20-11-2024");
        event3.setEventType(EventType.BIRTHDAY);
        event3.setDescription("Sister's Birthday ");
        event3.setAllDayEvent(false);

        Events event4 = new Events();
        event4.setEventId(4);
        event4.setWho("Apoorva");
        event4.setEventType(EventType.TRAVEL);
        event4.setAllDayEvent(true);

        // Create
        //System.out.println("************ Add Events ********************");
        Calendar calendar = new Calendar();
        calendar.addEvent(event1);
        calendar.addEvent(event2);
        calendar.addEvent(event3);
        calendar.addEvent(event4);

        // Read
        System.out.println("************ Search Events ************");
        System.out.println("________ getEventById __________");
        calendar.getEventById(3);
        calendar.getEventById(4);

        System.out.println("__________ getEventByWho ________");
        calendar.getEventByWho("Chris");
        calendar.getEventByWho("Apoorva");

        System.out.println("__________ getEventByEventType ________");
        calendar.getEventByEventType(EventType.TRAVEL);

        System.out.println("__________ getEventByStartDate ________");
        calendar.getEventByStartDate("20-11-2024");
        calendar.getEventByStartDate("21-11-2024");

        System.out.println("__________ getEventByEndDate ________");
        calendar.getEventByEndDate("21-11-2024");
        calendar.getEventByEndDate("28-11-2024");

        System.out.println("__________ getWhoByStartDate ________");
        calendar.getWhoByStartDate("20-11-2024");

        System.out.println("__________ getWhoByEndDate ________");
        calendar.getWhoByEndDate("25-11-2024");

        System.out.println("__________ getEventTypeById ________");
        calendar.getEventTypeById(1);

        System.out.println("__________ getAllDayEventByEventType ________");
        calendar.getAllDayEventByEventType(EventType.BIRTHDAY);

        //Update
        System.out.println("__________ updateStartDateByWho ________");
        calendar.updateStartDateByWho("Chris","20-11-2024");

        System.out.println("__________ updateStartAndEndDateByWho ________");
        calendar.updateStartAndEndDateByWho("Karan","22-11-2024", "28-11-2024");

        //Delete
        System.out.println("__________ deleteEventById ________");
        calendar.deleteEventById(3);

        System.out.println("************ All Events ********************");
        calendar.getAllEvents();

    }
}
