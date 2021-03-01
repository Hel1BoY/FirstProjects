package MiniToto;

import java.util.Queue;

public abstract class Card {

    String serialNumber;
    Queue<Integer> userCard;

    public abstract boolean compareNumbers(Queue<Integer> user, Queue<Integer> generatedNums);
}
