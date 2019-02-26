package service;

import pojo.BaseDict;
import pojo.Customer;
import pojo.QueryVo;

import java.util.List;

public interface CustomerService {

    List<BaseDict> findDictByCode(String code);

    List<Customer> findCustomerByVo(QueryVo vo);

    Integer findCustomerByVoCount(QueryVo vo);

    Customer findCustomerById(Long id);

    void updateCustomerById(Customer customer);

    void delCustomerById(Long id);

}
