package com.chong.pojo;

public class Limit<T> {
    private int page=1 ;//当前页数
    private int rows;       //总记录数
    private int pagecount = 3;  //每页的记录数
    private int size;    //总页数
    private int count ;   //次数

    public Limit(int page, int rows) {
        this.page = page;
        this.rows = rows;
//        this.pagecount = pagecount;
//        this.size = size;
//        this.count = count;
    }

    public int getCount() {
        return (page-1)*pagecount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Limit{" +
                "page=" + page +
                ", rows=" + rows +
                ", pagecount=" + pagecount +
                ", size=" + size +
                ", count=" + count +
                '}';
    }

    public Limit() {
    }

    public int getPage() {

        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getPagecount() {
        return pagecount;
    }

    public void setPagecount(int pagecount) {
        this.pagecount = pagecount;
    }

    public int getSize() {
        size = getRows() / getPagecount();
        return (rows % pagecount == 0) ? pagecount : pagecount + 1;
    }

    public void setSize(int size) {
        this.size = size;
    }
}