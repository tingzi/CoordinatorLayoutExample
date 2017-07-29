package com.amy.coordinator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amy on 17/7/29.
 */

public class FragmentForListView extends Fragment {

    private NestedScrollingListView mListView;
    private List<String> mData;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_listview, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initData();

        mListView = (NestedScrollingListView) view.findViewById(R.id.list);
        mListView.setAdapter(new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_list_item_1, mData));
    }

    private void initData() {
        mData = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            mData.add("test" + i);
        }
    }
}
