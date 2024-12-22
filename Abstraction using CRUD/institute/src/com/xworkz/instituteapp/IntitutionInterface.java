package com.xworkz.instituteapp;

import com.xworkz.instituteapp.constants.Gender;
import com.xworkz.instituteapp.trainee.Trainee;

public interface IntitutionInterface {
    public boolean addTrainee(Trainee trainee);
    public void getDetails();
    public Trainee getNameById(int id);
    public Trainee getGenderById(int id);
    public Trainee getNameByGender(Gender gender);
    public Trainee getPhoneNumberByName(String name);
    public Trainee getEmailByName(String name);
    public Trainee getEmailById(int id);
    public Trainee getDObById(int id);
    public Trainee getDegreeNameByName(String name);
    public Trainee getYearByDegree(String degree);
    public boolean updateEmailById(String UpdatedEmail,int id);
    public boolean updateNumByName(long updatedNumber,String name);
    public boolean updatePlacedByName(boolean placed,String name);
    public boolean deleteTraineeById( int id);
}
