package com.ctgu.ja.dao;

import com.ctgu.ja.vo.Manager;


public interface ManagerDao {
    Manager selectManager(String managerId);
}
