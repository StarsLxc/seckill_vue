package com.ruoyi.seckill.service;

import com.ruoyi.seckill.domain.SeckillRefund;
import java.util.List;

/**
 * 退款表(SeckillRefund)表服务接口
 *
 * @author CJW
 * @since 2024-09-15 20:35:52
 */
public interface ISeckillRefundService {

    /**
     * 通过ID查询单条数据
     *
     * @param refundId 主键
     * @return 实例对象
     */
    SeckillRefund selectById(Long refundId);

    /**
     * 查询指定行数据
     *
     * @param seckillRefund 筛选条件
     * @return 查询结果
     */
    List<SeckillRefund> selectList(SeckillRefund seckillRefund);

    /**
     * 新增数据
     *
     * @param seckillRefund 实例对象
     * @return 实例对象
     */
    SeckillRefund insert(SeckillRefund seckillRefund);

    /**
     * 修改数据
     *
     * @param seckillRefund 实例对象
     * @return 实例对象
     */
    SeckillRefund update(SeckillRefund seckillRefund);

    /**
     * 通过主键删除数据
     *
     * @param refundId 主键
     * @return 是否成功
     */
    boolean deleteById(Long refundId);

}
