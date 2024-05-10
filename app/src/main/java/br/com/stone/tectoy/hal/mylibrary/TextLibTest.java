package br.com.stone.tectoy.hal.mylibrary;

import android.content.Context;
import android.os.Build;

public class TextLibTest {
    Context context;

    public TextLibTest(Context context) {
        this.context = context;
    }

    public String getBuildManufactureer(){
        return Build.MANUFACTURER.toString().trim();
    }
}
