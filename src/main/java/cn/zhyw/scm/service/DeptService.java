package cn.zhyw.scm.service;

import cn.zhyw.scm.entity.Dept;

/**
 * Created by 张译文 on 2017/1/31.
 */
public interface DeptService {
    public Dept selectDept(Integer id);

    public int insertDept(Dept dept);
}
