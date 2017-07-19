package hello;

import java.util.concurrent.atomic.AtomicLong;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController{
	private final String template = "Bienvenue sur le serveur, %s";
	private final AtomicLong id = new AtomicLong();
	
	@CrossOrigin
	@RequestMapping(value = "/greeting/{name}", method = RequestMethod.GET)
	public Greeting greeting(final @PathVariable String name){
		return new Greeting(id.incrementAndGet(), String.format(this.template, name));
	}
}