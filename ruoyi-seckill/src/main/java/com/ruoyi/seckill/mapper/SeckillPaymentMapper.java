package com.ruoyi.seckill.mapper;

import com.ruoyi.seckill.domain.SeckillPayment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 支付账单表(SeckillPayment)表数据库访问层
 *
 * @author makejava
 * @since 2024-09-15 20:34:36
 */
@Mapper
public interface SeckillPaymentMapper {

        /**
         * 通过ID查询单条数据
         *
         * @param paymentId 主键
         * @return 实例对象
         */
    SeckillPayment selectById(Long paymentId);

        /**
         * 查询指定行数据
         *
         * @param seckillPayment 查询条件
         * @return 对象列表
         */
        List<SeckillPayment> selectList(SeckillPayment seckillPayment);

        /**
         * 统计总行数
         *
         * @param seckillPayment 查询条件
         * @return 总行数
         */
        long count(SeckillPayment seckillPayment);

        /**
         * 新增数据
         *
         * @param seckillPayment 实例对象
         * @return 影响行数
         */
        int insert(SeckillPayment seckillPayment);

        /**
         * 批量新增数据（MyBatis原生foreach方法）
         *
         * @param entities List<SeckillPayment> 实例对象列表
         * @return 影响行数
         */
        int insertBatch(@Param("entities") List<SeckillPayment> entities);

        /**
         * 批量新增或按主键更新数据（MyBatis原生foreach方法）
         *
         * @param entities List<SeckillPayment> 实例对象列表
         * @return 影响行数
         * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
         */
        int insertOrUpdateBatch(@Param("entities") List<SeckillPayment> entities);

        /**
         * 修改数据
         *
         * @param seckillPayment 实例对象
         * @return 影响行数
         */
        int update(SeckillPayment seckillPayment);

        /**
         * 通过主键删除数据
         *
         * @param paymentId 主键
         * @return 影响行数
         */
        int deleteById(Long paymentId);

}


