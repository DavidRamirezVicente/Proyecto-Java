<<<<<<< HEAD
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
=======
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
>>>>>>> 925f4c70726023cb696e53329c9b6c8ad9eac77d
