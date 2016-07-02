package zjulzq.github.com.scenarios.oom;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * Creating too many classes dynamically.
 * -Xmx10m -Xms10m -XX:PrintGCDetails
 */
public class Scenario4 {

    static class Tmp {

    }

    public static void main(String[] args) {
        Tmp tmp = new Tmp();
        while (!Thread.interrupted()) {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(Tmp.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
                    return arg3.invokeSuper(arg0, arg2);
                }
            });
            enhancer.create();
        }
        System.out.println(tmp.hashCode());
    }

}
