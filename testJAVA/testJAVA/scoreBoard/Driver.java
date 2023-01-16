package testJAVA.scoreBoard;

public class Driver {

    public static void main(String[] args) {
        playerService playerService = testJAVA.scoreBoard.playerService.getInstance();
        runServices runServices = testJAVA.scoreBoard.runServices.getInstance();
        playerService.addPlayer("Nitesh", "Batter", "BP");
        playerService.addPlayer("Swati", "Bowler", "BP");
        playerService.addPlayer("Surya", "all", "broCOde");
        runServices.addRun(6, "Nitesh", "Surya", "", runType.six);
        runServices.addRun(4, "Nitesh", "Surya", "", runType.four);
        runServices.addRun(2, "Nitesh", "Surya", "", runType.two);
        runServices.addRun(0, "Nitesh", "Surya", "", runType.out);
        System.out.println(runServices.getSumScore());
        System.out.println(runServices.getWickets());
    }
    
}
