package com.ruoyi.seckill.mapper;

import com.ruoyi.seckill.domain.SeckillSaleItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单明细表(SeckillSaleItem)表数据库访问层
 *
 * @author makejava
 * @since 2024-09-15 20:37:40
 */
@Mapper
public interface SeckillSaleItemMapper {

        /**
         * 通过ID查询单条数据
         *
         * @param saleItemId 主键
         * @return 实例对象
         */
    SeckillSaleItem selectById(Long saleItemId);

        /**
         * 查询指定行数据
         *
         * @param seckillSaleItem 查询条件
         * @return 对象列表
         */
        List<SeckillSaleItem> selectList(SeckillSaleItem seckillSaleItem);

        /**
         * 统计总行数
         *
         * @param seckillSaleItem 查询条件
         * @return 总行数
         */
        long count(SeckillSaleItem seckillSaleItem);

        /**
         * 新增数据
         *
         * @param seckillSaleItem 实例对象
         * @return 影响行数
         */
        int insert(SeckillSaleItem seckillSaleItem);

        /**
         * 批量新增数据（MyBatis原生foreach方法）
         *
         * @param entities List<SeckillSaleItem> 实例对象列表
         * @return 影响行数
         */
        int insertBatch(@Param("entities") List<SeckillSaleItem> entities);

        /**
         * 批量新增或按主键更新数据（MyBatis原生foreach方法）
         *
         * @param entities List<SeckillSaleItem> 实例对象列表
         * @return 影响行数
         * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
         */
        int insertOrUpdateBatch(@Param("entities") List<SeckillSaleItem> entities);

        /**
         * 修改数据
         *
         * @param seckillSaleItem 实例对象
         * @return 影响行数
         */
        int update(SeckillSaleItem seckillSaleItem);

        /**
         * 通过主键删除数据
         *
         * @param saleItemId 主键
         * @return 影响行数
         */
        int deleteById(Long saleItemId);

}


