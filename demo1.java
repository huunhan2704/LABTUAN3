public class demo1{
    public static void main(String[]args){
        //tao hs1
        LOPHOCSINH hs1 = new LOPHOCSINH();
        hs1.input();
        hs1.output();
        //tao hs2
        LOPHOCSINH hs2 = new LOPHOCSINH(111,"Nguyen Van A",8.5f);
        hs2.output();
        //tao hs3
        LOPHOCSINH hs3 = new LOPHOCSINH(hs2);
        hs3.output();
        //doi ten hoc sinh 3 thanh ten moi
        hs3.sethoten("Nguyen Van B");
        hs3.output();
        //tim ten cua hs co dtb cao nhat
        float max = hs1.getdiemtrungbinh();
        String ten = hs1.gethoten();
        if (max < hs2.getdiemtrungbinh()){
            max = hs2.getdiemtrungbinh();
            ten = hs2.gethoten();
        }
        if (max < hs3.getdiemtrungbinh()){
            max = hs3.getdiemtrungbinh();
            ten = hs3.gethoten();
        }
        System.out.println("hoc sinh"+ten+"co dtb cao nhat la:"+max);

    }

}