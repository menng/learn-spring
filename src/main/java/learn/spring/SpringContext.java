package learn.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringContext {

    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println("ApplicationContext: " + applicationContext);
        Chinese bean = applicationContext.getBean(Chinese.class);
        System.out.println("ApplicationContext: " + bean.getApplicationContext());

        System.out.println(applicationContext == bean.getApplicationContext());

        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanFactory.xml"));
        System.out.println("BeanFactory: " + beanFactory);
        China bean1 = beanFactory.getBean(China.class);
        System.out.println("BeanFactory: " + bean1.getBeanFactory());
        System.out.println(beanFactory == bean1.getBeanFactory());
    }
}
