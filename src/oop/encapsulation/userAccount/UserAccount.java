package oop.encapsulation.userAccount;

public class UserAccount {

    // привтаные поля - инкапсуляций
    private  String userName;
    private String email;
    private  String password;
    private String phoneNumber;

    // конструктор
    public UserAccount(String userName, String email, String password, String phoneNumber) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    // getter - для получение значение привтаного поля

    public String getName() {
        System.out.println("Имя пользоветеля : " + userName);
        return  userName;

    }

    public String getEmail() {
        System.out.println("E-mail : " + email);
        return  email;
    }

    public String getPassword(){
        return  password;
    }

    public int getPhoneNumber() {
        System.out.println("Номер телефон : " + phoneNumber);
        return phoneNumber.length();
    }

    // setter - для установки значение

    // метод (установка новый имя)
    // добавить валидацию,
    // чтобы имя было допустимым
    // не пустое, не слишком короткое
    public void setUserName(String newUserName) {
        if (newUserName != null && !newUserName.isEmpty()) {
            this.userName = newUserName;
            System.out.println("Имя успешно изменено на " + newUserName );
        } else {
            System.out.println("Ошибка : Имя пользоветеля не должно быть пустым !!! ");
        }
    }

    public void setUserEmail(String newUserEmail) {
        if (newUserEmail != null && !newUserEmail.isEmpty()) {
            this.email = newUserEmail;
            System.out.println("Email успешно изменено на " + newUserEmail );
        } else {
            System.out.println("Ошибка : Email пользоветеля не должно быть пустым !!! ");
        }
    }

    public void setPassword(String newPassword) {
        if (newPassword != null && !newPassword.isEmpty()) {
            this.password = newPassword;
            System.out.println("Пароль успешно изменено ");
        } else {
            System.out.println("Пароль не должно быть пустым !!! ");
        }
    }

    public void setPhoneNumber(String newPhoneNumber) {
        if (newPhoneNumber != null && newPhoneNumber.matches("\\d{10}")) { // \\d{9} — регулярное выражение, которое означает: строка из ровно 10 цифр.
            this.phoneNumber = newPhoneNumber;
            System.out.println("Номер телефона успешно установлен.");
        } else {
            System.out.println("Ошибка: номер должен состоять из 10 цифр.");
        }
    }






    // метод для получения информаций

    public void displayUserAccount () {
        System.out.println("\n--- Информация о пользавателе ---");
        System.out.println("Имя пользавтеля : " + userName);
        System.out.println("E-mail : " + email);
        System.out.println("Телефон номер : " + phoneNumber);
    }





}
