package com.ctgu.ja.service.impl;

import com.ctgu.ja.dao.ManagerDao;
import com.ctgu.ja.service.ManagerService;
import com.ctgu.ja.vo.Manager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class ManagerServiceImpl implements ManagerService {
    @Resource
    private ManagerDao managerDao;

    @Override
    public Manager findManagerById(String managerId) {
        Manager manager = managerDao.selectManager(managerId);
        if(manager == null) return null;
        return manager;
    }
}
