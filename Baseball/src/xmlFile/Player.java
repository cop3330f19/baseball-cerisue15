/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlFile;

/**
 *
 * @author cerigoff
 */
public class Player {
    private String name;
    private String team;
    private int atBats;
    private int hits;
    private double Avg = (double) hits / (double) atBats;;
    private String batAvg = String.format("%.3f", Avg);
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public int getAtBats() {
        return atBats;
    }
    public void setAtBats(String atBats) {
        this.atBats = Integer.parseInt(atBats);
    }
    public int getHits() {
        return hits;
    }
    public void setHits(String hits) {
        this.hits = Integer.parseInt(hits);
    }
    /*public void setBattingAvg() {
        this.Avg = (double) hits / (double) atBats;
        this.batAvg = String.format("%.3f", Avg);
    }*/
    public String getBattingAvg() {
        //setBattingAvg();
        return batAvg;
    }
    
    
    @Override
    public String toString() {
        return "Player [name=" + name + ", team=" + team + ", atBats="
                + atBats + ", hits=" + hits + ", battingAvg=" + batAvg + "]";
    }
    
}
