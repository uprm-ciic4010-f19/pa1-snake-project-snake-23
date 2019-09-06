package Worlds;

import Game.Entities.Dynamic.Player;
import Game.Entities.Dynamic.Tail;
import Game.Entities.Static.Apple;
import Main.Handler;

import java.awt.*;
import java.util.LinkedList;


/**
 * Created by AlexVR on 7/2/2018.
 */
public abstract class WorldBase {

    //How many pixels are from left to right
    //How many pixels are from top to bottom
    //Must be equal
    public int GridWidthHeightPixelCount;

    //automatically calculated, depends on previous input.
    //The size of each box, the size of each box will be GridPixelsize x GridPixelsize.

    public int GridPixelsize ;
    		
    		
    public Player player;

    protected Handler handler;


    public Boolean appleOnBoard;
    protected Apple apple;
    public Boolean[][] appleLocation;


    public Boolean[][] playerLocation;

    public LinkedList<Tail> body = new LinkedList<>();


    public WorldBase(Handler handler){
        this.handler = handler;

        appleOnBoard = false;


    }
    public void tick(){



    }

    public void render(Graphics g){

    	//Changed initial to 800 instead of deleting the whole lines of code to be able to draw lines later if needed
        for (int i = 800; i <= 800; i = i + GridPixelsize) {

            g.setColor(Color.white);
            g.drawLine(0, i, handler.getWidth() , i);
            g.drawLine(i,0,i,handler.getHeight());

        }



    }

}
