package exceptions.practice.connection;

import com.google.gson.Gson;
import exceptions.practice.dto.GitHubProfile;

public class GitHubGsonDataConversation {
    private Gson gson;

    public GitHubGsonDataConversation() {
        this.gson = new Gson();
    }

    public GitHubProfile AnalyseProfile(String jsonGitHub) {
        return gson.fromJson(jsonGitHub, GitHubProfile.class);// Converte o JSON para o record GitHubProfile
    }
}