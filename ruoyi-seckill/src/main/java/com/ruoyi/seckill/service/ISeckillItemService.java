package com.ruoyi.seckill.service;

import com.ruoyi.seckill.domain.SeckillItem;
import java.util.List;

/**
 * 产品表(SeckillItem)表服务接口
 *
 * @author CJW
 * @since 2024-09-15 20:52:29
 */
public interface ISeckillItemService {

    /**
     * 通过ID查询单条数据
     *
     * @param itemId 主键
     * @return 实例对象
     */
    SeckillItem selectById(Long itemId);

    /**
     * 查询指定行数据
     *
     * @param seckillItem 筛选条件
     * @return 查询结果
     */
    List<SeckillItem> selectList(SeckillItem seckillItem);

    /**
     * 新增数据
     *
     * @param seckillItem 实例对象
     * @return 实例对象
     */
    SeckillItem insert(SeckillItem seckillItem);

    /**
     * 修改数据
     *
     * @param seckillItem 实例对象
     * @return 实例对象
     */
    SeckillItem update(SeckillItem seckillItem);

    /**
     * 通过主键删除数据
     *
     * @param itemId 主键
     * @return 是否成功
     */
    boolean deleteById(Long itemId);

}
