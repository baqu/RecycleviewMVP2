package test.bwie.com.recycleviewmvp.model;

import java.util.List;

import test.bwie.com.recycleviewmvp.bean.Bean;
import test.bwie.com.recycleviewmvp.contract.Contract;
import test.bwie.com.recycleviewmvp.utils.OkHttpUtils;

/**
 * 类的用途 ：
 * zhangjiale
 * {DATE}
 */

public class DataModel implements Contract.IDataModel {

    private String url = "http://shouyoutoutiao.app.17wanba.com/toutiao/get_list";

    @Override
    public void getData(final IGetDataFromNet iGetDataFromNet) {
        OkHttpUtils.doGet(url, new OkHttpUtils.SendData() {
            @Override
            public void sendData(String result) {

                //去bean类里加
                // public static Bean objectFromData(String str) {
                //return new com.google.gson.Gson().fromJson(str, Bean.class);
                // }

                Bean bean = Bean.objectFromData(result);
                List<Bean.DataBean> data = bean.getData();
                iGetDataFromNet.getData(data);
            }
        });
    }

    public interface IGetDataFromNet {
        void getData(List<Bean.DataBean> list);
    }
}
