/* mcee_auctn의 schema를 정의한다. */
CREATE TABLE tb_user(
      id VARCHAR2(20) -- 아이디
    , pswd VARCHAR2(25) -- 비밀번호
    , flnm VARCHAR2(40) -- 성명
    , mbl_telno VARCHAR2(11) -- 휴대전화번호
    , rsdc_addr VARCHAR2(200) -- 거주지주소
    , BRDT DATE -- 생년월일
    , REG_ID VARCHAR2(20) -- 등록자
    , REG_DT DATE -- 등록일시
    , MOD_ID VARCHAR2(20) -- 수정자
    , MOD_DT DATE -- 수정일시
    , PRIMARY KEY(id)
);
