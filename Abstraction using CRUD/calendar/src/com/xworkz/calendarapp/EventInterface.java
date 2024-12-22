package com.xworkz.calendarapp;

import com.xworkz.calendarapp.constants.EventType;
import com.xworkz.calendarapp.event.Events;

public interface EventInterface {
    public boolean addEvent(Events event);
    public  void getAllEvents();
    public Events getEventById(int id);
    public Events getEventByWho(String eWho);
    public EventType getEventByEventType(EventType eventType);
    public Events getEventByStartDate(String startDate);
    public Events getEventByEndDate(String endDate);
    public String getWhoByStartDate(String startDate);
    public String getWhoByEndDate(String endDate);
    public EventType getEventTypeById(int id);
    public boolean getAllDayEventByEventType(EventType type);
    public boolean updateStartDateByWho(String who, String updatedStartDate);
    public boolean updateStartAndEndDateByWho(String who, String upadtedStartaDate, String upadtedEndDate);
    public boolean deleteEventById(int id);
    }
