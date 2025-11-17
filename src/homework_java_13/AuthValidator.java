package homework_java_13;

import java.util.regex.Pattern;

public class AuthValidator {

    public static boolean validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{

        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Логин не соответствует требованиям: длина >= 20 символов или содержит пробелы.");
        }

        if (password.length() >= 20 || password.contains(" ")) {
            throw new WrongPasswordException("Пароль не соответствует требованиям: длина >= 20 символов или содержит пробелы.");
        }

        if (!Pattern.compile(".*[0-9].*").matcher(password).matches()) {
            throw new WrongPasswordException("Пароль не соответствует требованиям: должен содержать хотя бы одну цифру.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль и подтверждение пароля не совпадают.");
        }

        return  true;

    }
}
