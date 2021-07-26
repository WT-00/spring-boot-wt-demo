package com.wt.dao;

import com.wt.bean.Guest;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDao {

    static List<Guest> guestList = new ArrayList<>();

    static {
        guestList.add(new Guest("黄晓明 ","店长 "));
        guestList.add(new Guest("情海璐","财务"));
        guestList.add(new Guest("刘珊珊","总监"));
        guestList.add(new Guest("张一山","经理"));
        guestList.add(new Guest("杨紫","前台"));
    }

    public List<Guest> list(){
        return guestList;
    }

    public void add(Guest guest){
        guestList.add(guest);
    }


    public void update(Guest newGuest){
        Guest oldGuest=get(newGuest.getName());
        oldGuest.setRole(newGuest.getRole());
    }

    public Guest get(String name){
        for(Guest guest:guestList){
            if(guest.getName().equals(name)){
                return guest;
            }
        }
        return new Guest();
    }
}
