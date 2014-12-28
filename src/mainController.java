import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;


/**
 * Created by marekbejda on 11/7/14.
 */

@RestController
public class mainController {

    Logger log = Logger.getLogger("mainController");


    public mainController(){
        log.warning("mainController constructed");
    }

    @RequestMapping(value="/hello")
    public @ResponseBody String startMe() {
        log.warning("ProjectsController:startMe");
        return "Hello World";
    }
}