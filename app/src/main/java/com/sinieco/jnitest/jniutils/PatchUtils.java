package com.sinieco.jnitest.jniutils;

/**
 * Created by BaiMeng on 2017/5/18.
 */
public class PatchUtils {
    static {
        System.loadLibrary("apkpatch");
    }
    public static native int combine(String oldPath , String newPath , String patch);
}
