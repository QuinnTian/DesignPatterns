import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//动态代理类，实现了invocationhandler
public class GamePlayIH implements InvocationHandler {
    //被代理者
    Class cls = null;
    //被代理的实例
    Object obj = null;
    //我要代理谁
    public GamePlayIH(Object _obj){
        this.obj = _obj;
    }

    /**
     *
     * @param proxy 要代理的类对象
     * @param method 方法对象
     * @param args 方法的参数列表
     * @return 返回调用的方法对象
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(this.obj , args);
        System.out.println(method);
        System.out.println(args);
        if (method.getName().equalsIgnoreCase("login")){
            System.out.println("有人在用我的号登录");
        }
        return result;
    }
}
