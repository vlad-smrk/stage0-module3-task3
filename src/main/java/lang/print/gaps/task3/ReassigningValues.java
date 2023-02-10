package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first = 1, second = 10, third = 100;
        System.out.println(first + "\n" + second + "\n" + third);
        int linkToFirst = first, linkToSecond = second, linkToThird = 100;
        first = 15;
        second = 6;
        third = 4;
        System.out.println(first + "\n" + second + "\n" + third + "\n" + linkToFirst + "\n" + linkToSecond + "\n" + linkToThird);
    }
}
