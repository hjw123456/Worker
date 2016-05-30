package com.soboot.mike.worker.enity;

/**
 * Created by Wing on 2016/5/28.
 */
public class WorkListInfo {
    private int imgId;
    private String workListName;
    private String workListState;


    public WorkListInfo(String workListState, int imgId, String workListName) {
        this.workListState = workListState;
        this.imgId = imgId;
        this.workListName = workListName;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getWorkListName() {
        return workListName;
    }

    public void setWorkListName(String workListName) {
        this.workListName = workListName;
    }

    public String getWorkListState() {
        return workListState;
    }

    public void setWorkListState(String workListState) {
        this.workListState = workListState;
    }
}
