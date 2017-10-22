package is.ru.hugb;

import static spark.Spark.*;

public class TicTacToeWeb {
    public static void main(String[] args) {
        port(getHerokuPort());
        get("/", (req, res) -> {
            return "ARNAR OG JAKOB BITCH";
        });
    }

    static int getHerokuPort() {
        ProcessBuilder psb = new ProcessBuilder();
	if (psb.environment().get("PORT") != null) {
	    return Integer.parseInt(psb.environment().get("PORT"));
	}
	return 4567;
    }
}