package chainofresponsibility.middlewares;

public class CheckPermissionMiddleware extends Middleware {


    @Override
    public boolean check(String email, String password) {
        if (email.equals("stefany@gmail.com.br")) {
            System.out.println("Bem-Vindo Administrador(a)!");
            return true;
        }
        System.out.println("Bem-Vindo!");
        return checkNext(email, password);
    }
}
