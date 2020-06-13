package baitap_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choose = 0, n;
        ArrayList<Author> authors = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        do {
            showMenu();
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("nhập số sách cần thêm");
                    n = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < n; i++) {
                        Book book = new Book();
                        book.input();
                        books.add(book);
                        boolean isFind = false;
                        for (int j = 0; j < authors.size(); j++) {
                            if (authors.get(j).getNickname().equalsIgnoreCase(book.getNickname())) {
                                isFind = true;
                                break;
                            }
                        }
                        if (!isFind) {
                            Author author = new Author(book.getNickname());
                            author.input();
                            authors.add(author);
                        }
                    }
                    break;
                case 2:
                    for (Book b:books) {
                        b.display();
                    }

                    break;
                case 3:

                    System.out.println("nhập số tác giả cần thêm");
                    n = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < n; i++) {
                        Author author = new Author();
                        author.input(authors);
                        authors.add(author);
                    }
                    break;
                case 4:
                    System.out.println("nhập ten bút danh cần tìm kiếm :");
                    String nickname = input.nextLine();
                    for (int i = 0; i <books.size() ; i++) {
                        if(books.get(i).getNickname().equalsIgnoreCase(nickname)){
                            books.get(i).display();
                        }
                    }
                    break;
            }
        } while (choose != 5);
    }

    static void showMenu() {
        System.out.println("1.nhập thông tin sách :");
        System.out.println("2. hiển thị tất cả sách");
        System.out.println("3. nhập thông tin tác giả");
        System.out.println("4. tìm kiếm sách theo but danh");
        System.out.println("5. thoát!");
    }
}
