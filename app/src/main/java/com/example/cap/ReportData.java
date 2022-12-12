package com.example.cap;

//메인화면
//리스트에 들어가는 데이터 선언
//메인화면과 내 글 목록 화면(심부름, 신고)의 카드뷰 내용은 같으므로 그대로 사용할 수 있음?

public class ReportData {
    private String rTitle;
    private String rDate;
    private String rNname;
    private int id;

    public ReportData(String title, String date, String nname) {
        rTitle = title;
        rDate = date;
        rNname = nname;
        this.id = id;
    }

    public String getTitle() {
        return rTitle;
    }

    public void setTitle(String title) {
        rTitle = title;
    }

    public String getDate() {
        return rDate;
    }

    public void setDate(String date) {
        rDate = date;
    }

    public String getNname() {
        return rNname;
    }

    public void setNname(String nname) {
        rNname = nname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

