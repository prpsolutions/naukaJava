package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();


    public Forum() {
        for(int i = 0; i < 50 ; i ++) {
            forumUsersList.add(new ForumUser());
        }

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsersList);
    }

}
