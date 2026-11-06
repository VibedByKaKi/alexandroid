package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.client.alexaservice.voicechat.VoiceChatContract;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/KHKeepAliveFlag;", "", "<init>", "()V", VoiceChatContract.COLUMN_IS_ACTIVE, "", "isActive$annotations", "()Z", "setActive", "(Z)V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class KHKeepAliveFlag {
    private static volatile boolean isActive;

    @NotNull
    public static final KHKeepAliveFlag INSTANCE = new KHKeepAliveFlag();
    public static final int $stable = 8;

    private KHKeepAliveFlag() {
    }

    public static final boolean isActive() {
        return isActive;
    }

    public static final void setActive(boolean z) {
        isActive = z;
    }

    @JvmStatic
    public static /* synthetic */ void isActive$annotations() {
    }
}
