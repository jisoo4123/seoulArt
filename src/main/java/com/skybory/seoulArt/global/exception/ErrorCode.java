package com.skybory.seoulArt.global.exception;

public enum ErrorCode {
	
	// Common
    METHOD_NOT_ALLOWED(405, "C001", "잘못된 요청입니다."),
    HANDLE_ACCESS_DENIED(400, "c002", "잘못된 접근입니다."),
    INVALID_INPUT_VALUE(400, "C003", "잘못된 입력입니다."),
    ENTITY_NOT_FOUND(400, "C004", "개체를 찾을 수 없습니다."),
    INTERNAL_SERVER_ERROR(500, "C005", "서버 내부 오류 입니다."),
    INVALID_TYPE_VALUE(400, "C006", "잘못된 타입 입니다."),

    // Member
//    PASSWORD_NULL_ERROR(400, "M001", "비밀번호가 없습니다."),
    USER_NOT_FOUND(400, "M002", "없는 회원 입니다."),
//    USER_COUNT_NOT_FOUND(400, "M003", "해당 MemberCount가 존재하지 않습니다."),
//    DUPLICATE_EMAIL(400, "M004", "이메일이 겹칩니다."),
//    DUPLICATE_NICKNAME(400, "M005", "닉네임이 겹칩니다."),
//    PASSWORD_MISS_MATCH(400, "M006", "비밀번호가 일치하지 않습니다."),
//
    // Seat
//    PASSWORD_NULL_ERROR(400, "M001", "비밀번호가 없습니다."),
    SEAT_NOT_FOUND(400, "M002", "없는 좌석 입니다."),
//    USER_COUNT_NOT_FOUND(400, "M003", "해당 MemberCount가 존재하지 않습니다."),
//    DUPLICATE_EMAIL(400, "M004", "이메일이 겹칩니다."),
    SEAT_UNAVAILABLE(400, "M005", "빈 자리가 없습니다."),
//    PASSWORD_MISS_MATCH(400, "M006", "비밀번호가 일치하지 않습니다."),
//
    // Event
//    PASSWORD_NULL_ERROR(400, "M001", "비밀번호가 없습니다."),
    EVENT_NOT_FOUND(400, "E002", "없는 공연입니다."),
    CREATOR_NOT_FOUND(400, "C002", "없는 창작자입니다."),
//    USER_COUNT_NOT_FOUND(400, "M003", "해당 MemberCount가 존재하지 않습니다."),
//    DUPLICATE_EMAIL(400, "M004", "이메일이 겹칩니다."),
//    DUPLICATE_NICKNAME(400, "M005", "닉네임이 겹칩니다."),
//    PASSWORD_MISS_MATCH(400, "M006", "비밀번호가 일치하지 않습니다."),
//
//    // JWT
//    TOKEN_NOT_FOUND(400, "J001", "잘못된 토큰입니다."),
//
//    // Board
//    BOARD_NOT_FOUND(400, "B001", "해당 게시판을 찾을 수 없습니다."),
//    BOARD_MISS_MATCH(400, "B002", "해당 회원의 게시판이 아닙니다"),
//    DUPLICATE_TITLE(400, "B003", "제목이 겹칩니다."),
//
//     // Ticket
    	TICKET_NOT_FOUND(400, "T001", "해당 티켓을 찾을 수 없습니다."),
    	TICKET_MISS_MATCH(400, "T002", "해당 회원의 티켓이 아닙니다"),
    	DUPLICATE_TICKET(400, "T003", "중복된 티켓입니다."),
//
//    // Reply
//    REPLY_NOT_FOUND(400, "R001", "해당 댓글은 존재하지 않습니다."),
//
//    // Like
//    LIKE_NOT_FOUND(400, "L001", "해당 좋아요 기록은 존재하지 않습니다."),
//
    //FOLLOW
    	FOLLOW_NOT_FOUND(400, "F001", "팔로우 정보가 없습니다."),
    	SAME_ID_DENIED(400, "F002", "자기 자신을 팔로우할 순 없습니다.");

    private final int status;
    private final String code;
    private final String message;

    ErrorCode(int status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
