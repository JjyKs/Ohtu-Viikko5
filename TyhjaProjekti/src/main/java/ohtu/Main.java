package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.io.IOUtils;

public class Main {

    public static void main(String[] args) throws IOException {
        String studentNr = "014396276";
        if ( args.length>0) {
            studentNr = args[0];
        }

        String url = "http://ohtustats-2015.herokuapp.com/students/"+studentNr+"/submissions";

        HttpClient client = new HttpClient();
        GetMethod method = new GetMethod(url);
        client.executeMethod(method);

        InputStream stream =  method.getResponseBodyAsStream();

        String bodyText = IOUtils.toString(stream);

        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);

        System.out.println("opiskelijanumero " + studentNr);
        System.out.println("");
        
        for (Submission submission : subs) {
            System.out.println(submission);
        }
        
        int tehtyja = 0;
        int aika = 0;
        for (Submission submission : subs) {
            tehtyja += submission.tehtyjä();
            aika += submission.aika();
        }
        System.out.println("");
        System.out.println("Yhteensä: " + tehtyja+ " tehtävää " + aika + " tuntia");
    }
}