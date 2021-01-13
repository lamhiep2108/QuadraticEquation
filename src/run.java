import java.util.Scanner;

public class run {
    public static void main(String[] args) {
    double a;
    double b;
    double c;
    Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a");
        a= scanner.nextDouble();
        System.out.println("nhap b");
        b= scanner.nextDouble();
        System.out.println("nhap c");
        c= scanner.nextDouble();
        QuadraticEquation quadraticEquation=new QuadraticEquation();
        double delta= quadraticEquation.getDiscriminant();
        double r1 = quadraticEquation.getRoot1();
        double r2= quadraticEquation.getRoot2();
        double  x=-b/2*a;
        if (delta < 0){
            System.out.println("Phương trình vô nghiệm");
        } else if (delta==0){
            System.out.println("pt có nghiệm kép x1=x2= "+x);
        }else {
            System.out.println("pt có 2 nghiệm phân biệt"+"x1: "+r1 +" x2: " +r2);
        }
    }
}
