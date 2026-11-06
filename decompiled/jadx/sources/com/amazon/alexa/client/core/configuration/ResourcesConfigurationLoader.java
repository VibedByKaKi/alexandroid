package com.amazon.alexa.client.core.configuration;

import android.content.Context;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class ResourcesConfigurationLoader extends ConfigurationLoader {
    private static final String KEY_PREFIX = "a4a_sdk_";
    private final Context context;

    @Inject
    public ResourcesConfigurationLoader(Context context) {
        this.context = context;
    }

    private int getResourceIdentifier(String str, String str2) {
        return this.context.getResources().getIdentifier(getResourceKey(str), str2, this.context.getApplicationContext().getPackageName());
    }

    private String getResourceKey(String str) {
        return a$$ExternalSyntheticOutline0.m(KEY_PREFIX, str);
    }

    @Override // com.amazon.alexa.client.core.configuration.ConfigurationLoader
    public Boolean getBoolean(String str) {
        int resourceIdentifier = getResourceIdentifier(str, "bool");
        if (resourceIdentifier == 0) {
            return null;
        }
        return Boolean.valueOf(this.context.getResources().getBoolean(resourceIdentifier));
    }

    @Override // com.amazon.alexa.client.core.configuration.ConfigurationLoader
    public Long getLong(String str) {
        if (getResourceIdentifier(str, TypedValues.Custom.S_INT) == 0) {
            return null;
        }
        return Long.valueOf(this.context.getResources().getInteger(r2));
    }

    @Override // com.amazon.alexa.client.core.configuration.ConfigurationLoader
    public String getString(String str) {
        String string;
        int resourceIdentifier = getResourceIdentifier(str, TypedValues.Custom.S_STRING);
        if (resourceIdentifier == 0 || (string = this.context.getResources().getString(resourceIdentifier)) == null || TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    @Override // com.amazon.alexa.client.core.configuration.ConfigurationLoader
    public Set<String> getStringSet(String str) {
        int resourceIdentifier = getResourceIdentifier(str, "array");
        if (resourceIdentifier == 0) {
            return null;
        }
        return new HashSet(Arrays.asList(this.context.getResources().getStringArray(resourceIdentifier)));
    }
}
