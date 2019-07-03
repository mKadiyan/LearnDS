package home.ds.logical;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class SumInCollection {

    public static void main(String[] args) {
        int total = 8;
        System.out.println(getSumPairOfOrdered(total, 1, 3, 5, 6, 8));
        System.out.println(getSumPairOfUnOrdered(total, 1,5 , 7, 9,3, 5, 6, 8));
    }

    private static Optional<Pair> getSumPairOfOrdered(int total, int... col) {
        for (int i = 0, j = col.length - 1; i < col.length && j > -1; ) {
            if (col[i] + col[j] == total) {
                return Optional.of(new Pair(col[i], col[j]));
            } else if (col[i] + col[j] < total) {
                i++;
            } else if (col[i] + col[j] > total) {
                j--;
            }
        }
        return Optional.empty();
    }

    private static Optional<Pair> getSumPairOfUnOrdered(int total, int... col) {
        Set<Integer> complements = new HashSet<>();
        for (int i = 0; i < col.length; i++) {
            if(complements.contains(Integer.valueOf(total - col[i]))){
                return Optional.of(new Pair(total - col[i], col[i]));
            }
            else {
                complements.add(col[i]);
            }
        }
        return Optional.empty();
    }

    private static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("x=%s, y=%s", x, y);
        }
    }
}
