package BankingManagement;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        login();
        int choose = 0;
        do {
            showMenu();
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("BYE");
                    break;
                default:
                    System.err.println("ERRO");
                    break;
            }


        }while (choose != 8);


    }
    static void showMenu(){
        System.out.println("1.khoi tao tk");
        System.out.println("2.nap tien");
        System.out.println("3.chuyen tien ");
        System.out.println("4.xem ls nap tien");
        System.out.println("5.xem ls chuyen tien");
        System.out.println("6.save");
        System.out.println("7.doc du lieu ");
        System.out.println("8.thoat");
        System.out.println("chọn:");
    }


    static void login(){
        System.out.println("---------WELCOME---------");
        System.out.println("USERNAME:");
        String username = scanner.nextLine();
        System.out.println("password:");
        String password = scanner.nextLine();
        if(username.equalsIgnoreCase("tu.vuhoang")
                && password.equalsIgnoreCase("tu123")){
            System.out.println("OK");
        }else {
            System.out.println("LOGIN FAIL");
            login();
        }
    }
}
