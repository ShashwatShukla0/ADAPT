package Q9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext cap = new ClassPathXmlApplicationContext("Q9/Spring.xml"); 
             HelloWorld hw= (HelloWorld)cap.getBean("hello");
         ((ConfigurableApplicationContext) cap).close();
        
    }
}
© 2021 GitHub, Inc.