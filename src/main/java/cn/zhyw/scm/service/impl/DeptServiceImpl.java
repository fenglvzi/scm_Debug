package cn.zhyw.scm.service.impl;

import cn.zhyw.scm.dao.DeptMapper;
import cn.zhyw.scm.entity.Dept;
import cn.zhyw.scm.service.DeptService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 张译文 on 2017/1/31.
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptMapper deptMapper;
    public Dept selectDept(Integer id) {
        Dept dept = deptMapper.selectDept(id);
        return dept;
    }

    public int insertDept(Dept dept) {
        deptMapper.insertDept(dept);
        return 0;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        DeptService deptService = (DeptService) applicationContext.getBean("deptService");
        Dept dept = deptService.selectDept(1);
        System.out.println(dept);
    }
}
