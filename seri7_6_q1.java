/*
	In the name of God
	
	Seyed Ali Mirferdos
	AP : Java Homework Seri 7
	Winter 1395
	
	Student class
*/ 

import java.util.*;
class student{
	private String name;
	private int id , courses;
	private double scores[];
	private double avg = 0;
	
	static number = 0;

	//	Setters
	public setname(String s){
		name = s;
	}
	public setid(int i){
		id = i;
	}
	public setcourses(int i){
		courses = i;
	}
	public setscores(int[] s){
		scores = s;
		avg = aveg();
	}
	
	//	Getters
	public getname(){
		return name;
	}
	public getid(){
		return id;
	}
	public getscores(){
		return scores;
	}
	public getavg(){
		return avg;
	}
	public getcourses(){
		return avg;
	}
	
	finalize(){
		number--;
	}
	
	student(){
		number++;
	}
	
	public void read(){
		Scanner input = new Scanner(System.in);
		System.out.print("name? ");
		name = input.nextLine();
		System.out.print("id? ");
		id = input.nextInt();
		System.out.print("How many courses? ");
		courses = input.nextInt();
		scores = new double[courses];
		
		for(int i = 0; i < courses; i++)
			scores[i] = input.nextDouble();
		
		avg = aveg();
	}
	
	void print(){
		System.out.println("name: " + name);
		System.out.println("id: " + id);
		System.out.println("courses: " + courses);
		for(int i = 0 ; i < courses; i++)
			System.out.println("course " + (i+1) + " score: " + score[i]);
		System.out.println("average: " + avg);
	}
	
	double aveg(){
		double sum = 0;
		for(int i = 0; i < courses; i++)
			sum += scores[i];
		
		return sum / courses;
	}
}
class college{
	int num;
	student[] s;
	
	void read(){
		Scanner input = new Scanner(System.in);
		System.out.print("How many students? ");
		num = input.nextInt();
		s = new student[num];
		
		for(int i = 0; i < num; i++){
		System.out.print("Students no. " + i + " : ");
			s[i].read();
		}
	}
	
	void print(){
		for(int i = 0; i < row; i++){
			System.out.print("Students no. " + (i + 1) + " : ");
			s[i].print();
			System.out.print("\n");
		}
	}

	void sortByName(){
		student temp;
		
		for(int i = 0; i < num; i++){
			for(int j = i + 1; j < num; j++){
				if(s[i].getname().compareTo(s[j].getname()) > 0){
					temp  = s[j];
					s[j] = s[i];
					s[i] = temp;
				}
			}
		}
	}
	
	void sortById(){
		student temp;
		
		for(int i = 0; i < num; i++){
			for(int j = i + 1; j < num; j++){
				if(s[i].getid() - s[j].getid()) > 0){
					temp  = s[j];
					s[j] = s[i];
					s[i] = temp;
				}
			}
		}
	}
	
	void sortByCourses(){
		student temp;
		
		for(int i = 0; i < num; i++){
			for(int j = i + 1; j < num; j++){
				if(s[i].getcourses() - s[j].getcourses()) > 0){
					temp  = s[j];
					s[j] = s[i];
					s[i] = temp;
				}
			}
		}
	}
	
	void sortByAvg(){
		student temp;
		
		for(int i = 0; i < num; i++){
			for(int j = i + 1; j < num; j++){
				if(s[i].getavg() - s[j].getavg()) > 0){
					temp  = s[j];
					s[j] = s[i];
					s[i] = temp;
				}
			}
		}
	}
}

class seri7_6_q2{
	public static void main(String[] h){
		
	}
}