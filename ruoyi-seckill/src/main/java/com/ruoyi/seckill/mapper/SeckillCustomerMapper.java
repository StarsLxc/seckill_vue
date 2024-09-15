package com.ruoyi.seckill.mapper;

import com.ruoyi.seckill.domain.SeckillCustomer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 客户表(SeckillCustomer)表数据库访问层
 *
 * @author makejava
 * @since 2024-09-15 15:26:09
 */
@Mapper
public interface SeckillCustomerMapper {

        /**
         * 通过ID查询单条数据
         *
         * @param customerId 主键
         * @return 实例对象
         */
        SeckillCustomer selectById(Long customerId);

        /**
         * 查询指定行数据
         *
         * @param seckillCustomer 查询条件
         * @return 对象列表
         */
        List<SeckillCustomer> selectList(SeckillCustomer seckillCustomer);

        /**
         * 统计总行数
         *
         * @param seckillCustomer 查询条件
         * @return 总行数
         */
        long count(SeckillCustomer seckillCustomer);

        /**
         * 新增数据
         *
         * @param seckillCustomer 实例对象
         * @return 影响行数
         */
        int insert(SeckillCustomer seckillCustomer);

        /**
         * 批量新增数据（MyBatis原生foreach方法）
         *
         * @param entities List<SeckillCustomer> 实例对象列表
         * @return 影响行数
         */
        int insertBatch(@Param("entities") List<SeckillCustomer> entities);

        /**
         * 批量新增或按主键更新数据（MyBatis原生foreach方法）
         *
         * @param entities List<SeckillCustomer> 实例对象列表
         * @return 影响行数
         * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
         */
        int insertOrUpdateBatch(@Param("entities") List<SeckillCustomer> entities);

        /**
         * 修改数据
         *
         * @param seckillCustomer 实例对象
         * @return 影响行数
         */
        int update(SeckillCustomer seckillCustomer);

        /**
         * 通过主键删除数据
         *
         * @param customerId 主键
         * @return 影响行数
         */
        int deleteById(Long customerId);

}


