package adneom.poc_library.preview;


import javax.inject.Inject;


/**
 * Created by gtshilombowanticale on 19-06-17.
 */

public class PreviewPresenetr implements PreviewContract.Presenetr{

    private  PreviewContract.View view;

    //constructor handle by dagger 2
    @Inject
    public PreviewPresenetr(PreviewContract.View previewView){
        view = previewView;
    }


    @Override
    public void start() {
        view.display();
    }

    @Override
    public void test() {
        view.display();
    }

    @Override
    public PreviewContract.View getView() {
        return this.view;
    }

    @Override
    public void setView(PreviewContract.View view) {
        this.view = view;
    }

    @Inject
    void setupPresenter(){
        view.setPresenter(this);
    }

}
