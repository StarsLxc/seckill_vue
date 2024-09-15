import { parseStrEmpty } from "@/utils/ruoyi";

import request from '@/utils/request'

// 查询seckillSaleItem列表
export function listSeckillSaleItem(query) {
  return request({
    url: '/seckillSaleItem/list',
    method: 'get',
    params: query
  })
}

// 分页查询seckillSaleItem列表
export function listSeckillSaleItemByPage(query) {
  return request({
    url: '/seckillSaleItem/page',
    method: 'get',
    params: query
  })
}

// 查询seckillSaleItem
export function getSeckillSaleItem(id) {
  return request({
    url: '/seckillSaleItem/' + parseStrEmpty(id),
    method: 'get'
  })
}

// 新增seckillSaleItem
export function addSeckillSaleItem(data) {
  return request({
    url: '/seckillSaleItem',
    method: 'post',
    data: data
  })
}

// 修改seckillSaleItem
export function updateSeckillSaleItem(data) {
  return request({
    url: '/seckillSaleItem',
    method: 'put',
    data: data
  })
}

// 删除seckillSaleItem
export function deleteSeckillSaleItem(id) {
  return request({
    url: '/seckillSaleItem/delete/' + parseStrEmpty(id),
    method: 'delete'
  })
}
