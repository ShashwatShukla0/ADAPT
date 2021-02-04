package assignment.six;
import java.util.*;

public abstract class Persistence {
abstract String persist();

}

class FilePersistence extends Persistence{
public String persist(){
System.out.println("FilePersistence is Called");
return null;
}
}

public class DatabasePersistence extends Persistence{
      public String persist(){
              System.out.println("DatabasePersistence is Called");
              return null;

}
}
     


public class Assignment2Q6{
    public static void main(String[] args) {

           FilePersistence j=new FilePersistence();
           DatabasePersistence a= new DatabasePersistence();
           j.persist();
           a.persist();
}

}



