package star.liuwen.com.cash_books.Enage;

import java.util.ArrayList;
import java.util.List;

import star.liuwen.com.cash_books.R;
import star.liuwen.com.cash_books.bean.PlanSaveMoneyModel;
import star.liuwen.com.cash_books.bean.ZhiChuModel;

/**
 * Created by liuwen on 2017/1/5.
 */
public class DataEnige {


    public static List<ZhiChuModel> getZhiChuData() {
        List<ZhiChuModel> mList = new ArrayList<>();
        mList.add(new ZhiChuModel(R.mipmap.icon_shouru_type_qita, "一般"));
        mList.add(new ZhiChuModel(R.mipmap.maicai, "买菜"));
        mList.add(new ZhiChuModel(R.mipmap.zaocan, "早餐"));
        mList.add(new ZhiChuModel(R.mipmap.zhongfan, "中饭"));
        mList.add(new ZhiChuModel(R.mipmap.xiaochi, "小吃"));
        mList.add(new ZhiChuModel(R.mipmap.naifen, "奶粉"));
        mList.add(new ZhiChuModel(R.mipmap.jiushui, "酒水"));
        mList.add(new ZhiChuModel(R.mipmap.lingshi, "零食"));
        mList.add(new ZhiChuModel(R.mipmap.richangyongpin, "生活品"));
        mList.add(new ZhiChuModel(R.mipmap.xiezi, "鞋子"));
        mList.add(new ZhiChuModel(R.mipmap.yaopinfei, "医药费"));
        mList.add(new ZhiChuModel(R.mipmap.yifu, "衣服"));
        return mList;
    }

    public static List<PlanSaveMoneyModel> getPlanSaveMoneyData() {
        List<PlanSaveMoneyModel> list = new ArrayList<>();
        list.add(new PlanSaveMoneyModel("旅行", "48234人已经加入", R.mipmap.lvyou, "加入 +", "生活不止眼前的苟且，还有远方的诗和田野"));
        list.add(new PlanSaveMoneyModel("演唱会", "4987人已经加入", R.mipmap.yanchanghui, "加入 +", "生活不止眼前的苟且，还有远方的诗和田野"));
        list.add(new PlanSaveMoneyModel("比赛", "429人已经加入", R.mipmap.bisai, "加入 +", "生活不止眼前的苟且，还有远方的诗和田野"));
        list.add(new PlanSaveMoneyModel("买房装修", "20312人已经加入", R.mipmap.fang, "加入 +", "生活不止眼前的苟且，还有远方的诗和田野"));
        list.add(new PlanSaveMoneyModel("买车", "18929人已经加入", R.mipmap.che, "加入 +", "生活不止眼前的苟且，还有远方的诗和田野"));
        list.add(new PlanSaveMoneyModel("存下第一笔十万", "78551人已经加入", R.mipmap.shiwan, "加入 +", "生活不止眼前的苟且，还有远方的诗和田野"));
        return list;
    }

}
