package com.example.rasia.demo1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TestActivity extends BaseActivity {


    @BindView(R.id.imageView)
    ImageView imageView;
    @BindView(R.id.etUsername)
    EditText etUsername;
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.tvSignIn)
    TextView tvSignIn;
    @BindView(R.id.tvSignInFacebook)
    TextView tvSignInFacebook;
    @BindView(R.id.tvOr)
    TextView tvOr;
    @BindView(R.id.tvForgotPassword)
    TextView tvForgotPassword;
    @BindView(R.id.tvLine)
    TextView tvLine;
    @BindView(R.id.tvCreateAnAccount)
    TextView tvCreateAnAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);

        getSupportActionBar().hide();

        etUsername.setOnFocusChangeListener(focusChangeListener);
        etPassword.setOnFocusChangeListener(focusChangeListener);

    }

    View.OnFocusChangeListener focusChangeListener = new View.OnFocusChangeListener() {
        @Override
        public void onFocusChange(View view, boolean b) {
            if (!b) {
                hideKeyboard(view);
            }
        }
    };

}
