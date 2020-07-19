package ink.bignose.catmall.product.web;

import ink.bignose.catmall.product.service.SkuInfoService;
import ink.bignose.catmall.product.vo.SkuItemVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;
import java.util.concurrent.ExecutionException;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/16  22:38
 * DESCRIPTION:
 **/
@Controller
public class ItemController {

    @Resource
    private SkuInfoService skuInfoService;

    @GetMapping("/{skuId}.html")
    public String item(@PathVariable("skuId") Long skuId, Model model) throws ExecutionException, InterruptedException {
        SkuItemVO skuItemVO = skuInfoService.item(skuId);
        model.addAttribute("item", skuItemVO);
        return "item";
    }

}
