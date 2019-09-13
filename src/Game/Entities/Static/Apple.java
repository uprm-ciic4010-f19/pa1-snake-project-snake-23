package Game.Entities.Static;

import Game.Entities.Dynamic.Player;
import Main.Handler;

/**
 * Created by AlexVR on 7/2/2018.
 */
public class Apple {

    private Handler handler;

    public int xCoord;
    public int yCoord;
    

    public Apple(Handler handler,int x, int y){
        this.handler=handler;
        this.xCoord=x;
        this.yCoord=y;
    }
    
//Checks if apple is rotten
    public static boolean isGood() {
    	if(Player.stepCounter > 180) {
    		return false;
    	}
    	else
    		return true;
    }
   

}
