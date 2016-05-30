package com.soboot.mike.worker.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by Wing on 2016/5/27.
 */
public class MyBaseFragmentActivity extends FragmentActivity{
    FragmentManager fm;
    private FragmentTransaction ft;

    // 添加fragment
    public void addFragmentView(int id, Fragment f) {
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        ft.add(id, f, f.getClass().getSimpleName());
        ft.commit();
    }

    // 替换fragment
    public void replaceFragmentView(int id, Fragment f) {
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        ft.replace(id, f, f.getClass().getSimpleName());
        ft.commit();
    }

    Fragment currentFragment;

    protected void smartReplaceFragmentView(int layoutId, Fragment f) {
        // 不直接replace，隐藏当前显示的那个fragment，显示目标的fragment
        // 判断的当前是否有显示
        // 判断目标的fragment是否已经显示过，在tag是否能找到
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ts = fm.beginTransaction();
        if (currentFragment != null) {
            ts.hide(currentFragment);
        }
        String tag = f.getClass().getSimpleName();
        Fragment tempFragment = fm.findFragmentByTag(tag);
        if (tempFragment != null) {
            ts.show(tempFragment);
        } else {
            ts.add(layoutId, f, tag);
        }
        ts.commit();
        currentFragment = f;
    }
    // 跳转传递任意数据
    protected void jumpTo(Class<?> targetClass, Bundle bundle) {
        Intent intent = new Intent(this, targetClass);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
