package me.andrew.springmydefaultsetting.common.repository.mybatis;

import me.andrew.springmydefaultsetting.common.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserDAO {

    SqlSession sqlSession;

    public List<User> findUserByEmail(String email){
        return sqlSession.selectList("UserMapper.findUserByEmail",email);
    }
}
