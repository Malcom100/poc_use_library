package adneom.poc_library.preview;

import adneom.poc_library.AplicationComponent;
import adneom.poc_library.ApplicationModule;
import adneom.poc_library.FragmentScoped;
import dagger.Component;

/**
 * Uses ApplicationModule and provides methods from PreviewPresneterModule
 */

@FragmentScoped
@Component(dependencies = AplicationComponent.class, modules = PreviewPresenterModule.class)
public interface PreviewComponent {

    void inject(PreviewActivity activity);
}
