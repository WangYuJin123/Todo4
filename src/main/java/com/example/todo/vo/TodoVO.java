package com.example.todo.vo;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class TodoVO {
    private int group_id;
    private int id;
    private String title;
    private String note;
    private LocalDateTime due_dt;
    private boolean is_status;
    private int sort;
    private String insert_id;
    private LocalDateTime insert_dt;
    private String update_id;
    private LocalDateTime update_dt;
}
