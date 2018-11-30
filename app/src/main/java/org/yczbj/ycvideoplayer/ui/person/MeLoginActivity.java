package org.yczbj.ycvideoplayer.ui.person;

import android.view.View;
import android.widget.TextView;

import org.yczbj.ycvideoplayer.R;
import org.yczbj.ycvideoplayer.base.mvp1.BaseActivity;

import butterknife.BindView;

/**
 * Created by yc on 2018/1/15.
 */

public class MeLoginActivity extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.tv_fail)
    TextView tvFail;
    @BindView(R.id.tv_success)
    TextView tvSuccess;

    @Override
    public int getContentView() {
        return R.layout.activity_me_login;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initListener() {
        tvFail.setOnClickListener(this);
        tvSuccess.setOnClickListener(this);
    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_fail:

                break;
            case R.id.tv_success:

                break;
            default:
                break;
        }
    }
}
