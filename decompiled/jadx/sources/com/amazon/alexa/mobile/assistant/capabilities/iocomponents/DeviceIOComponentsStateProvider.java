package com.amazon.alexa.mobile.assistant.capabilities.iocomponents;

import com.amazon.alexa.assistant.AssistantBuilder$$ExternalSyntheticLambda15;
import com.amazon.alexa.mobile.assistant.capabilities.iocomponents.model.ClusterDevice;
import com.amazon.alexa.mobile.assistant.capabilities.iocomponents.model.Connection;
import com.amazon.alexa.mobile.assistant.capabilities.iocomponents.model.ConnectionType;
import com.amazon.alexa.mobile.assistant.capabilities.iocomponents.model.DeviceInfo;
import com.amazon.alexa.mobile.assistant.capabilities.iocomponents.model.IOComponent;
import com.amazon.alexa.mobile.assistant.capabilities.iocomponents.model.IOComponentType;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H$J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/DeviceIOComponentsStateProvider;", "Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/IOComponentsStateProvider;", "deviceType", "", "deviceSerialNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFirmwareVersion", "microphoneComponent", "Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/IOComponent;", "getMicrophoneComponent", "()Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/IOComponent;", "microphoneComponent$delegate", "Lkotlin/Lazy;", "createAllIOComponents", "", "createActiveIOComponents", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class DeviceIOComponentsStateProvider implements IOComponentsStateProvider {

    @NotNull
    private final String deviceSerialNumber;

    @NotNull
    private final String deviceType;

    /* renamed from: microphoneComponent$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy microphoneComponent;

    public DeviceIOComponentsStateProvider(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.deviceType = str;
        this.deviceSerialNumber = str2;
        this.microphoneComponent = LazyKt.lazy(new AssistantBuilder$$ExternalSyntheticLambda15(this, 24));
    }

    private final IOComponent getMicrophoneComponent() {
        return (IOComponent) this.microphoneComponent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IOComponent microphoneComponent_delegate$lambda$0(DeviceIOComponentsStateProvider deviceIOComponentsStateProvider) {
        return new IOComponent(IOComponentType.MICROPHONE, new Connection(ConnectionType.MICROPHONE), new DeviceInfo(deviceIOComponentsStateProvider.deviceType, deviceIOComponentsStateProvider.deviceSerialNumber, deviceIOComponentsStateProvider.getFirmwareVersion()), (ClusterDevice) null, (List) null, 24, (DefaultConstructorMarker) null);
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.iocomponents.IOComponentsStateProvider
    @NotNull
    public Set<IOComponent> createActiveIOComponents() {
        return SetsKt.setOf(getMicrophoneComponent());
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.iocomponents.IOComponentsStateProvider
    @NotNull
    public Set<IOComponent> createAllIOComponents() {
        return SetsKt.setOf(getMicrophoneComponent());
    }

    @Nullable
    public abstract String getFirmwareVersion();
}
