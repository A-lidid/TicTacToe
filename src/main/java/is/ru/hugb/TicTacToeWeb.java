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
            HashMap<String, Object> values = new HashMap<>();
            values.put("turn", "X");
            values.put("turn", "O");
            values.put("turn", "O");
            values.put("turn", "O");
            values.put("turn", "X");
            values.put("turn", "O");
            values.put("turn", "O");
            values.put("turn", "O");
            values.put("turn", "X");
            return new ModelAndView(values, "templates/index.vtl");
            
        }, new VelocityTemplateEngine());

        post("/", (req, res) -> {
            HashMap<String, Object> values = new HashMap<>();
            values.put("turn", "X");
            values.put("turn", "O");
            values.put("turn", "O");
            values.put("turn", "O");
            values.put("turn", "X");
            values.put("turn", "O");
            values.put("turn", "O");
            values.put("turn", "O");
            values.put("turn", "X");
            return new ModelAndView(values, "templates/index.vtl");
        }, new VelocityTemplateEngine());

        post("/game", (req, res) -> {
            res.type("application/json");
            HashMap<String, Object> values = new HashMap<>();

            //test in console to see if right id is returning
            //System.out.println(req.queryParams("id"));

            int id = Integer.parseInt(req.queryParams("id"));
            System.out.println(id);
            //String player game.insertSymbol(id);

           //if (id == 1) 
           values.put("one", "X");

            return new ModelAndView(values, "templates/index.vtl");
        }, new VelocityTemplateEngine());
    }
}