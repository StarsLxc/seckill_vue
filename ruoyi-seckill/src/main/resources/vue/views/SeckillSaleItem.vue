<template>
  <div class="app-container">
    <el-row :gutter="10">
      <el-col :span="24" :xs="24">
        <!-- 数据筛选表单 -->
        <el-form ref="queryForm" :model="queryParams" :inline="true" label-width="100px">
          <!-- 数据筛选表单组件 -->
              <el-form-item label="产品id" prop="itemId">
            <el-input v-model="queryParams.itemId" placehold clearable size="small" @keyup.enter="handleQuery" />
          </el-form-item>
                  <el-form-item label="产品单价" prop="saleItemPrice">
            <el-input v-model="queryParams.saleItemPrice" placehold clearable size="small" @keyup.enter="handleQuery" />
          </el-form-item>
                  <el-form-item label="秒杀数量" prop="saleItemQuantity">
            <el-input v-model="queryParams.saleItemQuantity" placehold clearable size="small" @keyup.enter="handleQuery" />
          </el-form-item>
                  <el-form-item label="订单明细状态" prop="saleItemStatus">
            <el-input v-model="queryParams.saleItemStatus" placehold clearable size="small" @keyup.enter="handleQuery" />
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
        <el-table v-loading="loading" :data="seckillSaleItemList">
          <!-- 数据表格列 -->
              <el-table-column label="订单明细id" align="center" prop="saleItemId" />
                  <el-table-column label="产品id" align="center" prop="itemId" />
                  <el-table-column label="产品单价" align="center" prop="saleItemPrice" />
                  <el-table-column label="秒杀数量" align="center" prop="saleItemQuantity" />
                  <el-table-column label="订单明细状态" align="center" prop="saleItemStatus" />
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
    <!-- 添加修改seckillSaleItem对话框 -->
    <el-dialog :title="title" v-model="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="120px">
        <!-- 数据编辑表单组件 -->
            <el-form-item label="产品id" prop="itemId">
          <el-input v-model="form.itemId" placeholder="请输入产品id" />
        </el-form-item>
                <el-form-item label="产品单价" prop="saleItemPrice">
          <el-input v-model="form.saleItemPrice" placeholder="请输入产品单价" />
        </el-form-item>
                <el-form-item label="秒杀数量" prop="saleItemQuantity">
          <el-input v-model="form.saleItemQuantity" placeholder="请输入秒杀数量" />
        </el-form-item>
                <el-form-item label="订单明细状态" prop="saleItemStatus">
          <el-input v-model="form.saleItemStatus" placeholder="请输入订单明细状态" />
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
import { listSeckillSaleItemByPage, getSeckillSaleItem, addSeckillSaleItem, updateSeckillSaleItem, deleteSeckillSaleItem } from '@/api/seckill/sale/item'
export default {
  name: 'SeckillSaleItem',
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
      // SeckillSaleItem表格数据
      seckillSaleItemList: [],
      // 弹出层标题
      title: '',
      // 是否显示弹出层
      open: false,
      // 数据查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 5,
        saleItemId: null,
        itemId: null,
        saleItemPrice: null,
        saleItemQuantity: null,
        saleItemStatus: null,
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
        saleItemId: [
          { required: true, message: '订单明细id不能为空', trigger: 'blur' }
        ],
        itemId: [
          { required: true, message: '产品id不能为空', trigger: 'blur' }
        ],
        saleItemPrice: [
          { required: true, message: '产品单价不能为空', trigger: 'blur' }
        ],
        saleItemQuantity: [
          { required: true, message: '秒杀数量不能为空', trigger: 'blur' }
        ],
        saleItemStatus: [
          { required: true, message: '订单明细状态不能为空', trigger: 'blur' }
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
    /** 查询SeckillSaleItem数据列表 */
    getList() {
      this.loading = true
      listSeckillSaleItemByPage(this.queryParams).then((response) => {
        this.seckillSaleItemList = response.data.list
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
        saleItemId: null,
        itemId: null,
        saleItemPrice: null,
        saleItemQuantity: null,
        saleItemStatus: null,
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
      this.title = '添加SeckillSaleItem'
    },

    /** 修改按钮操作 */
    handleUpdate(row) {
      this.resetForm()
      getSeckillSaleItem(row.saleItemId).then((response) => {
        this.form = response.data
        this.open = true
        this.title = '修改SeckillSaleItem'
      })
    },

    /** 数据提交按钮 */
    submitForm: function() {
      this.$refs['form'].validate((valid) => {
        if (valid) {
          if (this.form.saleItemId !== null) {
            updateSeckillSaleItem(this.form).then((response) => {
              this.open = false
              this.title = ''
              this.getList()
              this.$message.success(response.data)
            })
          } else {
            addSeckillSaleItem(this.form).then((response) => {
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
      this.$confirm('是否确认删除ID为"' + row.saleItemId + '"的数据项?', '警告', {
          confirmButtonText: '确定', cancelButtonText: '取消', type: 'warning'
        })
        .then(function() {
          return deleteSeckillSaleItem(row.saleItemId)
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
