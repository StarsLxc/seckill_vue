package com.ruoyi.seckill.service;

import com.ruoyi.seckill.domain.SeckillSaleItem;
import java.util.List;

/**
 * 订单明细表(SeckillSaleItem)表服务接口
 *
 * @author CJW
 * @since 2024-09-15 20:37:40
 */
public interface ISeckillSaleItemService {

    /**
     * 通过ID查询单条数据
     *
     * @param saleItemId 主键
     * @return 实例对象
     */
    SeckillSaleItem selectById(Long saleItemId);

    /**
     * 查询指定行数据
     *
     * @param seckillSaleItem 筛选条件
     * @return 查询结果
     */
    List<SeckillSaleItem> selectList(SeckillSaleItem seckillSaleItem);

    /**
     * 新增数据
     *
     * @param seckillSaleItem 实例对象
     * @return 实例对象
     */
    SeckillSaleItem insert(SeckillSaleItem seckillSaleItem);

    /**
     * 修改数据
     *
     * @param seckillSaleItem 实例对象
     * @return 实例对象
     */
    SeckillSaleItem update(SeckillSaleItem seckillSaleItem);

    /**
     * 通过主键删除数据
     *
     * @param saleItemId 主键
     * @return 是否成功
     */
    boolean deleteById(Long saleItemId);

}
