public interface IGamePlayer {
    //登录游戏
    public void login(String user, String password);
    //杀怪物
    public void killBoss();
    //升级
    public void upgrade();
    //增加一个获取代理对象的方法
    public IGamePlayer getProxy();
}
