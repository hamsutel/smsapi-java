import com.hamsutel.Message;
import com.hamsutel.MessageApi;
import sun.util.resources.cldr.agq.CurrencyNames_agq;

import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        System.out.println("Hello World");
        MessageApi messageApi = new MessageApi("cris@cris.com","cris@cris.com");
        Message message = new Message();
        message.setSenderId("soso");
        message.setTo("0542024401");
        message.setToken("r6mi9okuqsgg00s80gww9704b54a5f");
        message.setContent("Welcome Home");
        messageApi.send(message);

    }
}
