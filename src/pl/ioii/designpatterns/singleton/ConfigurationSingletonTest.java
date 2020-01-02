package pl.ioii.designpatterns.singleton;

public class ConfigurationSingletonTest {

    private static final String AUTH_BASE_URL = "http://localhost:8080/auth";
    private static final String USERS_BASE_URL = "http://localhost:8081/";

    public static void test() {

        ConfigurationSingleton singletonFirst = ConfigurationSingleton.getInstance(AUTH_BASE_URL, USERS_BASE_URL);
        System.out.println(singletonFirst.getAuthenticationServiceUrl());
        System.out.println(singletonFirst.getUsersServiceUrl());

        ConfigurationSingleton singletonSecond = ConfigurationSingleton.getInstance("another auth link", "another users link");
        System.out.println(singletonSecond.getAuthenticationServiceUrl());
        System.out.println(singletonSecond.getUsersServiceUrl());
    }
}
