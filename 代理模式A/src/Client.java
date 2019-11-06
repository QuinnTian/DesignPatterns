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
        //定义一个代练者,用构造方法来传递要代练的人
        GamePlayerProxy gamePlayerProxy =new GamePlayerProxy(player);
        //下面使用代练者进行打游戏
        //开始打游戏
        System.out.println("开始时间：2019");
        gamePlayerProxy.login("zhangsan","password");
        //开始杀怪
        gamePlayerProxy.killBoss();
        //升级
        gamePlayerProxy.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间：2020");
    }
}
