package ink.bignose.catmall.product.web;

import ink.bignose.catmall.product.entity.CategoryEntity;
import ink.bignose.catmall.product.service.CategoryService;
import ink.bignose.catmall.product.vo.Catelog2VO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/14  20:47
 * DESCRIPTION:
 **/
@Controller
public class IndexController {

    @Resource
    private CategoryService categoryService;

    @GetMapping({"/", "/index.html"})
    public String indexPage(Model model) {
        // TODO 1 查出所有的1级分类
        List<CategoryEntity> categoryEntities = categoryService.getLevel1Categories();
        // 视图解析器进行拼串
        // classpath:/templates/ + result + .html
        model.addAttribute("categories", categoryEntities);
        return "index";
    }

    @ResponseBody
    @GetMapping("/index/catalog.json")
    public Map<String, List<Catelog2VO>> getCatalogJson() throws InterruptedException {
        return categoryService.getCatalogJson();
    }
}
