package star.liuwen.com.cash_books.Fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import star.liuwen.com.cash_books.Base.BaseFragment;
import star.liuwen.com.cash_books.R;
import star.liuwen.com.cash_books.Utils.ToastUtils;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReportsFragment extends BaseFragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        setContentView(R.layout.fragment_reports);
        setTitle(getString(R.string.reports_my));
        initView();
        initData();
        return getContentView();
    }

    private void initView() {
    }

    private void initData() {

    }

}
