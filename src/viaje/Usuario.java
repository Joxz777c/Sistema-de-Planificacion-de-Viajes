package viaje;

public class Usuario {
    private String username;
    private String password;

    public void registrar(String user, String pass) {
        this.username = user;
        this.password = pass;
    }

    public boolean verificar(String user, String pass) {
        return this.username != null && this.username.equals(user) && this.password.equals(pass);
    }

    public boolean estaRegistrado() {
        return this.username != null;
    }
}
