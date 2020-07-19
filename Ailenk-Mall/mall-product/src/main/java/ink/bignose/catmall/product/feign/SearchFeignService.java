package ink.bignose.catmall.product.feign;

import ink.bignose.common.to.es.ESSkuModel;
import ink.bignose.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/13  23:06
 * DESCRIPTION:
 **/
@FeignClient("mall-search")
public interface SearchFeignService {

    @PostMapping("/search/save/product")
    R productStatusUp(@RequestBody List<ESSkuModel> esSkuModels);
}
