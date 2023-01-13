package ExOOP.Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        ManagerOfficer managerOfficer = new ManagerOfficer();
        while (true){
            System.out.println("Application Manager Officer");
            System.out.println("Enter 1: To insert officer");
            System.out.println("Enter 2: To search officer by name: ");
            System.out.println("Enter 3: To show information officers");
            System.out.println("Enter 4: To exit:");
            String line = Sc.nextLine();
           switch (line){
               case "1":{
                   System.out.println("Enter a: to insert Enginner");
                   System.out.println("Enter b: to insert Worker");
                   System.out.println("Enter c: to insert Staff");
                   String type = Sc.nextLine();
                   switch (type){
                       case "a":{
                           System.out.print("Enter name: ");
                           String name = Sc.nextLine();
                           System.out.print("Enter age:");
                           int age = Sc.nextInt();
                           System.out.print("Enter gender: ");
                           Sc.nextLine();
                           String gender = Sc.nextLine();
                           System.out.print("Enter address: ");
                           String address = Sc.nextLine();
                           System.out.print("Enter branch: ");
                           String branch = Sc.nextLine();
                           Officer enginerr = new Engineer(name,age,gender,address,branch);
                           managerOfficer.addOfficer(enginerr);
                           System.out.println( enginerr.toString());
                           break;
                       }
                       case "b": {
                           System.out.print("Enter name: ");
                           String name = Sc.nextLine();
                           System.out.print("Enter age:");
                           int age = Sc.nextInt();
                           System.out.print("Enter gender: ");
                           Sc.nextLine();
                           String gender = Sc.nextLine();
                           System.out.print("Enter address: ");
                           String address = Sc.nextLine();
                           System.out.print("Enter level: ");
                           int level = Sc.nextInt();
                           Officer worker = new Worker(name, age, gender, address, level);
                           managerOfficer.addOfficer(worker);
                           System.out.println(worker.toString());
                           Sc.nextLine();
                           break;
                       }
                       case "c": {
                           System.out.print("Enter name: ");
                           String name = Sc.nextLine();
                           System.out.print("Enter age: ");
                           int age = Sc.nextInt();
                           System.out.print("Enter gender: ");
                           Sc.nextLine();
                           String gender = Sc.nextLine();
                           System.out.print("Enter address: ");
                           String address = Sc.nextLine();
                           System.out.print("Enter task: ");
                           String task = Sc.nextLine();
                           Officer staff = new Staff(name, age, gender, address, task);
                           managerOfficer.addOfficer(staff);
                           System.out.println(staff.toString());
                           break;
                       }
                       default:
                           System.out.println("Invalid");
                           break;
                   }
            }
               case "2":{
                   System.out.println("Enter the name to search");
                   String name = Sc.nextLine();
                   managerOfficer.searchOfficerByName(name).forEach(officer -> {
                       System.out.println(officer.toString());
                   });
                   break;
               }
               case "3" :{
                   managerOfficer.showListInforOfficer();
                   break;
               }
               case "4" : {
                   return;
               }
               default:
                   System.out.println("Invalid");
                   continue;
           }
        }
    }
}
