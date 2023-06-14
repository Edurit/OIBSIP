import java.util.*;
interface reservation_cost{
void total_fare(String[] passengers);}
public class Passengers implements reservation_cost{
Scanner sc = new Scanner(System.in);
public void total_fare(String passengers[]){
System.out.print("Enter actual fare: ");
double ac=sc.nextDouble();
double totalFare=0;
int n=passengers.length;
for(int i=0;i<n;i++){
if(passengers[i].equalsIgnoreCase("student")){
totalFare+=ac*0.7;}
else if(passengers[i].equalsIgnoreCase("seniorcitizen")){
totalFare+=ac*0.5;}
else if(passengers[i].equalsIgnoreCase("citizen")) {
totalFare+=ac;}else{
totalFare+=0;}}
System.out.println("Total Fare is "+totalFare);}
}
import pass.Passengers;
import java.util.*;
public class passMain{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter no.of passengers: ");
int n=sc.nextInt();
String passengers[] = new String[n];
System.out.print("Enter children,citizen,student or seniorCitizen: ");
for(int i=0;i<n;i++){
passengers[i]=sc.next();}
Passengers p = new Passengers();
p.total_fare(passengers);}
}
