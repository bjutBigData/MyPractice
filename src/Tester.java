import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student students[]=new Student[5];
     StudentClass aClass=new StudentClass("软件0210",5);
     for (int i=0; i<5; i++)
    	 students[i]=new Student(getAStudent(i+1));
     aClass.setStudents(students);
     System.out.println(aClass);
     
     try {
    	 FileOutputStream fo= new FileOutputStream("stu.ser");
    	 ObjectOutputStream so= new ObjectOutputStream(fo);
    	 for(int i=0; i<5; i++)
    		 so.writeObject(students[i]);
    	     so.close();
         } catch(Exception e)
              { 
        	     System.out.println(e);
    	 
      }
   }
	
	public static Student getAStudent(int i){
		Student studenti;
		System.out.println("输入第"+i+"个学生的信息：");
		System.out.print("学号：");
	    String id =Keyboard.readString();
	
		
		System.out.print("姓名：");
		String name =Keyboard.readString();

		
		System.out.print("英语成绩：");
		int eng=Keyboard.readInt();

		
		System.out.print("数学成绩：");
		int math=Keyboard.readInt();
	
		
		System.out.print("计算机成绩：");
		int comp=Keyboard.readInt();
		
		
		studenti= new Student(id,name,eng,math,comp);
		return studenti;
		
	}
	
}
