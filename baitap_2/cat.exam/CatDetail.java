package cat.exam;

import managet.cat.ColorManager;

import java.util.Scanner;

public class CatDetail implements Icat {
    String type ;
    String color;
    String locate;

    public CatDetail() {
    }

    public CatDetail(String type, String color, String locate) {
        this.type = type;
        this.color = color;
        this.locate = locate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLocate() {
        return locate;
    }

    public void setLocate(String locate) {
        this.locate = locate;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập loại :");
        type = scanner.nextLine();

        System.out.println("nhập nơi sống :");
        locate = scanner.nextLine();
    }
    public void input(ColorManager colorManager){
        input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap mau :");
        while (true){
            color = scanner.nextLine();
            if(colorManager.checkColor(color)){
                break;
            }else {
                colorManager.display();
                System.out.println("nhap lai ma mau`");
            }
        }
    }

    @Override
    public String toString() {
        return "CatDetail{" + "name=" +name +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", locate='" + locate + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println(toString());
    }

}
