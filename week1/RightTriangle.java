public class RightTriangle {
    public static void main(String[] args) {
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        int third = Integer.parseInt(args[2]);

        // check if all positive
        boolean allPositive = (first > 0) && (second > 0) && (third > 0);
        
        // square integers
        int firstSquared = first * first;
        int secondSquared = second * second;
        int thirdSquared = third * third;

        boolean isRightTriangle = (thirdSquared == firstSquared + secondSquared) || (firstSquared == secondSquared + thirdSquared) || (secondSquared == firstSquared + thirdSquared);
        System.out.println(allPositive && isRightTriangle);
    }
}
