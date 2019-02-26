package controller;

import cn.itcast.utils.Page;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.BaseDict;
import pojo.Customer;
import pojo.QueryVo;
import service.CustomerService;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Resource
    private CustomerService customerService;

    @Value("${customer.dict.source}")
    private String source;
    @Value("${customer.dict.industry}")
    private String industry;
    @Value("${customer.dict.level}")
    private String level;

    @RequestMapping("/list")
    public String findByVo(QueryVo vo,Model model){
        List<BaseDict> sourceList = customerService.findDictByCode(source);
        List<BaseDict> industryList = customerService.findDictByCode(industry);
        List<BaseDict> levelList = customerService.findDictByCode(level);

        vo.setStart((vo.getPage() -1 ) * vo.getSize());
        List<Customer> customerList = customerService.findCustomerByVo(vo);
        Integer count = customerService.findCustomerByVoCount(vo);

        if (vo.getPage() == null){
            vo.setPage(1);
        }

        Page<Customer> page = new Page<>();
        page.setTotal(count);         //数据总数
        page.setSize(vo.getSize());   //每页显示的数量
        page.setPage(vo.getPage());   //当前页数
        page.setRows(customerList);   //数据列表

        model.addAttribute("page",page);

        model.addAttribute("fromType",sourceList);
        model.addAttribute("industryType",industryList);
        model.addAttribute("levelType",levelList);


       //数据回显
        model.addAttribute("custName",vo.getCustName());
        model.addAttribute("custSource",vo.getCustSource());
        model.addAttribute("custIndustry",vo.getCustIndustry());
        model.addAttribute("custLevel",vo.getCustLevel());
        return "customer";
    }

    @RequestMapping("/detail")
    @ResponseBody
    public Customer detail(Long id){
        return customerService.findCustomerById(id);
    }

    @RequestMapping("/update")
    public String update(Customer customer){
        customerService.updateCustomerById(customer);
        return "customer";
    }

    @RequestMapping("/delete")
    public String delete(Long id){
        customerService.delCustomerById(id);
        return "customer";
    }

}
