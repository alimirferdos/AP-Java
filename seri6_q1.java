/*
	In the name of God
	
	Seyed Ali Mirferdos
	AP : Java Homework Seri 6
	Winter 1395
	
	Student class
*/ 

import java.util.*;
class student{
	String name;
	int id , courses;
	double scores[];
	double avg = 0;
	
	void read(){
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
				if(s[i].name.compareTo(s[j].name) > 0){
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
				if(s[i].id - s[j].id) > 0){
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
				if(s[i].courses - s[j].courses) > 0){
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
				if(s[i].avg - s[j].avg) > 0){
					temp  = s[j];
					s[j] = s[i];
					s[i] = temp;
				}
			}
		}
	}
}

class seri6_q2{
	public static void main(String[] h){
		
	}
}