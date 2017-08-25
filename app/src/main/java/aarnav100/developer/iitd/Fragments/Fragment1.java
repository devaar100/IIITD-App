package aarnav100.developer.iitd.Fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import aarnav100.developer.iitd.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {
    FragmentManager fragMan;
    FrameLayout fragPlace;
    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment1,container,false);
        fragPlace=(FrameLayout)v.findViewById(R.id.content);
        fragMan=getFragmentManager();
        BottomNavigationView navigation = (BottomNavigationView)v.findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        return v;
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.buy:
                    fragMan.beginTransaction()
                            .replace(R.id.content,new Fragment3())
                            .commit();
                    return true;
                case R.id.sell:
                    fragMan.beginTransaction()
                            .replace(R.id.content,new Fragment4())
                            .commit();
                    return true;
            }
            return false;
        }

    };

}
