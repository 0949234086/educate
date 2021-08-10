package com.educate.common.helper;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Response {
    public Integer response_code;
    public String response_message;
    public List data;
    public Integer total_record;
}
