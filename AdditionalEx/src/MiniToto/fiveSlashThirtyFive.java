package MiniToto;

import java.util.Queue;

public class fiveSlashThirtyFive extends Card {

    fiveSlashThirtyFive(){}

    public fiveSlashThirtyFive(String serialNumber, Queue<Integer> userCard) {
        this.serialNumber = serialNumber;
        this.userCard = userCard;
    }

    public String toString(){
        return "Serial number: " + serialNumber + "\n User card: " + userCard.toString();
    }

    @Override
    public boolean compareNumbers(Queue<Integer> user ,Queue<Integer> generatedNums) {
        boolean isWinner = true;

        for(int i = 0; i < user.size(); i++){

            int genNum = generatedNums.poll();
            int userNum = user.poll();

            if(!(userNum == genNum)){
                System.out.println("You don't win! Better choice next time!");
                isWinner = false;
                break;
            }

        }

        return isWinner;
    }

}
