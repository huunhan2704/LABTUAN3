import java.util.Scanner;
public class LOPHOCSINH {
    private int maso;
    private String hoten;
    private float diemtrungbinh;
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        LOPHOCSINH hs = new LOPHOCSINH();
        hs.input();
        hs.output();
        hs.xeploai();
    }
    public int getmaso() { return maso; }     
    public void setmaso(int maso) { this.maso=maso; }
    public String gethoten() { return hoten; }
    public void sethoten(String hoten) { this.hoten=hoten; }
    public float getdiemtrungbinh() { return diemtrungbinh; }
    public void setdiemtrungbinh(float diemtrungbinh) { this.diemtrungbinh=diemtrungbinh; }
    public LOPHOCSINH() {
        this.maso = 0;
        this.hoten = "";
        this.diemtrungbinh = 0f;
    }
    public LOPHOCSINH(int maso, String hoten, float diemtrungbinh) {
        this.maso = maso;
        this.hoten = hoten;
        this.diemtrungbinh = diemtrungbinh;
    }
    public LOPHOCSINH(LOPHOCSINH hs) {
        this.maso = hs.maso;
        this.hoten = hs.hoten;
        this.diemtrungbinh = hs.diemtrungbinh;
    }
    public void input() {
        System.out.println("Nhap ma so hs :");
        maso = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap ten hs:");
        hoten = sc.nextLine();
        System.out.println("nhap diem trung binh:");
        diemtrungbinh = sc.nextFloat();
    }
    public void output() {
        System.out.println(maso + " - " + hoten + " - " + diemtrungbinh);
    }
    public void xeploai() {
        if (diemtrungbinh < 5) {
            System.out.println("xep loai yeu");
        } else if (diemtrungbinh < 7) {
            System.out.println("Xep loai trung binh");
        } else if (diemtrungbinh < 8) {
            System.out.println("Xep loai kha");
        } else if (diemtrungbinh < 9) {
            System.out.println("Xep loai gioi");
        } else {
            System.out.println("Xep loai xuat sac");
        }
    }
}
