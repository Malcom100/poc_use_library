package adneom.poc_library.Preview;

import adneom.poc_library.preview.PreviewContract;

/**
 * Created by gtshilombowanticale on 20-06-17.
 */

public class PreviewContractTest implements PreviewContract {

    interface PreviewContractViewTest extends PreviewContract.View {
        String test();
    }

    interface PreviewContractPresenterTest extends PreviewContract.Presenetr {

        String display();
    }
}
