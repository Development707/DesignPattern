package Builder;

import java.time.LocalDate;
import java.time.Month;

public class MainTestBuilder {
    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien.SinhVienBuilder("Nguyen","A")
                .setAge(18)
                .setAddress("Viet Nam")
                .setBirthDay(LocalDate.of(2000, Month.APRIL,1))
                .setEmail("nguyenvana@gmail.com")
                .build();
        System.out.println(sinhVien.toString());
    }
}
