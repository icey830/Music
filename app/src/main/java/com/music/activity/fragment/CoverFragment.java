package com.music.activity.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.music.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import me.wcy.lrcview.LrcView;

/**
 * Created by 雅倩宝宝 on 2017/9/11.
 */

public class CoverFragment extends Fragment {
    @Bind(R.id.iv_cover)
    ImageView ivCover;
    @Bind(R.id.lrc_view_single)
    LrcView lrcViewSingle;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_play_page_cover, container, false);

        ButterKnife.bind(this, super.onCreateView(inflater, container, savedInstanceState));
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
