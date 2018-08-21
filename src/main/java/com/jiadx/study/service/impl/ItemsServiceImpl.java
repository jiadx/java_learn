package com.jiadx.study.service.impl;

import com.jiadx.study.mapper.ItemsMapperCustom;
import com.jiadx.study.po.ItemsCustom;
import com.jiadx.study.po.ItemsQueryVo;
import com.jiadx.study.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsMapperCustom itemsMapperCustom;

    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
        return itemsMapperCustom.findItemsList(itemsQueryVo);
    }
}
