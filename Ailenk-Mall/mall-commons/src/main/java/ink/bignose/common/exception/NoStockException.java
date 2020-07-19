package ink.bignose.common.exception;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/24  20:46
 * DESCRIPTION:
 **/
public class NoStockException extends RuntimeException {

    private Long skuId;

    public NoStockException(Long skuId) {
        super("商品 ID:" + skuId + "没有足够的库存.");
    }

    public NoStockException(String msg) {
        super(msg);
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }
}
