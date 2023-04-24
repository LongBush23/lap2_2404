
public class Main {
	public static void main(String[] args) {

        LopHocPhan lopHocPhan = new LopHocPhan("123456", "lt huong doi tuong", "Nguyen Van A", "Thu 7, tiet 4-6, phong A1.1");

        lopHocPhan.themSinhVien(new SinhVien("123", "Nguyen Van A"));
        lopHocPhan.themSinhVien(new SinhVien("543", "Le Thi B"));
        lopHocPhan.themSinhVien(new SinhVien("321", "Luong Van C"));
        lopHocPhan.hienThiThongTin();
    }
}
