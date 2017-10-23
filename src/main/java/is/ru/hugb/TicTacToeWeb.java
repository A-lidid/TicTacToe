package is.ru.hugb;

import static spark.Spark.*;

public class TicTacToeWeb {
    
    private static int getHerokuPort() {
        ProcessBuilder psb = new ProcessBuilder();
        if(psb.environment().get("PORT") != null) {
            return Integer.parseInt(psb.environment().get("PORT"));
        }

        return 4567;
    }


    public static void main(String[] args) {
        port(getHerokuPort());
        staticFileLocation("/public");        
        
        TicTacToe game = new TicTacToe();
        
        put("/turn", (req, res) -> "hi");
    }
}