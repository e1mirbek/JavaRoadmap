package tasks.registration;

// Цель задачи:
// работать с коллекциями (Map, List),
//                        методами,
//                        вводом с консоли,
//                        проверками,
//                        валидацией данных.


// 📝 Условие задачи:
// консольное приложение, где:
// Пользователь может:
// Зарегистрироваться (вводит имя и email)
// Посмотреть всех зарегистрированных
// Выйти из программы
// Нужно проверять:
// Уникальность email (нельзя зарегистрировать один и тот же email дважды)
// Корректность email (должен содержать @)


// | **Интерфейс программы**            | **Ввод пользователя** | **Вывод программы**                |
//| ---------------------------------- | --------------------- | ---------------------------------- |
//| `=== User Registration System ===` |                       |                                    |
//| `1. Register User`                 |                       |                                    |
//| `2. Show All Users`                |                       |                                    |
//| `3. Exit`                          |                       |                                    |
//| `Choose option:`                   | `1`                   |                                    |
//| `Enter name:`                      | `John`                |                                    |
//| `Enter email:`                     | `john@gmail.com`      | `>> User registered successfully!` |
//| `Choose option:`                   | `1`                   |                                    |
//| `Enter name:`                      | `Mike`                |                                    |
//| `Enter email:`                     | `john@gmail.com`      | `>> Email already exists!`         |

// 🧱 Структура проекта (Clean Architecture)

// UserRegistrationApp/
//│
//├── domain/
//│   ├── User.java                  → модель (Entity)
//│   └── UserRepository.java       → интерфейс хранилища
//│
//├── usecase/
//│   ├── RegisterUserUseCase.java  → бизнес-логика регистрации
//│   └── ShowUsersUseCase.java     → бизнес-логика отображения
//│
//├── infrastructure/
//│   └── InMemoryUserRepository.java → реализация репозитория (Map)
//│
//├── controller/
//│   └── ConsoleApp.java           → управление консольным интерфейсом
//│
//└── Main.java                     → точка входа

public class UserRegistrationSystem {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}
