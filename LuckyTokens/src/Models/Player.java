package Models;

import java.util.ArrayList;
import java.util.Random;

public class Player {
    private int tokens;
    private ArrayList<Integer> value;
    private Integer point;
    public Player(){
        Random random = new Random();
        this.tokens = random.nextInt(5-2)+1;
        this.point = 0;
    }

    public Player(int tokens, ArrayList<Integer> value, Integer point) {
        this.tokens = tokens;
        this.value = value;
        this.point = point;
    }

    public int getTokens() {
        return tokens;
    }

    public void setTokens(int tokens) {
        if(tokens <= 0){
            this.tokens = 0;
        }else{
            this.tokens = tokens;
        }
    }

    public ArrayList<Integer> getValue() {
        return value;
    }

    public void setValue(ArrayList<Integer> value) {
        this.value = value;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(ArrayList<Integer> arrayListValue) {
        this.point = 0;
        for(Integer value : arrayListValue){
            this.point += value;
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "generated number is " + value +
                "-> total is " + point +
                "-> token is " + tokens +
                '}';
    }
}
