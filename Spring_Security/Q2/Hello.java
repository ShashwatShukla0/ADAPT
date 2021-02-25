package q2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@GetMapping("/")
	public String world()
	{
		return ("<h1>Hello World</h1>");
	}
	
	@GetMapping("/user")
	public String user()
	{
		return ("<h1>Hello user to the world</h1>");
	}
	
	@GetMapping("/admin")
	public String admin()
	{
		return ("<h1>Hello Admin to the world</h1>");
	}

}

