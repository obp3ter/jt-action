package msg.group.action;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;


@RestController("/action")
public class ActionService {

    @PostMapping
    private void action(@NotNull @RequestBody List<String> uris,
                        @NotNull @RequestBody String action)
    {

    }

    private void create(){}
    private void delete(){}

}
