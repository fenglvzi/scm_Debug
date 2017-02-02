package cn.zhyw.scm.dao;

import cn.zhyw.scm.entity.Dept;
import org.springframework.stereotype.Repository;


public interface DeptMapper {
    public Dept selectDept(Integer id);

    public int insertDept(Dept dept);
}