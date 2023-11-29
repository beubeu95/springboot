package com.team36.service;

import com.team36.dto.MemberJoinDTO;

public interface MemberService {
    static class MidExistException extends Exception {}

    void join(MemberJoinDTO memberJoinDTO)throws MidExistException ;

}