import { parseStrEmpty } from "@/utils/ruoyi";

import request from '@/utils/request'

// 查询seckillRefund列表
export function listSeckillRefund(query) {
  return request({
    url: '/seckillRefund/list',
    method: 'get',
    params: query
  })
}

// 分页查询seckillRefund列表
export function listSeckillRefundByPage(query) {
  return request({
    url: '/seckillRefund/page',
    method: 'get',
    params: query
  })
}

// 查询seckillRefund
export function getSeckillRefund(id) {
  return request({
    url: '/seckillRefund/' + parseStrEmpty(id),
    method: 'get'
  })
}

// 新增seckillRefund
export function addSeckillRefund(data) {
  return request({
    url: '/seckillRefund',
    method: 'post',
    data: data
  })
}

// 修改seckillRefund
export function updateSeckillRefund(data) {
  return request({
    url: '/seckillRefund',
    method: 'put',
    data: data
  })
}

// 删除seckillRefund
export function deleteSeckillRefund(id) {
  return request({
    url: '/seckillRefund/delete/' + parseStrEmpty(id),
    method: 'delete'
  })
}
