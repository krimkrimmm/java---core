package extend_lesson.exception.libraries.utils;

public class Validator {
    public static boolean validateEmail(String email) {
        return email.contains("@");
    }

    public static boolean validatePassword(String password) {
        return password.length() >= 6; // Example validation
    }
}
