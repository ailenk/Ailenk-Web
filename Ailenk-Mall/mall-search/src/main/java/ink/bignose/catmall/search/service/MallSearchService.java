package ink.bignose.catmall.search.service;

import ink.bignose.catmall.search.vo.SearchParam;
import ink.bignose.catmall.search.vo.SearchResult;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/16  09:43
 * DESCRIPTION:
 **/
public interface MallSearchService {

    /**
     * 检索服务
     * @param searchParam 所有检索参数
     * @return 检索结果
     */
    SearchResult search(SearchParam searchParam);

}
