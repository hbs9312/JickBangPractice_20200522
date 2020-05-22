package kr.co.tjoeun.jickbangpractice_20200522;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import kr.co.tjoeun.jickbangpractice_20200522.adapters.RoomAdapter;
import kr.co.tjoeun.jickbangpractice_20200522.databinding.ActivityMainBinding;
import kr.co.tjoeun.jickbangpractice_20200522.datas.DetailRoomActivity;
import kr.co.tjoeun.jickbangpractice_20200522.datas.Room;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding;

    List<Room> rooms = new ArrayList<>();
    RoomAdapter mRoomAdapter; // onCreate 후에 객체화 필요


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        binding.roomListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Room clickedRoom = rooms.get(position);

                Intent myIntent = new Intent(mContext, DetailRoomActivity.class);
                myIntent.putExtra("room", clickedRoom);
                startActivity(myIntent);

            }
        });

    }

    @Override
    public void setValues() {
        addRooms();

        mRoomAdapter = new RoomAdapter(mContext,R.layout.room_list_item,rooms);
        binding.roomListView.setAdapter(mRoomAdapter);
    }

    void addRooms() {
        rooms.add(new Room(7500, "은평구 불광동", 4, "불광동 흔합 집입니다."));
        rooms.add(new Room(28500, "마포구 서교동", 2, "신혼부부의 보금자리 서교동..."));
        rooms.add(new Room(9000, "은평구 갈현동", 0, "갈현동 흔합 반지하 집입니다."));
        rooms.add(new Room(4500, "은평구 응암동", -1, "응암동 흔합 지하1층 집입니다."));
        rooms.add(new Room(55000, "광진구 구의동", 5, "구의동 흔합 5충집입니다."));
    }
}
