package com.jiadx.study.mapper;

import com.jiadx.study.po.ItemsCustom;
import com.jiadx.study.po.ItemsQueryVo;

import java.util.List;

public interface ItemsMapperCustom {
    //商品查询列表
    List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}
