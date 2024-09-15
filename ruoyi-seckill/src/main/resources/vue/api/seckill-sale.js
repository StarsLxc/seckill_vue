import { parseStrEmpty } from "@/utils/ruoyi";

import request from '@/utils/request'

// 查询seckillSale列表
export function listSeckillSale(query) {
  return request({
    url: '/seckillSale/list',
    method: 'get',
    params: query
  })
}

// 分页查询seckillSale列表
export function listSeckillSaleByPage(query) {
  return request({
    url: '/seckillSale/page',
    method: 'get',
    params: query
  })
}

// 查询seckillSale
export function getSeckillSale(id) {
  return request({
    url: '/seckillSale/' + parseStrEmpty(id),
    method: 'get'
  })
}

// 新增seckillSale
export function addSeckillSale(data) {
  return request({
    url: '/seckillSale',
    method: 'post',
    data: data
  })
}

// 修改seckillSale
export function updateSeckillSale(data) {
  return request({
    url: '/seckillSale',
    method: 'put',
    data: data
  })
}

// 删除seckillSale
export function deleteSeckillSale(id) {
  return request({
    url: '/seckillSale/delete/' + parseStrEmpty(id),
    method: 'delete'
  })
}
