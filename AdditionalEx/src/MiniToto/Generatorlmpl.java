package MiniToto;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Generatorlmpl implements GeneratorAPI{

    @Override
    public Queue<Integer> generateNumbers(int count) {

        Queue<Integer> generatedNums = new LinkedList<>();
        Random random = new Random();

        int maxLimit;
        if (count == 6){
            maxLimit = 49;
        }else{
            maxLimit = 35;
        }

        System.out.println("Generated numbers:");
        for(int i = 1; i <= count; i++) {
            int randomNum = random.nextInt(maxLimit - 1) + 1;
            generatedNums.add(randomNum);
            System.out.print(randomNum + "  ");
        }
        System.out.println();

        return generatedNums;
    }

}
