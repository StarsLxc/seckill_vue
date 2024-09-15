package com.ruoyi.seckill.service;

import com.ruoyi.seckill.domain.SeckillEvent;
import java.util.List;

/**
 * 秒杀活动表(SeckillEvent)表服务接口
 *
 * @author CJW
 * @since 2024-09-15 20:23:37
 */
public interface ISeckillEventService {

    /**
     * 通过ID查询单条数据
     *
     * @param seckillId 主键
     * @return 实例对象
     */
    SeckillEvent selectById(Long seckillId);

    /**
     * 查询指定行数据
     *
     * @param seckillEvent 筛选条件
     * @return 查询结果
     */
    List<SeckillEvent> selectList(SeckillEvent seckillEvent);

    /**
     * 新增数据
     *
     * @param seckillEvent 实例对象
     * @return 实例对象
     */
    SeckillEvent insert(SeckillEvent seckillEvent);

    /**
     * 修改数据
     *
     * @param seckillEvent 实例对象
     * @return 实例对象
     */
    SeckillEvent update(SeckillEvent seckillEvent);

    /**
     * 通过主键删除数据
     *
     * @param seckillId 主键
     * @return 是否成功
     */
    boolean deleteById(Long seckillId);

}
