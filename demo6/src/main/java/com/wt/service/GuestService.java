package com.wt.service;


import com.wt.bean.Guest;


import java.util.List;


public interface GuestService {

    List<Guest> list();

    void add(Guest guest);

    void update(Guest guest);

    Guest get(String name);

    void delete(String name);
}
