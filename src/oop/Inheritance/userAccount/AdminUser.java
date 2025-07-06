package oop.Inheritance.userAccount;

public class AdminUser extends User {

    void accessAdminPanel () {
        System.out.printf(name + " Зашел в админ-панель");
    }

}
