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
        String desk;
        int metric;
        switch (serviceCode){
            case 'P':
                System.out.println("Go to: Pharmacy Desk");
                desk="PHARMACY";
                break;
            case 'L':
                System.out.println("Go to: Lab Desk");
                desk="LAB";
                break;
            case 'T':
                System.out.println("Go to: Triage Desk");
                desk="TRIAGE";
                break; 
            case 'C':
                System.out.println("Go to: Counseling Desk");
                desk="COUNSELING";
                break; 
            default:
                System.out.println("Invalid service code");
                desk="ERROR";
                break; 
        }
        System.out.println();
        //Task 2
        if(desk.equals("TRIAGE")){
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

                    double bmi=weightKG/(heightM*heightM);
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
                    metric=(int) roundedBMI;            
                    break;
                    
                case 2:
                    System.out.println("Welcome to the Dosage Round-up");
                    System.out.println("------------------------------");
                    System.out.println("Enter the required dosage in mg");
                    double dosage=input.nextDouble();
                    int numberOfTablets=(int) Math.ceil(dosage/PHARMACYDISPENSE);
                    System.out.println("Number of tablets: "+numberOfTablets);
                    metric=numberOfTablets;
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
                    metric=(int) (Math.round(sinAngle * 1000) / 1000.0);
                    break;
                default:
                    System.out.println("Invalid Health Metric");
                    metric=0;
                    break;
            }
            System.out.println();
        }else{
            metric=0;
            System.out.println();
        }

        
        //Task 3
        
        char randomChar = (char) ('A' + (int)(Math.random() * 26));

        int d1 = 3 + (int)(Math.random() * 7);
        int d2 = 3 + (int)(Math.random() * 7);
        int d3 = 3 + (int)(Math.random() * 7);
        int d4 = 3 + (int)(Math.random() * 7);


        String iD = "" + randomChar + d1 + d2 + d3 + d4;

        if (iD.length() == 5) {
            if (Character.isLetter(iD.charAt(0))) {
                if (Character.isDigit(iD.charAt(1)) &&
                    Character.isDigit(iD.charAt(2)) &&
                    Character.isDigit(iD.charAt(3)) &&
                    Character.isDigit(iD.charAt(4))) {
                    
                    System.out.println("ID OK: " + iD);
                } else {
                    System.out.println("Invalid: last 4 must be digits");
                }
            } else {
                System.out.println("Invalid: first char must be a letter");
            }
        } else {
            System.out.println("Invalid length");
        }

        System.out.println();
        //Task 4
        System.out.println("Enter your first name:");
        String fName = input.next();
        
        char base =Character.toUpperCase(fName.charAt(0));
        char shiftedLetter=(char) ('A'+(base - 'A' + 2) % 26);
        String lastTwoOfID = iD.substring(iD.length() - 2);
        
        String code=""+shiftedLetter+lastTwoOfID+"-"+metric;
        System.out.println("Display code: "+code);
        System.out.println();
        System.out.println("Summary: "+desk+" | ID="+iD+" |Code="+code);
        

        input.close();
    }
}
