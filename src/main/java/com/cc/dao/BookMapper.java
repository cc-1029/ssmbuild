package com.cc.dao;

import com.cc.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author caichengjie
 * @date 2020/7/16
 */

public interface BookMapper {
    //增加一本书
    int insertBook(Books books);
    //删除一本书
    int deleteBookById(@Param("bookID") int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(@Param("bookID") int id);
    //查询全部的书
    List<Books> queryAllBooks();

}
