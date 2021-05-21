package com.ctgu.ja.service;

import com.ctgu.ja.vo.Customer;

import java.util.List;

public interface CustomerService {
    int addCustomer(Customer customer);
    List<Customer> selectCustomer();
}
