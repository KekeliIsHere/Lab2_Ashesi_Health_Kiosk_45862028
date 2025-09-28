import java.util.Scanner;
public class HealthKiosk{
    public static void main(String[] args) {
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

        
        
        
        input.close();
    }
}