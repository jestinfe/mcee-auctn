/* mcee_auctn의 schema를 정의한다. */

/*
 * [테이블]
 * 사용자
 */
CREATE TABLE tb_user(
      id VARCHAR2(20) -- 아이디
    , pswd VARCHAR2(25) -- 비밀번호
    , flnm VARCHAR2(40) -- 성명
    , mbl_telno VARCHAR2(11) -- 휴대전화번호
    , rsdc_addr VARCHAR2(200) -- 거주지주소
    , brdt DATE -- 생년월일
    , last_lgn_dt DATE -- 최종로그인일시
    , acnt_lck_yn VARCHAR2(1) -- 계정잠금여부
    , pswd_err_nmtm NUMBER(2) -- 비밀번호오류횟수
    , reg_id VARCHAR2(20) -- 등록자
    , reg_dt DATE -- 등록일시
    , mod_id VARCHAR2(20) -- 수정자
    , mod_dt DATE -- 수정일시
    , PRIMARY KEY(id)
);
