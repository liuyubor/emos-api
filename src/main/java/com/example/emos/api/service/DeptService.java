package com.example.emos.api.service;

import com.example.emos.api.common.util.PageUtils;
import com.example.emos.api.db.pojo.TbDept;

import java.util.ArrayList;
import java.util.HashMap;

public interface DeptService {
    ArrayList<HashMap> searchAllDept();

    PageUtils searchDeptByPage(HashMap param);

    HashMap searchById(int id);

    int insert(TbDept dept);

    int update(TbDept dept);

    int deleteDeptByIds(Integer[] ids);
}
