package com.amazon.alexa.mobile.assistant.capabilities.iocomponents;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/DefaultDeviceIOComponentsStateProvider;", "Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/DeviceIOComponentsStateProvider;", "deviceType", "", "deviceSerialNumber", "firmwareVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirmwareVersion", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class DefaultDeviceIOComponentsStateProvider extends DeviceIOComponentsStateProvider {

    @Nullable
    private final String firmwareVersion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDeviceIOComponentsStateProvider(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        super(str, str2);
        str.getClass();
        str2.getClass();
        this.firmwareVersion = str3;
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.iocomponents.DeviceIOComponentsStateProvider
    @Nullable
    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }
}
