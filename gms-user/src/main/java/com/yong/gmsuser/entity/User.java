package com.yong.gmsuser.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: YUY
 * @date: 2019/5/26 16:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private Long id;
    private Integer sex;
    private String userName;
    private String password;
    private String mobile;
    private String email;
    private String userPic;
    private Integer status;
}
