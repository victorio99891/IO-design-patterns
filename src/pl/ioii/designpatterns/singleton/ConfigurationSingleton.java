package pl.ioii.designpatterns.singleton;

public class ConfigurationSingleton {

    private static ConfigurationSingleton instance = null;

    private String authenticationServiceUrl;
    private String usersServiceUrl;

    // LAZY LOADING OF APPLICATION PROPERTIES FROM CONFIGURATION FILE
    public static ConfigurationSingleton getInstance(String authUrl, String usersUrl) {
        if (instance == null) {
            return new ConfigurationSingleton(authUrl, usersUrl);
        }
        return instance;
    }

    private ConfigurationSingleton(String authUrl, String usersUrl) {
        this.authenticationServiceUrl = authUrl;
        this.usersServiceUrl = usersUrl;
    }

    public String getAuthenticationServiceUrl() {
        return authenticationServiceUrl;
    }

    public String getUsersServiceUrl() {
        return usersServiceUrl;
    }
}
