package oop.Inheritance.userAccount;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.name = "Кайрат";
        user.login();
        AdminUser admin = new AdminUser();
        admin.name = "Элмирбек";
        admin.login(); // Наследованный метод
        admin.accessAdminPanel();  // Собственный метод
    }
}
