package com.example.cap;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//메인화면 어댑터
//메인화면과 내 글 목록 화면(심부름, 신고)의 카드뷰 내용은 같으므로 그대로 사용할 수 있음?

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.CustomViewHolder> {

    private ArrayList<MainData> arrayList;

    public MainAdapter(ArrayList<MainData> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MainAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_item_list,parent,false);
        CustomViewHolder holder = new CustomViewHolder(view);

        return holder;
    }

    @Override
    //데이터를 가져오는 문장? & 리스트뷰를 클릭하면 실행되는 동작도 여기서 구현
    public void onBindViewHolder(@NonNull MainAdapter.CustomViewHolder holder, int position) {
        holder.tag.setText(arrayList.get(position).getTag());
        holder.title.setText(arrayList.get(position).getTitle());
        holder.date.setText(arrayList.get(position).getDate());
        holder.nname.setText(arrayList.get(position).getNname());
        //holder.id.setText(String.valueOf(arrayList.get(position).getId()));

        //리스크뷰를 클릭했을때 토스트를 띄움(잘 작동하는지 테스트하기 위함)
        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String curName = holder.title.getText().toString();
                Toast.makeText(view.getContext(), curName, Toast.LENGTH_SHORT).show();

                //Context context = view.getContext();
                //String id = String.valueOf(holder.id.getText());
                //Intent intent = new Intent(context, BoardDetailActivity.class);
                //intent.putExtra("boardId", id);
                //context.startActivity(intent);
            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        protected TextView tag;
        protected TextView title;
        protected TextView date;
        protected TextView nname;
        protected TextView id;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tag = (TextView) itemView.findViewById(R.id.wTag);
            this.title = (TextView) itemView.findViewById(R.id.wTitle);
            this.date = (TextView) itemView.findViewById(R.id.wDate);
            this.nname = (TextView) itemView.findViewById(R.id.wNname);
            //this.id = (TextView) itemView.findViewById(R.id.boardId);
        }
    }
}

