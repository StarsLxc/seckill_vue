package com.ruoyi.seckill.service.impl;

import com.ruoyi.seckill.domain.SeckillPayment;
import com.ruoyi.seckill.mapper.SeckillPaymentMapper;
import com.ruoyi.seckill.service.ISeckillPaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 支付账单表(SeckillPayment)表服务实现类
 *
 * @author CJW
 * @since 2024-09-15 20:34:36
 */
@Service("seckillPaymentService")
public class SeckillPaymentServiceImpl implements ISeckillPaymentService {
    @Resource
    private SeckillPaymentMapper seckillPaymentMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param paymentId 主键
     * @return 实例对象
     */
    @Override
    public SeckillPayment selectById(Long paymentId) {
        return this.seckillPaymentMapper.selectById(paymentId);
    }

    /**
     * 查询指定行
     *
     * @param seckillPayment 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SeckillPayment> selectList(SeckillPayment seckillPayment) {
        return this.seckillPaymentMapper.selectList(seckillPayment);
    }

    /**
     * 新增数据
     *
     * @param seckillPayment 实例对象
     * @return 实例对象
     */
    @Override
    public SeckillPayment insert(SeckillPayment seckillPayment) {
        this.seckillPaymentMapper.insert(seckillPayment);
        return seckillPayment;
    }

    /**
     * 修改数据
     *
     * @param seckillPayment 实例对象
     * @return 实例对象
     */
    @Override
    public SeckillPayment update(SeckillPayment seckillPayment) {
        this.seckillPaymentMapper.update(seckillPayment);
        return this.selectById(seckillPayment.getPaymentId());
    }

    /**
     * 通过主键删除数据
     *
     * @param paymentId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long paymentId) {
        return this.seckillPaymentMapper.deleteById(paymentId) > 0;
    }
}
