package kr.co.tjoeun.jickbangpractice_20200522.datas;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;

import kr.co.tjoeun.jickbangpractice_20200522.BaseActivity;
import kr.co.tjoeun.jickbangpractice_20200522.R;
import kr.co.tjoeun.jickbangpractice_20200522.databinding.ActivityDetailRoomBinding;

public class DetailRoomActivity extends BaseActivity {

    ActivityDetailRoomBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail_room);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }
}
