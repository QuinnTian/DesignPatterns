import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    //***************默认不使用代理模式的代码********************************************
    //场景类
//    public static void main(String[] args){
//        //定义一个玩家
//        IGamePlayer player = new GamePlayer("张三");
//        //开始打游戏
//        System.out.println("开始时间：2019");
//        player.login("zhangsan","password");
//        //开始杀怪
//        player.killBoss();
//        //升级
//        player.upgrade();
//        //记录结束游戏时间
//        System.out.println("结束时间：2020");
//    }
    //**************使用代理模式的代码*****************************************
    public static void main(String[] args){
        //定义一个玩家
        IGamePlayer player = new GamePlayer("张三");
        //定义一个handler
        InvocationHandler handler = new GamePlayIH(player);

        System.out.println("开始时间：2019");
        //获得类的Class loader
        ClassLoader c1 = player.getClass().getClassLoader();
        //动态产生一个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(
                c1,new Class[]{IGamePlayer.class},handler
        );
        //登录
        proxy.login("zhangsan","password");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间：2020");
    }
}
