package aarnav100.developer.iitd.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import aarnav100.developer.iitd.Main3Activity;
import aarnav100.developer.iitd.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {


    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment2,container,false);
        ArrayList<String> names=new ArrayList<>();
        //TODO:change to custom view
        names.add("Aarnav");
        names.add("Daizy");
        names.add("Aditya");
        names.add("Anmol");
        ((ListView)v.findViewById(R.id.list))
                .setAdapter(new ArrayAdapter<String>(
                        getActivity(),
                        R.layout.support_simple_spinner_dropdown_item,
                        names
                ));
        ((ListView)v.findViewById(R.id.list))
                .setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        startActivity(new Intent(getActivity(), Main3Activity.class));
                    }
                });
        return v;
    }

}
