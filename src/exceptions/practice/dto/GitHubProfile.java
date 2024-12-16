package exceptions.practice.dto;

public record GitHubProfile(String login, String name, String company, String location, int public_repos) {
}
