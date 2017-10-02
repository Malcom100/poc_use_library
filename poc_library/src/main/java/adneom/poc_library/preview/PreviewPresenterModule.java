package adneom.poc_library.preview;

import dagger.Module;
import dagger.Provides;

/**
 * Allows to provid the view
 */

@Module
public class PreviewPresenterModule {

    private final PreviewContract.View mView;

    public PreviewPresenterModule(PreviewContract.View view){
        this.mView = view;
    }

    @Provides
    PreviewContract.View providesPreviewContractView(){
        return this.mView;
    }
}
