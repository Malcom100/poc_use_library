package adneom.poc_library;

import android.app.Application;


/**
 * Created by gtshilombowanticale on 19-06-17.
 */

public class PreviewApplication extends Application {

    AplicationComponent applicationComponent;

    public AplicationComponent getApplicationComponent () { return this.applicationComponent;}

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerAplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
    }
}
