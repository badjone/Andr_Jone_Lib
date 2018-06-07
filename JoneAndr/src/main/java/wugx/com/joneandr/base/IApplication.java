package wugx.com.joneandr.base;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

/**
 * @author wugx
 * @data 2018/6/7.
 */

public class IApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);

    }
}
