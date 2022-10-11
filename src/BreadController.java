import java.util.ArrayList;
import java.util.Scanner;

public class BreadController {
    public void BreadInfoSave (int id, String name, ArrayList<Bread> arr) {
        Bread bd = new Bread(id, name);
        arr.add(bd);
    }

    public void BreadSave (int n, ArrayList<Bread> BreadDatas) {
        for (int i = 0; i < n; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("등록할 빵의 이름을 입력하세요 : ");
            String name = sc.nextLine();
            BreadInfoSave(i, name, BreadDatas);
        }
    }
}
