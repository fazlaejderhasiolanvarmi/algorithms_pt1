import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    // Week 1 - Course Introduction
    public static void main(String[] args){
        String champion = args[0];

        for(int i = 1; i < args.length; i++){
            String challenger = args[i];

            if(StdRandom.bernoulli(1.0 / args.length)){
                champion = challenger;
            }
        }

        System.out.println(champion);
    }
}
