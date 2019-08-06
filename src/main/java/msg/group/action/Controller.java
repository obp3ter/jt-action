package msg.group.action;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Document me.
 *
 * @author msg systems AG; User Name.
 * @since 19.1.2
 */
@RestController
public class Controller {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format(template, name);
    }

    @PostMapping("/action")
    private String action(@RequestBody Request request
    ) throws URISyntaxException {
        List<Image> images = request.getUris();
        String action = request.getAction();
        String uris = "{";
        for (Image image : images) {
            uris += "\"";
            uris += image.getPath();
            uris += "\"";
            uris += ",";
        }
        uris = uris.substring(0, uris.length() - 1);
        uris += "}";


        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject(
                "http://localhost:8080/" + action,
                uris,
                String.class);
        return "OK";
    }
}
