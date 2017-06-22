package com.example.mcao.demoapp2;

/**
 * Created by m.cao on 2017/6/22.
 */

public class Dataupdate {
    private int imgId;
    private String content;

    public Dataupdate(){}

    public Dataupdate(int imgId, String content){
        this.imgId = imgId;
        this.content = content;
    }

    public int getImgId(){
        return imgId;
    }

    public String getContent(){
        return content;
    }

    public void setImgId(int imgId){
        this.imgId = imgId;
    }

    public void setContent(String content){
        this.content = content;
    }
}
