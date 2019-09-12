package name.zzj.daoImpl;

import name.zzj.dao.UserDao;
import name.zzj.entity.User;
import org.hibernate.Criteria;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {

    private HibernateTemplate hibernateTemplate;
    @Override
    public void addUser() {
        User user = new User();
        user.setUname("张三");
        user.setPassword("123");
        hibernateTemplate.save(user);
    }

    @Override
    public void queryUser() {
        /**
         * 根据id查询
         */
//        User user = hibernateTemplate.get(User.class, 2);
//        System.out.println(user);

        /**
         * 查询所有
         */
        /*List<User> list = (List<User>) hibernateTemplate.find("from User");
        for(User user:list){
            System.out.println(user.getUid()+"-->"+user.getUname()+"-->"+user.getPassword());
        }*/

        /**
         * 条件查询
         */
        List<User> list1 = (List<User>) hibernateTemplate.find("from User where uid=1");
        for(User user:list1){
            System.out.println(user.getUid()+"-->"+user.getUname()+"-->"+user.getPassword());
        }
        List<User> list2 = (List<User>) hibernateTemplate.find("from User where uid=2");
        for(User user:list2){
            System.out.println(user.getUid()+"-->"+user.getUname()+"-->"+user.getPassword());
        }

        /**
         * 分页查询
         */

//        List<User> criteria = hibernateTemplate.findByCriteria(<criteria>, 2, 2);

    }

    @Override
    public void deleteUser() {

    }

    @Override
    public void updateUser() {

    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
