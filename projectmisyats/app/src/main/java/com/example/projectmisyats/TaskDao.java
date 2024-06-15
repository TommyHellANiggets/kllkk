package com.example.projectmisyats;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface TaskDao {
    @Insert
    void insert(Task task);

    @Update
    void update(Task task);

    @Delete
    void delete(Task task);

    @Query("DELETE FROM task_table")
    void deleteAllTasks();

    @Query("SELECT * FROM task_table ORDER BY reminderTime ASC")
    LiveData<List<Task>> getAllTasks();

    @Query("SELECT * FROM task_table WHERE isCompleted = 0 ORDER BY reminderTime ASC")
    LiveData<List<Task>> getIncompleteTasks();

    @Query("SELECT * FROM task_table WHERE isCompleted = 1 ORDER BY reminderTime ASC")
    LiveData<List<Task>> getCompletedTasks();
}
