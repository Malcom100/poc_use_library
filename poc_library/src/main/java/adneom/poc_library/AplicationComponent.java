package adneom.poc_library;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by gtshilombowanticale on 19-06-17.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface AplicationComponent {

    Context context();
}
