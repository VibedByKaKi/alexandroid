package com.amazon.appmanager.lib.metrics;

import android.content.Context;
import com.amazon.appmanager.lib.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ApplicationDetails {
    private final String mApplicationName = getApplicationNameInfo();
    private final String mApplicationVersion = getApplicationVersionInfo();
    Context mContext;

    public ApplicationDetails(Context context) {
        this.mContext = context;
    }

    private String getApplicationNameInfo() {
        try {
            return this.mContext.getPackageName();
        } catch (Exception unused) {
            return Constants.NOT_FOUND;
        }
    }

    private String getApplicationVersionInfo() {
        if (!Constants.NOT_FOUND.equals(this.mApplicationName)) {
            try {
                return this.mContext.getPackageManager().getPackageInfo(this.mApplicationName, 0).versionName;
            } catch (Exception unused) {
            }
        }
        return Constants.NOT_FOUND;
    }

    public String getApplicationName() {
        return this.mApplicationName;
    }

    public String getApplicationVersion() {
        return this.mApplicationVersion;
    }
}
