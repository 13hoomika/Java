package com.xworkz.instituteapp.institute;


import com.xworkz.instituteapp.IntitutionInterface;
import com.xworkz.instituteapp.constants.Gender;
import com.xworkz.instituteapp.trainee.Trainee;

import java.util.Arrays;

public class Institute implements IntitutionInterface {
    Trainee trainees[] = new Trainee[5];
    int index;

    @Override
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
    @Override
    public void getDetails(){
        System.out.println("---- Trainee Details ----");
        for(Trainee details : trainees){
            if(details!= null){
                System.out.println("Id: "+details.getId());
                System.out.println("Name: "+details.getName());
                System.out.println("Year of graduation: "+details.getYearOfGraduation());
                System.out.println("Degree name: "+details.getDegreeName());
                System.out.println("Date of Birth: "+details.getDob());
                System.out.println("Email: "+details.getEmail());
                System.out.println("Gender Type: "+details.getGender());
                System.out.println("----------------------------");
            }
        }
    }
    @Override
    public Trainee getNameById(int id){
        System.out.println("---- getNameById ----");
        Trainee tranieeFound = null;
        for(Trainee trainee:trainees){
            if(trainee.getId()==id){
                tranieeFound = trainee;
                System.out.println("Name: "+trainee.getName());
            }
        }
        if(tranieeFound == null)
            System.out.println("ID not found");
        return tranieeFound;
    }

    @Override
    public Trainee getGenderById(int id){
        System.out.println("----- getGenderById -----");
        Trainee tranieeFound = null;
        for(Trainee tranieeId:trainees){
            if(tranieeId.getId()==id){
                tranieeFound = tranieeId;
                System.out.println("Gender Type: " + tranieeId.getGender());
            }
        }
        if(tranieeFound == null)
            System.out.println("Id not found");
        return tranieeFound;
    }

    @Override
    public Trainee getNameByGender(Gender gender){
        System.out.println("----- getNameByGender -----");
        Trainee tranieeFound = null;
        for(Trainee traineeGender:trainees){
            if(traineeGender.getGender()==gender){
                tranieeFound = traineeGender;
                System.out.println("Name: "+traineeGender.getName());
            }
        }
        if(tranieeFound == null)
            System.out.println("Trainee not found");
        return tranieeFound;
    }
    @Override
    public Trainee getPhoneNumberByName(String name){
        System.out.println("----- getPhoneNumberByName -----");
        Trainee tranieeFound= null;
        for(Trainee traineeName:trainees){
            if(traineeName.getName()==name){
                tranieeFound = traineeName;
                System.out.println("Phone number: " + traineeName.getPhoneNumber());
            }
        }
        if(tranieeFound == null)
            System.out.println("Name not found");
        return tranieeFound;
    }

    @Override
    public Trainee getEmailByName(String name){
        System.out.println("----- getEmailByName -----");
        Trainee tranieeFound = null;
        for(Trainee traineeName:trainees){
            if(traineeName.getName()==name){
                tranieeFound = traineeName;
                System.out.println("Email: "+ traineeName.getEmail());
            }
        }
        if(tranieeFound == null)
            System.out.println("Name not found");
        return tranieeFound;
    }

    @Override
    public Trainee getEmailById(int id){
        System.out.println("----- getEmailById -----");
        Trainee tranieeFound = null;
        for(Trainee traineeId:trainees){
            if(traineeId.getId()==id){
                tranieeFound = traineeId;
                System.out.println("Email: "+ traineeId.getEmail());
            }
        }
        if(tranieeFound==null)
            System.out.println("ID not found");
        return tranieeFound;
    }

    @Override
    public Trainee getDObById(int id){
        System.out.println("----- getDObById -----");
        Trainee tranieeFound = null;
        for(Trainee traineeId:trainees){
            if(traineeId.getId()==id){
                tranieeFound = traineeId;
                System.out.println("DOB: "+ traineeId.getDob());
            }
        }
        if(tranieeFound==null)
            System.out.println("Id not found");
        return tranieeFound;
    }

    @Override
    public Trainee getDegreeNameByName(String name){
        System.out.println("----- getDegreeNameByName -----");
        Trainee tranieeFound = null;
        for(Trainee traineeName:trainees){
            if(traineeName.getName()==name){
                tranieeFound = traineeName;
                System.out.println("Degree name: "+ traineeName.getDegreeName());
            }
        }
        if(tranieeFound ==null)
            System.out.println("name not found");
        return tranieeFound;
    }

    @Override
    public Trainee getYearByDegree(String degree){
        System.out.println("----- getYearByDegree -----");
        Trainee tranieeFound = null;
        for(Trainee tDegree:trainees){
            if(tDegree.getDegreeName() == degree){
                tranieeFound = tDegree;
                System.out.println("Degree: "+ tDegree.getDegreeName());
                System.out.println("Year of passing: "+ tDegree.getYearOfGraduation());
            }
        }
        if(tranieeFound == null)
            System.out.println("Degree not found");
        return tranieeFound;
    }

    @Override
    public boolean updateEmailById(String UpdatedEmail,int id){
        System.out.println("----- updateEmailById -----");
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

    @Override
    public boolean updateNumByName(long updatedNumber,String name){
        System.out.println("----- updateNumByName -----");
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

    @Override
    public boolean updatePlacedByName(boolean placed,String name) {
        System.out.println("----- updatePlacedByName -----");
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

    @Override
    public boolean deleteTraineeById( int id){
        System.out.println("-----  deleteTraineeById -----");
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


