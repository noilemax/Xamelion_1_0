package com.javarush.test.level36.lesson04.big01.model;

import com.javarush.test.level36.lesson04.big01.bean.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 04.01.2016.
 */
public class ModelData
{
    private List<User> users = new ArrayList<>();
    private User activeUser;
    private boolean displayDeletedUserList;

    public boolean isDisplayDeletedUserList()
    {
        return displayDeletedUserList;
    }

    public void setDisplayDeletedUserList(boolean displayDeletedUserList)
    {
        this.displayDeletedUserList = displayDeletedUserList;
    }

    public User getActiveUser()
    {
        return activeUser;
    }

    public void setActiveUser(User activeUser)
    {
        this.activeUser = activeUser;
    }

    public List<User> getUsers()
    {
        return users;
    }

    public void setUsers(List<User> users)
    {
        this.users = users;
    }

}
