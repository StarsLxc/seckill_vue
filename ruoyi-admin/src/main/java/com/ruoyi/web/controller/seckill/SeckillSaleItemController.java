package com.ruoyi.web.controller.seckill;

import com.ruoyi.seckill.domain.SeckillSaleItem;
import com.ruoyi.seckill.service.ISeckillSaleItemService;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.web.bind.annotation.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
/**
 * 订单明细表(SeckillSaleItem)表控制层
 *
 * @author CJW
 * @since 2024-09-15 20:37:40
 */
@RestController
@RequestMapping("seckillSaleItem")
public class SeckillSaleItemController {
    /**
     * 服务对象
     */
    @Autowired
    private ISeckillSaleItemService seckillSaleItemService;

    /**
     * 查询数据列表
     *
     * @param seckillSaleItem 筛选条件
     * @return 查询结果
     */
    @GetMapping("/list")
    public AjaxResult list(SeckillSaleItem seckillSaleItem) {
        return AjaxResult.success(this.seckillSaleItemService.selectList(seckillSaleItem));
    }
    
    /**
     * 分页查询数据列表
     *
     * @param seckillSaleItem 筛选条件
     * @return 查询结果
     */
    @GetMapping("/page")
    public AjaxResult page(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, SeckillSaleItem seckillSaleItem) {
        PageHelper.startPage(pageNum,pageSize);
        List<SeckillSaleItem> list = this.seckillSaleItemService.selectList(seckillSaleItem);
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
        return AjaxResult.success(this.seckillSaleItemService.selectById(id));
    }

    /**
     * 新增数据
     *
     * @param seckillSaleItem 实体
     * @return 新增结果
     */
    @PostMapping
    public AjaxResult add(@RequestBody SeckillSaleItem seckillSaleItem) {
        return AjaxResult.success(this.seckillSaleItemService.insert(seckillSaleItem));
    }

    /**
     * 编辑数据
     *
     * @param seckillSaleItem 实体
     * @return 编辑结果
     */
    @PutMapping
    public AjaxResult edit(@RequestBody SeckillSaleItem seckillSaleItem) {
        return AjaxResult.success(this.seckillSaleItemService.update(seckillSaleItem));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/delete/{id}")
    public AjaxResult deleteById(@PathVariable Long id) {
        return AjaxResult.success(this.seckillSaleItemService.deleteById(id));
    }
}
