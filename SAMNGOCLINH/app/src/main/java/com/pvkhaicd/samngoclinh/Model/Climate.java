package com.pvkhaicd.samngoclinh.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Climate implements Serializable {

@SerializedName("title")
@Expose
private String title;
@SerializedName("content")
@Expose
private String content;

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public String getContent() {
return content;
}

public void setContent(String content) {
this.content = content;
}

}