package managet.cat;

import java.util.Scanner;

public class UsingManagerCat {
    public static void main(String[] args) {
        ManagerCar managerCar = new ManagerCar();
        ColorManager colorManager = new ColorManager();

        int choose = 0;
        Scanner input = new Scanner(System.in);
        do{
            showMenu();
            choose = Integer.parseInt(input.nextLine());
            switch (choose){
                case 0:
                    colorManager.input();
                    break;
                case 1:
                    managerCar.input(colorManager);
                    break;
                case 2:
                    managerCar.showCat();
                    break;
                case 3 :
                    managerCar.sort();
                    break;
                case 4 :
                    managerCar.find();
                    break;
                case 5 :
                    System.out.println("Thoát ");
                    break;
                default:
                    System.err.println("nhập sai");
                    break;
            }

        }while (choose!=5);

    }
    static void showMenu(){
        System.out.println("0.nhập danh sách mã màu");
        System.out.println("1.nhập thong tin N con mèo");
        System.out.println("2.Hiển thị");
        System.out.println("3.Sắp xếp theo màu");
        System.out.println("4.tim kiếm thong tin theo loại");
        System.out.println("5.thoát");
    }
}
