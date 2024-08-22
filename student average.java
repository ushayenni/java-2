import java.io.*;
import java.util.*;
class StudentAverage{
public static void main(String args[]){
int sm1,sm2,sm3,sm4,sm5;
double Avg;
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks of five subjects: ");
sm1 = sc.nextInt();
sm2 = sc.nextInt();
sm3 = sc.nextInt();
sm4 = sc.nextInt();
sm5 = sc.nextInt();
Avg=(sm1+sm2+sm3+sm4+sm5)/5.0;
System.out.println("Student Average"+Avg);
if(Avg>=80){
System.out.println("Student passed in distinction,very good");
}
else if(Avg>=70 && Avg<80){
System.out.println("Student passed in first class");
}
else if (Avg>=50 && Avg<70){
System.out.println("Student passed in second class");
}
else if(Avg>40 && Avg<50){
System.out.println("Student passed in third class");
}
else{
System.out.println("Student are failed,next time you try best");
}
}
}
