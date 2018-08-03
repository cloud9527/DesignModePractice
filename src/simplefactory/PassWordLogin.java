package simplefactory;

class PassWordLogin implements Login {
    @Override
    public boolean login(String name, String password) {
        return false;
    }
}
