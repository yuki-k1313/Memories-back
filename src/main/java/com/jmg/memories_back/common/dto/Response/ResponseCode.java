package com.jmg.memories_back.common.dto.response;

public interface ResponseCode {
    String SUCCESS = "SU";

    String VALIDATION_FAIL = "VF";
    String EXIST_USER = "EU";
    String NO_EXIST_DIARY = "ND";

    String SIGN_IN_FAIL = "SF";
    
    String DATABASE_ERROR = "DBE";
}
