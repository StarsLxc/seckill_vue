package com.ruoyi.seckill.mapper;

import com.ruoyi.seckill.domain.SeckillRefund;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 退款表(SeckillRefund)表数据库访问层
 *
 * @author makejava
 * @since 2024-09-15 20:35:52
 */
@Mapper
public interface SeckillRefundMapper {

        /**
         * 通过ID查询单条数据
         *
         * @param refundId 主键
         * @return 实例对象
         */
    SeckillRefund selectById(Long refundId);

        /**
         * 查询指定行数据
         *
         * @param seckillRefund 查询条件
         * @return 对象列表
         */
        List<SeckillRefund> selectList(SeckillRefund seckillRefund);

        /**
         * 统计总行数
         *
         * @param seckillRefund 查询条件
         * @return 总行数
         */
        long count(SeckillRefund seckillRefund);

        /**
         * 新增数据
         *
         * @param seckillRefund 实例对象
         * @return 影响行数
         */
        int insert(SeckillRefund seckillRefund);

        /**
         * 批量新增数据（MyBatis原生foreach方法）
         *
         * @param entities List<SeckillRefund> 实例对象列表
         * @return 影响行数
         */
        int insertBatch(@Param("entities") List<SeckillRefund> entities);

        /**
         * 批量新增或按主键更新数据（MyBatis原生foreach方法）
         *
         * @param entities List<SeckillRefund> 实例对象列表
         * @return 影响行数
         * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
         */
        int insertOrUpdateBatch(@Param("entities") List<SeckillRefund> entities);

        /**
         * 修改数据
         *
         * @param seckillRefund 实例对象
         * @return 影响行数
         */
        int update(SeckillRefund seckillRefund);

        /**
         * 通过主键删除数据
         *
         * @param refundId 主键
         * @return 影响行数
         */
        int deleteById(Long refundId);

}


