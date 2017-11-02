package test.bwie.com.recycleviewmvp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import test.bwie.com.recycleviewmvp.R;
import test.bwie.com.recycleviewmvp.bean.Bean;

/**
 * 类的用途 ：
 * zhangjiale
 * {DATE}
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Bean.DataBean> list = new ArrayList<>();
    private Context context;

    private LayoutInflater layoutInflater;

    public MyAdapter(List<Bean.DataBean> list, Context context) {
        this.list = list;
        this.context = context;

        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View inflate = LayoutInflater.from(context).inflate(R.layout.item, parent, false);

        ViewHolder holder = new ViewHolder(inflate);
        return holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Bean.DataBean bean = list.get(position);

        holder.title.setText(bean.getTitle());

        Glide.with(context).load(list.get(position).getImg().get(0).getUrl()).into(holder.image);

    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title;

        public ViewHolder(View itemView) {
            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.image);
            title = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
