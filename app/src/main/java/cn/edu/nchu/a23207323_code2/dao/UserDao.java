package cn.edu.nchu.a23207323_code2.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import cn.edu.nchu.a23207323_code2.entity.User;

@Dao
public interface UserDao {
    @Query("SELECT * FROM users LIMIT 1")
    User getUser();

    @Insert
    void insertUser(User user);

    @Update
    void updateUser(User user);

    @Delete
    void deleteUser(User user);
}