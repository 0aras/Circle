import java.util.Scanner ;
import java.lang.Math;



public class Main
{
    public static void main(String[] args) {
        System.out.println("Please press 1 to calculate a circle's circumference and area \nor press 2 to calculate a piece of a circle with radius and angle ");
        Scanner tara=new Scanner(System.in);
        int sonuc= tara.nextInt();
        if(sonuc==1){
            yaricap();
        } else if (sonuc==2) {
            dilimalan();

        }else{
            System.out.println("Wrong input, please try again");
        }

    }
    public static void yaricap() {
        Scanner tara = new Scanner(System.in);
        System.out.println("Enter the radius ");
        double r = tara.nextDouble();
        System.out.println("Circumference of the circle: " + (float)(Math.PI * 2 * r) + "\nArea of the circle: " + (float)Math.PI * r * r);
    }
    public static void dilimalan(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please input  radius of the circle");
        double rad=sc.nextDouble();
        System.out.println("Please enter the angle value of circle piece");
        double dilima=sc.nextDouble();
        System.out.println("Area of the circle's piece: "+(float)(Math.PI*Math.pow(rad,2)*dilima));

    }
}