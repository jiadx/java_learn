package com.jiadx.study.service;

import com.jiadx.study.po.ItemsCustom;
import com.jiadx.study.po.ItemsQueryVo;

import java.util.List;

public interface ItemsService {
    //商品查询列表
    List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}
