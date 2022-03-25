package com.scc.icad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scc.icad.dao.IcadDao;
import com.scc.icad.domain.Dog;
import com.scc.icad.service.IcadService;

@Service
public class IcadServiceImpl implements IcadService {

    @Autowired
    IcadDao icadDao;

    @Override
    public Dog getIcadDogByToken(String token) {
        return icadDao.getIcadDogByToken(token);
    }
}
