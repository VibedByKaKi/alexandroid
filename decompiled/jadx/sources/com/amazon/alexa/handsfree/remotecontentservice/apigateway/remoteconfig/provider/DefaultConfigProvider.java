package com.amazon.alexa.handsfree.remotecontentservice.apigateway.remoteconfig.provider;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.remotecontentservice.apigateway.remoteconfig.utils.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DefaultConfigProvider {

    @VisibleForTesting
    static final String DEFAULT_CONFIG_FILE = "defaultConfig.json";
    private static final String TAG = "DefaultConfigProvider";
    private final Context mContext;
    private final StringUtils mStringUtils;

    public DefaultConfigProvider(@NonNull Context context) {
        this(new StringUtils(), context);
    }

    @Nullable
    public String getDefaultConfig() {
        try {
            InputStream open = this.mContext.getAssets().open(DEFAULT_CONFIG_FILE);
            try {
                String stringFromInputStream = this.mStringUtils.getStringFromInputStream(open, StandardCharsets.UTF_8);
                if (open != null) {
                    open.close();
                }
                return stringFromInputStream;
            } finally {
            }
        } catch (IOException e) {
            Log.e(TAG, "Failed trying to read the default config file", e, new Object[0]);
            return null;
        }
    }

    @VisibleForTesting
    public DefaultConfigProvider(@NonNull StringUtils stringUtils, @NonNull Context context) {
        this.mStringUtils = stringUtils;
        this.mContext = context;
    }
}
