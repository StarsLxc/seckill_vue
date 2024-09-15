import { parseStrEmpty } from "@/utils/ruoyi";

import request from '@/utils/request'

// 查询seckillPayment列表
export function listSeckillPayment(query) {
  return request({
    url: '/seckillPayment/list',
    method: 'get',
    params: query
  })
}

// 分页查询seckillPayment列表
export function listSeckillPaymentByPage(query) {
  return request({
    url: '/seckillPayment/page',
    method: 'get',
    params: query
  })
}

// 查询seckillPayment
export function getSeckillPayment(id) {
  return request({
    url: '/seckillPayment/' + parseStrEmpty(id),
    method: 'get'
  })
}

// 新增seckillPayment
export function addSeckillPayment(data) {
  return request({
    url: '/seckillPayment',
    method: 'post',
    data: data
  })
}

// 修改seckillPayment
export function updateSeckillPayment(data) {
  return request({
    url: '/seckillPayment',
    method: 'put',
    data: data
  })
}

// 删除seckillPayment
export function deleteSeckillPayment(id) {
  return request({
    url: '/seckillPayment/delete/' + parseStrEmpty(id),
    method: 'delete'
  })
}
