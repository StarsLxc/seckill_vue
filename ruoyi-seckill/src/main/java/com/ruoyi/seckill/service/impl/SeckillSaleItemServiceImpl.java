package com.ruoyi.seckill.service.impl;

import com.ruoyi.seckill.domain.SeckillSaleItem;
import com.ruoyi.seckill.mapper.SeckillSaleItemMapper;
import com.ruoyi.seckill.service.ISeckillSaleItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单明细表(SeckillSaleItem)表服务实现类
 *
 * @author CJW
 * @since 2024-09-15 20:37:40
 */
@Service("seckillSaleItemService")
public class SeckillSaleItemServiceImpl implements ISeckillSaleItemService {
    @Resource
    private SeckillSaleItemMapper seckillSaleItemMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param saleItemId 主键
     * @return 实例对象
     */
    @Override
    public SeckillSaleItem selectById(Long saleItemId) {
        return this.seckillSaleItemMapper.selectById(saleItemId);
    }

    /**
     * 查询指定行
     *
     * @param seckillSaleItem 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SeckillSaleItem> selectList(SeckillSaleItem seckillSaleItem) {
        return this.seckillSaleItemMapper.selectList(seckillSaleItem);
    }

    /**
     * 新增数据
     *
     * @param seckillSaleItem 实例对象
     * @return 实例对象
     */
    @Override
    public SeckillSaleItem insert(SeckillSaleItem seckillSaleItem) {
        this.seckillSaleItemMapper.insert(seckillSaleItem);
        return seckillSaleItem;
    }

    /**
     * 修改数据
     *
     * @param seckillSaleItem 实例对象
     * @return 实例对象
     */
    @Override
    public SeckillSaleItem update(SeckillSaleItem seckillSaleItem) {
        this.seckillSaleItemMapper.update(seckillSaleItem);
        return this.selectById(seckillSaleItem.getSaleItemId());
    }

    /**
     * 通过主键删除数据
     *
     * @param saleItemId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long saleItemId) {
        return this.seckillSaleItemMapper.deleteById(saleItemId) > 0;
    }
}
