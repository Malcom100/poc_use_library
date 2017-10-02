package adneom.poc_use_library;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import adneom.poc_library.preview.PreviewActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import models.AccessRequest;
import models.Issue;

public class MainActivity extends AppCompatActivity{

    @BindView(R.id.btn_access_request)
    TextView btnAR;
    @BindView(R.id.btn_issue) TextView btnIssue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_issue)
    public void event(){
        launchPreviewActivity(true);
        Log.i("Test","1");
    }

    @OnClick(R.id.btn_access_request)
    public void eventAR(){
        launchPreviewActivity(false);
        Log.i("Test","2");
    }

    private void launchPreviewActivity(boolean type){
        Intent intent;
        if(type){
            Log.i("Test","Issue");
            intent = PreviewActivity.starterActivity(new Issue(),this);
        }else{
            Log.i("Test","AR");
           intent =  PreviewActivity.starterActivity(new AccessRequest(),this);
        }
        startActivity(intent);
    }
}
