package com.gmail.acharne.bookstore.dao.impl;

import com.gmail.acharne.bookstore.dao.BookDao;
import com.gmail.acharne.bookstore.entitys.Book;

public class BookDaoImpl extends AbstractDaoImpl<Book> implements BookDao {

    protected BookDaoImpl(Class clazz) {
        super(clazz);
    }
}