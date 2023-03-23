package Models;

import java.util.Random;

public class Host {
    private int tokens;
    public Host(){
        Random random = new Random();
        this.tokens = random.nextInt(5-1)+1;
    }

    public Host(int tokens) {
        this.tokens = tokens;
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

    @Override
    public String toString() {
        return "Host{" +
                "tokens is " + tokens +
                '}';
    }
}
