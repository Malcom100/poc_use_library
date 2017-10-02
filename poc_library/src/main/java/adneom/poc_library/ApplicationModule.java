package adneom.poc_library;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by gtshilombowanticale on 19-06-17.
 */

@Module
public class ApplicationModule {

    private final Context mContext;

    ApplicationModule(Context context){
        this.mContext = context;
    }

    @Provides
    Context provideContext(){
        return this.mContext;
    }
}
