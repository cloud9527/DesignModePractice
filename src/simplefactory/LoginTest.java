package simplefactory;

class LoginTest {

    public static void main(String[] args) {
        String name = "name";
        String password = "pass";
        Login factory = LoginManager.factory(Login.PHONE_TYPE);
        //登录成功
        if (factory.login(name, password)){

        }else{
            //登录失败
        }


    }
}
