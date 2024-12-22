package com.xworkz.calendarapp.event;

import com.xworkz.calendarapp.constants.EventType;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Events {
    private int eventId;
    private String startDate;
    private String endDate;
    private String who;
    private String description;
    private EventType eventType;
    private boolean allDayEvent;
}
