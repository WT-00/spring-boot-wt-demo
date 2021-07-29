package com.wt.mapper;


import com.wt.bean.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;




public interface GuestMapper {

    @Select("select * from guest")
    List<Guest> getGuest();
}
