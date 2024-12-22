package com.xworkz.instituteapp.institute;


import com.xworkz.instituteapp.constants.Gender;
import com.xworkz.instituteapp.trainee.Trainee;

import java.util.Arrays;

public class Institute {
    Trainee trainees[] = new Trainee[5];
    int index;

    public boolean addTrainee(Trainee trainee){
        boolean isTraineeAdded = false;
        if(index < this.trainees.length){
            this.trainees[index++] = trainee;
            isTraineeAdded = true;
        }
        else{
            System.out.println("Maximum batch strength is reached!!..");
        }
        return isTraineeAdded;
    }
    public void getDetails(){
        for(Trainee details : trainees){
            if(details!= null){
                System.out.println("Id: "+details.getId());
                System.out.println("Name: "+details.getName());
                System.out.println("Year of graduation: "+details.getYearOfGraduation());
                System.out.println("Degree name: "+details.getDegreeName());
                System.out.println("Date of Birth: "+details.getDob());
                System.out.println("Email: "+details.getEmail());
                System.out.println("Gender Type: "+details.getGender());
                System.out.println("----------------------------------");
            }
        }
    }
    public Trainee getNameById(int id){
        Trainee tranieeFound = null;
//        System.out.println("Name by id method is invoked!!");
        for(Trainee trainee:trainees){
            if(trainee.getId()==id){
                tranieeFound = trainee;
                System.out.println("Name: "+trainee.getName());
                System.out.println("----------------------------------");
            }
        }
        if(tranieeFound == null)
            System.out.println("ID not found");
        return tranieeFound;
    }

    public Trainee getGenderById(int id){
        Trainee tranieeFound = null;
//        System.out.println("Gender by id method is invoked!!");
        for(Trainee tranieeId:trainees){
            if(tranieeId.getId()==id){
                tranieeFound = tranieeId;
                System.out.println("Gender Type: " + tranieeId.getGender());
                System.out.println("----------------------------------");
            }
        }
        if(tranieeFound == null)
            System.out.println("Id not found");
        return tranieeFound;
    }

    public Trainee getNameByGender(Gender gender){
        Trainee tranieeFound = null;
//        System.out.println("Name by gender method is invoked!!");
        for(Trainee traineeGender:trainees){
            if(traineeGender.getGender()==gender){
                tranieeFound = traineeGender;
                System.out.println("Name: "+traineeGender.getName());
                System.out.println("----------------------------------");
            }
        }
        if(tranieeFound == null)
            System.out.println("Trainee not found");
        return tranieeFound;
    }
    public Trainee getPhoneNumberByName(String name){
        Trainee tranieeFound= null;
//        System.out.println("Phone number by name method is invoked!!");
        for(Trainee traineeName:trainees){
            if(traineeName.getName()==name){
                tranieeFound = traineeName;
                System.out.println("Phone number: " + traineeName.getPhoneNumber());
                System.out.println("----------------------------------");
            }
        }
        if(tranieeFound == null)
            System.out.println("Name not found");
        return tranieeFound;
    }

    public Trainee getEmailByName(String name){
        Trainee tranieeFound = null;
//        System.out.println("Email by name method is invoked!!");
        for(Trainee traineeName:trainees){
            if(traineeName.getName()==name){
                tranieeFound = traineeName;
                System.out.println("Email: "+ traineeName.getEmail());
                System.out.println("----------------------------------");
            }
        }
        if(tranieeFound == null)
            System.out.println("Name not found");
        return tranieeFound;
    }
    public Trainee getEmailById(int id){
        Trainee tranieeFound = null;
//        System.out.println("Email by Id method is invoked!!");
        for(Trainee traineeId:trainees){
            if(traineeId.getId()==id){
                tranieeFound = traineeId;
                System.out.println("Email: "+ traineeId.getEmail());
                System.out.println("----------------------------------");
            }
        }
        if(tranieeFound==null)
            System.out.println("ID not found");
        return tranieeFound;
    }
    public Trainee getDObById(int id){
        Trainee tranieeFound = null;
        //System.out.println("DOB by Id method is invoked !!");
        for(Trainee traineeId:trainees){
            if(traineeId.getId()==id){
                tranieeFound = traineeId;
                System.out.println("DOB: "+ traineeId.getDob());
                System.out.println("----------------------------------");
            }
        }
        if(tranieeFound==null)
            System.out.println("Id not found");
        return tranieeFound;
    }

    public Trainee getDegreeNameByName(String name){
        Trainee tranieeFound = null;
//        System.out.println("Degree name by name method is invoked!!");
        for(Trainee traineeName:trainees){
            if(traineeName.getName()==name){
                tranieeFound = traineeName;
                System.out.println("Degree name: "+ traineeName.getDegreeName());
                System.out.println("----------------------------------");
            }
        }
        if(tranieeFound ==null)
            System.out.println("name not found");
        return tranieeFound;
    }
    public Trainee getYearByDegree(String degree){
        Trainee tranieeFound = null;
//        System.out.println("Year of passing by degree name method is invoked!!");
        for(Trainee tDegree:trainees){
            if(tDegree.getDegreeName() == degree){
                tranieeFound = tDegree;
                System.out.println("Year of passing: "+ tDegree.getEmail());
                System.out.println("----------------------------------");
            }
        }
        if(tranieeFound == null)
            System.out.println("Degree not found");
        return tranieeFound;
    }

    public boolean updateEmailById(String UpdatedEmail,int id){
        boolean isEmailUpdated = false;
        for(Trainee traineeId:trainees){
            if(traineeId.getId() == id){
                traineeId.setEmail(UpdatedEmail);
                isEmailUpdated = true;
                System.out.println("Updated " + isEmailUpdated);
            }
        }
        if(isEmailUpdated == false)
            System.out.println("Id not found!!");
        return isEmailUpdated;
    }

    public boolean updateNumByName(long updatedNumber,String name){
        boolean isNumUpdated = false;
        for(Trainee UName:trainees){
            if(UName.getName()==name){
                UName.setPhoneNumber(updatedNumber);
                isNumUpdated = true;
                System.out.println("Updated " + isNumUpdated);
            }
        }
        if(isNumUpdated==false)
            System.out.println("Name not found!!");
        return isNumUpdated;
    }

    public boolean updatePlacedByName(boolean placed,String name) {
        boolean isPlacedUpdated = false;
        for (Trainee UNmae : trainees) {
            if (UNmae.getName() == name) {
                UNmae.setPlaced(placed);
                isPlacedUpdated = true;
                System.out.println("Updated " + isPlacedUpdated);
            }
        }
        if (isPlacedUpdated == false)
            System.out.println("Name not found!!");
        return isPlacedUpdated;
    }

    public boolean deleteTraineeById( int id){
        boolean isTraineeDeleted = false;
        int newIndex = 0;
        for (int start = 0; start < this.trainees.length; start++) {
            if (trainees[start].getId() != id) {
                trainees[newIndex++] = trainees[start];
            } else {
                isTraineeDeleted = true;
                System.out.println("Deleted " + isTraineeDeleted);
            }
        }
        trainees = Arrays.copyOf(trainees, newIndex);
        return isTraineeDeleted;
    }
}


