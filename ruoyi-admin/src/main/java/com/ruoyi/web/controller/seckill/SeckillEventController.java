package com.ruoyi.web.controller.seckill;

import com.ruoyi.seckill.domain.SeckillEvent;
import com.ruoyi.seckill.service.ISeckillEventService;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.web.bind.annotation.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
/**
 * 秒杀活动表(SeckillEvent)表控制层
 *
 * @author CJW
 * @since 2024-09-15 20:31:26
 */
@RestController
@RequestMapping("seckillEvent")
public class SeckillEventController {
    /**
     * 服务对象
     */
    @Autowired
    private ISeckillEventService seckillEventService;

    /**
     * 查询数据列表
     *
     * @param seckillEvent 筛选条件
     * @return 查询结果
     */
    @GetMapping("/list")
    public AjaxResult list(SeckillEvent seckillEvent) {
        return AjaxResult.success(this.seckillEventService.selectList(seckillEvent));
    }
    
    /**
     * 分页查询数据列表
     *
     * @param seckillEvent 筛选条件
     * @return 查询结果
     */
    @GetMapping("/page")
    public AjaxResult page(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, SeckillEvent seckillEvent) {
        PageHelper.startPage(pageNum,pageSize);
        List<SeckillEvent> list = this.seckillEventService.selectList(seckillEvent);
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
        return AjaxResult.success(this.seckillEventService.selectById(id));
    }

    /**
     * 新增数据
     *
     * @param seckillEvent 实体
     * @return 新增结果
     */
    @PostMapping
    public AjaxResult add(@RequestBody SeckillEvent seckillEvent) {
        return AjaxResult.success(this.seckillEventService.insert(seckillEvent));
    }

    /**
     * 编辑数据
     *
     * @param seckillEvent 实体
     * @return 编辑结果
     */
    @PutMapping
    public AjaxResult edit(@RequestBody SeckillEvent seckillEvent) {
        return AjaxResult.success(this.seckillEventService.update(seckillEvent));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/delete/{id}")
    public AjaxResult deleteById(@PathVariable Long id) {
        return AjaxResult.success(this.seckillEventService.deleteById(id));
    }
}
