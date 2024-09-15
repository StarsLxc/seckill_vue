package com.ruoyi.web.controller.seckill;

import com.ruoyi.seckill.domain.SeckillSale;
import com.ruoyi.seckill.service.ISeckillSaleService;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.web.bind.annotation.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
/**
 * 订单表(SeckillSale)表控制层
 *
 * @author CJW
 * @since 2024-09-15 20:36:48
 */
@RestController
@RequestMapping("seckillSale")
public class SeckillSaleController {
    /**
     * 服务对象
     */
    @Autowired
    private ISeckillSaleService seckillSaleService;

    /**
     * 查询数据列表
     *
     * @param seckillSale 筛选条件
     * @return 查询结果
     */
    @GetMapping("/list")
    public AjaxResult list(SeckillSale seckillSale) {
        return AjaxResult.success(this.seckillSaleService.selectList(seckillSale));
    }
    
    /**
     * 分页查询数据列表
     *
     * @param seckillSale 筛选条件
     * @return 查询结果
     */
    @GetMapping("/page")
    public AjaxResult page(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, SeckillSale seckillSale) {
        PageHelper.startPage(pageNum,pageSize);
        List<SeckillSale> list = this.seckillSaleService.selectList(seckillSale);
        PageInfo<List> pageInfo = new PageInfo(list);
        return AjaxResult.success(pageInfo);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public AjaxResult getById(@PathVariable("id") Long id) {
        return AjaxResult.success(this.seckillSaleService.selectById(id));
    }

    /**
     * 新增数据
     *
     * @param seckillSale 实体
     * @return 新增结果
     */
    @PostMapping
    public AjaxResult add(@RequestBody SeckillSale seckillSale) {
        return AjaxResult.success(this.seckillSaleService.insert(seckillSale));
    }

    /**
     * 编辑数据
     *
     * @param seckillSale 实体
     * @return 编辑结果
     */
    @PutMapping
    public AjaxResult edit(@RequestBody SeckillSale seckillSale) {
        return AjaxResult.success(this.seckillSaleService.update(seckillSale));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/delete/{id}")
    public AjaxResult deleteById(@PathVariable Long id) {
        return AjaxResult.success(this.seckillSaleService.deleteById(id));
    }
}
