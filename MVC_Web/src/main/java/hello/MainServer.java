package hello;

import static spark.Spark.*;


public class MainServer {
	
	final static Model model = new Model();
	
    public static void main(String[] args) {

		// Get port config of heroku on environment variable
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 1234;
        }
        port(port);

		//Serve html js css files
		staticFileLocation("/static");

		inicializarCarros();

		Controller controller = new Controller(model);
		
		controller.login();

		
    }
    
    public static void inicializarCarros(){
    	model.addUser(new User("joao@gmail.com", "thomasandfriends"));
    	
    
    }
}
