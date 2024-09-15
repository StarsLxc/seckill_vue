package com.ruoyi.seckill.service.impl;

import com.ruoyi.seckill.domain.SeckillEvent;
import com.ruoyi.seckill.mapper.SeckillEventMapper;
import com.ruoyi.seckill.service.ISeckillEventService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 秒杀活动表(SeckillEvent)表服务实现类
 *
 * @author CJW
 * @since 2024-09-15 20:23:37
 */
@Service("seckillEventService")
public class SeckillEventServiceImpl implements ISeckillEventService {
    @Resource
    private SeckillEventMapper seckillEventMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param seckillId 主键
     * @return 实例对象
     */
    @Override
    public SeckillEvent selectById(Long seckillId) {
        return this.seckillEventMapper.selectById(seckillId);
    }

    /**
     * 查询指定行
     *
     * @param seckillEvent 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SeckillEvent> selectList(SeckillEvent seckillEvent) {
        return this.seckillEventMapper.selectList(seckillEvent);
    }

    /**
     * 新增数据
     *
     * @param seckillEvent 实例对象
     * @return 实例对象
     */
    @Override
    public SeckillEvent insert(SeckillEvent seckillEvent) {
        this.seckillEventMapper.insert(seckillEvent);
        return seckillEvent;
    }

    /**
     * 修改数据
     *
     * @param seckillEvent 实例对象
     * @return 实例对象
     */
    @Override
    public SeckillEvent update(SeckillEvent seckillEvent) {
        this.seckillEventMapper.update(seckillEvent);
        return this.selectById(seckillEvent.getSeckillId());
    }

    /**
     * 通过主键删除数据
     *
     * @param seckillId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long seckillId) {
        return this.seckillEventMapper.deleteById(seckillId) > 0;
    }
}
