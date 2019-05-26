package com.yong.gmsuser.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yong.gmsuser.entity.User;
import com.yong.gmsuser.mapper.UserMapper;
import com.yong.gmsuser.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author: YUY
 * @date: 2019/5/26 16:29
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> implements IUserService {
}
