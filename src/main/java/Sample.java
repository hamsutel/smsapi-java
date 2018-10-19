import com.hamsutel.Message;
import com.hamsutel.MessageApi;
import sun.util.resources.cldr.agq.CurrencyNames_agq;

import java.io.IOException;

public class Sample {

    public static void main(String args[]) throws IOException {
        MessageApi messageApi = new MessageApi("******","******");
        Message message = new Message();
        message.setSenderId("Hamsutel");
        message.setTo("0244111111");
        message.setToken("r6mi9okuqsgg00s80gww9704b54a5f");
        message.setContent("Welcome Home");
        messageApi.send(message);

    }
}
