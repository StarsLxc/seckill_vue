package com.ruoyi.web.controller.seckill;

import com.ruoyi.seckill.domain.SeckillPayment;
import com.ruoyi.seckill.service.ISeckillPaymentService;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.web.bind.annotation.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
/**
 * 支付账单表(SeckillPayment)表控制层
 *
 * @author CJW
 * @since 2024-09-15 20:34:36
 */
@RestController
@RequestMapping("seckillPayment")
public class SeckillPaymentController {
    /**
     * 服务对象
     */
    @Autowired
    private ISeckillPaymentService seckillPaymentService;

    /**
     * 查询数据列表
     *
     * @param seckillPayment 筛选条件
     * @return 查询结果
     */
    @GetMapping("/list")
    public AjaxResult list(SeckillPayment seckillPayment) {
        return AjaxResult.success(this.seckillPaymentService.selectList(seckillPayment));
    }
    
    /**
     * 分页查询数据列表
     *
     * @param seckillPayment 筛选条件
     * @return 查询结果
     */
    @GetMapping("/page")
    public AjaxResult page(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, SeckillPayment seckillPayment) {
        PageHelper.startPage(pageNum,pageSize);
        List<SeckillPayment> list = this.seckillPaymentService.selectList(seckillPayment);
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
        return AjaxResult.success(this.seckillPaymentService.selectById(id));
    }

    /**
     * 新增数据
     *
     * @param seckillPayment 实体
     * @return 新增结果
     */
    @PostMapping
    public AjaxResult add(@RequestBody SeckillPayment seckillPayment) {
        return AjaxResult.success(this.seckillPaymentService.insert(seckillPayment));
    }

    /**
     * 编辑数据
     *
     * @param seckillPayment 实体
     * @return 编辑结果
     */
    @PutMapping
    public AjaxResult edit(@RequestBody SeckillPayment seckillPayment) {
        return AjaxResult.success(this.seckillPaymentService.update(seckillPayment));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/delete/{id}")
    public AjaxResult deleteById(@PathVariable Long id) {
        return AjaxResult.success(this.seckillPaymentService.deleteById(id));
    }
}
