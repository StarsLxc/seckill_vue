package com.ruoyi.web.controller.seckill;

import com.ruoyi.seckill.domain.SeckillRefund;
import com.ruoyi.seckill.service.ISeckillRefundService;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.web.bind.annotation.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
/**
 * 退款表(SeckillRefund)表控制层
 *
 * @author CJW
 * @since 2024-09-15 20:35:52
 */
@RestController
@RequestMapping("seckillRefund")
public class SeckillRefundController {
    /**
     * 服务对象
     */
    @Autowired
    private ISeckillRefundService seckillRefundService;

    /**
     * 查询数据列表
     *
     * @param seckillRefund 筛选条件
     * @return 查询结果
     */
    @GetMapping("/list")
    public AjaxResult list(SeckillRefund seckillRefund) {
        return AjaxResult.success(this.seckillRefundService.selectList(seckillRefund));
    }
    
    /**
     * 分页查询数据列表
     *
     * @param seckillRefund 筛选条件
     * @return 查询结果
     */
    @GetMapping("/page")
    public AjaxResult page(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, SeckillRefund seckillRefund) {
        PageHelper.startPage(pageNum,pageSize);
        List<SeckillRefund> list = this.seckillRefundService.selectList(seckillRefund);
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
        return AjaxResult.success(this.seckillRefundService.selectById(id));
    }

    /**
     * 新增数据
     *
     * @param seckillRefund 实体
     * @return 新增结果
     */
    @PostMapping
    public AjaxResult add(@RequestBody SeckillRefund seckillRefund) {
        return AjaxResult.success(this.seckillRefundService.insert(seckillRefund));
    }

    /**
     * 编辑数据
     *
     * @param seckillRefund 实体
     * @return 编辑结果
     */
    @PutMapping
    public AjaxResult edit(@RequestBody SeckillRefund seckillRefund) {
        return AjaxResult.success(this.seckillRefundService.update(seckillRefund));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/delete/{id}")
    public AjaxResult deleteById(@PathVariable Long id) {
        return AjaxResult.success(this.seckillRefundService.deleteById(id));
    }
}
