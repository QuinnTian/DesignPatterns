public class GamePlayer implements IGamePlayer {
    //我的名字
    private String name = "";
    public GamePlayer(String _name){
        this.name = _name;

    }
    //我的代理对象是谁，声明一个代理对象
    private IGamePlayer proxy = null;
    //获取自己的代理对象
    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }
    //检验是否为代理访问
    private boolean isProxy(){
        if (this.proxy==null){
            return false;
        }else {
            return true;
        }
    }
    @Override
    public void login(String user, String password) {
        if (this.isProxy()) {
            System.out.println("登录名为：" + user + "的用户，" + this.name + "登录成功");
        }else {
            System.out.println("请用指定的代理访问");
        }
    }

    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name + ":在打怪");
        }else {
            System.out.println("请用指定的代理访问");

        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name + ":又升了一级");
        }else {
            System.out.println("请用指定的代理访问");

        }
    }


}
