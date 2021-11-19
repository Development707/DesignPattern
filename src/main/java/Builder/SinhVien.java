package Builder;

import java.time.LocalDate;

public class SinhVien {
    private String firstName, lastName, email, address;
    private int age;
    private LocalDate birthDay;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", birthDay=" + birthDay +
                '}';
    }

    public SinhVien(SinhVienBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.address = builder.address;
        this.age = builder.age;
        this.birthDay = builder.birthDay;
    }

    public static class SinhVienBuilder{
        private String firstName, lastName, email, address;
        private int age;
        private LocalDate birthDay;

        public SinhVienBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public SinhVienBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public SinhVienBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public SinhVienBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public SinhVienBuilder setBirthDay(LocalDate birthDay) {
            this.birthDay = birthDay;
            return this;
        }

        public SinhVien build(){
            return new SinhVien(this);
        }
    }
}
