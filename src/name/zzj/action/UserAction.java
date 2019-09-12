package name.zzj.action;

import com.opensymphony.xwork2.ActionSupport;
import name.zzj.service.UserService;

public class UserAction extends ActionSupport {

    private UserService userService;
//    @Override
//    public String execute() throws Exception{
//        userService.addUser();
//        userService.queryUser();
//        return SUCCESS;
//    }

    public String add() throws Exception{
        userService.addUser();
        return SUCCESS;
    }

    public String query() throws Exception{
        userService.queryUser();
        return SUCCESS;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
