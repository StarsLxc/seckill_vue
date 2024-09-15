package com.ruoyi.seckill.service;

import com.ruoyi.seckill.domain.SeckillCustomer;
import java.util.List;

/**
 * 客户表(SeckillCustomer)表服务接口
 *
 * @author CJW
 * @since 2024-09-15 15:23:43
 */
public interface ISeckillCustomerService {

    /**
     * 通过ID查询单条数据
     *
     * @param customerId 主键
     * @return 实例对象
     */
    SeckillCustomer selectById(Long customerId);

    /**
     * 查询指定行数据
     *
     * @param seckillCustomer 筛选条件
     * @return 查询结果
     */
    List<SeckillCustomer> selectList(SeckillCustomer seckillCustomer);

    /**
     * 新增数据
     *
     * @param seckillCustomer 实例对象
     * @return 实例对象
     */
    SeckillCustomer insert(SeckillCustomer seckillCustomer);

    /**
     * 修改数据
     *
     * @param seckillCustomer 实例对象
     * @return 实例对象
     */
    SeckillCustomer update(SeckillCustomer seckillCustomer);

    /**
     * 通过主键删除数据
     *
     * @param customerId 主键
     * @return 是否成功
     */
    boolean deleteById(Long customerId);

}
