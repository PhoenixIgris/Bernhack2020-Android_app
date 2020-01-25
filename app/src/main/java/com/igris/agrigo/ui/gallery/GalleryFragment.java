package com.igris.agrigo.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.igris.agrigo.Adapter.SectionPagerAdapter;
import com.igris.agrigo.Field;
import com.igris.agrigo.R;
import com.igris.agrigo.Seeds;
import com.igris.agrigo.Tools;
import com.igris.agrigo.Transport;
import com.igris.agrigo.ui.Potted;

    public class GalleryFragment extends Fragment {

        View myFragment;
        ViewPager viewPager;
        TabLayout tabLayout;
        public GalleryFragment(){

        }
        public static GalleryFragment getInstance(){return new GalleryFragment();}

        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceStates){
            myFragment =inflater.inflate(R.layout.fragment_gallery,container,false);
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
            adapter.addFragment(new Transport(),"Transport");
            adapter.addFragment(new Tools(),"Tools");
            adapter.addFragment(new Seeds(),"Seeds");
            viewPager.setAdapter(adapter);
        }
    }