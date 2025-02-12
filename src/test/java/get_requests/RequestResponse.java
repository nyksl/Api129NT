package get_requests;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RequestResponse {
    /*
1) Postman manuel test için kullanılır
2) Otomasyon için Rest-Assured library kullanıyoruz
3) Otomasyonu yazabilmek için şu adımların izlenmesi gerekir:
    a) Gereksinimleri anlama
    b) Test case yazma:
        -Test yazmak için Gherkin Language kullanılır
        x) Given: Ön koşullar --> Url, Body ...
        y) When: Yapılacak işlemler --> Get, Put, Post ... requests...
        z) Then: Dönütler, çıktılar --> Assertion, close...
        t) And: Art arda yapılan aynı çoklu işlmeleri bağlamak için kullanılır
         c) Otomasyon kodlarını yazma:
            i) Set the url --> endpoint'i kur
            ii) Set the expected data --> beklenen veriyi kur
            iii) Send the request and get the response --> request'i gönder ve response'ı al
            iv) Do assertion --> Doğrulama yap

 */


    public static void main(String[] args) {

        String url = "https://petstore.swagger.io/v2/pet/4247865210";
        Response response = given().get(url);//import static io.restassured.RestAssured.given;
        //response.prettyPrint(); //prettyPrint() methodu ile response'ı konsola yazdırdık.

        //Status code nasıl yazdırılır:
        System.out.println("Status code: "+ response.statusCode());//Status code: 200

        //Content Type nasıl yazdırılır:
        System.out.println("Content type: "+response.contentType());//Content type: application/json

        //Status Line nasıl yazdırılır:
        System.out.println("Status line: "+response.statusLine());//Status line: HTTP/1.1 200 OK

        //Header nasıl yazdırılır:
        System.out.println(response.header("Date"));//Wed, 31 May 2023 09:06:20 GMT
        System.out.println(response.header("Connection"));//keep-alive  ->baglantya verilen isimi verir
        System.out.println(response.header("Server"));//Jetty(9.2.9.v20150224) data'nın geirildiği server ismi
        System.out.println(response.header("Transfer-Encoding"));//chunked

        //Headers nasıl yazdırılır:
        System.out.println("----Headers-----");
        System.out.println(response.headers());//headers() yazdırırsak tüm headers'leri verir

        //Time nasıl yazdırılır
        System.out.println("\nTime: " + response.time());//Time: 1433


    }


}
