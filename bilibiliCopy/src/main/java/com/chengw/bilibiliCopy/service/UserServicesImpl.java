package com.bilibili.main.service;

import com.bilibili.main.dao.UserMapper;
import com.bilibili.main.model.User;
import com.bilibili.main.model.UserExample;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServicesImpl implements UserServices {
    @Resource
    private UserMapper userMapper;

    @Override
    public int countByExample(UserExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(UserExample example) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public List<User> selectByExampleWithBLOBs(UserExample example) {
        return null;
    }

    @Override
    public List<User> selectByExample(UserExample example) {

        return userMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(User record, UserExample example) {
        return userMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExampleWithBLOBs(User record, UserExample example) {
        return userMapper.updateByExampleWithBLOBs(record,example);
    }

    @Override
    public int updateByExample(User record, UserExample example) {
        return userMapper.updateByExample(record,example);
    }
}
