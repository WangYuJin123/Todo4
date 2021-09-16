package com.example.todo.service;

import ch.qos.logback.core.encoder.EchoEncoder;
import com.example.todo.vo.TodoVO;

import java.util.List;

public interface TodoService {
    List<TodoVO> selectTodoList() throws Exception;
}
