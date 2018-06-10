package org.obsessive.web;

import org.obsessive.web.factory.BeanFactory;
import org.obsessive.web.factory.ClassFactory;
import org.obsessive.web.factory.ConfigFactory;
import org.obsessive.web.util.ClassUtil;

import java.util.Arrays;
import java.util.List;

/**
 * 启动类
 */
public class ObsessiveStarter {

    public static void run() {
        List<Class<?>> classList = Arrays.asList(ConfigFactory.class,
                ClassFactory.class,
                BeanFactory.class);
        classList.forEach(clazz -> ClassUtil.loadClass(clazz.getName(), true));
    }

}