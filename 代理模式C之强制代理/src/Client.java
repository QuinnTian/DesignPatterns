public class Client {

//************若直接使用真实类访问**********************************
//    public static void main(String[] args){
//        //定义一个代练者
//        IGamePlayer gamePlayerProxy = new GamePlayer("张三");
//        //下面使用代练者进行打游戏
//        //开始打游戏
//        System.out.println("开始时间：2019");
//        gamePlayerProxy.login("zhangsan","password");
//        //开始杀怪
//        gamePlayerProxy.killBoss();
//        //升级
//        gamePlayerProxy.upgrade();
//        //记录结束游戏时间
//        System.out.println("结束时间：2020");
//    }
//    public static void main(String[] args){
//        //定义一个代练者
//        IGamePlayer gamePlayer = new GamePlayer("张三");
//        IGamePlayer proxy = new GamePlayerProxy(gamePlayer);
//        //下面使用代练者进行打游戏
//        //开始打游戏
//        System.out.println("开始时间：2019");
//        proxy.login("zhangsan","password");
//        //开始杀怪
//        proxy.killBoss();
//        //升级
//        proxy.upgrade();
//        //记录结束游戏时间
//        System.out.println("结束时间：2020");
//    }
public static void main(String[] args){
    //定义一个代练者
    IGamePlayer gamePlayer = new GamePlayer("张三");
    IGamePlayer proxy = gamePlayer.getProxy();
    //下面使用代练者进行打游戏
    //开始打游戏
    System.out.println("开始时间：2019");
    proxy.login("zhangsan","password");
    //开始杀怪
    proxy.killBoss();
    //升级
    proxy.upgrade();
    //记录结束游戏时间
    System.out.println("结束时间：2020");
}
}
