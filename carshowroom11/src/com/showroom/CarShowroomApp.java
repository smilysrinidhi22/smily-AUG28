package com.showroom;


interface Utility {
    void getDetails();
    void setDetails(String... details); // Generic parameter for flexibility
}


class Showroom {
    private String showroomName;
    private String showroomAddress;
    private int totalEmployees;
    private int totalCarsInStock;
    private String managerName;

    public void getDetails() {
        System.out.println("Showroom Name: " + showroomName);
        System.out.println("Showroom Address: " + showroomAddress);
        System.out.println("Manager Name: " + managerName);
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Total Cars in Stock: " + totalCarsInStock);
    }

    public void setDetails(String showroomName, String showroomAddress, int totalEmployees, int totalCarsInStock, String managerName) {
        this.showroomName = showroomName;
        this.showroomAddress = showroomAddress;
        this.totalEmployees = totalEmployees;
        this.totalCarsInStock = totalCarsInStock;
        this.managerName = managerName;
    }
}


class Cars implements Utility {
    private String carName;
    private String carColor;
    private String carFuelType;
    private double carPrice;
    private String carType;
    private String carTransmission;

    @Override
    public void getDetails() {
        System.out.println("Car Name: " + carName);
        System.out.println("Car Color: " + carColor);
        System.out.println("Fuel Type: " + carFuelType);
        System.out.println("Price: $" + carPrice);
        System.out.println("Car Type: " + carType);
        System.out.println("Transmission Type: " + carTransmission);
    }

    @Override
    public void setDetails(String... details) {
        this.carName = details[0];
        this.carColor = details[1];
        this.carFuelType = details[2];
        this.carPrice = Double.parseDouble(details[3]);
        this.carType = details[4];
        this.carTransmission = details[5];
    }
}


class Employees implements Utility {
    private String empId;
    private String empName;
    private int empAge;
    private String empDepartment;

    @Override
    public void getDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Age: " + empAge);
        System.out.println("Employee Department: " + empDepartment);
    }

    @Override
    public void setDetails(String... details) {
        this.empId = details[0];
        this.empName = details[1];
        this.empAge = Integer.parseInt(details[2]);
        this.empDepartment = details[3];
    }
}


public class CarShowroomApp {
    public static void main(String[] args) {
       
        Showroom showroom = new Showroom();
        showroom.setDetails("Luxury Cars Hub", "123 Main Street", 10, 50, "John Doe");
        showroom.getDetails();

      
        Cars car = new Cars();
        car.setDetails("Tesla Model S", "Red", "Electric", "79999.99", "Sedan", "Automatic");
        car.getDetails();

      
        Employees employee = new Employees();
        employee.setDetails("EMP123", "Alice Smith", "30", "Sales");
        employee.getDetails();
    }
}
