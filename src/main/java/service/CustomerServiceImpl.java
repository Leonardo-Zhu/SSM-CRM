package service;

import dao.CustomerMapper;
import dao.DictMapper;
import org.springframework.stereotype.Service;
import pojo.BaseDict;
import pojo.Customer;
import pojo.QueryVo;

import javax.annotation.Resource;
import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private DictMapper dictMapper;

    @Resource
    private CustomerMapper customerMapper;

    @Override
    public List<BaseDict> findDictByCode(String code) {
        List<BaseDict> dictByCode = dictMapper.findDictByCode(code);
        System.out.println(dictByCode);
        return dictByCode;
    }

    @Override
    public List<Customer> findCustomerByVo(QueryVo vo) {
        return customerMapper.findCustomerByVo(vo);
    }

    @Override
    public Integer findCustomerByVoCount(QueryVo vo) {
        return customerMapper.findCustomerByVoCount(vo);
    }

    @Override
    public Customer findCustomerById(Long id) {
        return customerMapper.findCustomerById(id);
    }

    @Override
    public void updateCustomerById(Customer customer) {
        customerMapper.updateCustomerById(customer);
    }

    @Override
    public void delCustomerById(Long id) {
        customerMapper.delCustomerById(id);
    }
}
