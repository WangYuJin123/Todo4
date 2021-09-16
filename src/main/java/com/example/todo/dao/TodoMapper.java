package com.example.todo.dao;

import com.example.todo.vo.TodoVO;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface TodoMapper {
    //글쓰기
    @Insert("INSERT INTO t_task (title,note,is_status,sort) VALUES(#{title},#{note},#{is_ststus},#{sort})")
    public void insertTodo(TodoVO todo);

    //글 목록
    public List<TodoVO> selectList(Map<String,Object> map);

    //글 상세 페이지
    @Select("SELECT * FROM t_task t JOIN t_group_task g ON t.group_id = g.id WHERE t.id = #{id}")
    public TodoVO selectTodo(Integer todo_num);

    //글 수정
    @Update("UPDATE t_task SET title=#{title},note=#{note},is_status=#{is_status},sort=#{sort},update_dt=LocalDateTime")
    public void updateTodo(TodoVO todo);

    //글 삭제
    @Delete("DELETE FROM t_task WHERE id={id}")
    public void deleteTodo(Integer todo_num);

}
