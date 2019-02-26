import dao.DictMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.BaseDict;

import java.util.List;

public class MapperTest {

    private ApplicationContext applicationContext;
    @Before
    public void setUp(){
        applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    }
    @Test
    public void testDictMapper() {
        DictMapper dictMapper = (DictMapper) applicationContext.getBean("dictMapper");
        List<BaseDict> dictByCode = dictMapper.findDictByCode("002");
        System.out.println(dictByCode);
    }
}
