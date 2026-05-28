package cn.edu.nchu.a23207323_code2.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import cn.edu.nchu.a23207323_code2.dao.CourseDao;
import cn.edu.nchu.a23207323_code2.dao.LibrarySeatDao;
import cn.edu.nchu.a23207323_code2.dao.UserDao;
import cn.edu.nchu.a23207323_code2.entity.Course;
import cn.edu.nchu.a23207323_code2.entity.LibrarySeat;
import cn.edu.nchu.a23207323_code2.entity.User;

@Database(entities = {Course.class, User.class, LibrarySeat.class}, version = 1)
public abstract class CampusDatabase extends RoomDatabase {
    public abstract CourseDao courseDao();
    public abstract UserDao userDao();
    public abstract LibrarySeatDao librarySeatDao();
}