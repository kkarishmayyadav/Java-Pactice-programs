import javax.naming.spi.DirStateFactory.Result;
import javax.sql.rowset.spi.SyncResolver;

public class type_conversion {
    public static void main(String[] args) {
        byte b=4;
    short s=512;
    char c='c';
    float f= 3.14f;
    int $=1000;
    double d=99.9954;
    float fb=(f*b);
    System.out.println(fb);
    int $c=($%c);
    System.out.println($c);
    double ds=(d*s);
    System.out.println(ds);
    double Result =(f*b)+($%c)-(d*s);
    System.out.println(Result);
    }
    
    
}
