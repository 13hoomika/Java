class DrivingLicenceRunner{
	public static void main(String dl[]){
		//dlNo, name , dob , validTill , bloodGroup , fatherName , rtoOfficeNumber

		DrivingLicence person1 = new DrivingLicence("KA46 2020003345","Abhishek","10/03/2001","04/10/2040","A+","Shekhar","K46");
		person1.allObj();
		
		DrivingLicence person2 = new DrivingLicence("KA01 2020103345","Shashi","21/05/1992","01/09/2032","O+","Nanjappa","K401");
		person2.allObj();
		
		DrivingLicence person3 = new DrivingLicence("KA03 2021005432","Ravi","12/07/1990","15/08/2030","B+","Mohan","K303");
        person3.allObj();
        
        DrivingLicence person4 = new DrivingLicence("KA05 2022006789","Priya","25/12/1985","12/11/2035","AB-","Ramesh","K105");
        person4.allObj();
        
        DrivingLicence person5 = new DrivingLicence("KA08 2023109876","Karthik","18/02/1995","30/03/2045","O-","Harish","K208");
        person5.allObj();
        
        DrivingLicence person6 = new DrivingLicence("KA07 2023212345","Ananya","14/04/2000","22/07/2040","A-","Surya","K307");
        person6.allObj();
        
        DrivingLicence person7 = new DrivingLicence("KA04 2023321456","Sanjay","09/09/1988","03/05/2038","B-","Anil","K104");
        person7.allObj();
        
        DrivingLicence person8 = new DrivingLicence("KA06 2022432567","Vijay","11/11/1997","01/01/2042","AB+","Suresh","K506");
        person8.allObj();
        
        DrivingLicence person9 = new DrivingLicence("KA02 2023456789","Geetha","02/08/1993","25/12/2043","O+","Rajesh","K202");
        person9.allObj();
        
	}
}