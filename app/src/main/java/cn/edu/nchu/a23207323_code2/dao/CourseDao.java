package cn.edu.nchu.a23207323_code2.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import cn.edu.nchu.a23207323_code2.entity.Course;

@Dao
public interface CourseDao {
    @Query("SELECT * FROM courses")
    List<Course> getAllCourses();

    @Query("SELECT * FROM courses WHERE dayOfWeek = :day")
    List<Course> getCoursesByDay(int day);

    @Insert
    void insertCourse(Course course);

    @Update
    void updateCourse(Course course);

    @Delete
    void deleteCourse(Course course);

    @Query("DELETE FROM courses")
    void deleteAllCourses();
}