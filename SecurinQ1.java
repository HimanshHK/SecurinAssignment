import java.util.ArrayList;
import java.util.List;

public class SecurinQ1{
    public static void main(String[] args) {
        List<Integer> dice_a = new ArrayList<>();
        dice_a.add(1);
        dice_a.add(2);
        dice_a.add(3);
        dice_a.add(4);
        dice_a.add(5);
        dice_a.add(6);

        List<Integer> dice_b = new ArrayList<>();
        dice_b.add(1);
        dice_b.add(2);
        dice_b.add(3);
        dice_b.add(4);
        dice_b.add(5);
        dice_b.add(6);

        int total = totalNumberOfCombinations(dice_a, dice_b);
        System.out.print("Total number of Possible Combinations are: ");
        System.out.println(total);
        System.out.println();

        List<List<Integer>> totalCombinations = totalCombinations(dice_a, dice_b);
        System.out.println("Total Possible Combinations are:");
        for (List<Integer> combination : totalCombinations) {
            for (int num : combination) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        List<List<Integer>> totalCombinations1 = totalCombinations1(dice_a, dice_b);
        int[] psum = new int[12];
        for (List<Integer> combination : totalCombinations1) {
            int temp = 0;
            for (int num : combination) {
                temp += num;
            }
            psum[temp - 1]++;
        }
        for (int i = 1; i < psum.length; i++) {
            System.out.println("probability sum of " + (i + 1) + " is " + psum[i] + "/36");
        }
        System.out.println();
    }

    public static int totalNumberOfCombinations(List<Integer> dice_a, List<Integer> dice_b) {
        int ct = 0;
        for (int i : dice_a) {
            for (int j : dice_b) {
                ct++;
            }
        }
        return ct;
    }

    public static List<List<Integer>> totalCombinations(List<Integer> dice_a, List<Integer> dice_b) {
        List<List<Integer>> total = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        for (int i : dice_a) {
            for (int j : dice_b) {
                current.add(i);
                current.add(j);
                total.add(new ArrayList<>(current));
                current.clear();
            }
        }
        return total;
    }

    public static List<List<Integer>> totalCombinations1(List<Integer> dice_a, List<Integer> dice_b) {
        List<List<Integer>> total = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        for (int i : dice_a) {
            for (int j : dice_b) {
                current.add(i);
                current.add(j);
                total.add(new ArrayList<>(current));
                current.clear();
            }
        }
        return total;
    }
}