/**
 * CONFIDENTIAL INFORMATION
 *
 * All Rights Reserved.  Unauthorized reproduction, transmission, or
 * distribution of this software is a violation of applicable laws.
 *
 * Date: Mar 11, 2018
 * Copyright 2018 innoirvinge@gmail.com
 */
package com.example.todo.resource;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.todo.model.Todo;
import com.example.todo.service.TodoService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author irving09 <innoirvinge@gmail.com>
 */
@RestController
@RequestMapping(
    value = "/v1/todo",
    produces = APPLICATION_JSON_VALUE)
public class TodoResource {

  private final TodoService todoService;

  public TodoResource(final TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping(
      value = "/{todoId}",
      produces = APPLICATION_JSON_VALUE)
  @ResponseBody
  public ResponseEntity<Todo> getTodo(@PathVariable("todoId") final long todoId, HttpServletRequest request) {
    Todo response = todoService.getTodo(todoId);
    String resourceLocation = String.format("%s/%d", request.getRequestURI(), todoId);
    return ResponseEntity.ok(response);
  }

}
