import java.io.*;
public class Formattedoutput1{
public static void main(String args[]){
    String str="priya";
    System.out.printf("The string value is %s\n",str);
    int x = 512;
    System.out.printf("\n The integer value is %d\n",x);
    double f=5.25412368;
    System.out.printf("\n The decimal value is: %lf\n",f);
    System.out.printf("\n after formatting two specific width the value is : %.4lf\n",f);
    System.out.printf("\n after formatted to right margin the value is : %20.4lf\n",f);
}
}
