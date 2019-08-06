package msg.group.action;


import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@RestController("/action")
public class ActionService {

    @PostMapping
    private void action(@NotNull @RequestParam List<Image> uris,
                        @NotNull @RequestParam String action
    )
    {

        uris.forEach(s-> System.out.println(s.getPath()));

    }
    @GetMapping
    private List<Image> getimg()
    {
        ArrayList<Image> list = new ArrayList<>();
        list.add(new Image("a","aa"));
        list.add(new Image("a","aa"));
        return list;
    }

    private void create(){}
    private void delete(){}

}
