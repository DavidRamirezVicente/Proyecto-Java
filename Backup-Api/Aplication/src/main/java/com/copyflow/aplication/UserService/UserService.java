package com.copyflow.aplication.UserService;

import java.util.List;

import com.copyflow.aplication.model.User;

public interface UserService {
int save (User users);
int update (User users, int id);
int delete(int id);
List<User>getAll();
List<User>getPreguntas();
User getById(int id);
}
