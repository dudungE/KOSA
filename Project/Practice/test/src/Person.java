import java.util.Scanner;

public class Person {
    private String name;
    private String PhoneNum;
    private String address;


    public Person(String name, String PhoneNum, String address) {
        this.name = name;
        this.PhoneNum = PhoneNum;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        PhoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", PhoneNum='" + PhoneNum + '\'' +
                ", address='" + address + '\'';
    }
}
