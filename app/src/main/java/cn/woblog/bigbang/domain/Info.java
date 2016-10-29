package cn.woblog.bigbang.domain;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by renpingqing on 10/29/16.
 */
public class Info implements Parcelable {
    public static final int TYPE_TEXT = 1;
    public static final Creator<Info> CREATOR = new Creator<Info>() {
        @Override
        public Info createFromParcel(Parcel source) {
            return new Info(source);
        }

        @Override
        public Info[] newArray(int size) {
            return new Info[size];
        }
    };
    private int type; //1 文本
    private String text;

    public Info() {
    }

    public Info(int type, String text) {
        this.type = type;
        this.text = text;
    }

    protected Info(Parcel in) {
        this.type = in.readInt();
        this.text = in.readString();
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.type);
        dest.writeString(this.text);
    }
}
