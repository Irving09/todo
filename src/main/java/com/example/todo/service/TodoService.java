/**
 * CONFIDENTIAL INFORMATION
 *
 * All Rights Reserved.  Unauthorized reproduction, transmission, or
 * distribution of this software is a violation of applicable laws.
 *
 * Date: Mar 11, 2018
 * Copyright 2018 innoirvinge@gmail.com
 */
package com.example.todo.service;

import org.springframework.stereotype.Service;
import com.example.todo.model.Todo;

/**
 * @author irving09 <innoirvinge@gmail.com>
 */
@Service
public class TodoService {

  public Todo getTodo(final long todoId) {
    return Todo.builder()
        .message("hello world")
        .build();
  }

}
