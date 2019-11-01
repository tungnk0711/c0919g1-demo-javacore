package com.codegym;

public class Main {

    public static int add(int a, int b){
        return a + b;
    }


    public static void main(String[] args) {
        // write your code here

        int kq = Main.add(9, 7);

        System.out.println(kq);

        double result = Math.pow(5,3);
        System.out.println(result);



        Employee[] employees = new Employee[7];

        int[] numbers  = new int[5];

        numbers[0] = 20;




        Employee employee1 = new Employee(1, "Nam");
        Employee employee2 = new Employee(2, "Hung");
        Employee employee3 = new Employee(3, "Cuong");
        Employee employee4 = new Employee(4, "Sang");
        Employee employee5 = new Employee(5, "Trong");
        Employee employee6 = new Employee(6, "Manh");
        Employee employee7 = new Employee(7, "Giau");

        System.out.println(employee1.getName());
        System.out.println(employee2.getName());
        System.out.println(employee3.getName());
        System.out.println(employee4.getName());
        System.out.println(employee5.getName());
        System.out.println(employee6.getName());
        System.out.println(employee7.getName());

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = employee6;
        employees[6] = employee7;

        System.out.println("Dung for:");

        for (int i = 0; i < employees.length; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(employees[i].getName());
        }

        System.out.println("Dung for-each:");
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }

        System.out.println("Dung while:");
        int count = 0;
        while (count < employees.length) {
            System.out.println(employees[count].getName());
            count++;
        }

        System.out.println("Dung do while:");
        int count1 = 0;
        do {
            System.out.println(employees[count1].getName());
            count1++;
        } while (count1 < employees.length);


        /*String day = "Monday";
        switch (day){
            case "Monday":{
                System.out.println("Thu 2");

            }
            case "Tuesday":{
                System.out.println("Thu 3");
                break;
            }
            case "Sunday":{
                System.out.println("Chu Nhat");
                break;
            }
        }*/


    }
}
