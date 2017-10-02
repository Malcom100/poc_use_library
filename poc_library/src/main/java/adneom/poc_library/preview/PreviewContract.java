package adneom.poc_library.preview;

import adneom.poc_library.BasePresenter;
import adneom.poc_library.BaseView;

/**
 * Created by gtshilombowanticale on 19-06-17.
 */

public interface PreviewContract {

    interface View extends BaseView<Presenetr> {
        void display();
    }

    interface Presenetr extends BasePresenter {
        void test();
        View getView();
        void setView(View view);
    }
}
