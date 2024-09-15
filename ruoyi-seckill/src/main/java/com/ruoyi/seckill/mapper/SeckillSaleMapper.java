package com.ruoyi.seckill.mapper;

import com.ruoyi.seckill.domain.SeckillSale;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单表(SeckillSale)表数据库访问层
 *
 * @author makejava
 * @since 2024-09-15 20:36:48
 */
@Mapper
public interface SeckillSaleMapper {

        /**
         * 通过ID查询单条数据
         *
         * @param saleId 主键
         * @return 实例对象
         */
    SeckillSale selectById(Long saleId);

        /**
         * 查询指定行数据
         *
         * @param seckillSale 查询条件
         * @return 对象列表
         */
        List<SeckillSale> selectList(SeckillSale seckillSale);

        /**
         * 统计总行数
         *
         * @param seckillSale 查询条件
         * @return 总行数
         */
        long count(SeckillSale seckillSale);

        /**
         * 新增数据
         *
         * @param seckillSale 实例对象
         * @return 影响行数
         */
        int insert(SeckillSale seckillSale);

        /**
         * 批量新增数据（MyBatis原生foreach方法）
         *
         * @param entities List<SeckillSale> 实例对象列表
         * @return 影响行数
         */
        int insertBatch(@Param("entities") List<SeckillSale> entities);

        /**
         * 批量新增或按主键更新数据（MyBatis原生foreach方法）
         *
         * @param entities List<SeckillSale> 实例对象列表
         * @return 影响行数
         * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
         */
        int insertOrUpdateBatch(@Param("entities") List<SeckillSale> entities);

        /**
         * 修改数据
         *
         * @param seckillSale 实例对象
         * @return 影响行数
         */
        int update(SeckillSale seckillSale);

        /**
         * 通过主键删除数据
         *
         * @param saleId 主键
         * @return 影响行数
         */
        int deleteById(Long saleId);

}


