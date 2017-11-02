package test.bwie.com.recycleviewmvp.bean;

import java.util.List;

/**
 * 类的用途 ：
 * zhangjiale
 * {DATE}
 */

public class Bean {


    /**
     * ret : 0
     * data : [{"id":"15269","type":"1","source_id":"15","template_id":"5","title":"《王者荣耀》虞姬打团出装 全能射手操作难","img":[{"url":"http://img.storage.17wanba.org.cn/shouyou/2016/05/26/1486f588821665df563795a55437b15d.jpg"}],"url":"/toutiao/detail/15269?create_time=1509543072","status":"1","create_time":"11月01日 13:31","time_length":"0","source_name":"一起玩吧"},{"id":"25722","type":"1","source_id":"15","template_id":"5","title":"西游题材成今年大热 君海游戏魔幻新作曝光","img":[{"url":"http://img.storage.17wanba.org.cn/shouyou/2016/07/14/9fd34e65d701465b2323e65971677e34.jpg"}],"url":"/toutiao/detail/25722?create_time=1507799082","status":"1","create_time":"10月12日 09:04","time_length":"0","source_name":"一起玩吧"},{"id":"27791","type":"1","source_id":"15","template_id":"4","title":"《猎灵》有独创的\u201c神系统\u201d概念","img":[{"url":"http://img.storage.17wanba.org.cn/shouyou/2016/07/22/8dcca59632c087cc7cf4afde26d8ac63.jpg"},{"url":"http://img.storage.17wanba.org.cn/shouyou/2016/07/22/46a822cfd14caa26d036f1b1da994b0c.jpg"},{"url":"http://img.storage.17wanba.org.cn/shouyou/2016/07/22/6eb339bd5e397517f097c0c31169cc5e.jpg"}],"url":"/toutiao/detail/27791?create_time=1505546951","status":"1","create_time":"09月16日 07:29","time_length":"0","source_name":"一起玩吧"},{"id":"12048","type":"1","source_id":"15","template_id":"4","title":"《神武2》手游俏罗成红袍加身似火神","img":[{"url":"http://img.storage.17wanba.org.cn/shouyou/2016/05/17/07529c13ec1b96fac35123515d2a8620.jpg"},{"url":"http://img.storage.17wanba.org.cn/shouyou/2016/05/17/456213b8ff907586acf5e21a07bd91b6.jpg"},{"url":"http://img.storage.17wanba.org.cn/shouyou/2016/05/17/5d5585b2ff69b53958245d72a40c633b.jpg"}],"url":"/toutiao/detail/12048?create_time=1504540226","status":"1","create_time":"09月04日 15:50","time_length":"0","source_name":"一起玩吧"},{"id":"10770","type":"1","source_id":"15","template_id":"4","title":"5.13 百变阵法加BUFF，《大唐游仙记》阵法系统开放内测！","img":[{"url":"http://img.storage.17wanba.org.cn/shouyou/2016/05/13/6659b1ce470cf50236482be979e0a37e.jpg"},{"url":"http://img.storage.17wanba.org.cn/shouyou/2016/05/13/a12bd4442e138480de3a974dfa8f72b8.jpg"},{"url":"http://img.storage.17wanba.org.cn/shouyou/2016/05/13/a31cf52e65b1cbecca1603c3a64b3d2d.jpg"}],"url":"/toutiao/detail/10770?create_time=1503560407","status":"1","create_time":"08月24日 07:40","time_length":"0","source_name":"一起玩吧"},{"id":"1232","type":"1","source_id":"15","template_id":"3","title":"Oskar Burman宣布辞去Rovio瑞典工作室总监职务","img":[{"url":"http://img.storage.17wanba.org.cn/shouyou/2016/03/29/2c1799a790a9266c55b5ecb6be92f58f.jpg"}],"url":"/toutiao/detail/1232?create_time=1501556787","status":"1","create_time":"08月01日 03:06","time_length":"0","source_name":"一起玩吧"},{"id":"3258","type":"1","source_id":"15","template_id":"1","title":"419特辑：撩倒\u201c黑寡妇\u201d的汉子是怎样炼成的","img":[],"url":"/toutiao/detail/3258?create_time=1500490775","status":"1","create_time":"07月19日 18:59","time_length":"0","source_name":"一起玩吧"},{"id":"28779","type":"1","source_id":"15","template_id":"5","title":"全新名将助阵特色玩法《龙战于野》超爽新版本前瞻","img":[{"url":"http://img.storage.17wanba.org.cn/shouyou/2016/07/26/3cecfe1b4d5d1a1542b8a66c302f6099.jpg"}],"url":"/toutiao/detail/28779?create_time=1499624432","status":"1","create_time":"07月09日 18:20","time_length":"0","source_name":"一起玩吧"}]
     * flag : 0
     */

    private int ret;
    private int flag;
    private List<DataBean> data;



    public static Bean objectFromData(String str) {

        return new com.google.gson.Gson().fromJson(str, Bean.class);
    }

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 15269
         * type : 1
         * source_id : 15
         * template_id : 5
         * title : 《王者荣耀》虞姬打团出装 全能射手操作难
         * img : [{"url":"http://img.storage.17wanba.org.cn/shouyou/2016/05/26/1486f588821665df563795a55437b15d.jpg"}]
         * url : /toutiao/detail/15269?create_time=1509543072
         * status : 1
         * create_time : 11月01日 13:31
         * time_length : 0
         * source_name : 一起玩吧
         */

        private String id;
        private String type;
        private String source_id;
        private String template_id;
        private String title;
        private String url;
        private String status;
        private String create_time;
        private String time_length;
        private String source_name;
        private List<ImgBean> img;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getSource_id() {
            return source_id;
        }

        public void setSource_id(String source_id) {
            this.source_id = source_id;
        }

        public String getTemplate_id() {
            return template_id;
        }

        public void setTemplate_id(String template_id) {
            this.template_id = template_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getTime_length() {
            return time_length;
        }

        public void setTime_length(String time_length) {
            this.time_length = time_length;
        }

        public String getSource_name() {
            return source_name;
        }

        public void setSource_name(String source_name) {
            this.source_name = source_name;
        }

        public List<ImgBean> getImg() {
            return img;
        }

        public void setImg(List<ImgBean> img) {
            this.img = img;
        }

        public static class ImgBean {
            /**
             * url : http://img.storage.17wanba.org.cn/shouyou/2016/05/26/1486f588821665df563795a55437b15d.jpg
             */

            private String url;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
