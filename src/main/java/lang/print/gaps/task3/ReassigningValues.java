package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first=1,second=10,third=100;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        int  linkToFirst=15;
        int linkToSecond=6;
        int linkToThird=4;
        first=linkToFirst;
        second=linkToSecond;
        third=linkToThird;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);


    }
}
