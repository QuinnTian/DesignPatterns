//代练者，实现接口
public class GamePlayerProxy implements IGamePlayer{
    private IGamePlayer gamePlayer = null;
    //通过构造方法来传递要对哪位进行代练
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
