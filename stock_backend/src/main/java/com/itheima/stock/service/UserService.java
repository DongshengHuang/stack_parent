package com.itheima.stock.service;

import com.itheima.stock.pojo.entity.SysUser;
import com.itheima.stock.vo.req.LoginReqVo;
import com.itheima.stock.vo.resp.LoginRespVo;
import com.itheima.stock.vo.resp.R;

/**
 * @Author: hds
 * @Date: 2024-08-09-11:23
 * @Version 1.0
 */
public interface UserService {
 /**
  * 根据用户名称查询用户信息
  * @param userName
  * @return
  */
  SysUser findByUserName(String userName);

 R<LoginRespVo> login(LoginReqVo vo);
}
