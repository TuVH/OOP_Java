package managet.cat;

import cat.exam.CatDetail;

import java.util.*;

public class ManagerCar  {
    ArrayList<CatDetail> catList = new ArrayList<>();



    public void input(ColorManager colorManager){
        CatDetail catDetail;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số mèo cần thêm");
        int n  =  Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n ; i++) {
            catDetail = new CatDetail();
            catDetail.input(colorManager);
            catList.add(catDetail);
        }
    }
    public void showCat(){
        for (int i = 0; i <catList.size() ; i++) {
            catList.get(i).show();
        }
    }
    public void sort(){
        Collections.sort(catList, new Comparator<CatDetail>() {
            @Override
            public int compare(CatDetail t1, CatDetail t2) {
                return t1.getColor().compareToIgnoreCase(t2.getColor());
            }
        });
        showCat();
    }
    public void find(){
        Scanner input = new Scanner(System.in);
        System.out.println("nhập loại tìm kiếm :");
        String result = input.nextLine();
        boolean check = false;
        for (CatDetail c : catList) {
            if(c.getType().equalsIgnoreCase(result)){
                check =true;
                c.show();
            }

        }
        if (!check){
            System.out.println("khong tim thấy " + result);
        }
    }

}

