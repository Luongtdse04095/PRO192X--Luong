
import java.util.Random;
public class Asm1{
	Random random= new Random();
	String[] firstName={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","AA","BB","CC","DD","EE","FF","GG","HH","IH","JJ","KK","LL","MM","NN"};
	String[] middleName={"Kim","An","Quynh","Hoai","The","Minh","Gia","Ngoc","Thi","Thanh","Bao","Van","Dinh","Nguyet","Ba","Thuy","Duc","Huu","Thanh","Hong","Mien","Lan","Hue","Cong","Hien","Phuong","Truong","Nghia","Son","Thu" };
	String[] lastName={"Tran","Nguyen","Phan","Ngo","Ly","Luyen","Pham","Vu","Duong","Dang","Do","Bui","Phan","Ho","Hoang"};
	
	//Random FullName
	
	String mockFirstName(){
		int r =random.nextInt(firstName.length);
		return firstName[r];	
	}
	
	String mockMiddleName(){
		int r=random.nextInt(middleName.length);
		return middleName[r];
	}
	
	String mockLastName(){
		int r=random.nextInt(lastName.length);
		return lastName[r];
	}
	
	String mockFullName(){
		return mockLastName() + " " + mockMiddleName()+" "+ mockFirstName();
	}
    
   //Random Student's ID
    
    String studentID;
    String mockStudentID(){
    	studentID="HV";	
    	int r=random.nextInt(10);
    	for(int i=0;i<10;i++){
    		studentID+=r;
    	}
    	return studentID;
    }
    
    // Random birthday
    
    int mockMonth(){
    	int r=random.nextInt(12);
    	return r+1;
    }
    
    int mockDay(){
    	int r=0;
    	if(mockMonth()==2){
    		r =random.nextInt(29); 
    	}
    	if(mockMonth()==1|| mockMonth()==3|| mockMonth()==5|| mockMonth()==7|| mockMonth()==9|| mockMonth()==11){
    		r=random.nextInt(31);
    	}
    	if(mockMonth()==4|| mockMonth()== 6|| mockMonth()==8|| mockMonth()==10|| mockMonth()==12){
    		r=random.nextInt(30);
    	}
    	return r +1;
    }
    
    // Random score  
      int mockScore(int from, int to){
    	  int r=random.nextInt(to - from+1);
    	  return r+from;
      }
      
      int[]rA =new int[25];// Requirement analyze score
      int[]sD =new int[25];// Software design score
      int[]cP =new int[25];// C# programming score
      int[]jV =new int[25];// Java programming score
      int[]aD =new int[25];// Android programming score
      void mockListScore(){ 
    	  for(int i=0; i<=2;i++){
    		  rA[i]= mockScore(8,10);
    		  sD[i]= mockScore(8,10);
    		  cP[i]= mockScore(8,10);
    		  jV[i]= mockScore(8,10);
    		  aD[i]= mockScore(8,10);
    	  }
    	  for(int i=3; i<=15;i++){
    		  rA[i]= mockScore(5,7);
    		  sD[i]= mockScore(5,7);
    		  cP[i]= mockScore(5,7);
    		  jV[i]= mockScore(5,7);
    		  aD[i]= mockScore(5,7);
    	  }
    	  for(int i=16; i<22;i++){
    		  rA[i]= mockScore(3,4);
    		  sD[i]= mockScore(3,4);
    		  cP[i]= mockScore(3,4);
    		  jV[i]= mockScore(3,4);
    		  aD[i]= mockScore(3,4);
    	  }
    	  for(int i=22; i<24;i++){
    		  rA[i]= mockScore(1,2);
    		  sD[i]= mockScore(1,2);
    		  cP[i]= mockScore(1,2);
    		  jV[i]= mockScore(1,2);
    		  aD[i]= mockScore(1,2);
    	  }
    	 
    		  rA[24]= mockScore(0,1);
    		  sD[24]= mockScore(0,1);
    		  cP[24]= mockScore(0,1);
    		  jV[24]= mockScore(0,1);
    		  aD[24]= mockScore(0,1);
    	  
      }
      void shuffle(int[] rA, int[] sD, int[] cP, int[] jV, int[] aD){
    	  int r = random.nextInt(rA.length);
    	  int r1 = random.nextInt(sD.length);
    	  int r2 = random.nextInt(cP.length);
    	  int r3 = random.nextInt(jV.length);
    	  int r4 = random.nextInt(aD.length);
    	  for(int i=0;i<25;i++){
    		  rA[r] = rA[i];
    		  sD[r1] = sD[i];
    		  cP[r2] = cP[i];
    		  jV[r3] = jV[i];
    		  aD[r4] = aD[i];
    	  }
      }
     
      // Random GPA & Rank
    
      float mockGPA(int rA, int sD, int cP, int jV, int aD){
    	  return (float)(rA+sD+cP+jV+aD)/5;
      }
      String mockRank(float GPA){
    	  String rank="Cream";
    	  if (GPA>=8.0){
    		  rank="Excellent";
    	  }
    	  if(GPA<8 &&GPA>=6.5){
    		  rank ="Good";
    	  }
    	  if(GPA<6.5 && GPA>=5){
    		  rank ="Pass";
    	  }
    	  if(GPA<5 && GPA>=3.1){
    		  rank="Weak";
    	  }
    	  return rank;
      }

    //Display
    void display(){ 
    	 mockListScore();
    	 shuffle(rA, sD,cP,jV,aD);
    	 for (int i = 0; i <25; i++) {
    		 float GPA = mockGPA(rA[i],sD[i],cP[i],jV[i],aD[i]);
    		 System.out.println("No."+(i+1)+" "+"|"+" "+"Name:"+" "+ mockFullName() +" "+"|"+" " +"Birth Day: "+ mockDay()+ "/"+ mockMonth()+"/"+"1991"+ " "+"|"+ " "+"Requirement analyze: "+rA[i]+" "+"|"+" "+"Software design: " +sD[i]+" "+"|"+" "+"C# programming: "+cP[i]+" "+"|"+" "+"Java programming: "+jV[i]+" "+"|"+" "+"Android programming: "+aD[i]+" "+"|"+"GPA: "+GPA+" "+"|"+" "+"Rank: "+mockRank(GPA));
        }
     }

}
