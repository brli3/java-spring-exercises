package com.brli.dao;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface LogDao {
    @Insert("insert into tbl_log (info, createdAt) values(#{info}, now())")
    void log(String info);
}
