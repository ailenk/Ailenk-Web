package ink.bignose.catmall.order.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/23  10:22
 * DESCRIPTION:
 **/
@Controller
public class HelloController {

    @GetMapping("/{page}.html")
    public String page(@PathVariable("page") String page) {
        System.out.println(page);
        return page;
    }

}
