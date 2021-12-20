import com.sun.jdi.request.InvalidRequestStateException;

public abstract class Password {

    public static String expressaoRegex;
    public String senha;

    public Password(String expressaoRegex){
        this.expressaoRegex = expressaoRegex;
    }

    public void setValue(String pwd){

        boolean valida = valida(pwd, this.expressaoRegex);

        if(valida){
            this.senha = pwd;
        }
        else {
            throw new InvalidRequestStateException("Senha não atende aos requisitos.");
        }

    }

    public boolean valida(String pwd, String expressaoRegex){
        return pwd.matches(expressaoRegex);
    }

}
