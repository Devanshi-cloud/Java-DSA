public class Merge {
        public static void main(String[] args) {
            String string1 = "Hello";
            String string2 = "World";
            int numberOfIterations = 10;

            StringBuilder mergedString = new StringBuilder();

            for (int i = 0; i < numberOfIterations; i++) {
                mergedString.append(i % 2 == 0 ? string1 : string2);
                if (i < numberOfIterations - 1) {
                    mergedString.append(" ");
                }
            }

            System.out.println(mergedString.toString());
        }
    }
