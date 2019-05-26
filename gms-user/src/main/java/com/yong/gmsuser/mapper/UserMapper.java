package com.yong.gmsuser.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yong.gmsuser.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: YUY
 * @date: 2019/5/26 16:28
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
