/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uml_class_diagram;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Anusha
 */

class Position{
    int x;
    int y;
    
    public Position(int x,int y){
        this.x=x;
        this.y=y;
    }
}

class Orientation{
    String HORIZONTAL;
    String VERTICAL;
    
    public Orientation(String HORIZONTAL,String VERTICAL){
        this.HORIZONTAL=HORIZONTAL;
        this.VERTICAL=VERTICAL;
    }
}
  
class Ship{
    String name;
    int size;
    String colour;
    int value;
    List<Position>position;
    List<Orientation>orientation;
    
    public String getColour() {
        return colour;
    }
}

enum TypeofGame{
    player1vsplayer2,
    playervscomputer
}

class Torpedo{
    int x;
    int y;
    boolean hit;
    
    public Torpedo(int x,int y){
        this.x=x;
        this.y=y;
    }
    
    public boolean hit(){
        return hit;
    }
            
}

class Player{
    String name;
    int score;
    int id;
    List<Torpedo>torpedoes;
    List<Ship>ships;
    
    public Player(String name, int score){
        this.name=name;
        this.id=id;
        this.score=score;
        this.torpedoes=new ArrayList<>();
        this.ships=new ArrayList<>();    
}
    
}

class Rounds{
    int rounds;
    
    public Rounds(int rounds){
        this.rounds=rounds;
    }
}

class Outcome{
    String result;
    public Outcome(String result){
        this.result=result;
    }
}

class Game{
    Date startTime;
    Date endTime;
    List<Game>rounds;
    List<Player>winner;
    List<Player>player;
    
    public Game(){
        this.rounds=new ArrayList<>();
        this.winner=new ArrayList<>();
        this.player=new ArrayList<>();
    }
}

public class UML_CLASS_DIAGRAM {

    public static void main(String[] args) {
        Game game = new Game();
    }

}