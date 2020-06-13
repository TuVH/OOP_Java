package baitap_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Author {
    private String name;
    private int old;
    private String nickname;
    private String birthday;
    private String address;

    public Author() {
    }

    public Author(String nickname) {
        this.nickname = nickname;
    }


    public Author(String name, int old, String nickname, String birthday, String address) {
        this.name = name;
        this.old = old;
        this.nickname = nickname;
        this.birthday = birthday;
        this.address = address;
    }
    public void input(ArrayList<Author> authors){
        input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập bút danh");
        while (true){
            nickname = scanner.nextLine();
            boolean duplicate = false;
            for (int i = 0; i <authors.size() ; i++) {
                if (authors.get(i).getNickname().equalsIgnoreCase(nickname)){
                    duplicate = true;
                }
            }
            if (!duplicate){
                break;
            } else {
                System.err.println("nhập sai");
            }
        }

    }
    public void input(){
        System.out.println("-----------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên tác giả :");
        name = scanner.nextLine();
        System.out.println("nhập tuổi tác giả :");
        old = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập ngày sinh tác giả :");
        birthday = scanner.nextLine();
        System.out.println("nhập địa chỉ tác giả :");
        address = scanner.nextLine();
    }
    public void display(){
            System.out.println(toString());
    }


    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", nickname='" + nickname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }

    public String getNickname() {
        return nickname;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

}

