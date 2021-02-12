package Q7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args ) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Q7/Spring.xml");
    	SpelOperators spelOperators = (SpelOperators) context.getBean("spelOperators");
    	Car car =(Car)context.getBean("someCar");
    	Engine engine= (Engine)context.getBean("engine");
    }
}