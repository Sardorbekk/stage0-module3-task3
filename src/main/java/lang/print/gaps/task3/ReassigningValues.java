package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first=1;
        int second=10;
        int third=100;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        int linkToFirst, linkToSecond, linkToThird;
        linkToFirst=first;
        linkToSecond=second;
        linkToThird=third;
        first=15;
        second=4;
        third=6;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(linkToFirst);
        System.out.println(linkToSecond);
        System.out.println(linkToThird);

    }
}
