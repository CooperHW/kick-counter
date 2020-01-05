package com.example.kick_counter;

import java.util.ArrayList;

public class CounterStack {
    private ArrayList<Pair<Player, Integer>> hits;
    public CounterStack(){
        this.hits = new ArrayList<Pair<Player,Integer>>();
    }

    public void push (Pair<Player, Integer> hit  ){
        this.hits.add(hit);
    }
    public Pair<Player, Integer> pop(){
        if(this.hits.size()==0){
            return null;
        } else if(this.hits.size()>=1){
            Pair<Player, Integer> lastHit = this.hits.get(this.hits.size()-1);
            this.hits.remove(this.hits.size()-1);
            return lastHit;
        }
        return null;
    }
    public void clear(){
        int num = this.hits.size();
        for(int i=0; i < num; i++ ){
            this.hits.remove(0);
        }
    }
}
