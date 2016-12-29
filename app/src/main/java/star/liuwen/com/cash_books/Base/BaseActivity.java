package star.liuwen.com.cash_books.Base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import star.liuwen.com.cash_books.R;
import star.liuwen.com.cash_books.Utils.ActivityKiller;

/**
 * Created by liuwen on 2016/12/28.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(activityLayoutRes());
        initView();
        ActivityKiller.getInstance().addActivity(this);

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        // 移除Activity
        ActivityKiller.getInstance().removeActivity(this);
    }

    /**
     * actiivty layout id ,需要子类去实现
     *
     * @return
     */
    public abstract int activityLayoutRes();

    /**
     * acitivty 初始化组件和数据
     */
    public abstract void initView();

    /**
     * 设置显示右侧返回按钮
     */
    public void setBackView() {
        View backView = findViewById(R.id.back_view);
        if (backView == null) {
            return;
        }
        backView.setVisibility(View.VISIBLE);
        backView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    /**
     * 设置显示标题
     *
     * @param txt
     */
    public void setTitle(String txt) {
        TextView title = (TextView) findViewById(R.id.title);
        if (title == null) {
            return;
        }
        title.setVisibility(View.VISIBLE);
        title.setText(txt);
    }

    /**
     * 只显示右侧文字以及点击事件
     *
     * @param txt
     * @param onClickListener
     */
    public void setRightText(String txt, View.OnClickListener onClickListener) {
        TextView toolbar_righ_tv = (TextView) findViewById(R.id.toolbar_righ_tv);
        if (toolbar_righ_tv == null) {
            return;
        }
        ImageView toolbar_righ_iv = (ImageView) findViewById(R.id.toolbar_righ_iv);
        if (toolbar_righ_iv == null) {
            return;
        }
        toolbar_righ_iv.setVisibility(View.GONE);
        toolbar_righ_tv.setVisibility(View.VISIBLE);
        toolbar_righ_tv.setText(txt);
        toolbar_righ_tv.setOnClickListener(onClickListener);
    }

    /**
     * 右侧只显示一个图片
     *
     * @param resId
     * @param onClickListener
     */
    public void setRightImage(int resId, View.OnClickListener onClickListener) {
        TextView toolbar_righ_tv = (TextView) findViewById(R.id.toolbar_righ_tv);
        if (toolbar_righ_tv == null) {
            return;
        }
        toolbar_righ_tv.setVisibility(View.GONE);
        ImageView toolbar_righ_iv = (ImageView) findViewById(R.id.toolbar_righ_iv);
        if (toolbar_righ_iv == null) {
            return;
        }
        toolbar_righ_iv.setVisibility(View.VISIBLE);
        toolbar_righ_iv.setImageResource(resId);
        toolbar_righ_iv.setOnClickListener(onClickListener);
    }

    /**
     * 显示文字和图片，可以设置文字内容及字体颜色，图片资源
     *
     * @param txt
     * @param txtColor
     * @param resId
     * @param onClickListener
     */
    public void setRightTextAndImage(String txt, int txtColor, int resId, View.OnClickListener onClickListener) {
        TextView toolbar_righ_tv = (TextView) findViewById(R.id.toolbar_righ_tv);
        if (toolbar_righ_tv == null) {
            return;
        }
        toolbar_righ_tv.setVisibility(View.VISIBLE);
        toolbar_righ_tv.setTextColor(txtColor);

        ImageView toolbar_righ_iv = (ImageView) findViewById(R.id.toolbar_righ_iv);
        if (toolbar_righ_iv == null) {
            return;
        }
        toolbar_righ_iv.setVisibility(View.VISIBLE);
        toolbar_righ_iv.setImageResource(resId);
        toolbar_righ_iv.setOnClickListener(onClickListener);
        toolbar_righ_tv.setOnClickListener(onClickListener);
    }

}