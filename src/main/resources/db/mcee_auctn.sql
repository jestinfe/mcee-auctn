/* mcee_auctn의 schema를 정의한다. */

/*
 * 사용자
 */
CREATE TABLE tb_user(
      id VARCHAR2(20) -- 아이디
    , pswd VARCHAR2(25) -- 비밀번호
    , flnm VARCHAR2(40) -- 성명
    , mbl_telno VARCHAR2(11) -- 휴대전화번호
    , rsdc_addr VARCHAR2(200) -- 거주지주소
    , BRDT DATE -- 생년월일
    , LAST_LGN_DT DATE -- 최종로그인일시
    , acnt_lck_yn VARCHAR2(1) -- 계정잠금여부
    , pswd_err_nmtm NUMBER(2) -- 비밀번호오류횟수
    , REG_ID VARCHAR2(20) -- 등록자
    , REG_DT DATE -- 등록일시
    , MOD_ID VARCHAR2(20) -- 수정자
    , MOD_DT DATE -- 수정일시
    , PRIMARY KEY(id)
);
