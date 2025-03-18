package com.jmg.memories_back.common.dto.response;

public interface ResponseMessage {
    String SUCCESS = "Success.";
    
    String VALIDATION_FAIL = "Validation Fail.";
    String EXIST_USER = "Exist User.";
    String NO_EXIST_DIARY = "No Exist Diary.";

    String SIGN_IN_FAIL = "Sign In Fail.";

    String NO_PERMISSION = "No Permission.";
    
    String DATABASE_ERROR = "Database Error.";
}
