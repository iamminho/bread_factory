import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("등록할 빵 갯수를 입력하세요 : ");
        int n = sc.nextInt();
        ArrayList<Bread> BreadDatas = new ArrayList<>();
        BreadController bdControl = new BreadController();

        bdControl.BreadSave(n, BreadDatas);


    }
}