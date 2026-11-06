package com.amazon.alexa.enrollment.utils;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.WeakHashMap;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class FontHelper {
    private static WeakHashMap<String, Typeface> cache = new WeakHashMap<>();
    private static final String TAG = "VoxEn_FontHelper";

    private FontHelper() {
    }

    private static String excludeExtension(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf != -1 ? str.substring(0, lastIndexOf) : str;
    }

    private static String findPath(AssetManager assetManager, String str, String str2) {
        try {
            for (String str3 : assetManager.list(str)) {
                if (excludeExtension(str3).equals(str2)) {
                    return str + "/" + str3;
                }
            }
            return null;
        } catch (IOException e) {
            Log.w(TAG, "Failed to list " + str, e);
            return null;
        }
    }

    public static Typeface getFont(AssetManager assetManager, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Typeface typeface = cache.get(str);
        if (typeface != null) {
            return typeface;
        }
        String findPath = findPath(assetManager, "fonts", str);
        if (findPath == null) {
            Single$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Failed to find font asset with name ", str));
            return null;
        }
        Typeface createFromAsset = Typeface.createFromAsset(assetManager, findPath);
        cache.put(str, createFromAsset);
        return createFromAsset;
    }

    public static void setFont(TextView textView, String str) {
        textView.setTypeface(getFont(textView.getContext().getAssets(), str));
    }
}
