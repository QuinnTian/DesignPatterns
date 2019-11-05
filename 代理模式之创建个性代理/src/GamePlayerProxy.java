//代练者，实现接口
public class GamePlayerProxy implements IGamePlayer,IProxy{
    private IGamePlayer gamePlayer = null;
    //通过构造方法来传递要对哪位进行代练
    public GamePlayerProxy(String name){
        try {
            //通过代理对象来创建真实对象
            gamePlayer = new GamePlayer(this,name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void login(String user, String password) {
       this.gamePlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
        this.count();
    }
    //实现计算费用方法
    @Override
    public void count() {
        System.out.println("升级总费用：150");
    }
    //代练者

}
