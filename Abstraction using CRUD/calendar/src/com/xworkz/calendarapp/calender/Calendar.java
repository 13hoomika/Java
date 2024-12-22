package com.xworkz.calendarapp.calender;
import com.xworkz.calendarapp.EventInterface;
import com.xworkz.calendarapp.event.Events;
import com.xworkz.calendarapp.constants.EventType;

import java.awt.*;
import java.util.Arrays;

public class Calendar implements EventInterface {
    Events event[] = new Events[4];
    int index;
    //Add Events
    @Override
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

    @Override
    public  void getAllEvents(){
        System.out.println("************ All Events ********************");
        for (Events eve: event){
            if (eve != null)
            {
                System.out.println("Event Id: " + eve.getEventId());
                System.out.println("Event by Who: " + eve.getWho());
                System.out.println("Event Start date: " + eve.getStartDate() );
                System.out.println("Event Start date: " + eve.getEndDate() );
                System.out.println("Event Type: "+ eve.getEventType());
                System.out.println("Event Description: " + eve.getDescription());
                System.out.println("All Day Event: " + eve.isAllDayEvent());
                System.out.println("--------------------------------------------");
            }
        }
    }

    @Override
    public Events getEventById(int id){
        System.out.println("________ getEventById __________");
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

    // get Event By Who
    @Override
    public Events getEventByWho(String eWho){
        System.out.println("__________ getEventByWho ________");
        Events returnEvent = null;
        for (Events eve : event){
            if (eve != null && eve.getWho() == eWho){
                returnEvent = eve;
                System.out.println("Event Id: " + eve.getEventId());
                System.out.println("Event by Who: " + eve.getWho());
                System.out.println("Event Start date: " + eve.getStartDate() );
                System.out.println("Event Start date: " + eve.getEndDate() );
                System.out.println("Event Type: "+ eve.getEventType());
                System.out.println("Event Description: " + eve.getDescription());
                System.out.println("All Day Event: " + eve.isAllDayEvent());
                System.out.println("---------------------");
                break;
            }
        }
        if (returnEvent == null)
            System.out.println("Given Event with " + eWho + " not found");

        return returnEvent;
    }

    @Override
    public EventType getEventByEventType(EventType eventType){
        System.out.println("__________ getEventByEventType ________");
        EventType eventToBeReturned = null;
        for (Events type : event){
            if(type!= null && type.getEventType() == eventType){
                eventToBeReturned = eventType;

                System.out.println("Event Id: " + type.getEventId());
                System.out.println("Event by Who: " + type.getWho());
                System.out.println("Event Start date: " + type.getStartDate() );
                System.out.println("Event End date: " + type.getEndDate() );
                System.out.println("Event Type: "+ type.getEventType());
                System.out.println("Event Description: " + type.getDescription());
                System.out.println("All Day Event: " + type.isAllDayEvent());
                System.out.println("---------------------");
                break;
            }
        }
        if (eventToBeReturned == null) System.out.println("Given Event Type " + eventType + " not found");
        return eventToBeReturned;
    }
@Override
    public Events getEventByStartDate(String startDate){
        System.out.println("__________ getEventByStartDate ________");
        Events eventToBeReturned = null;
        for (Events sDate: event){
            if (sDate != null && sDate.getStartDate() == startDate){
                eventToBeReturned = sDate;

                System.out.println("Event Id: " + sDate.getEventId());
                System.out.println("Event by Who: " + sDate.getWho());
                System.out.println("Event Start date: " + sDate.getStartDate() );
                System.out.println("Event End date: " + sDate.getEndDate() );
                System.out.println("Event Type: "+ sDate.getEventType());
                System.out.println("Event Description: " + sDate.getDescription());
                System.out.println("All Day Event: " + sDate.isAllDayEvent());
                System.out.println("---------------------");

            }
        }
        if (eventToBeReturned == null) System.out.println("No event starting on " + startDate + " was found.");
        return eventToBeReturned;
    }

    @Override
    public Events getEventByEndDate(String endDate){
        System.out.println("__________ getEventByEndDate ________");
        Events eventToBeReturned = null;
        for (Events eDate : event){
            if ( eDate != null && eDate.getEndDate() == endDate){
                eventToBeReturned = eDate;

                System.out.println("Event Id: " + eDate.getEventId());
                System.out.println("Event by Who: " + eDate.getWho());
                System.out.println("Event Start date: " + eDate.getStartDate() );
                System.out.println("Event End date: " + eDate.getEndDate() );
                System.out.println("Event Type: "+ eDate.getEventType());
                System.out.println("Event Description: " + eDate.getDescription());
                System.out.println("All Day Event: " + eDate.isAllDayEvent());
                System.out.println("---------------------");
            }
        }
        if (eventToBeReturned == null) System.out.println("No event ending on " + endDate + " was found.");
        return eventToBeReturned;
    }

    @Override
    public String getWhoByStartDate(String startDate){
        System.out.println("__________ getWhoByStartDate ________");
        String eventToBeReturned = null;
        for (Events sDate : event){
            if (sDate != null && sDate.getStartDate() == startDate){
                eventToBeReturned = sDate.getWho();

                System.out.println("Event by Who: " + sDate.getWho());
                System.out.println("Event Start date: " + sDate.getStartDate() );
                System.out.println("---------------------");
            }
        }
        if (eventToBeReturned == null) System.out.println("No event starting on " + startDate + " was found.");
        return eventToBeReturned;
    }

    @Override
    public String getWhoByEndDate(String endDate){
        System.out.println("__________ getWhoByEndDate ________");
        String returnEvent = null;
        for(Events edate: event){
            if (edate != null &&  edate.getEndDate() == endDate){
                returnEvent = edate.getWho();
                System.out.println("Event by Who: " + edate.getWho());
                System.out.println("Event by End Date: " + edate.getEndDate());
            }
        }
        return returnEvent;
    }

    @Override
    public EventType getEventTypeById(int id){
        System.out.println("__________ getEventTypeById ________");
        EventType returnEventType = null;
        for (Events eId : event){
            if (eId != null && eId.getEventId() == id){
                returnEventType = eId.getEventType();
                System.out.println("Id: " + eId.getEventId());
                System.out.println("Event Type: " + eId.getEventType());
            }
        }
        if (returnEventType == null) System.out.println("Not Found");
        return returnEventType;
    }

    @Override
    public boolean getAllDayEventByEventType(EventType type){
        System.out.println("__________ getAllDayEventByEventType ________");
        boolean returnEventType = false;
        for (Events eType : event){
            if(eType != null && eType.getEventType() == type){
                returnEventType = eType.isAllDayEvent();

                System.out.println("Event Id: " + eType.getEventId());
                System.out.println("Event type: " + eType.getEventType());
                System.out.println("All Day Event: " + eType.isAllDayEvent());
            }
        }
        if (returnEventType == false) System.out.println("Not found");
        return  returnEventType;
    }

    @Override
    public boolean updateStartDateByWho(String who, String updatedStartDate){
        System.out.println("__________ updateStartDateByWho ________");
        boolean isStartDateUpdated = false;
        for (Events eWho :event){
            if (eWho != null && eWho.getWho() == who){
                eWho.setStartDate(updatedStartDate);
                isStartDateUpdated = true;

                System.out.println("who: " + eWho.getWho());
                System.out.println("is Start Date Updated: " + isStartDateUpdated);
            }
        }
        if (isStartDateUpdated == false) System.out.println(who + " Not Found");
        return isStartDateUpdated;
    }

    @Override
    public boolean updateStartAndEndDateByWho(String who, String upadtedStartaDate, String upadtedEndDate){
        System.out.println("__________ updateStartAndEndDateByWho ________");
        boolean isStartAndEndDateUpdated = false;
        for (Events eWho : event){
            if (eWho != null && eWho.getWho() == who){
                eWho.setStartDate(upadtedStartaDate);
                eWho.setEndDate(upadtedEndDate);
                isStartAndEndDateUpdated = true;

                System.out.println("who: " + eWho.getWho());
                System.out.println("is Start Date Updated: " + isStartAndEndDateUpdated);
            }
        }
        if (isStartAndEndDateUpdated == false) System.out.println(who + " Not Found");
        return isStartAndEndDateUpdated;
    }

    //deletion operation
    @Override
    public boolean deleteEventById(int id){
        System.out.println("__________ deleteEventById ________");
        boolean isEventDeleted = false;
        int newIndex = 0;

        // Loop through the events array
        for (int start= 0 ; start < this.event.length ; start ++){
            Events currentEvent = this.event[start];

//            // Check if the current event's ID matches the ID to be deleted
//            if (event[start].getEventId() != id){
//                this.event[newIndex++] = this.event[start];
//            }else isEventDeleted = true;

            // Check if the current event is not null and if its ID matches the ID to be deleted
            if (currentEvent != null && currentEvent.getEventId() != id) {
                this.event[newIndex++] = currentEvent; // If it doesn't match, keep it in the new array
            } else
                isEventDeleted = true; // Mark as deleted if the ID matches

        }
        int size = newIndex; // Resize the array to the new size
        event = Arrays.copyOf(event,size);
        System.out.println("is Event deleted: " + isEventDeleted);

        // Print a message if the event was not found
        if (!isEventDeleted) {
            System.out.println("Event not found");
        } else {
            System.out.println("Event " + id + " deleted successfully");
        }
        return isEventDeleted;
    }
}
