package me.andrew.springmydefaultsetting.common.repository.mapper;

import me.andrew.springmydefaultsetting.common.domain.UserDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from users")
    List<UserDomain> findAll();
}
