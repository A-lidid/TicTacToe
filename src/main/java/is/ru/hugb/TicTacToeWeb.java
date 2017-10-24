package is.ru.hugb;

import java.util.HashMap;
import java.util.ArrayList;

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
        
        TicTacToeService game = new TicTacToeService();
        
        get("/", (req, res) -> {
            HashMap<String, Object> values = new HashMap<>();
            game.initialize();
            ArrayList<String> turn = game.getArray();
            
            values.put("turn", turn);
            return new ModelAndView(values, "templates/index.vtl");
            
        }, new VelocityTemplateEngine());

        post("/", (req, res) -> {

            Thread.sleep(5); // this is only to make shure so this runs after the '/game' function
            HashMap<String, Object> values = new HashMap<>();
            ArrayList<String> turn = game.getArray();
            
            values.put("turn", turn);
            return new ModelAndView(values, "templates/index.vtl");
        }, new VelocityTemplateEngine());

        post("/game", (req, res) -> {
            //test in console to see if right id is returning
            //System.out.println(req.queryParams("id"));

            int id = Integer.parseInt(req.queryParams("id"));
            System.out.println(id);
            if (id == -1) game.initialize();
            else game.insertSymbol(id + 1);

            return new ModelAndView(new HashMap<>(), "templates/index.vtl");
        }, new VelocityTemplateEngine());
    }
}