package com.igris.agrigo.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.igris.agrigo.Adapter.SectionPagerAdapter;
import com.igris.agrigo.Field;
import com.igris.agrigo.R;
import com.igris.agrigo.ui.Potted;

public class HomeFragment extends Fragment {

    View myFragment;
    ViewPager viewPager;
    TabLayout tabLayout;
    public HomeFragment(){

    }
    public static HomeFragment getInstance(){return new HomeFragment();}

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceStates){
        myFragment =inflater.inflate(R.layout.fragment_home,container,false);
        viewPager=myFragment.findViewById(R.id.view_pager);
        tabLayout=myFragment.findViewById(R.id.tab_layout);
return myFragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    private void setUpViewPager(ViewPager viewPager){
        SectionPagerAdapter adapter=new SectionPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new Potted(),"Potted");
        adapter.addFragment(new Field(),"Field");

        viewPager.setAdapter(adapter);
    }

}