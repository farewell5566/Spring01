import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[]argus) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationFactory.xml");

        objA obja = ctx.getBean("objA",objA.class);
        objB objb = ctx.getBean("objB",objB.class);
        objC objc = ctx.getBean("objC",objC.class);

        objB obj = obja.getObjb();
        obj.setName("我是B");
        System.out.println(ToStringBuilder.reflectionToString(obja,ToStringStyle.MULTI_LINE_STYLE));

        System.out.println(obja.getObjb().getName());




        //System.out.println(ToStringBuilder.reflectionToString(person,ToStringStyle.MULTI_LINE_STYLE));
        //System.out.println(ToStringBuilder.reflectionToString(food,ToStringStyle.JSON_STYLE));


    }
}
