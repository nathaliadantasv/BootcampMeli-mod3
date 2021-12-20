public class PasswordFraco extends Password{

    public static String expressaoRegex = "^(?=.*[0-9])(?=\\S+$).{6,8}$";

    public PasswordFraco() {
        super(expressaoRegex);
    }

}
