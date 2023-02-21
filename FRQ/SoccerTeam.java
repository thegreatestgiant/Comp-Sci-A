class SoccerTeam{
    private int win, loss, tie, points;
    private static int gPlayed, gScored;
    public SoccerTeam(){
        win = 0;
        loss = 0;
        tie = 0;
        gPlayed = 0;
        gScored = 0;
    }
    public int points(){
        int w = win, l = loss, t = tie;
        points = 0;
        while(w>0){
            w--;
            points += 3;
        }
        while(t>0){
            t--;
            points ++;
        }
        while(l>0){
            l--;
            points--;
        }
        return points;
    }
    public void resetScore(){
        win = 0;
        loss = 0;
        tie = 0;
    }
    public static int gamesPlayed(){
        return gPlayed;
    }
    public static int goalsScored(){
        return gScored;
    }
    public static void startTourny(){
        gPlayed = 0;
        gScored = 0;
    }
    public void played(SoccerTeam other, int myScore,int otherScore){
        if(myScore > otherScore){
            this.win++;
            other.loss++;
        }
        else if(myScore < otherScore){
            other.win++;
            this.loss++;
        }
        else if(myScore == otherScore){
            this.tie++;
            other.tie++;
        }
        gPlayed ++;
        gScored += myScore + otherScore;
    }
}
