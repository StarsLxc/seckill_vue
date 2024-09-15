<template>
  <div class="app-container">
    <el-row :gutter="10">
      <el-col :span="24" :xs="24">
        <!-- 数据筛选表单 -->
        <el-form ref="queryForm" :model="queryParams" :inline="true" label-width="100px">
          <!-- 数据筛选表单组件 -->
              <el-form-item label="秒杀名称" prop="seckillName">
            <el-input v-model="queryParams.seckillName" placehold clearable size="small" @keyup.enter="handleQuery" />
          </el-form-item>
                  <el-form-item label="商品id" prop="itemId">
            <el-input v-model="queryParams.itemId" placehold clearable size="small" @keyup.enter="handleQuery" />
          </el-form-item>
                  <el-form-item label="秒杀价格" prop="seckillPrice">
            <el-input v-model="queryParams.seckillPrice" placehold clearable size="small" @keyup.enter="handleQuery" />
          </el-form-item>
                  <el-form-item label="秒杀库存数" prop="seckillStock">
            <el-input v-model="queryParams.seckillStock" placehold clearable size="small" @keyup.enter="handleQuery" />
          </el-form-item>
                  <el-form-item label="秒杀积分" prop="seckillPoints">
            <el-input v-model="queryParams.seckillPoints" placehold clearable size="small" @keyup.enter="handleQuery" />
          </el-form-item>
                  <el-form-item label="秒杀开始时间" prop="seckillStartTime">
            <el-input v-model="queryParams.seckillStartTime" placehold clearable size="small" @keyup.enter="handleQuery" />
          </el-form-item>
                  <el-form-item label="秒杀结束时间" prop="seckillEndTime">
            <el-input v-model="queryParams.seckillEndTime" placehold clearable size="small" @keyup.enter="handleQuery" />
          </el-form-item>
                  <el-form-item label="秒杀状态" prop="seckillStatus">
            <el-input v-model="queryParams.seckillStatus" placehold clearable size="small" @keyup.enter="handleQuery" />
          </el-form-item>
                  <el-form-item label="秒杀是否可以重复" prop="seckillRepeatability">
            <el-input v-model="queryParams.seckillRepeatability" placehold clearable size="small" @keyup.enter="handleQuery" />
          </el-form-item>
                  <el-form-item label="单个顾客秒杀限购数量" prop="seckillLimitCustomer">
            <el-input v-model="queryParams.seckillLimitCustomer" placehold clearable size="small" @keyup.enter="handleQuery" />
          </el-form-item>
                  <el-form-item label="单个ip秒杀限购数量" prop="seckillLimitIp">
            <el-input v-model="queryParams.seckillLimitIp" placehold clearable size="small" @keyup.enter="handleQuery" />
          </el-form-item>
                  <el-form-item label="单笔订单限购数量" prop="seckillLimitSale">
            <el-input v-model="queryParams.seckillLimitSale" placehold clearable size="small" @keyup.enter="handleQuery" />
          </el-form-item>
                  <el-form-item label="秒杀延迟支付时间" prop="seckillDelayTime">
            <el-input v-model="queryParams.seckillDelayTime" placehold clearable size="small" @keyup.enter="handleQuery" />
          </el-form-item>
                  <el-form-item label="创建者" prop="createBy">
            <el-input v-model="queryParams.createBy" placehold clearable size="small" @keyup.enter="handleQuery" />
          </el-form-item>
                  <el-form-item label="创建时间" prop="createTime">
            <el-input v-model="queryParams.createTime" placehold clearable size="small" @keyup.enter="handleQuery" />
          </el-form-item>
                  <el-form-item label="更新者" prop="updateBy">
            <el-input v-model="queryParams.updateBy" placehold clearable size="small" @keyup.enter="handleQuery" />
          </el-form-item>
                  <el-form-item label="更新时间" prop="updateTime">
            <el-input v-model="queryParams.updateTime" placehold clearable size="small" @keyup.enter="handleQuery" />
          </el-form-item>
                  <!-- 数据筛选操作按钮 -->
          <el-form-item>
            <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
            <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
          </el-form-item>
        </el-form>
        <el-row :gutter="10" class="mb8">
          <el-col :span="3">
            <el-button type="primary" icon="el-icon-plus" size="small" @click="handleAdd">新增
            </el-button>
          </el-col>
        </el-row>
        
        <!-- 数据表格 -->
        <el-table v-loading="loading" :data="seckillEventList">
          <!-- 数据表格列 -->
              <el-table-column label="秒杀id" align="center" prop="seckillId" />
                  <el-table-column label="秒杀名称" align="center" prop="seckillName" />
                  <el-table-column label="商品id" align="center" prop="itemId" />
                  <el-table-column label="秒杀价格" align="center" prop="seckillPrice" />
                  <el-table-column label="秒杀库存数" align="center" prop="seckillStock" />
                  <el-table-column label="秒杀积分" align="center" prop="seckillPoints" />
                  <el-table-column label="秒杀开始时间" align="center" prop="seckillStartTime" />
                  <el-table-column label="秒杀结束时间" align="center" prop="seckillEndTime" />
                  <el-table-column label="秒杀状态" align="center" prop="seckillStatus" />
                  <el-table-column label="秒杀是否可以重复" align="center" prop="seckillRepeatability" />
                  <el-table-column label="单个顾客秒杀限购数量" align="center" prop="seckillLimitCustomer" />
                  <el-table-column label="单个ip秒杀限购数量" align="center" prop="seckillLimitIp" />
                  <el-table-column label="单笔订单限购数量" align="center" prop="seckillLimitSale" />
                  <el-table-column label="秒杀延迟支付时间" align="center" prop="seckillDelayTime" />
                  <el-table-column label="创建者" align="center" prop="createBy" />
                  <el-table-column label="创建时间" align="center" prop="createTime" />
                  <el-table-column label="更新者" align="center" prop="updateBy" />
                  <el-table-column label="更新时间" align="center" prop="updateTime" />
                  <!-- 数据行操作按钮 -->
          <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
            <template v-slot="scope">
              <el-button size="small" type="text" icon="el-icon-edit" @click="handleUpdate(scope.row)">修改</el-button>
              <el-button size="small" type="text" icon="el-icon-delete" @click="handleDelete(scope.row)">删除</el-button>
            </template>
          </el-table-column>
        </el-table>
        <!-- 数据分页加载 -->
        <el-pagination
          :current-page="pageNum"
          :page-sizes="[5, 10, 50, 100]"
          :page-size="pageSize"
          layout="total, sizes, prev, pager, next, jumper"
          :total="total"
          @size-change="handleSizeChange"
          @current-change="handleCurrentChange"
          @pagination="getList"
        />
      </el-col>
    </el-row>
    <!-- 添加修改seckillEvent对话框 -->
    <el-dialog :title="title" v-model="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="120px">
        <!-- 数据编辑表单组件 -->
            <el-form-item label="秒杀名称" prop="seckillName">
          <el-input v-model="form.seckillName" placeholder="请输入秒杀名称" />
        </el-form-item>
                <el-form-item label="商品id" prop="itemId">
          <el-input v-model="form.itemId" placeholder="请输入商品id" />
        </el-form-item>
                <el-form-item label="秒杀价格" prop="seckillPrice">
          <el-input v-model="form.seckillPrice" placeholder="请输入秒杀价格" />
        </el-form-item>
                <el-form-item label="秒杀库存数" prop="seckillStock">
          <el-input v-model="form.seckillStock" placeholder="请输入秒杀库存数" />
        </el-form-item>
                <el-form-item label="秒杀积分" prop="seckillPoints">
          <el-input v-model="form.seckillPoints" placeholder="请输入秒杀积分" />
        </el-form-item>
                <el-form-item label="秒杀开始时间" prop="seckillStartTime">
          <el-input v-model="form.seckillStartTime" placeholder="请输入秒杀开始时间" />
        </el-form-item>
                <el-form-item label="秒杀结束时间" prop="seckillEndTime">
          <el-input v-model="form.seckillEndTime" placeholder="请输入秒杀结束时间" />
        </el-form-item>
                <el-form-item label="秒杀状态" prop="seckillStatus">
          <el-input v-model="form.seckillStatus" placeholder="请输入秒杀状态" />
        </el-form-item>
                <el-form-item label="秒杀是否可以重复" prop="seckillRepeatability">
          <el-input v-model="form.seckillRepeatability" placeholder="请输入秒杀是否可以重复" />
        </el-form-item>
                <el-form-item label="单个顾客秒杀限购数量" prop="seckillLimitCustomer">
          <el-input v-model="form.seckillLimitCustomer" placeholder="请输入单个顾客秒杀限购数量" />
        </el-form-item>
                <el-form-item label="单个ip秒杀限购数量" prop="seckillLimitIp">
          <el-input v-model="form.seckillLimitIp" placeholder="请输入单个ip秒杀限购数量" />
        </el-form-item>
                <el-form-item label="单笔订单限购数量" prop="seckillLimitSale">
          <el-input v-model="form.seckillLimitSale" placeholder="请输入单笔订单限购数量" />
        </el-form-item>
                <el-form-item label="秒杀延迟支付时间" prop="seckillDelayTime">
          <el-input v-model="form.seckillDelayTime" placeholder="请输入秒杀延迟支付时间" />
        </el-form-item>
                <el-form-item label="创建者" prop="createBy">
          <el-input v-model="form.createBy" placeholder="请输入创建者" />
        </el-form-item>
                <el-form-item label="创建时间" prop="createTime">
          <el-input v-model="form.createTime" placeholder="请输入创建时间" />
        </el-form-item>
                <el-form-item label="更新者" prop="updateBy">
          <el-input v-model="form.updateBy" placeholder="请输入更新者" />
        </el-form-item>
                <el-form-item label="更新时间" prop="updateTime">
          <el-input v-model="form.updateTime" placeholder="请输入更新时间" />
        </el-form-item>
              </el-form>
      <!-- 数据提交操作按钮 -->
      <template v-slot:footer>
        <div class="dialog-footer">
          <el-button type="primary" @click="submitForm">确 定</el-button>
          <el-button @click="cancel">取 消</el-button>
        </div>
      </template>
    </el-dialog>
  </div>
</template>

<script>
/** 导入axios Api */
import { listSeckillEventByPage, getSeckillEvent, addSeckillEvent, updateSeckillEvent, deleteSeckillEvent } from '@/api/seckill/event'
export default {
  name: 'SeckillEvent',
  data() {
    return {
      // 遮罩层
      loading: false,
      // 总条数
      total: 0,
      // 当前页
      pageNum: 0,
      // 每页数据量
      pageSize: 0,
      // SeckillEvent表格数据
      seckillEventList: [],
      // 弹出层标题
      title: '',
      // 是否显示弹出层
      open: false,
      // 数据查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 5,
        seckillId: null,
        seckillName: null,
        itemId: null,
        seckillPrice: null,
        seckillStock: null,
        seckillPoints: null,
        seckillStartTime: null,
        seckillEndTime: null,
        seckillStatus: null,
        seckillRepeatability: null,
        seckillLimitCustomer: null,
        seckillLimitIp: null,
        seckillLimitSale: null,
        seckillDelayTime: null,
        createBy: null,
        createTime: null,
        updateBy: null,
        updateTime: null,
        deleteFlag: null,
      },
      // 数据编辑表单
      form: {},
      // 表单数据校验规则
      rules: {
        seckillId: [
          { required: true, message: '秒杀id不能为空', trigger: 'blur' }
        ],
        seckillName: [
          { required: true, message: '秒杀名称不能为空', trigger: 'blur' }
        ],
        itemId: [
          { required: true, message: '商品id不能为空', trigger: 'blur' }
        ],
        seckillPrice: [
          { required: true, message: '秒杀价格不能为空', trigger: 'blur' }
        ],
        seckillStock: [
          { required: true, message: '秒杀库存数不能为空', trigger: 'blur' }
        ],
        seckillPoints: [
          { required: true, message: '秒杀积分不能为空', trigger: 'blur' }
        ],
        seckillStartTime: [
          { required: true, message: '秒杀开始时间不能为空', trigger: 'blur' }
        ],
        seckillEndTime: [
          { required: true, message: '秒杀结束时间不能为空', trigger: 'blur' }
        ],
        seckillStatus: [
          { required: true, message: '秒杀状态不能为空', trigger: 'blur' }
        ],
        seckillRepeatability: [
          { required: true, message: '秒杀是否可以重复不能为空', trigger: 'blur' }
        ],
        seckillLimitCustomer: [
          { required: true, message: '单个顾客秒杀限购数量不能为空', trigger: 'blur' }
        ],
        seckillLimitIp: [
          { required: true, message: '单个ip秒杀限购数量不能为空', trigger: 'blur' }
        ],
        seckillLimitSale: [
          { required: true, message: '单笔订单限购数量不能为空', trigger: 'blur' }
        ],
        seckillDelayTime: [
          { required: true, message: '秒杀延迟支付时间不能为空', trigger: 'blur' }
        ],
        createBy: [
          { required: true, message: '创建者不能为空', trigger: 'blur' }
        ],
        createTime: [
          { required: true, message: '创建时间不能为空', trigger: 'blur' }
        ],
        updateBy: [
          { required: true, message: '更新者不能为空', trigger: 'blur' }
        ],
        updateTime: [
          { required: true, message: '更新时间不能为空', trigger: 'blur' }
        ],
        deleteFlag: [
          { required: true, message: '逻辑删除（0正常，1停用）不能为空', trigger: 'blur' }
        ],
      }
    }
  },
  created() {
    this.getList()
  },
  methods: {
    /** 查询SeckillEvent数据列表 */
    getList() {
      this.loading = true
      listSeckillEventByPage(this.queryParams).then((response) => {
        this.seckillEventList = response.data.list
        this.total = response.data.total
        this.loading = false
      })
    },
    /** 处理分页 */
    handleSizeChange(val) {
      this.queryParams.pageSize = val
      this.getList()
    },
    handleCurrentChange(val) {
      this.queryParams.pageNum = val
      this.getList()
    },

    /** 数据编辑对话框取消按钮 */
    cancel() {
      this.open = false
      this.resetForm()
    },

    /** 数据编辑表单清空 */
    resetForm() {
      this.form = {
        seckillId: null,
        seckillName: null,
        itemId: null,
        seckillPrice: null,
        seckillStock: null,
        seckillPoints: null,
        seckillStartTime: null,
        seckillEndTime: null,
        seckillStatus: null,
        seckillRepeatability: null,
        seckillLimitCustomer: null,
        seckillLimitIp: null,
        seckillLimitSale: null,
        seckillDelayTime: null,
        createBy: null,
        createTime: null,
        updateBy: null,
        updateTime: null,
        deleteFlag: null,
      }
    },
    
    /** 重置分页 */
    resetQueryParams() {
      this.queryParams.pageNum = 1
      this.queryParams.pageSize = 5
    },

    /** 数据筛选搜索按钮 */
    handleQuery() {
      this.resetQueryParams()
      this.getList()
      this.$message.success('查询成功')
    },

    /** 数据筛选重置按钮 */
    resetQuery() {
      this.$refs.queryForm.resetFields()
      this.getList()
    },

    /** 新增按钮操作 */
    handleAdd() {
      this.resetForm()
      this.open = true
      this.title = '添加SeckillEvent'
    },

    /** 修改按钮操作 */
    handleUpdate(row) {
      this.resetForm()
      getSeckillEvent(row.seckillId).then((response) => {
        this.form = response.data
        this.open = true
        this.title = '修改SeckillEvent'
      })
    },

    /** 数据提交按钮 */
    submitForm: function() {
      this.$refs['form'].validate((valid) => {
        if (valid) {
          if (this.form.seckillId !== null) {
            updateSeckillEvent(this.form).then((response) => {
              this.open = false
              this.title = ''
              this.getList()
              this.$message.success(response.data)
            })
          } else {
            addSeckillEvent(this.form).then((response) => {
              this.open = false
              this.title = ''
              this.getList()
              this.$message.success(response.data)
            })
          }
        }
      })
    },
    
    /** 删除按钮操作 */
    handleDelete(row) {
      this.$confirm('是否确认删除ID为"' + row.seckillId + '"的数据项?', '警告', {
          confirmButtonText: '确定', cancelButtonText: '取消', type: 'warning'
        })
        .then(function() {
          return deleteSeckillEvent(row.seckillId)
        })
        .then(() => {
          this.getList()
          this.$message.success('删除成功')
        })
        .catch(() => {})
    }
  }
}
</script>
