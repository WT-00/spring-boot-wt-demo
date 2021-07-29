package com.wt.service;

import com.wt.bean.Guest;
import com.wt.mapper.GuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl  implements GuestService{

    @Autowired
    private GuestMapper guestMapper;
    @Override
    public List<Guest> getGuest() {
        return guestMapper.getGuest();
    }
}
