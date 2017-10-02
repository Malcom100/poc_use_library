package models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by gtshilombowanticale on 19-06-17.
 */

public class AccessRequest implements Parcelable{

    public static Creator<AccessRequest> CREATOR = new Creator<AccessRequest>() {
        @Override
        public AccessRequest createFromParcel(Parcel source) {
            return new AccessRequest(source);
        }

        @Override
        public AccessRequest[] newArray(int size) {
            return new AccessRequest[size];
        }
    };

    public AccessRequest(){};

    public AccessRequest(Parcel in){};

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
