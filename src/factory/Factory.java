package factory;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class Factory {
    private static SqlSessionFactory factory;
    static{
        try {
            Reader r = Resources.getResourceAsReader("config/config.xml");
            factory = new SqlSessionFactoryBuilder().build(r);
            r.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static SqlSessionFactory getFactory() {
        return factory;
    }
}
