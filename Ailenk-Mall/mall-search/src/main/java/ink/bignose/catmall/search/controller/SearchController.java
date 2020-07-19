package ink.bignose.catmall.search.controller;

import ink.bignose.catmall.search.service.MallSearchService;
import ink.bignose.catmall.search.vo.SearchParam;
import ink.bignose.catmall.search.vo.SearchResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/16  09:00
 * DESCRIPTION:
 **/
@Controller
public class SearchController {

    @Resource
    private MallSearchService mallSearchService;

    @GetMapping("/list.html")
    public String listPage(SearchParam searchParam, Model model) {
        SearchResult result = mallSearchService.search(searchParam);
        model.addAttribute("result", result);
        return "list";
    }

}
