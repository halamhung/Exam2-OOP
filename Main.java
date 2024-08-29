import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //nhập danh sách sản phẩm vào arraylist mặc định 5 sản phẩm
        for (int i = 0; i < 5; i++) {
            System.out.println("Sản phẩm thứ " + (i + 1));
            System.out.println("Nhập tên vật phẩm:");
            String tenVatPham = scanner.nextLine();
            System.out.println("Nhập chỉ số sức mạnh: ");
            int chiSoSucManh = scanner.nextInt();
            System.out.println("Nhập Hệ số sức mạnh: ");
            double heSoSucManh = scanner.nextDouble();
            System.out.println("Nhập Vàng quy đổi: ");
            int vangQuyDoi = scanner.nextInt();
            scanner.nextLine(); // đọc bỏ dòng mới còn lại
            items.add(new Item(tenVatPham, chiSoSucManh,heSoSucManh,vangQuyDoi));
        }

        // in danh sách sản phẩm
        System.out.println("Danh sách sản phẩm:");
        for (Item item : items) {
            System.out.println(item);
        }

        //tìm 1 vật phẩm tốn nhiều vàng để mua được nhất
        Item itemMaxVang = items.get(0);
        for (Item item : items) {
            if (item.tongVangDeMua() > itemMaxVang.tongVangDeMua()) {
                itemMaxVang = item;
            }
        }
        System.out.println("Sản phẩm tốn nhiều xu vàng nhất là: " + itemMaxVang.getName());

        //câu 4
        //nhập số xu vàng mà spon thu được
        System.out.println("Nhập số xu vàng mà spon đã thu được:");
        double vangCuaSpon = scanner.nextDouble();
        //khả năng giải cứu
        double Tongvangcan = items.stream().mapToDouble(Item:: tongVangDeMua).sum();
        if (vangCuaSpon >= Tongvangcan){
            double vangDu = (vangCuaSpon - Tongvangcan );
            System.out.println(" Spon giải cứu thành công và còn dư: " + vangDu + " xu vàng");
        }
        else {
            double vangConThieu = (Tongvangcan - vangCuaSpon );
            System.out.println("Xin lỗi , Spon không thể cứu bạn, còn thiếu "+ vangConThieu + " xu vàng" );
        }
    }
}
