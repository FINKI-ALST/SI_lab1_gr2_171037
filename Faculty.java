import java.util.*;

public class Faculty {

    public static void main(String[] args)
    {
        List <Student> fakultet = new LinkedList<>();
        String imeFaks;
        fakultet.add("NewStudent1");
        fakultet.add("NewStudent2");
        fakultet.remove("NewStudent1");
        fakultet.remove("NewStudent2");
        fakultet.remove("NewStudent3");

        System.out.println(fakultet);
    }
}