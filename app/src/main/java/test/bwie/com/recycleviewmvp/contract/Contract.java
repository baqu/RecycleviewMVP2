package test.bwie.com.recycleviewmvp.contract;

import java.util.List;

import test.bwie.com.recycleviewmvp.bean.Bean;
import test.bwie.com.recycleviewmvp.model.DataModel;

/**
 * 类的用途 ：
 * zhangjiale
 * {DATE}
 */

public class Contract {


    //view接口
    public interface IDataView{

        void setData(List<Bean.DataBean> list);
    }


    //Model
    public interface IDataModel{

        void getData(DataModel.IGetDataFromNet iGetDataFromNet);

    }


    //Presenter
    public interface IDataPresenter{

        void showData();
    }



}
