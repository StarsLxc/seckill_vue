package com.ruoyi.seckill.mapper;

import com.ruoyi.seckill.domain.SeckillEvent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 秒杀活动表(SeckillEvent)表数据库访问层
 *
 * @author makejava
 * @since 2024-09-15 20:23:37
 */
@Mapper
public interface SeckillEventMapper {

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
         * @param seckillEvent 查询条件
         * @return 对象列表
         */
        List<SeckillEvent> selectList(SeckillEvent seckillEvent);

        /**
         * 统计总行数
         *
         * @param seckillEvent 查询条件
         * @return 总行数
         */
        long count(SeckillEvent seckillEvent);

        /**
         * 新增数据
         *
         * @param seckillEvent 实例对象
         * @return 影响行数
         */
        int insert(SeckillEvent seckillEvent);

        /**
         * 批量新增数据（MyBatis原生foreach方法）
         *
         * @param entities List<SeckillEvent> 实例对象列表
         * @return 影响行数
         */
        int insertBatch(@Param("entities") List<SeckillEvent> entities);

        /**
         * 批量新增或按主键更新数据（MyBatis原生foreach方法）
         *
         * @param entities List<SeckillEvent> 实例对象列表
         * @return 影响行数
         * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
         */
        int insertOrUpdateBatch(@Param("entities") List<SeckillEvent> entities);

        /**
         * 修改数据
         *
         * @param seckillEvent 实例对象
         * @return 影响行数
         */
        int update(SeckillEvent seckillEvent);

        /**
         * 通过主键删除数据
         *
         * @param seckillId 主键
         * @return 影响行数
         */
        int deleteById(Long seckillId);

}


