import java.util.ArrayList;

public class LopHocPhan {
    public String maLHP;
    public String tenLHP;
    public String tenGV;
    public String in4LopHoc;
    private ArrayList<SinhVien> danhSachSV;

    // Constructor
    public LopHocPhan(String maLHP, String tenLHP, String tenGV, String in4LopHoc) {
        this.maLHP = maLHP;
        this.tenLHP = tenLHP;
        this.tenGV = tenGV;
        this.in4LopHoc = in4LopHoc;
        this.danhSachSV = new ArrayList<SinhVien>();
    }

    // Phương thức thêm sinh viên vào danh sách
    public void themSinhVien(SinhVien sinhVien) {
        danhSachSV.add(sinhVien);
    }

    // Phương thức hiển thị thông tin lớp học phần
    public void hienThiThongTin() {
        System.out.println("Ma LHP: " + maLHP);
        System.out.println("Ten LHP: " + tenLHP);
        System.out.println("GV giang day: " + tenGV);
        System.out.println("Thong tin buoi hoc: " + in4LopHoc);
        System.out.println("Danh sach sinh vien: ");
        for (SinhVien sv : danhSachSV) {
            System.out.println(sv.maSV + "| " + sv.hoTen);
        }
        System.out.println("Tong so sinh vien: " + danhSachSV.size());
    }
}