package com.example.zkjmavf.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by zkjmavf on 19/04/16.
 */
public class CrimeListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
