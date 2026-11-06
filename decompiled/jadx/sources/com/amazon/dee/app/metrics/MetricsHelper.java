package com.amazon.dee.app.metrics;

import androidx.annotation.VisibleForTesting;
import com.amazon.dee.app.services.logging.Log;
import com.amazon.dee.app.util.FireOsVersion;
import com.dee.app.contacts.common.constants.Constants;
import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u0005H\u0007J\b\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\n\n\u0002\u0010\f\u0012\u0004\b\u000b\u0010\u0003¨\u0006\u000e"}, d2 = {"Lcom/amazon/dee/app/metrics/MetricsHelper;", "", "<init>", "()V", Constants.LOG_TAG, "", "ANDROID", "FIRE_OS", "OBERLIN", "isFireOS", "", "isFireOS$annotations", "Ljava/lang/Boolean;", "getOsType", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MetricsHelper {

    @NotNull
    private static final String ANDROID = "ANDROID";

    @NotNull
    private static final String FIRE_OS = "FIRE_OS";

    @NotNull
    private static final String OBERLIN = "5.3.6.4";

    @JvmField
    @Nullable
    public static Boolean isFireOS;

    @NotNull
    public static final MetricsHelper INSTANCE = new MetricsHelper();

    @NotNull
    private static final String TAG = Log.tag((Class<?>) MetricsHelper.class);

    private MetricsHelper() {
    }

    @JvmStatic
    @NotNull
    public static final String getOsType() {
        return isFireOS() ? "FIRE_OS" : "ANDROID";
    }

    @JvmStatic
    public static final boolean isFireOS() {
        if (isFireOS == null) {
            isFireOS = Boolean.valueOf(new FireOsVersion().getIsFireOS());
        }
        return Intrinsics.areEqual(isFireOS, Boolean.TRUE);
    }

    @VisibleForTesting
    public static /* synthetic */ void isFireOS$annotations() {
    }
}
