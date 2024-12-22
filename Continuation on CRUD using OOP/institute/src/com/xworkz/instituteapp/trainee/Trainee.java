package com.xworkz.instituteapp.trainee;

import com.xworkz.instituteapp.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Trainee {
    private int id;
    private String name;
    private int yearOfGraduation;
    private String degreeName;
    private String dob;
    private String email;
    private Gender gender;
    private long phoneNumber;
    private boolean isPlaced;
}
