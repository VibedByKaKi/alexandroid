package com.amazon.alexa.mobile.assistant.client.device;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.assistant.foundation.authorization.AuthorizationMetadata;
import com.amazon.alexa.assistant.foundation.authorization.AuthorizationResult;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014BI\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u000e\u001a\u00020\nJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0006\u0010\u0012\u001a\u00020\nJ\u0006\u0010\u0013\u001a\u00020\nR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/device/DeviceInformationProvider;", "", "storage", "Lkotlin/Lazy;", "Lcom/amazon/alexa/mobile/assistant/client/device/DevicePersistentStorage;", "authResultFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/amazon/alexa/assistant/foundation/authorization/AuthorizationResult;", "deviceSerialNumberFallback", "Lkotlin/Function0;", "", "deviceTypeFallback", "<init>", "(Lkotlin/Lazy;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getDeviceSerialNumber", "getAndroidId", "context", "Landroid/content/Context;", "getDeviceId", "getDeviceType", "Companion", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceInformationProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInformationProvider.kt\ncom/amazon/alexa/mobile/assistant/client/device/DeviceInformationProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
/* loaded from: classes18.dex */
public final class DeviceInformationProvider {

    @NotNull
    private static final String TAG = "DeviceInformationProvider";

    @NotNull
    private static final String VOX_DEVICE_TYPE = "A2TF17PFR55MTB";

    @NotNull
    private final StateFlow<AuthorizationResult> authResultFlow;

    @NotNull
    private final Function0<String> deviceSerialNumberFallback;

    @NotNull
    private final Function0<String> deviceTypeFallback;

    @NotNull
    private final Lazy<DevicePersistentStorage> storage;
    public static final int $stable = 8;

    public DeviceInformationProvider(@NotNull Lazy<DevicePersistentStorage> lazy, @NotNull StateFlow<AuthorizationResult> stateFlow, @NotNull Function0<String> function0, @NotNull Function0<String> function02) {
        lazy.getClass();
        stateFlow.getClass();
        function0.getClass();
        function02.getClass();
        this.storage = lazy;
        this.authResultFlow = stateFlow;
        this.deviceSerialNumberFallback = function0;
        this.deviceTypeFallback = function02;
    }

    @SuppressLint({"HardwareIds"})
    @Nullable
    public final String getAndroidId(@NotNull Context context) {
        context.getClass();
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    @NotNull
    public final String getDeviceId() {
        String deviceId = this.storage.getValue().getDeviceId();
        if (deviceId != null) {
            return deviceId;
        }
        String m = TableInfo$$ExternalSyntheticOutline0.m();
        this.storage.getValue().setDeviceId(m);
        return m;
    }

    @NotNull
    public final String getDeviceSerialNumber() {
        AuthorizationMetadata metadata;
        String deviceSerialNumber;
        AuthorizationResult value = this.authResultFlow.getValue();
        if (value != null && (metadata = value.getMetadata()) != null && (deviceSerialNumber = metadata.getDeviceSerialNumber()) != null) {
            return deviceSerialNumber;
        }
        String invoke = this.deviceSerialNumberFallback.invoke();
        if (invoke != null) {
            return invoke;
        }
        Single$$ExternalSyntheticBUOutline0.m$1("DSN is not initialized yet");
        return null;
    }

    @NotNull
    public final String getDeviceType() {
        AuthorizationMetadata metadata;
        String deviceType;
        AuthorizationResult value = this.authResultFlow.getValue();
        if (value != null && (metadata = value.getMetadata()) != null && (deviceType = metadata.getDeviceType()) != null) {
            return deviceType;
        }
        String invoke = this.deviceTypeFallback.invoke();
        if (invoke != null) {
            return invoke;
        }
        Log.w(TAG, "Device type is not retrieved so using VOX as default");
        return "A2TF17PFR55MTB";
    }

    public /* synthetic */ DeviceInformationProvider(Lazy lazy, StateFlow stateFlow, Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazy, stateFlow, (i & 4) != 0 ? new Function0() { // from class: com.amazon.alexa.mobile.assistant.client.device.DeviceInformationProvider.1
            @Override // kotlin.jvm.functions.Function0
            public final Void invoke() {
                return null;
            }
        } : function0, (i & 8) != 0 ? new Function0() { // from class: com.amazon.alexa.mobile.assistant.client.device.DeviceInformationProvider.2
            @Override // kotlin.jvm.functions.Function0
            public final Void invoke() {
                return null;
            }
        } : function02);
    }
}
