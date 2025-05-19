package oop.encapsulation.userAccount;

import java.util.Scanner;

public class UserAccountImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в наш приложения !!! ");
        System.out.println("Напишите имя пользовтеля : ");
        String userName = scanner.nextLine();
        System.out.println("Напишите email : ");
        String email = scanner.nextLine();
        System.out.println("Напишите пароль : ");
        String password = scanner.nextLine();
        System.out.println("Напишите номер телефона : ");
        String phoneNumber = scanner.nextLine();

        UserAccount userAccount = new UserAccount(userName, email, password, phoneNumber);

        // меню операций

        boolean running = false;

        while (!running) {
            System.out.println("\n Выберите операцию ");
            System.out.println("1 - Показать инфоромацию пользовтеля");
            System.out.println("2 - Изменить имя пользовтеля");
            System.out.println("3 - Изменить email аккаунт");
            System.out.println("4 - Изменить пароль");
            System.out.println("5 - Изменить номер телефона ");
            System.out.println("0 - Выход");
            System.out.println("Ваш выбор : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 :
                    // показать информацию user
                    userAccount.displayUserAccount();
                    break;
                case 2:
                    // изменить имя
                    System.out.println("Изменить имя пользоветиеля : ");
                    String newName = scanner.nextLine();
                    userAccount.setUserName(newName);
                    userAccount.getName();
                    break;
                case 3:
                    // изменить email
                    System.out.println("Изменить email : ");
                    String newEmail = scanner.nextLine();
                    userAccount.setUserEmail(newEmail);
                    userAccount.getEmail();
                    break;
                case 4:
                    // именить password
                    System.out.println("Изменить пароль : ");
                    String newPassword = scanner.nextLine();
                    userAccount.setPassword(newPassword);
                    break;
                case 5:
                    // изменить номер телефона
                    System.out.println("Напишите чтобы изменить номер телефона : " );
                    String newPhoneNumber = scanner.nextLine();
                    userAccount.setPhoneNumber(newPhoneNumber);
                    userAccount.getPhoneNumber();
                    break;
                case 0:
                    running = true;
                    System.out.println("Спасибо что выбрали нас !!! ");
                    break;
                default:
                    System.out.println("Неверный выбор поробуйте еще раз !!! ");
            }
        }
        scanner.close();
    }
}
