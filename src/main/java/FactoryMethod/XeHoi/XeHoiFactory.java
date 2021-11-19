package FactoryMethod.XeHoi;

public class XeHoiFactory {
    public static XeHoi getXeHoi(LoaiXeHoi type, String thongTinXe, String cauHinh, String NSX){
        switch (type){
            case Honda:
                return new Honda(thongTinXe, cauHinh, NSX);
            case Nexus:
                return new Nexus(thongTinXe, cauHinh, NSX);
            case Toyota:
                return new Toyota(thongTinXe, cauHinh, NSX);
            default:
                return null;
        }
    }
}
