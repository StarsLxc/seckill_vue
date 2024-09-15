package com.ruoyi.web.controller.seckill;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.seckill.domain.SeckillCustomer;
import com.ruoyi.seckill.service.ISeckillCustomerService;
import org.springframework.web.bind.annotation.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
/**
 * 客户表(SeckillCustomer)表控制层
 *
 * @author CJW
 * @since 2024-09-15 16:07:51
 */
@RestController
@RequestMapping("seckillCustomer")
public class SeckillCustomerController {
    /**
     * 服务对象
     */
    @Autowired
    private ISeckillCustomerService seckillCustomerService;

    /**
     * 查询数据列表
     *
     * @param seckillCustomer 筛选条件
     * @return 查询结果
     */
    @GetMapping("/list")
    public AjaxResult list(SeckillCustomer seckillCustomer) {
        return AjaxResult.success(this.seckillCustomerService.selectList(seckillCustomer));
    }
    
    /**
     * 分页查询数据列表
     *
     * @param seckillCustomer 筛选条件
     * @return 查询结果
     */
    @GetMapping("/page")
    public AjaxResult page(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, SeckillCustomer seckillCustomer) {
        PageHelper.startPage(pageNum,pageSize);
        List<SeckillCustomer> list = this.seckillCustomerService.selectList(seckillCustomer);
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
        return AjaxResult.success(this.seckillCustomerService.selectById(id));
    }

    /**
     * 新增数据
     *
     * @param seckillCustomer 实体
     * @return 新增结果
     */
    @PostMapping
    public AjaxResult add(@RequestBody SeckillCustomer seckillCustomer) {
        return AjaxResult.success(this.seckillCustomerService.insert(seckillCustomer));
    }

    /**
     * 编辑数据
     *
     * @param seckillCustomer 实体
     * @return 编辑结果
     */
    @PutMapping
    public AjaxResult edit(@RequestBody SeckillCustomer seckillCustomer) {
        return AjaxResult.success(this.seckillCustomerService.update(seckillCustomer));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/delete/{id}")
    public AjaxResult deleteById(@PathVariable Long id) {
        return AjaxResult.success(this.seckillCustomerService.deleteById(id));
    }
}
