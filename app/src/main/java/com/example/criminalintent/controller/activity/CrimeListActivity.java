package com.example.criminalintent.controller.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.example.criminalintent.controller.fragment.CrimeListFragment;

public class CrimeListActivity extends SingleFragmentActivity {
String listUserName;
    public static Intent newIntent(Context context, String userName) {
        Intent intent = new Intent(context, CrimeListActivity.class);
        intent.putExtra("UserName",userName);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public Fragment createFragment() {
        Intent intent = getIntent();
        listUserName = intent.getStringExtra("UserName");
        return CrimeListFragment.newInstance(listUserName);
    }
}