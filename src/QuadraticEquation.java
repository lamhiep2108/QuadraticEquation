import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public  QuadraticEquation(){};
    public  QuadraticEquation(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getDiscriminant(){
        double delta = b*b-4*a*c;
       return delta;
    }
    public  double  getRoot1(){
        double z =b*b-4*a*c;
        double r1=(-b+Math.pow(z,0.5))/2*a;
        return  r1;
    }
    public  double getRoot2(){
        double z =b*b-4*a*c;
        double r2=(-b-Math.pow(z,0.5))/2*a;
        return  r2;
    }
    }

