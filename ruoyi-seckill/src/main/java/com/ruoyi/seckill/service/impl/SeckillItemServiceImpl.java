package com.ruoyi.seckill.service.impl;

import com.ruoyi.seckill.domain.SeckillItem;
import com.ruoyi.seckill.mapper.SeckillItemMapper;
import com.ruoyi.seckill.service.ISeckillItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 产品表(SeckillItem)表服务实现类
 *
 * @author CJW
 * @since 2024-09-15 20:52:29
 */
@Service("seckillItemService")
public class SeckillItemServiceImpl implements ISeckillItemService {
    @Resource
    private SeckillItemMapper seckillItemMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param itemId 主键
     * @return 实例对象
     */
    @Override
    public SeckillItem selectById(Long itemId) {
        return this.seckillItemMapper.selectById(itemId);
    }

    /**
     * 查询指定行
     *
     * @param seckillItem 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SeckillItem> selectList(SeckillItem seckillItem) {
        return this.seckillItemMapper.selectList(seckillItem);
    }

    /**
     * 新增数据
     *
     * @param seckillItem 实例对象
     * @return 实例对象
     */
    @Override
    public SeckillItem insert(SeckillItem seckillItem) {
        this.seckillItemMapper.insert(seckillItem);
        return seckillItem;
    }

    /**
     * 修改数据
     *
     * @param seckillItem 实例对象
     * @return 实例对象
     */
    @Override
    public SeckillItem update(SeckillItem seckillItem) {
        this.seckillItemMapper.update(seckillItem);
        return this.selectById(seckillItem.getItemId());
    }

    /**
     * 通过主键删除数据
     *
     * @param itemId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long itemId) {
        return this.seckillItemMapper.deleteById(itemId) > 0;
    }
}
