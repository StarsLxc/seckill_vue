package com.ruoyi.seckill.service.impl;

import com.ruoyi.seckill.domain.SeckillRefund;
import com.ruoyi.seckill.mapper.SeckillRefundMapper;
import com.ruoyi.seckill.service.ISeckillRefundService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 退款表(SeckillRefund)表服务实现类
 *
 * @author CJW
 * @since 2024-09-15 20:35:52
 */
@Service("seckillRefundService")
public class SeckillRefundServiceImpl implements ISeckillRefundService {
    @Resource
    private SeckillRefundMapper seckillRefundMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param refundId 主键
     * @return 实例对象
     */
    @Override
    public SeckillRefund selectById(Long refundId) {
        return this.seckillRefundMapper.selectById(refundId);
    }

    /**
     * 查询指定行
     *
     * @param seckillRefund 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SeckillRefund> selectList(SeckillRefund seckillRefund) {
        return this.seckillRefundMapper.selectList(seckillRefund);
    }

    /**
     * 新增数据
     *
     * @param seckillRefund 实例对象
     * @return 实例对象
     */
    @Override
    public SeckillRefund insert(SeckillRefund seckillRefund) {
        this.seckillRefundMapper.insert(seckillRefund);
        return seckillRefund;
    }

    /**
     * 修改数据
     *
     * @param seckillRefund 实例对象
     * @return 实例对象
     */
    @Override
    public SeckillRefund update(SeckillRefund seckillRefund) {
        this.seckillRefundMapper.update(seckillRefund);
        return this.selectById(seckillRefund.getRefundId());
    }

    /**
     * 通过主键删除数据
     *
     * @param refundId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long refundId) {
        return this.seckillRefundMapper.deleteById(refundId) > 0;
    }
}
