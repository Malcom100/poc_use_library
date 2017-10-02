package adneom.poc_library.preview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import adneom.poc_library.R;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by gtshilombowanticale on 19-06-17.
 */

public class PreviewFragment extends Fragment implements PreviewContract.View {

    private PreviewContract.Presenetr mPresenetr;

    TextView txt;

    public static PreviewFragment newInstance(){
        return new PreviewFragment();
    }

    public PreviewFragment(){}

    @Override
    public void setPresenter(PreviewContract.Presenetr presneter) {
        mPresenetr = presneter;
    }

    @Override
    public void display() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutRes(),container,false);
        return view;
    }

    public int getLayoutRes() {
        return R.layout.layout_preview_fragment;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this,view);
        txt = (TextView) getActivity().findViewById(R.id.preview_txt);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenetr.test();
            }
        });
    }

}
