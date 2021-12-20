public class PasswordMedio extends Password {

    public static String expressaoRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{6,8}$";

    public PasswordMedio() {
        super(expressaoRegex);
    }

}
