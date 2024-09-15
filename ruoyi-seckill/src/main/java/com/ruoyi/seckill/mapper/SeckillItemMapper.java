package com.ruoyi.seckill.mapper;

import com.ruoyi.seckill.domain.SeckillItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 产品表(SeckillItem)表数据库访问层
 *
 * @author makejava
 * @since 2024-09-15 20:52:29
 */
@Mapper
public interface SeckillItemMapper {

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
         * @param seckillItem 查询条件
         * @return 对象列表
         */
        List<SeckillItem> selectList(SeckillItem seckillItem);

        /**
         * 统计总行数
         *
         * @param seckillItem 查询条件
         * @return 总行数
         */
        long count(SeckillItem seckillItem);

        /**
         * 新增数据
         *
         * @param seckillItem 实例对象
         * @return 影响行数
         */
        int insert(SeckillItem seckillItem);

        /**
         * 批量新增数据（MyBatis原生foreach方法）
         *
         * @param entities List<SeckillItem> 实例对象列表
         * @return 影响行数
         */
        int insertBatch(@Param("entities") List<SeckillItem> entities);

        /**
         * 批量新增或按主键更新数据（MyBatis原生foreach方法）
         *
         * @param entities List<SeckillItem> 实例对象列表
         * @return 影响行数
         * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
         */
        int insertOrUpdateBatch(@Param("entities") List<SeckillItem> entities);

        /**
         * 修改数据
         *
         * @param seckillItem 实例对象
         * @return 影响行数
         */
        int update(SeckillItem seckillItem);

        /**
         * 通过主键删除数据
         *
         * @param itemId 主键
         * @return 影响行数
         */
        int deleteById(Long itemId);

}


