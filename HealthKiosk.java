import java.util.Scanner;
public class HealthKiosk{
    public static void main(String[] args) {
        final double PHARMACYDISPENSE=250;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Ashesi Health Kiosk");
        System.out.println("__________________________________");
        System.out.println();
        //Task 1
        System.out.println("Enter Service code(P/L/T/C):");
        char serviceCode=input.nextLine().toUpperCase().charAt(0);

        switch (serviceCode){
            case 'P':
                System.out.println("Go to: Pharmacy Desk");
                break;
            case 'L':
                System.out.println("Go to: Lab Desk");
                break;
            case 'T':
                System.out.println("Go to: Triangle Desk");
                break; 
            case 'C':
                System.out.println("Go to: Counseling Desk");
                break; 
            default:
                System.out.println("Invalid service code");
                break; 
        }
        //Task 2
        System.out.println("""
        Please enter a health metric:
        1.BMI
        2.Dosage round-up
        3.Simple Trig helper
        """);
        int quickMetric=input.nextInt();

        switch (quickMetric) {
            case 1:
                System.out.println("Welcome to the BMI Metric");
                System.out.println("-------------------------");
                System.out.println("Enter your weight in kg:");
                double weightKG=input.nextDouble();
                System.out.println("Enter your height in meters:");
                double heightM=input.nextDouble();

                double bmi=weightKG/heightM;
                double roundedBMI=Math.round(bmi*100)/100;
                System.out.println("BMI: "+roundedBMI);
                
                if(roundedBMI<18.5){
                    System.out.print("Category: Underweight");
                }else if(roundedBMI>=18.5 && roundedBMI<=24.9){
                    System.out.print("Category: Normal");
                }else if(roundedBMI>=25.0 && roundedBMI<=29.9){
                    System.out.print("Category: Overweight");
                }else{
                    System.out.print("Category: Obese");
                }                
                break;
            case 2:
                System.out.println("Welcome to the Dosage Round-up");
                System.out.println("------------------------------");
                System.out.println("Enter the required dosage in mg");
                double dosage=input.nextDouble();
                int numberOfTablets=(int) Math.ceil(dosage/PHARMACYDISPENSE);
                System.out.println("Number of tablets: "+numberOfTablets);
                break;
            case 3:
                System.out.println("Welcome to the Simple Trig helper");
                System.out.println("---------------------------------");
                System.out.println("Enter an angle in degrees: ");
                double angleDegrees=input.nextDouble();
                double angleRadians=Math.toRadians(angleDegrees);
                double sinAngle=Math.sin(angleRadians);
                double cosAngle=Math.cos(angleRadians);
                System.out.println("sin angle: "+(Math.round(sinAngle * 1000) / 1000.0));
                System.out.println("cos angle: "+(Math.round(cosAngle * 1000) / 1000.0));
                break;
            default:
                System.out.println("Invalid Health Metric");
                break;
        }
        //Task 3
        char randomChar = (char) ('A' + Math.random() * 26);
        int randomNumbers=(int) (Math.random()*10000);
        String iD=""+randomChar+randomNumbers;
        
        
                
        input.close();
    }
}