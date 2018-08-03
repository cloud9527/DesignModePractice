package simplefactory;

class LoginManager {

    public static Login factory(int type) {
        if (type == Login.PASSWORD_TYPE) {
            return new PassWordLogin();
        } else if (type == Login.PHONE_TYPE) {
            return new PhoneLogin();
        } else {
            throw new RuntimeException("do not found login type");
        }
    }
}
