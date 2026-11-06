package com.amazon.tarazed.utility;

import android.content.SharedPreferences;
import com.amazon.dee.app.storage.BobDispatchEndpointContentProvider;
import com.amazon.tarazed.metrics.TarazedMetricsHelper;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/tarazed/utility/AccountPreferences;", "", "sharedPreferences", "Lcom/amazon/tarazed/utility/TarazedSharedPreferences;", "metrics", "Lcom/amazon/tarazed/metrics/TarazedMetricsHelper;", "(Lcom/amazon/tarazed/utility/TarazedSharedPreferences;Lcom/amazon/tarazed/metrics/TarazedMetricsHelper;)V", "value", "", "deviceEnvironment", "getDeviceEnvironment", "()Ljava/lang/String;", "setDeviceEnvironment", "(Ljava/lang/String;)V", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class AccountPreferences {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String DEVICE_ENVIRONMENT = "deviceEnvironment";

    @NotNull
    private static final String METRIC_SHARED_PREFERENCES_EDITOR_UNAVAILABLE = "SharedPreferencesEditorUnavailable";

    @NotNull
    private static final String TAG = "AccountPreferences";

    @NotNull
    private final TarazedMetricsHelper metrics;

    @NotNull
    private final TarazedSharedPreferences sharedPreferences;

    public AccountPreferences(@NotNull TarazedSharedPreferences tarazedSharedPreferences, @NotNull TarazedMetricsHelper tarazedMetricsHelper) {
        tarazedSharedPreferences.getClass();
        tarazedMetricsHelper.getClass();
        this.sharedPreferences = tarazedSharedPreferences;
        this.metrics = tarazedMetricsHelper;
    }

    @Nullable
    public final String getDeviceEnvironment() {
        return this.sharedPreferences.getString("deviceEnvironment", BobDispatchEndpointContentProvider.PROD);
    }

    public final void setDeviceEnvironment(@Nullable String str) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        if (edit != null) {
            edit.putString("deviceEnvironment", str).apply();
        } else {
            this.metrics.addCount(TAG, METRIC_SHARED_PREFERENCES_EDITOR_UNAVAILABLE, 1.0d);
            Single$$ExternalSyntheticBUOutline0.m("Shared preferences editor is unavailable");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/amazon/tarazed/utility/AccountPreferences$Companion;", "", "()V", "DEVICE_ENVIRONMENT", "", "METRIC_SHARED_PREFERENCES_EDITOR_UNAVAILABLE", Constants.LOG_TAG, "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
