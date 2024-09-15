import { parseStrEmpty } from "@/utils/ruoyi";

import request from '@/utils/request'

// 查询seckillItem列表
export function listSeckillItem(query) {
  return request({
    url: '/seckillItem/list',
    method: 'get',
    params: query
  })
}

// 分页查询seckillItem列表
export function listSeckillItemByPage(query) {
  return request({
    url: '/seckillItem/page',
    method: 'get',
    params: query
  })
}

// 查询seckillItem
export function getSeckillItem(id) {
  return request({
    url: '/seckillItem/' + parseStrEmpty(id),
    method: 'get'
  })
}

// 新增seckillItem
export function addSeckillItem(data) {
  return request({
    url: '/seckillItem',
    method: 'post',
    data: data
  })
}

// 修改seckillItem
export function updateSeckillItem(data) {
  return request({
    url: '/seckillItem',
    method: 'put',
    data: data
  })
}

// 删除seckillItem
export function deleteSeckillItem(id) {
  return request({
    url: '/seckillItem/delete/' + parseStrEmpty(id),
    method: 'delete'
  })
}
