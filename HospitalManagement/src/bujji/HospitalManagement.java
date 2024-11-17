package bujji;

import java.util.HashMap;
import java.util.Scanner;

class General {
    private final HashMap<String, String> doctors = new HashMap<>();

    public General() {
        doctors.put("Neurologist", "Devasena");
        doctors.put("Ophthalmologist", "Kattapa");
        doctors.put("Dentist", "Bahubali");
        doctors.put("Dermatologist", "Ballaladeva");
        doctors.put("Cardiologist", "Keerthi");
        doctors.put("General Surgeon", "Suresh");
        doctors.put("ENT", "RajMohan");
    }

    public synchronized void list() throws InterruptedException {
        System.out.println("WELCOME....!");
        System.out.println("THE LIST OF DOCTORS WE HAVE IS:");
        int i = 1;
        for (String specialty : doctors.keySet()) {
            System.out.println(i + " = " + specialty.toUpperCase());
            i++;
            Thread.sleep(1000);
        }
    }

    public synchronized void details() throws InterruptedException {
        System.out.println("\nHERE IS THE LIST OF DOCTORS WITH THEIR DESIGNATION:");
        for (String specialty : doctors.keySet()) {
            System.out.println(specialty + " : " + doctors.get(specialty));
            Thread.sleep(1000); 
        }

        System.out.println("\nSELECT NAME OF DOCTOR YOU WANT TO CONSULT:");
        Scanner s = new Scanner(System.in);
        String choice = s.nextLine();

        if (doctors.containsValue(choice)) {
            System.out.println("THANK YOU FOR WAITING, YOUR APPOINTMENT IS READY WITH Dr. " + choice);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    public void check() {
        
    }
}

class Doctor extends General {
    @Override
    public void check() {
        Scanner s = new Scanner(System.in);

        System.out.print("\nENTER PATIENT NAME: ");
        String name = s.nextLine();

        System.out.print("ENTER YOUR SEX: ");
        String sex = s.nextLine();

        System.out.print("ENTER PATIENT AGE: ");
        int age = s.nextInt();

        System.out.println("\nTHANK YOU FOR ENTERING YOUR DETAILS:");
        System.out.println("Name: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("Age: " + age);
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        try {
            Doctor doc = new Doctor();
            doc.list();
            doc.check();
            doc.details();
        } catch (InterruptedException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
