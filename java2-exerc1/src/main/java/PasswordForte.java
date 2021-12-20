public class PasswordForte extends Password{

    public static String expressaoRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\\\S+$).{6,8}$";

    public PasswordForte() {
        super(expressaoRegex);
    }

}
