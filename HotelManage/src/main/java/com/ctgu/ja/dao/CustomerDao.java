package com.ctgu.ja.dao;

import com.ctgu.ja.vo.Customer;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface CustomerDao {
    int insertCustomer(Customer customer);
    List<Customer> selectCustomers();
    Customer findCustomerByID(String identityId);
}
