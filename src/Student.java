import java.io.*;
public class Student implements Serializable {

	private String id;        //学号
	private String name;      //姓名
	private int eng;          //英语成绩
	private int math;         //数学成绩
	private int comp;         //计算机总成绩
	private int sum;          //总成绩 
	
	
	public Student(String id, String name, int eng, int math, int comp ){
		this.id=id;
		this.name=name;
		this.eng=eng;
		this.math=math;
		this.comp=comp;
		sum ();               //计算总成绩
	}
	
	public Student(Student s){
		this.id=s.id;
		this.name=new String(s.name);
		this.eng=s.eng;
		this.math=s.math;
		this.comp=s.comp;
		sum();
	}
	
	public void setId(String id){
		this.id=id;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setEng(int eng){
		this.eng=eng;
		sum();
	}
	
	public void setMath(int math){
		this.math=math;
		sum();
	}
	
	public void setComp(int comp){
		this.comp=comp;
		sum();
	}
	
	public String getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public int getMath(){
		return math;
	}
	
	public int getEng(){
		return eng;
	}
	
	public int getComp(){
		return comp;
	}
	
	public int getSum(){
		return sum;
	}
	
	void sum(){
		this.sum=eng+math+comp;
	}
	
	public String toString(){
		return getId()+"\t"+getName()+"\t"+getEng()+"\t"+getMath()+"\t"+getComp()+"\t"+getSum();
	}
	
	//比较两个student对象的值是否相等
	public boolean equals(Object x){
		if(this.getClass()!=x.getClass())    return false;
		Student b=(Student)x;
		return (this.getId().equals(b.getId()));
		
	}
	
	public int compare(Student A){
		if(this.getSum()>A.getSum())  return 1;
		else if(this.getSum()==A.getSum())  return 0;
		else return -1;
	}
	
}






















