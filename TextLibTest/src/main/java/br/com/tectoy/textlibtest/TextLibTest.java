package br.com.tectoy.textlibtest;

import android.content.Context;
import android.os.Build;

public class TextLibTest {
    Context context;

    public TextLibTest(Context context) {
        this.context = context;
    }

    public String getBuildManufacturer(){
        return Build.MANUFACTURER.toString().trim();
    }
}
