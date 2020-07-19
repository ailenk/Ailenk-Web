package ink.bignose.catmall.search.service;

import ink.bignose.common.to.es.ESSkuModel;

import java.io.IOException;
import java.util.List;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/13  22:43
 * DESCRIPTION:
 **/
public interface ProductSaveService {
    boolean productStatusUp(List<ESSkuModel> esSkuModels) throws IOException;
}
