package info.java;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Javaphase1 {

    public static void main(String[] args) {
        File folder = new File("C:\\Users\\vaibh\\OneDrive\\Desktop\\FIRSTPHASE\\SIMPLILEARN");
        folder.mkdir();
        System.out.println("\nWELCOME TO LOCKEDME ");
        System.out.println("""
                DEVELOPER NAME:\s
                VAIBHAV AGGARWAL""");
        System.out.println("\nSIMPLILEARN");
        System.out.println("-------------------------------------------------------------------------------");
        int option;
        do {
            System.out.println("\nFILE MENU");
            System.out.println("\n1. Show Files");
            System.out.println("2. Manage Files");
            System.out.println("3. EXIT");
            System.out.println("\nEnter your choice : ");
            Scanner sc = new Scanner(System.in);

            option = sc.nextInt();
            switch (option) {
                case 1 -> {
                    File ob = new File("C:\\Users\\vaibh\\OneDrive\\Desktop");
                    File[] array = ob.listFiles();
                    assert array != null;
                    for (File file : array) {
                        if (file.isFile())
                            System.out.println("file is:  " + file);

                    }
                }
                case 2 -> {
                    int ch;
                    do {
                        System.out.println("Manage Files Menu");
                        System.out.println("\n1. Add File");
                        System.out.println("2. Delete File");
                        System.out.println("3. Search FIle");
                        System.out.println("4. Exit to main");
                        System.out.println("\nEnter your choice : ");

                        ch = sc.nextInt();
                        switch (ch) {
                            case 1 -> {
                                Scanner input = new Scanner(System.in);
                                System.out.print("Enter the file name to add : ");
                                String fileName1 = input.nextLine();
                                fileName1 = fileName1 + ".txt";
                                File file = new File(fileName1);
                                try {
                                    if(file.createNewFile())
                                    System.out.println(fileName1 + " is created successfully!");

                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                            case 2 -> {
                                Scanner scan = new Scanner(System.in);
                                String filename;
                                System.out.print("Enter the Name of File to Delete: ");
                                filename = scan.nextLine();
                                filename = filename + ".txt";
                                File myfile = new File(filename);
                                if (myfile.delete())
                                    System.out.println("\n"+filename +" is deleted successfully!");
                                else
                                    System.out.println("\nSomething went wrong!");
                            }
                            case 3 -> {
                                boolean found = false;
                                System.out.println("Please Enter the Filename:");
                                Scanner scan1 = new Scanner(System.in);
                                System.out.print("Enter the desired name of your file: ");
                                String filesearch = scan1.nextLine();
                                File directory = new File("C:\\Users\\vaibh\\OneDrive\\Desktop");
                                File[] array1 = directory.listFiles();
                                System.out.println("You are searching for a file named: " + filesearch);
                                for (int i = 0; i < Objects.requireNonNull(array1).length; i++) {
                                    if (array1[i].getName().equals(filesearch)) {
                                        System.out.println("Found " + array1[i]);
                                        found = true;
                                    }
                                }
                                if (!found) {
                                    System.out.println("File not found");
                                }
                            }
                            case 4 -> {
                                System.out.println("Exited from the Business Level operation...");
                                System.out.println("---------------------------------\n");
                            }
                        }

                    } while (ch != 4);
                }
                case 3 -> System.out.println("Exiting from the application...");
                default -> System.out.println("Invalid choice");
            }
            }while(option !=3);
        }
    }





