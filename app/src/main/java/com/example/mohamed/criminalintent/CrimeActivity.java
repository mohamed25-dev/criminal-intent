package com.example.mohamed.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity {
    public static final String EXTRA_CRIME_ID =
            "com.example.mohamed.criminalintent.crime_id";
    @Override
    protected Fragment createFragment() {
        UUID id = (UUID) getIntent().
                getSerializableExtra(EXTRA_CRIME_ID);
        return  CrimeFragment.newInstance(id);
    }

    public static Intent newIntent(Context packageContext, UUID id) {
        Intent intent = new Intent(packageContext, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, id);
        return intent;
    }
}
