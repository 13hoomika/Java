package com.xworkz.instituteapp;

import com.xworkz.instituteapp.constants.Gender;
import com.xworkz.instituteapp.institute.Institute;
import com.xworkz.instituteapp.trainee.Trainee;

public class MainRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Trainee trainee1 =new Trainee();
        trainee1.setId(1);
        trainee1.setName("Bhoomika");
        trainee1.setDob("01-05-2002");
        trainee1.setGender(Gender.female);
        trainee1.setEmail("bhoomi@gmail.com");
        trainee1.setDegreeName("MCA");
        trainee1.setYearOfGraduation(2024);
        trainee1.setPhoneNumber(9876543201L);
        trainee1.setPlaced(false);

        Trainee trainee2 =new Trainee();
        trainee2.setId(2);
        trainee2.setName("Poojitha");
        trainee2.setDob("03-09-2000");
        trainee2.setGender(Gender.female);
        trainee2.setEmail("poojitha@gmail.com");
        trainee2.setDegreeName("MCA");
        trainee2.setYearOfGraduation(2024);
        trainee2.setPhoneNumber(9876543202L);
        trainee2.setPlaced(true);

        Trainee trainee3 =new Trainee();
        trainee3.setId(3);
        trainee3.setName("Kishan");
        trainee3.setDob("23-04-2002");
        trainee3.setGender(Gender.male);
        trainee3.setEmail("kishan@gmail.com");
        trainee3.setDegreeName("BTech");
        trainee3.setYearOfGraduation(2025);
        trainee3.setPhoneNumber(9876543203L);
        trainee3.setPlaced(true);

        Trainee trainee4 =new Trainee();
        trainee4.setId(4);
        trainee4.setName("Keerthi");
        trainee4.setDob("01-04-2002");
        trainee4.setGender(Gender.female);
        trainee4.setEmail("keerthi@gmail.com");
        trainee4.setDegreeName("MCA");
        trainee4.setYearOfGraduation(2024);
        trainee4.setPhoneNumber(9876543204L);
        trainee4.setPlaced(false);

        Trainee trainee5 =new Trainee();
        trainee5.setId(5);
        trainee5.setName("Kushal");
        trainee5.setDob("23-09-2003");
        trainee5.setGender(Gender.male);
        trainee5.setEmail("kushal@gmail.com");
        trainee5.setDegreeName("MCA");
        trainee5.setYearOfGraduation(2024);
        trainee5.setPhoneNumber( 9876543205L);
        trainee5.setPlaced(false);

        Trainee trainee6 =new Trainee();
        trainee6.setId(6);
        trainee6.setName("Pavithra");
        trainee6.setDob("29-10-2000");
        trainee6.setGender(Gender.female);
        trainee6.setEmail("pavithra@gmail.com");
        trainee6.setDegreeName("BTech");
        trainee6.setYearOfGraduation(2023);
        trainee6.setPhoneNumber(1234567890L);
        trainee6.setPlaced(true);

        Institute institute=new Institute();
        institute.addTrainee(trainee1);
        institute.addTrainee(trainee2);
        institute.addTrainee(trainee3);
        institute.addTrainee(trainee4);
        institute.addTrainee(trainee5);
        institute.addTrainee(trainee6);

        institute.getNameById(2);
        institute.getGenderById(1);
        institute.getEmailByName("Kushal");
        institute.getNameByGender(Gender.female);
        institute.getPhoneNumberByName("Poojitha");
        institute.getEmailByName("Keerthi");
        institute.getEmailById(3);
        institute.getDObById(4);
        institute.getYearByDegree("MCA");
        institute.getDegreeNameByName("Bhoomika");
        institute.getDegreeNameByName("Kushal");
        institute.updateEmailById("kishanNarayan@gmail.com",3);
        institute.updateNumByName(68765432002L,"Poojitha");
        institute.updatePlacedByName(true,"Bhoomika");
        institute.deleteTraineeById(5);
        institute.getDetails();

        System.out.println("Main ended");

    }
}

