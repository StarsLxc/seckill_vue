package com.ruoyi.web.controller.seckill;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.seckill.domain.SeckillItem;
import com.ruoyi.seckill.service.ISeckillItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 产品表(SeckillItem)表控制层
 *
 * @author CJW
 * @since 2024-09-15 20:52:29
 */
@RestController
@RequestMapping("seckillItem")
public class SeckillItemController {
    /**
     * 服务对象
     */
    @Autowired
    private ISeckillItemService seckillItemService;

    /**
     * 查询数据列表
     *
     * @param seckillItem 筛选条件
     * @return 查询结果
     */
    @GetMapping("/list")
    public AjaxResult list(SeckillItem seckillItem) {
        return AjaxResult.success(this.seckillItemService.selectList(seckillItem));
    }
    
    /**
     * 分页查询数据列表
     *
     * @param seckillItem 筛选条件
     * @return 查询结果
     */
    @GetMapping("/page")
    public AjaxResult page(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, SeckillItem seckillItem) {
        PageHelper.startPage(pageNum,pageSize);
        List<SeckillItem> list = this.seckillItemService.selectList(seckillItem);
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
        return AjaxResult.success(this.seckillItemService.selectById(id));
    }

    /**
     * 新增数据
     *
     * @param seckillItem 实体
     * @return 新增结果
     */
    @PostMapping
    public AjaxResult add(@RequestBody SeckillItem seckillItem) {
        return AjaxResult.success(this.seckillItemService.insert(seckillItem));
    }

    /**
     * 编辑数据
     *
     * @param seckillItem 实体
     * @return 编辑结果
     */
    @PutMapping
    public AjaxResult edit(@RequestBody SeckillItem seckillItem) {
        return AjaxResult.success(this.seckillItemService.update(seckillItem));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/delete/{id}")
    public AjaxResult deleteById(@PathVariable Long id) {
        return AjaxResult.success(this.seckillItemService.deleteById(id));
    }
}
