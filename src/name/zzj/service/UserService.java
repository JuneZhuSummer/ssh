package name.zzj.service;

import name.zzj.dao.UserDao;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void addUser(){
        userDao.addUser();
    }

    public void queryUser(){
        userDao.queryUser();
    }
}
