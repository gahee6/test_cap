package com.example.cap;

//메인화면
//리스트에 들어가는 데이터 선언
//메인화면과 내 글 목록 화면(심부름, 신고)의 카드뷰 내용은 같으므로 그대로 사용할 수 있음?

public class MainData {

    private String wTag;
    private String wTitle;
    private String wDate;
    private String wNname;
    private int id;

    public MainData(String tag, String title, String date, String nname) {
        wTag = tag;
        wTitle = title;
        wDate = date;
        wNname = nname;
        this.id = id;
    }

    public String getTag() {
        return wTag;
    }

    public void setTag(String tag) {
        wTag = tag;
    }

    public String getTitle() {
        return wTitle;
    }

    public void setTitle(String title) {
        wTitle = title;
    }

    public String getDate() {
        return wDate;
    }

    public void setDate(String date) {
        wDate = date;
    }

    public String getNname() {
        return wNname;
    }

    public void setNname(String nname) {
        wNname = nname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


