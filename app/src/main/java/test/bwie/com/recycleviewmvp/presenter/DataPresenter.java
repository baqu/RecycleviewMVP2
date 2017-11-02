package test.bwie.com.recycleviewmvp.presenter;

import java.util.List;

import test.bwie.com.recycleviewmvp.bean.Bean;
import test.bwie.com.recycleviewmvp.contract.Contract;
import test.bwie.com.recycleviewmvp.model.DataModel;

/**
 * 类的用途 ：
 * zhangjiale
 * {DATE}
 */

public class DataPresenter implements Contract.IDataPresenter {
    private Contract.IDataView view;
    private DataModel model;

    public DataPresenter(Contract.IDataView view) {
        this.view = view;
        model = new DataModel();
    }

    @Override
    public void showData() {

        model.getData(new DataModel.IGetDataFromNet() {
            @Override
            public void getData(List<Bean.DataBean> list) {
                view.setData(list);
            }
        });

    }
}
