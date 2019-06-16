public class Program {

    public static int[] main ( String[] args ) {
        int[] result = new int[2];
        int min, max;

        if (args.length == 0) // 1
            throw new IllegalArgumentException();
        else {
            min = max = Integer.parseInt(args[0]);
            for (int i = 1; i < args.length; i++) { // 2
                int obs = Integer.parseInt(args[i]);
                if (obs > max) max = obs; // 3
                else if (min > obs) min = obs; //4
            }
        }
        result[0] = min;
        result[1] = max;

        return result;
    }
}
