package models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by gtshilombowanticale on 19-06-17.
 */

public class Issue implements Parcelable{

    public static Creator<Issue> CREATOR = new Creator<Issue>() {
        @Override
        public Issue createFromParcel(Parcel source) {
            return new Issue(source);
        }

        @Override
        public Issue[] newArray(int size) {
            return new Issue[size];
        }
    };

    public Issue(){};

    public Issue(Parcel in){};

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
