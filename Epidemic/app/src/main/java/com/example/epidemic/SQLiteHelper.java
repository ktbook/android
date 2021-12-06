package com.example.epidemic;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class SQLiteHelper extends SQLiteOpenHelper {
    private SQLiteDatabase sqLiteDatabase;
    public SQLiteHelper(Context context) {
        super(context,  DBUtils.DATABASE_NAME, null,DBUtils.DATABASE_VERION);
        sqLiteDatabase =this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        Log.e("sqlitebbb","333");
        sqLiteDatabase.execSQL("create table "+DBUtils.DATABASE_TABLE+"("+DBUtils.DATA_ID+
                " integer primary key autoincrement,"+ DBUtils.DATA_NAEM +
                " text," + DBUtils.DATA_PHONE+ " text,"+DBUtils.DATA_PASSWORD+ " text,"+
                DBUtils.DATA_FAVORITE+ " text,"+ DBUtils.DATA_SEX + " text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {



    }
    public List<User> query(){
        List<User> list=new ArrayList<User>();
        Cursor cursor=sqLiteDatabase.query(DBUtils.DATABASE_TABLE,null,null,null,
                null,null,DBUtils.DATA_ID);
        if (cursor!=null){
            while (cursor.moveToNext()){
                User user=new User();
                String name = cursor.getString(cursor.getColumnIndex
                        (DBUtils.DATA_NAEM ));
                String password = cursor.getString(cursor.getColumnIndex
                        (DBUtils.DATA_PASSWORD));
                String favorite = cursor.getString(cursor.getColumnIndex
                        (DBUtils.DATA_FAVORITE));
                String sex = cursor.getString(cursor.getColumnIndex
                        (DBUtils.DATA_SEX));
                user.setName(name);
                user.setPassword(password);
                user.setFavorite(favorite);
                user.setSex(sex);
                //character.setImage(image);
                list.add(user);
            }
            cursor.close();
        }
        return list;
    }
   //删除数据
    public boolean deleteDate(String name){
        String sql=DBUtils.DATA_NAEM+"=?";
        String[] contentValuesArray=new String[]{String.valueOf(name)};
        return
                sqLiteDatabase.delete(DBUtils.DATABASE_TABLE,sql,contentValuesArray)>0;

    }

    //更新数据
    public boolean updateData(String id,String name,String password){
        ContentValues contentValues=new ContentValues();
        contentValues.put(DBUtils.DATA_NAEM,name);
        contentValues.put(DBUtils.DATA_PASSWORD,password);
        String sql=DBUtils.DATA_ID+"=?";
        String[] strings=new String[]{id};
        return
                sqLiteDatabase.update(DBUtils.DATABASE_TABLE,contentValues,sql,strings)>0;
    }


    //添加数据
    public boolean insertData(String name,String phone,String password,String favorite,String sex){
        ContentValues contentValues=new ContentValues();
        contentValues.put(DBUtils.DATA_NAEM,name);
        contentValues.put(DBUtils.DATA_PHONE,phone);
        contentValues.put(DBUtils.DATA_PASSWORD,password);
        contentValues.put(DBUtils.DATA_FAVORITE,favorite);
        contentValues.put(DBUtils.DATA_SEX,sex);


        return
                sqLiteDatabase.insert(DBUtils.DATABASE_TABLE,null,contentValues)>0;
    }

    //查询特定数据
    public User find(String name){
        User user=new User();
        Cursor cursor =sqLiteDatabase.query("information",null,"name=?",new String[]{name+""},null,null,null);
        if(cursor.getCount()!=0){
            while (cursor.moveToNext()){
                String name1 =cursor.getString(cursor.getColumnIndex("name"));
                String password =cursor.getString(cursor.getColumnIndex("password"));
                String phone =cursor.getString(cursor.getColumnIndex("phone"));
                user.setName(name1);
                user.setPassword(password);
                user.setPhone(phone);

            }

        }
        cursor.close();
        sqLiteDatabase.close();
        return user;
    }

}
