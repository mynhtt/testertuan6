package Models;

import java.util.ArrayList;
import java.util.Random;

public class GamePlay {
    private final Host host;
    private final Player player;
    private Integer loop;
    public GamePlay(){
        this.host = new Host();
        this.player = new Player();
        this.loop = 0;
    }

    public void gameLoop(){
        if(this.host.getTokens() == 0 || this.player.getTokens() == 0){
            if(this.player.getTokens() == 0){
                System.out.println("Host Win");
            }else if (this.host.getTokens() == 0){
                System.out.println("Player Win");
            }
        }else{
            ArrayList<Integer> arrayListValue = new ArrayList<>();
            while (arrayListValue.size() < this.player.getTokens()){
                Random random = new Random();
                Integer value = random.nextInt(2+2) - 2;
                if(!arrayListValue.contains(value)){
                    arrayListValue.add(value);
                }
            }
            this.player.setValue(arrayListValue);
            this.player.setPoint(arrayListValue);
            if(this.player.getPoint() == 3){
                this.player.setTokens(this.player.getTokens() * 2);
            }
            if (this.player.getPoint() > 0 && this.player.getPoint() != 3){
                if(this.player.getPoint() <= this.host.getTokens()){
                    this.player.setTokens(this.player.getTokens() + this.player.getPoint());
                    this.host.setTokens(this.host.getTokens() - this.player.getPoint());
                }else{
                    this.player.setTokens(this.player.getTokens() + this.host.getTokens());
                    this.host.setTokens(0);
                }
            }
            if (this.player.getPoint() == -3){
                this.player.setTokens(this.host.getTokens() / 2);
            }
            if (this.player.getPoint() < 0 && this.player.getPoint() != -3){
                if(Math.abs(this.player.getPoint()) <= Math.abs(this.player.getTokens())){
                    this.player.setTokens(this.player.getTokens() - Math.abs(this.player.getPoint()));
                    this.host.setTokens(this.host.getTokens() + Math.abs(this.player.getPoint()));
                }else{
                    this.host.setTokens(this.host.getTokens() + this.player.getTokens());
                    this.player.setTokens(0);
                }
            }
            this.loop++;
            outDetailRound();
            gameLoop();
        }
    }
    void outDetailRound(){
        System.out.println("- Round " + this.loop + ":");
        System.out.println(this.player);
        System.out.println(this.host);
    }
     public void startUp(){
        System.out.println("Lucky Tokens");
        System.out.println(this.player);
        System.out.println(this.host);
    }
}
