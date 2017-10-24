package is.ru.hugb;

import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
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
        
        get("/", (req, res) -> {

            return new ModelAndView(new HashMap(), "templates/index.vtl");
        },new VelocityTemplateEngine());
    }
}