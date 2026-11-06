package com.facebook.soloader.recovery;

import android.content.Context;
import com.facebook.soloader.LogUtil;
import com.facebook.soloader.NoBaseApkException;
import com.facebook.soloader.SoSource;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class CheckBaseApkExists implements RecoveryStrategy {
    private static final String TAG = "soloader.recovery.CheckBaseApkExists";
    private final BaseApkPathHistory mBaseApkPathHistory;
    private final Context mContext;

    public CheckBaseApkExists(Context context, BaseApkPathHistory baseApkPathHistory) {
        this.mContext = context;
        this.mBaseApkPathHistory = baseApkPathHistory;
    }

    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, SoSource[] soSourceArr) {
        String str = this.mContext.getApplicationInfo().sourceDir;
        if (!new File(str).exists()) {
            StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Base apk does not exist: ", str, ". ");
            this.mBaseApkPathHistory.report(m2m);
            throw new NoBaseApkException(m2m.toString(), unsatisfiedLinkError);
        }
        LogUtil.w(TAG, "Base apk exists: " + str);
        return false;
    }
}
