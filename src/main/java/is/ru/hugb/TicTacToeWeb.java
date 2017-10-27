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
            return new VelocityTemplateEngine().render(new ModelAndView(values, "templates/index.vtl"));
        });

        post("/", (req, res) -> {
            HashMap<String, Object> values = new HashMap<>();
            game.initialize();
            ArrayList<String> turn = game.getArray();
            
            values.put("turn", turn);
            return new VelocityTemplateEngine().render(new ModelAndView(values, "templates/index.vtl"));
        });

        post("/game", (req, res) -> {
            
            int id = Integer.parseInt(req.queryParams("id"));
            game.insertSymbol(id + 1);

            ArrayList<String> turn = game.getArray();
            String values = id + turn.get(id) + game.isGameOver();
            return values;
        });
    }
}