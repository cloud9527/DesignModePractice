package simplefactory;

interface Login {
    int PHONE_TYPE = 1111;
    int PASSWORD_TYPE = 2222;

    boolean login(String name ,String password);
}
