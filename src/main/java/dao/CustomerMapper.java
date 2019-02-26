package dao;

import pojo.Customer;
import pojo.QueryVo;

import java.util.List;

public interface CustomerMapper {

    List<Customer> findCustomerByVo(QueryVo vo);

    Integer findCustomerByVoCount(QueryVo vo);

    Customer findCustomerById(Long id);


    void updateCustomerById(Customer customer);

    void delCustomerById(Long id);
}
