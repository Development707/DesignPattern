package FactoryMethod.XeHoi;

public class Nexus extends XeHoi{
    private String thongTinXe, cauHinh, NSX;

    public Nexus(String thongTinXe, String cauHinh, String NSX) {
        this.thongTinXe = thongTinXe;
        this.cauHinh = cauHinh;
        this.NSX = NSX;
    }

    @Override
    public String getThongTinXe() {
        return this.thongTinXe;
    }

    @Override
    public String getCauHinhXe() {
        return this.cauHinh;
    }

    @Override
    public String getNhaSanXuat() {
        return this.NSX;
    }
}
