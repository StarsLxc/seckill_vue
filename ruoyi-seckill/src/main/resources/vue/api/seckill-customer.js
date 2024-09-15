import { parseStrEmpty } from "@/utils/ruoyi";

import request from '@/utils/request'

// 查询seckillCustomer列表
export function listSeckillCustomer(query) {
  return request({
    url: '/seckillCustomer/list',
    method: 'get',
    params: query
  })
}

// 分页查询seckillCustomer列表
export function listSeckillCustomerByPage(query) {
  return request({
    url: '/seckillCustomer/page',
    method: 'get',
    params: query
  })
}

// 查询seckillCustomer
export function getSeckillCustomer(id) {
  return request({
    url: '/seckillCustomer/' + parseStrEmpty(id),
    method: 'get'
  })
}

// 新增seckillCustomer
export function addSeckillCustomer(data) {
  return request({
    url: '/seckillCustomer',
    method: 'post',
    data: data
  })
}

// 修改seckillCustomer
export function updateSeckillCustomer(data) {
  return request({
    url: '/seckillCustomer',
    method: 'put',
    data: data
  })
}

// 删除seckillCustomer
export function deleteSeckillCustomer(id) {
  return request({
    url: '/seckillCustomer/delete/' + parseStrEmpty(id),
    method: 'delete'
  })
}
