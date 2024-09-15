package com.ruoyi.seckill.service;

import com.ruoyi.seckill.domain.SeckillPayment;
import java.util.List;

/**
 * 支付账单表(SeckillPayment)表服务接口
 *
 * @author CJW
 * @since 2024-09-15 20:34:36
 */
public interface ISeckillPaymentService {

    /**
     * 通过ID查询单条数据
     *
     * @param paymentId 主键
     * @return 实例对象
     */
    SeckillPayment selectById(Long paymentId);

    /**
     * 查询指定行数据
     *
     * @param seckillPayment 筛选条件
     * @return 查询结果
     */
    List<SeckillPayment> selectList(SeckillPayment seckillPayment);

    /**
     * 新增数据
     *
     * @param seckillPayment 实例对象
     * @return 实例对象
     */
    SeckillPayment insert(SeckillPayment seckillPayment);

    /**
     * 修改数据
     *
     * @param seckillPayment 实例对象
     * @return 实例对象
     */
    SeckillPayment update(SeckillPayment seckillPayment);

    /**
     * 通过主键删除数据
     *
     * @param paymentId 主键
     * @return 是否成功
     */
    boolean deleteById(Long paymentId);

}
