package baitap_1;

import java.util.Scanner;

public class Book {
    String bookName;
    String date;
    String nickname;

    public Book() {
    }

    public Book(String bookName, String date, String nickname) {
        this.bookName = bookName;
        this.date = date;
        this.nickname = nickname;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("nhập tên sách :");
        bookName = scanner.nextLine();
        System.out.println("nhập ngày xuất bản sách :");
        date = scanner.nextLine();
        System.out.println("nhập bút danh sách :");
        nickname = scanner.nextLine();
    }

    public void display(){
        System.out.println(toString());
    }



    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", date='" + date + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
