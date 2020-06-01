package org.springframework.Bean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

@Component
public class MyMapperScannerRegistrar implements ImportBeanDefinitionRegistrar {


    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(ExtentMapperTest.class);
        GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanDefinitionBuilder.getBeanDefinition();
        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.lenovo.datasets.dao.mapper.ExtentMapperTest");
        beanDefinition.setBeanClass(TestFactoryBean.class);
        beanDefinitionRegistry.registerBeanDefinition("extentMapperTest", beanDefinition);
    }

}


class TestFactoryBean implements FactoryBean, InvocationHandler {

    Class aClass;

    public TestFactoryBean(Class classz) {
        aClass = classz;
    }

    @Override
    public Object getObject() throws Exception {
        Class[] classes = new Class[]{aClass};
        Object object = Proxy.newProxyInstance(this.getClass().getClassLoader(), classes, this);

        return object;


    }

    @Override
    public Class<?> getObjectType() {
        return aClass;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(1111);
        return null;
    }
}