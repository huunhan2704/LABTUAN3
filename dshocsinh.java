import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class dshocsinh{
    //cac thuoc tinh
    private LOPHOCSINH[] ds;//mang
    private int soluong;//so luong hs
    //cac pt
    public void nhapds(){
        //nhap so luong hs
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("nhap so luong hoc sinh:");
            soluong = sc.nextInt();
            //khoi tao mang
            ds = new LOPHOCSINH[soluong];
            //nhap tt cho hs
            for (int i = 0; i < soluong; i++){
                ds[i] = new LOPHOCSINH();
                ds[i].input();
            }
        }
    }
    public void xuatds(){
        System.out.println("danh sach hoc sinh:");
        for (int i = 0; i < soluong; i++){
            ds[i].output();
        }
    }
    public void sapxep(){
        Arrays.sort(ds, new Comparator<LOPHOCSINH>(){
            public int compare(LOPHOCSINH hs1, LOPHOCSINH hs2){
                return Float.compare(hs2.getdiemtrungbinh(), hs1.getdiemtrungbinh());
            }
        });

    }
}