package com.ruoyi.seckill.service.impl;

import com.ruoyi.seckill.domain.SeckillCustomer;
import com.ruoyi.seckill.mapper.SeckillCustomerMapper;
import com.ruoyi.seckill.service.ISeckillCustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 客户表(SeckillCustomer)表服务实现类
 *
 * @author CJW
 * @since 2024-09-15 15:23:43
 */
@Service("seckillCustomerService")
public class SeckillCustomerServiceImpl implements ISeckillCustomerService {
    @Resource
    private SeckillCustomerMapper seckillCustomerMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param customerId 主键
     * @return 实例对象
     */
    @Override
    public SeckillCustomer selectById(Long customerId) {
        return this.seckillCustomerMapper.selectById(customerId);
    }

    /**
     * 查询指定行
     *
     * @param seckillCustomer 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SeckillCustomer> selectList(SeckillCustomer seckillCustomer) {
        return this.seckillCustomerMapper.selectList(seckillCustomer);
    }

    /**
     * 新增数据
     *
     * @param seckillCustomer 实例对象
     * @return 实例对象
     */
    @Override
    public SeckillCustomer insert(SeckillCustomer seckillCustomer) {
        this.seckillCustomerMapper.insert(seckillCustomer);
        return seckillCustomer;
    }

    /**
     * 修改数据
     *
     * @param seckillCustomer 实例对象
     * @return 实例对象
     */
    @Override
    public SeckillCustomer update(SeckillCustomer seckillCustomer) {
        this.seckillCustomerMapper.update(seckillCustomer);
        return this.selectById(seckillCustomer.getCustomerId());
    }

    /**
     * 通过主键删除数据
     *
     * @param customerId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long customerId) {
        return this.seckillCustomerMapper.deleteById(customerId) > 0;
    }
}
