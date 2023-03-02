public class Tower{
    public static void main(String[] args) {
        TowerOfHanoi(3, 1, 3, 2);
    }
    
    public static void TowerOfHanoi(int pegs, int source, int dest, int aux) {
        if(pegs >= 1){
            TowerOfHanoi(pegs - 1, source, aux, dest);
            System.out.println("Move peg from " + source + " to " + dest);
            TowerOfHanoi(pegs -1, aux, dest, source);
        }
    }

}