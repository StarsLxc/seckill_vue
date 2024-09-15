import { parseStrEmpty } from "@/utils/ruoyi";

import request from '@/utils/request'

// 查询seckillEvent列表
export function listSeckillEvent(query) {
  return request({
    url: '/seckillEvent/list',
    method: 'get',
    params: query
  })
}

// 分页查询seckillEvent列表
export function listSeckillEventByPage(query) {
  return request({
    url: '/seckillEvent/page',
    method: 'get',
    params: query
  })
}

// 查询seckillEvent
export function getSeckillEvent(id) {
  return request({
    url: '/seckillEvent/' + parseStrEmpty(id),
    method: 'get'
  })
}

// 新增seckillEvent
export function addSeckillEvent(data) {
  return request({
    url: '/seckillEvent',
    method: 'post',
    data: data
  })
}

// 修改seckillEvent
export function updateSeckillEvent(data) {
  return request({
    url: '/seckillEvent',
    method: 'put',
    data: data
  })
}

// 删除seckillEvent
export function deleteSeckillEvent(id) {
  return request({
    url: '/seckillEvent/delete/' + parseStrEmpty(id),
    method: 'delete'
  })
}
