public class Client {


    public static void main(String[] args){
        //定义一个代练者
        IGamePlayer gamePlayerProxy = new GamePlayerProxy("张三");
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
