import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy<T> {
    /**
     * 创建一个代理的对象
     * @param loader 类加载器
     * @param interfaces 类的接口对象集
     * @param h 调用处理器
     * @param <T>
     * @return
     */
    public static <T> T newProxyInstance(ClassLoader loader,
                                         Class<?>[] interfaces,
                                         InvocationHandler h){
        //寻找JoinPoint连接点，AOP框架使用元数据定义
        if (true){
            //执行一个前置通知
            (new BeforeAdvice()).exec();
        }

        //执行目标，并返回结果
        return (T) Proxy.newProxyInstance(loader,interfaces,h);
    }

}
