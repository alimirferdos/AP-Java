/*
	In the name of God
	
	Seyed Ali Mirferdos
	AP : Java Workshop 1
	Winter 1395
	
	DateTime Class
*/

import static java.lang.Math.*;
import java.util.Scanner;

class DateTime{
    int year = 0, mounth = 0, day = 0 , hour = 0, minute = 0, second = 0;
    
    void read(){
        Scanner input = new Scanner(System.in);
        year = input.nextInt();
        mounth = input.nextInt();
        day = input.nextInt();
        hour = input.nextInt();
        minute = input.nextInt();
        second = input.nextInt();
    }
    
    void print(){
        System.out.println(year + "/" + mounth + "/" + day + " " + hour + ":" + minute + ":" + second);
    }
    
    int compare(DateTime d){
        if(year != d.year)
            return year - d.year; 
        if(mounth != d.mounth)
            return mounth - d.mounth;
        if(day != d.day)
            return day - d.day;
        if(hour != d.hour)
            return hour - d.hour;
        if(minute != d.minute)
            return minute - d.minute;
        if(second != d.second)
            return second - d.second;
    
        return 0;
    }
    
    DateTime extract(DateTime d){
        DateTime fd = new DateTime();
		
		fd.second = second - d.second;
		while(fd.second < 0){
			fd.second += 60;
			fd.minute--;
		}
		
		fd.minute += minute - d.minute;
		while(fd.minute < 0){
			fd.minute += 60;
			fd.hour--;
		}
		
		fd.hour += hour - d.hour;
		while(fd.hour < 0){
			fd.hour += 24;
			fd.day--;
		}
		
		fd.day += day - d.day;
		while(fd.day < 0){
			fd.day += 30;
			fd.mounth--;
		}
		
		fd.mounth += mounth - d.mounth;
		while(fd.mounth < 0){
			fd.mounth += 12;
			fd.year--;
		}
		
		fd.year += year - d.year;
		
        return fd;
    }
	
	void addWithConst(int c){
		day += c;
		while(day > 30){
			day -= 30;
			mounth++;
		}
		
		while(mounth > 12){
			day -= 12;
			year++;
		}
	}
}
class workshop1 {

    public static void main(String[] h){
        DateTime[] dates = new DateTime[10];
		
		// Initializing the array randomly
		for(int i = 0; i < dates.length; i++){
			dates[i] = new DateTime();
			
			dates[i].year = (int)(Math.random() * 2050);
			dates[i].mounth = (int)(Math.random() * 11 + 1);
			dates[i].day = (int)(Math.random() * 29 + 1);
			dates[i].hour = (int)(Math.random() * 23 + 1);
			dates[i].minute = (int)(Math.random() * 59 + 1);
			dates[i].second = (int)(Math.random() * 59 + 1);
			
			// Printing the generated date
			dates[i].print();
		}
		
		// Sorting the array
		DateTime temp = new DateTime();
		for(int i = 0; i < dates.length; i++){
			for(int j = i + 1; j < dates.length; j++){
				if(dates[i].compare(dates[j]) > 0){
					temp  = dates[j];
					dates[j] = dates[i];
					dates[i] = temp;
				}
			}
		}
		
		// Printing the sorted version
		System.out.println("\n\nThe sorted array:");
		for(int i = 0; i < dates.length; i++)
			dates[i].print();
			
		// Distance of the max. and min.
		System.out.println("\n\nDistance of the max. and min.:");
		temp = dates[dates.length - 1].extract(dates[0]);
		temp.print();
		
		
		
		// According to 700/4/21 12:20:15
		DateTime adate = new DateTime() ,temp2 = new DateTime(), temp3 = new DateTime();
		adate.year = 700;
		adate.mounth = 4;
		adate.day = 21;
		adate.hour = 12;
		adate.minute = 20;
		adate.second = 15;
		
		// Sorting the array
		for(int i = 0; i < dates.length; i++){
			temp2 = dates[i].extract(adate);
			if(temp2.year < 0)
					temp2.year *= -1;
			for(int j = i + 1; j < dates.length; j++){
				temp3 = dates[j].extract(adate);
				if(temp3.year < 0)
					temp3.year *= -1;
				if(temp2.compare(temp3) < 0){
					temp  = dates[j];
					dates[j] = dates[i];
					dates[i] = temp;
				}
			}
		}
		
		// Printing the sorted version
		System.out.println("\n\nThe sorted array according to the distance from 700/4/21 12:20:15 :");
		for(int i = 0; i < dates.length; i++)
			dates[i].print();
			
		// Distance of the max. and min.
		System.out.println("\n\nDistance of the max. and min.:");
		temp = dates[0].extract(dates[dates.length - 1]);
		temp.print();
	}
    
}
