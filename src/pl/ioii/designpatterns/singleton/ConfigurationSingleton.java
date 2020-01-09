package pl.ioii.designpatterns.singleton;

public class ConfigurationSingleton {

    private static ConfigurationSingleton instance = null;

    private String authenticationServiceUrl;
    private String usersServiceUrl;

    private ConfigurationSingleton(String authUrl, String usersUrl) {
        this.authenticationServiceUrl = authUrl;
        this.usersServiceUrl = usersUrl;
    }

    // LAZY LOADING OF APPLICATION PROPERTIES FROM CONFIGURATION FILE
    public static ConfigurationSingleton getInstance(String authUrl, String usersUrl) {
        if (instance == null) {
            instance = new ConfigurationSingleton(authUrl, usersUrl);
        }
        return instance;
    }

    public static ConfigurationSingleton getInstance() {
        if (instance == null) {
            throw new RuntimeException(
                    "At first you need to initialize this class with parametrized method getInstance(String, String)");
        }
        return instance;
    }

    public String getAuthenticationServiceUrl() {
        return authenticationServiceUrl;
    }

    public String getUsersServiceUrl() {
        return usersServiceUrl;
    }
}

