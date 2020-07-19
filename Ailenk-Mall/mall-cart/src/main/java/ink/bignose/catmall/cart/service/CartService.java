package ink.bignose.catmall.cart.service;

import ink.bignose.catmall.cart.vo.Cart;
import ink.bignose.catmall.cart.vo.CartItem;

import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/20  11:58
 * DESCRIPTION:
 **/
public interface CartService {
    CartItem addToCart(Long skuId, Integer num) throws ExecutionException, InterruptedException;

    CartItem getCartItem(Long skuId);

    Cart getCart() throws ExecutionException, InterruptedException;

    void clearCart(String cartKey);

    /**
     * 勾选购物车里的购物项
     * @param skuId
     * @param checked
     */
    void checkItem(Long skuId, Integer checked);

    /**
     * 统计购物车中商品项的数量
     * @param skuId
     * @param num
     */
    void countItem(Long skuId, Integer num);

    void deleteItem(Long skuId);

    List<CartItem> getUserCartItems();
}
