package pl.ioii.designpatterns.singleton;

public class ConfigurationSingletonTest {

    private static final String AUTH_BASE_URL = "http://localhost:8080/auth";
    private static final String USERS_BASE_URL = "http://localhost:8081/";

    public static void test() {

        System.out.println(
                String.format("Attempt to obtain the singleton for the first time with args: '%s' and '%s':",
                        AUTH_BASE_URL,
                        USERS_BASE_URL));
        ConfigurationSingleton singletonFirst = ConfigurationSingleton.getInstance(AUTH_BASE_URL, USERS_BASE_URL);
        System.out.println(singletonFirst.getAuthenticationServiceUrl());
        System.out.println(singletonFirst.getUsersServiceUrl());

        String another_auth_link = "another auth link";
        String another_users_link = "another users link";
        System.out.println(
                String.format("Attempt to obtain the singleton for the second time with args: '%s' and '%s':",
                        another_auth_link,
                        another_users_link));
        ConfigurationSingleton singletonSecond = ConfigurationSingleton.getInstance(another_auth_link, another_users_link);
        System.out.println(singletonSecond.getAuthenticationServiceUrl());
        System.out.println(singletonSecond.getUsersServiceUrl());
    }
}
