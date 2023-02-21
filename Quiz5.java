public class Quiz5 {
    public static void main(String[] args){



//        #3
        int amt = 0;
        SoccerTeam USA, Arsenal, Brazil, Iran;
        USA = new SoccerTeam();
        Arsenal = new SoccerTeam();
        Brazil = new SoccerTeam();
        Iran = new SoccerTeam();
        while(amt <2){
            amt++;
            int g1, g2, g3, g4, t1, t2, t3 ,t4;
            g1 = (int) (Math.random() * 10);
            g2 = (int) (Math.random() * 10);
            g3 = (int) (Math.random() * 10);
            g4 = (int) (Math.random() * 10);
            t1 = (int) (Math.random() * 10);
            t2 = (int) (Math.random() * 10);
            t3 = (int) (Math.random() * 10);
            t4 = (int) (Math.random() * 10);
            USA.startTourny();
            USA.played(Arsenal, g1, t1);
            Arsenal.played(Brazil, g2, t2);
            Brazil.played(Iran, g3, t3);
            Iran.played(USA, g4, t4);
            System.out.println("USA points is " + USA.points());
            System.out.println("Arsenal points is " + Arsenal.points());
            System.out.println("Brazil points is " + Brazil.points());
            System.out.println("Iran points is " + Iran.points());
            System.out.println("The number of games played was " + USA.gamesPlayed());
            System.out.println("The number of goals scored was " + USA.goalsScored());
        }
    }
}
