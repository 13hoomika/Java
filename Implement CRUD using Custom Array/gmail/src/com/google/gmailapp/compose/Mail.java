package com.google.gmailapp.compose;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Mail {
    private int id;
    private String to;
    private String from;
    private String subject;
    private String body;
    private boolean isDocAttached;
}
