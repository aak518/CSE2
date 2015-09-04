// Anas Kamal
// cse2
// Lab 02
// Cyclometer Java Program
// This program will 1. print the number of minutes for each trip
// 2. print the number of counts for each trip
// 3. print the distance of each trip in miles
// 4. print the distance for the two trips combined
//
public class Cyclometer{
    //main method
    public static void main (String[] args) {
    
    // end of main method
    int TripTime1=480; // the time it took for the first trip
    int TripTime2=3220; // the time it took for the second trip
    int TripCount1= 1561; // number of tire counts for first trip
    int TripCount2=9037; // number of tire counts for the second trip
    
    double Diameter=27.0; // wheel diameter
    double PI=3.14159; // vlaue of pi
    double FeetPerMile=5280; // number of feet in a mile
    double InchesPerFoot=12; // number of inches in a foot
    double SecondsPerMinute=60; // number of seconds in minute
    double TripDistance1, TripDistance2, TotalDistance; // double the vlaues that will be printed
    
    System.out.println("Trip 1 took "+ (TripTime1 / SecondsPerMinute) + " minutes and had " + TripCount1 + "counts.");
    System.out.println("Trip 2 took "+ (TripTime2 / SecondsPerMinute) + " minutes and had " + TripCount2 + "counts.");
    // This will print the time it took and counts for the first and second trip
    
    // Below will give the distances for the trips
    TripDistance1=TripCount1*Diameter*PI; // distance of trip 1 in inches
    TripDistance1/=InchesPerFoot*FeetPerMile; // converts from inches to miles
    TripDistance2=TripCount2*Diameter*PI/InchesPerFoot/FeetPerMile; //distance of trip 2 is automatically converted to miles
    TotalDistance=TripDistance1+TripDistance2; // Total distance is the sum of distances 1 and 2
    
    //printer
    System.out.println("Trip 1 was "+TripDistance1+"miles"); // prints the value of trip 1
    System.out.println("Trip 1 was "+TripDistance2+"miles"); // prints the value of trip 2
    System.out.println("The total distance was"+TotalDistance+"miles"); // prints the value of the total distance
    
    
    }
}
