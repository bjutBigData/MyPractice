
public class StudentClass {

	private String name;            //班级名称
	private int capacity=40;        //最大容量
	private Student students[];     //学生
	private int size;               //实际人数
	
	public StudentClass(String name, int size){
		this.name=name;
		this.size=size;
		students=new Student[capacity];
	}
	
	public String getName(){
		return name;
	}
	
	public int getCapacity(){
		return capacity;
	}
	public Student[] getStudents(){
		return students;
	}
	
	public int getSize(){
		return size;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public void setCapacity(int capacity){
		this.capacity=capacity;
	}
	public void setSize(int size){
		this.size=size;
	}
	public void setStudents(Student[] students){
		for(int i=0; i<size; i++)
			this.students[i]=new Student(students[i]);
	}
	
	public String toString(){
		
		String  s1, s2 = "" ;
		
	    s1= "班级："+name+"\t"+"容量："+capacity+"\t"
	    		+"实际人数："+size+"\n\n";
	    s1=s1+"学号："+"\t"+"姓名："+"\t"+"英语："+"\t"+"数学："+"\t"+"计算机："+"\t"+"总成绩\n";
	    		
	    for (int i=0;i<size;i++)
	    	  s2= s2+students[i].getId()+"\t"+students[i].getName()+"\t"+students[i].getEng()
	         +"\t"+students[i].getMath()+"\t"+students[i].getComp()+"\t"+students[i].getSum()+"\n";
	    
	        ;
	        return s1+s2;
			
		}
	}























