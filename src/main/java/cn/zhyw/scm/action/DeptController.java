package cn.zhyw.scm.action;

import cn.zhyw.scm.entity.Dept;
import cn.zhyw.scm.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 张译文 on 2017/2/1.
 */
@Controller
@RequestMapping("/dept")
public class DeptController {
    @Resource
    private DeptService deptService;
    @RequestMapping("/success.action")
    public String showTest(Model model,HttpServletRequest request) {
        Integer deptId = Integer.valueOf(request.getParameter("deptId"));
        System.out.println("前面传来的id是"+deptId);
        Dept dept = deptService.selectDept(deptId);
        model.addAttribute("dept",dept);
        return "success";
    }
}
