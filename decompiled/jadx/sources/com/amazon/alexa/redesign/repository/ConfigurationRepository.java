package com.amazon.alexa.redesign.repository;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.utils.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0016\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/redesign/repository/ConfigurationRepository;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "servicesStartMessageSent", "", "getServicesStartMessageSent", "()Z", "setServicesStartMessageSent", "(Z)V", "ttcMessageSent", "getTtcMessageSent", "setTtcMessageSent", "isColdStart", "setColdStart", "getAndClear", "", "key", "", "hasPersistentData", "clearKey", "", "persistReturnPosition", Constants.RETURN_POSITION, Constants.RETURN_OFFSET, "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ConfigurationRepository {
    public static final int $stable = 8;
    private boolean isColdStart;
    private boolean servicesStartMessageSent;

    @NotNull
    private final SharedPreferences sharedPreferences;
    private boolean ttcMessageSent;

    public ConfigurationRepository(@NotNull Context context) {
        context.getClass();
        this.isColdStart = true;
        this.sharedPreferences = context.getSharedPreferences(Constants.HOME_SHARED_PREFERENCES, 0);
    }

    private final void clearKey(String key) {
        this.sharedPreferences.edit().remove(key).commit();
    }

    private final boolean hasPersistentData(String key) {
        return this.sharedPreferences.contains(key);
    }

    public final int getAndClear(@NotNull String key) {
        key.getClass();
        if (!hasPersistentData(key)) {
            return 0;
        }
        int i = this.sharedPreferences.getInt(key, 0);
        clearKey(key);
        return i;
    }

    public final boolean getServicesStartMessageSent() {
        return this.servicesStartMessageSent;
    }

    public final boolean getTtcMessageSent() {
        return this.ttcMessageSent;
    }

    /* renamed from: isColdStart, reason: from getter */
    public final boolean getIsColdStart() {
        return this.isColdStart;
    }

    public final void persistReturnPosition(int returnPosition, int returnOffset) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putInt(Constants.RETURN_POSITION, returnPosition);
        edit.putInt(Constants.RETURN_OFFSET, returnOffset);
        edit.apply();
    }

    public final void setColdStart(boolean z) {
        this.isColdStart = z;
    }

    public final void setServicesStartMessageSent(boolean z) {
        this.servicesStartMessageSent = z;
    }

    public final void setTtcMessageSent(boolean z) {
        this.ttcMessageSent = z;
    }
}
