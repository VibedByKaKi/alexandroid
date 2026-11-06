package com.dee.app.data.reactnative;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ElementsDataRequest {

    @Nullable
    public DataBlob body;

    @Nullable
    public String domain;

    @Nullable
    public String id;

    @Nullable
    public Method method;

    @Nullable
    public String operationName;

    @Nullable
    public String uri;

    @Nullable
    public Integer connectionTimeout = null;

    @Nullable
    public Integer readTimeout = null;
    public boolean singleResult = false;
    public Map<String, String> headers = new HashMap();
    public ElementsCacheOptions cache = new ElementsCacheOptions();
    private ElementsDataRequestAuthentication authentication = new ElementsDataRequestAuthentication();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Method {
        GET,
        POST,
        PUT,
        DELETE,
        PATCH;

        @Nullable
        @SuppressLint({"DefaultLocale"})
        public static Method fromString(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
            }
            return null;
        }
    }

    public ElementsDataRequestAuthentication getAuth() {
        return this.authentication;
    }
}
