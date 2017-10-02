package adneom.poc_library.preview;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import adneom.poc_library.PreviewApplication;
import adneom.poc_library.R;
import models.AccessRequest;
import models.Issue;

public class PreviewActivity extends AppCompatActivity {

    public static final String KEY_AR = "access_request";
    public static final String KEY_ISSUE = "issue";

    private Object model;

    @Inject
    PreviewPresenetr previewPresenetr;

    public static Intent starterActivity(Issue issue,Context context){
        Intent intent = new Intent(context,PreviewActivity.class);
        intent.putExtra(KEY_ISSUE,issue);
        return intent;
    }

    public static Intent starterActivity(AccessRequest accessRequest, Context context){
        Intent intent = new Intent(context,PreviewActivity.class);
        intent.putExtra(KEY_AR,accessRequest);
        return intent;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        Intent intent = getIntent();
        if(intent != null){
            if(intent.getExtras().getParcelable(KEY_AR) != null){
                model = intent.getExtras().getParcelable(KEY_AR);
            }
            if(intent.getExtras().getParcelable(KEY_ISSUE) != null){
                model = intent.getExtras().getParcelable(KEY_ISSUE);
            }
        }

        if(model instanceof Issue){
            Log.i("Test","it is Issue");
        }

        if(model instanceof AccessRequest){
            Log.i("Test","it is access request");
        }

        PreviewFragment fragment = (PreviewFragment) getSupportFragmentManager().findFragmentById(R.id.contentFragment);
        if(fragment == null){
            fragment = PreviewFragment.newInstance();
            getSupportFragmentManager().beginTransaction().replace(R.id.contentFragment,fragment,"fragment").commit();
        }

        //build component with application component and presenter module
        DaggerPreviewComponent.builder()
                .aplicationComponent(((PreviewApplication)getApplication()).getApplicationComponent())
                .previewPresenterModule(new PreviewPresenterModule(fragment)).build().inject(this);

    }
}
