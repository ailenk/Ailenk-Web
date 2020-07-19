package ink.bignose.catmall.ware.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import ink.bignose.catmall.ware.exception.NoStockException;
import ink.bignose.catmall.ware.vo.SkuHasStockVO;
import ink.bignose.catmall.ware.vo.WareSkuLockVO;
import ink.bignose.common.exception.BizCodeEnum;
import ink.bignose.catmall.ware.entity.WareSkuEntity;
import ink.bignose.catmall.ware.service.WareSkuService;
import org.springframework.web.bind.annotation.*;

import ink.bignose.common.utils.PageUtils;
import ink.bignose.common.utils.R;

import javax.annotation.Resource;


/**
 * 商品库存
 *
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-30 09:51:46
 */
@RestController
@RequestMapping("ware/waresku")
public class WareSkuController {

    @Resource
    private WareSkuService wareSkuService;

    @PostMapping("/lock/order")
    public R lockOrder(@RequestBody WareSkuLockVO vo) {
        try {
            Boolean stock = wareSkuService.orderLockStock(vo);
            return R.ok();
        } catch (NoStockException e) {
            return R.error(BizCodeEnum.NO_STOCK_EXCEPTION.getCode(), BizCodeEnum.NO_STOCK_EXCEPTION.getMsg());
        }
    }

    @PostMapping("/hasstock")
    public R getSkusHasStock(@RequestBody List<Long> skuIds) {
        List<SkuHasStockVO> vos = wareSkuService.getSkuHasStock(skuIds);
        return R.ok().setData(vos);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("ware:waresku:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wareSkuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("ware:waresku:info")
    public R info(@PathVariable("id") Long id){
		WareSkuEntity wareSku = wareSkuService.getById(id);

        return R.ok().put("wareSku", wareSku);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("ware:waresku:save")
    public R save(@RequestBody WareSkuEntity wareSku){
		wareSkuService.save(wareSku);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("ware:waresku:update")
    public R update(@RequestBody WareSkuEntity wareSku){
		wareSkuService.updateById(wareSku);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("ware:waresku:delete")
    public R delete(@RequestBody Long[] ids){
		wareSkuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
