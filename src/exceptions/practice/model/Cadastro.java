package exceptions.practice.model;

import exceptions.practice.exceptions.ExceptionLoginInvalido;

public class Cadastro {
    private String usuario;
    private String senha;

    public Cadastro(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public void login(String usuarioLogin, String senhaLogin){
        if (!this.usuario.equalsIgnoreCase(usuarioLogin) || !this.senha.equalsIgnoreCase(senhaLogin)){
            throw new ExceptionLoginInvalido("Usuario ou senha invalidos");
        }
    }
}
