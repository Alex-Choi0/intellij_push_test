import java.util.Arrays;
import java.util.Scanner;
public class HelloJava {
    public static void main(String[] args){
        System.out.println("자바 테스트");
        class MobilePhone{
            public String brand;
            public String name;
            public String number;

            public String[] list;
        }

        MobilePhone myPhone = new MobilePhone();
        myPhone.brand="삼성";
        myPhone.name="갤럭시20000";
        myPhone.number="010-4853-4810";
        myPhone.list = new String[]{"a", "b", "c"};
        System.out.println("myPhone 정보");
        System.out.println(Arrays.toString(myPhone.list));


    }
}
