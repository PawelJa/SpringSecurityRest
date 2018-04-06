package pl.springsecurityrest.dao;

import pl.springsecurityrest.entity.UserInfo;

public interface IUserInfoDao {

    UserInfo getActiveUser(String userName);
}
