package cheetSheet;


import java.util.function.BiFunction;

public class FI_6_Partial {

    public static void main(String[] args) {
        //sysout buildRequest with Content-Type: application/json
        System.out.println(buildRequest("myUrl.com/people", "Content-Type: application/json",
                "GET", null));

        //BiFunction accessPeople
        BiFunction<String, String, String> accessPeople =
                createEndpoint.apply("myUrl.com/people", "Content-Type: application/json");

        //sysout accessPeople get
        System.out.println(accessPeople.apply("GET", null));

        //sysout accessPeople post
        System.out.println(accessPeople.apply("POST", "{name: 'tom'}"));
    }

    //method for building fake http request
    static String buildRequest(String url, String headers, String httpMethod, String payload) {
        return url + "\n" + headers + "\n" + httpMethod + "\n" + payload + "\n";
    }

    //BiFunction createEndpoint
    static BiFunction<String, String, BiFunction<String, String, String>> createEndpoint =
            (s1, s2) -> (s3, s4) -> s1 + "\n" + s2 + "\n" + s3 + "\n" + s4 + "\n";
}
