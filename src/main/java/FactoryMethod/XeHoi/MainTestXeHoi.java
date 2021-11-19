package FactoryMethod.XeHoi;

public class MainTestXeHoi {
    public static void main(String[] args) {
        XeHoi honda = XeHoiFactory.getXeHoi(LoaiXeHoi.Honda,"Xe loai 1","V4.1","Nhật Bản");
        XeHoi nexus = XeHoiFactory.getXeHoi(LoaiXeHoi.Nexus,"Xe loai 2","V8.0","Nhật Bản");
        XeHoi toyota = XeHoiFactory.getXeHoi(LoaiXeHoi.Toyota,"Xe loai 3","V6.2","Nhật Bản");
        System.out.println(honda);
        System.out.println(nexus);
        System.out.println(toyota);
    }
}
