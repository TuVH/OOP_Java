package managet.cat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColorManager {
    List<String> colorList = new ArrayList<>();

    public ColorManager() {
    }
    public void  input(){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("nhap ma mau can them :");
            String color = input.nextLine();
            colorList.add(color);

            System.out.println("co tiep tuc khong Y/N");
            String option = input.nextLine();
            if(option.equalsIgnoreCase("n")){
                break;
            }
        }
    }
    public void display(){
        for (int i = 0; i <colorList.size() ; i++) {
            System.out.print(" "+colorList.get(i));
        }
    }
    public boolean checkColor(String color){
        return colorList.contains(color);
    }



}
