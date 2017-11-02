package test.bwie.com.recycleviewmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import test.bwie.com.recycleviewmvp.adapter.MyAdapter;
import test.bwie.com.recycleviewmvp.bean.Bean;
import test.bwie.com.recycleviewmvp.contract.Contract;
import test.bwie.com.recycleviewmvp.presenter.DataPresenter;

public class MainActivity extends AppCompatActivity implements Contract.IDataView{

    private RecyclerView recyview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initview();


    }

    private void initview() {

        recyview = (RecyclerView) findViewById(R.id.recyview);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);

        recyview.setLayoutManager(linearLayoutManager);

        DataPresenter presenter=new DataPresenter(this);

        presenter.showData();
    }


    @Override
    public void setData(List<Bean.DataBean> list) {

        MyAdapter adapter=new MyAdapter(list,this);
        recyview.setAdapter(adapter);

    }
}
