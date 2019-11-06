//代练者，实现接口
public class GamePlayerProxy implements IGamePlayer{
    private IGamePlayer gamePlayer = null;
    //代理的代理暂时没有，所以获取的是自己
    @Override
    public IGamePlayer getProxy() {
        return this;
    }
    //构造函数传递真实用户
    public GamePlayerProxy(IGamePlayer _gamePlayer){
        this.gamePlayer = _gamePlayer;
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
    }


    //代练者

}
