package com.ruoyi.seckill.service;

import com.ruoyi.seckill.domain.SeckillSale;
import java.util.List;

/**
 * 订单表(SeckillSale)表服务接口
 *
 * @author CJW
 * @since 2024-09-15 20:36:48
 */
public interface ISeckillSaleService {

    /**
     * 通过ID查询单条数据
     *
     * @param saleId 主键
     * @return 实例对象
     */
    SeckillSale selectById(Long saleId);

    /**
     * 查询指定行数据
     *
     * @param seckillSale 筛选条件
     * @return 查询结果
     */
    List<SeckillSale> selectList(SeckillSale seckillSale);

    /**
     * 新增数据
     *
     * @param seckillSale 实例对象
     * @return 实例对象
     */
    SeckillSale insert(SeckillSale seckillSale);

    /**
     * 修改数据
     *
     * @param seckillSale 实例对象
     * @return 实例对象
     */
    SeckillSale update(SeckillSale seckillSale);

    /**
     * 通过主键删除数据
     *
     * @param saleId 主键
     * @return 是否成功
     */
    boolean deleteById(Long saleId);

}
