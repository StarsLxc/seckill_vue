package com.ruoyi.seckill.service.impl;

import com.ruoyi.seckill.domain.SeckillSale;
import com.ruoyi.seckill.mapper.SeckillSaleMapper;
import com.ruoyi.seckill.service.ISeckillSaleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单表(SeckillSale)表服务实现类
 *
 * @author CJW
 * @since 2024-09-15 20:36:48
 */
@Service("seckillSaleService")
public class SeckillSaleServiceImpl implements ISeckillSaleService {
    @Resource
    private SeckillSaleMapper seckillSaleMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param saleId 主键
     * @return 实例对象
     */
    @Override
    public SeckillSale selectById(Long saleId) {
        return this.seckillSaleMapper.selectById(saleId);
    }

    /**
     * 查询指定行
     *
     * @param seckillSale 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SeckillSale> selectList(SeckillSale seckillSale) {
        return this.seckillSaleMapper.selectList(seckillSale);
    }

    /**
     * 新增数据
     *
     * @param seckillSale 实例对象
     * @return 实例对象
     */
    @Override
    public SeckillSale insert(SeckillSale seckillSale) {
        this.seckillSaleMapper.insert(seckillSale);
        return seckillSale;
    }

    /**
     * 修改数据
     *
     * @param seckillSale 实例对象
     * @return 实例对象
     */
    @Override
    public SeckillSale update(SeckillSale seckillSale) {
        this.seckillSaleMapper.update(seckillSale);
        return this.selectById(seckillSale.getSaleId());
    }

    /**
     * 通过主键删除数据
     *
     * @param saleId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long saleId) {
        return this.seckillSaleMapper.deleteById(saleId) > 0;
    }
}
