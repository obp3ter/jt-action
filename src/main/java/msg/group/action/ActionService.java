package msg.group.action;


import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ActionService {

    @PostMapping("/action")
    private String action(@RequestBody Request request
    )
    {
        List<Image> uris=request.getUris();
        String action = request.getAction();
        uris.forEach(s-> System.out.println(s.getPath()));
        System.out.println(action);
        return "OK";
    }
    @GetMapping("/action")
    private Request getr()
    {
        ArrayList<Image> list = new ArrayList<>();
        list.add(new Image("a","aa"));
        list.add(new Image("a","aa"));
        Request r = new Request();
        r.setUris(list);
        r.setAction("create");
        return r;
    }

    private void create(){}
    private void delete(){}

}
