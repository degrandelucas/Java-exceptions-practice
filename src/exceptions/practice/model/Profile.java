package exceptions.practice.model;

import exceptions.practice.dto.GitHubProfile;

public class Profile {
    private String login;
    private String nome;
    private String empresa;
    private String localizacao;
    private int repositoriosPublicos;

    public Profile(GitHubProfile profile) {
        this.login = profile.login();
        this.nome = profile.name();
        this.empresa = profile.company();
        this.localizacao = profile.company();
        this.repositoriosPublicos = profile.public_repos();
    }

    @Override
    public String toString() {
        return "Perfil do GitHub:\n" +
                "Login: " + login + "\n" +
                "Nome: " + (nome != null ? nome : "N/A") + "\n" +
                "Empresa: " + (empresa != null ? empresa : "N/A") + "\n" +
                "Localização: " + (localizacao != null ? localizacao : "N/A") + "\n" +
                "Repositórios Públicos: " + repositoriosPublicos;
    }

}
