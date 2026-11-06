package com.amazon.alexa.mobile.assistant.client.utils;

import android.app.KeyguardManager;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.mobile.assistant.capabilities.iocomponents.LockStateProvider;
import com.amazon.alexa.ra.core.data.model.ActionItem$$ExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/utils/KeyguardLockStateProvider;", "Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/LockStateProvider;", "keyguardManager", "Landroid/app/KeyguardManager;", "isKHTablet", "Lkotlin/Function0;", "", "<init>", "(Landroid/app/KeyguardManager;Lkotlin/jvm/functions/Function0;)V", "isDeviceLocked", "isDeviceSecure", "isSwipeLockEnforced", "isSwipeLocked", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class KeyguardLockStateProvider implements LockStateProvider {
    public static final int $stable = 8;

    @NotNull
    private final Function0<Boolean> isKHTablet;

    @NotNull
    private final KeyguardManager keyguardManager;

    public KeyguardLockStateProvider(@NotNull KeyguardManager keyguardManager, @NotNull Function0<Boolean> function0) {
        keyguardManager.getClass();
        function0.getClass();
        this.keyguardManager = keyguardManager;
        this.isKHTablet = function0;
    }

    private final boolean isSwipeLocked() {
        return this.keyguardManager.isKeyguardLocked() && !isDeviceSecure();
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.iocomponents.LockStateProvider
    public boolean isDeviceLocked() {
        return this.keyguardManager.isDeviceLocked();
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.iocomponents.LockStateProvider
    public boolean isDeviceSecure() {
        return this.keyguardManager.isDeviceSecure();
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.iocomponents.LockStateProvider
    public boolean isSwipeLockEnforced() {
        return this.isKHTablet.invoke().booleanValue() && isSwipeLocked();
    }

    public /* synthetic */ KeyguardLockStateProvider(KeyguardManager keyguardManager, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(keyguardManager, (i & 2) != 0 ? new ActionItem$$ExternalSyntheticLambda0(5) : function0);
    }
}
