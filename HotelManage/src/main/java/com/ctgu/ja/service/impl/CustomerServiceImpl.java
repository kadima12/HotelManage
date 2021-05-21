package com.ctgu.ja.service.impl;

import com.ctgu.ja.dao.CustomerDao;
import com.ctgu.ja.service.CustomerService;
import com.ctgu.ja.vo.Customer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerDao customerDao;

    @Override
    public int addCustomer(Customer customer) {
        Customer cust = customerDao.findCustomerByID(customer.getIdentityId());
        if(cust!=null){
            return -1;
        }
        return customerDao.insertCustomer(customer);
    }

    @Override
    public List<Customer> selectCustomer() {
        return customerDao.selectCustomers();
    }
}
