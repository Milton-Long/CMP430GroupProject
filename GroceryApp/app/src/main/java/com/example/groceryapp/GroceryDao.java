package com.example.groceryapp;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface GroceryDao {
    @Insert
    void insert(GroceryItem item);

    void update();

    @Query("SELECT * from groceryItem_table ORDER BY Item_Name ASC")
    LiveData<List<GroceryItem>> getAllItems();

    @Query("DELETE FROM groceryItem_table")
    void deleteAll();
}
