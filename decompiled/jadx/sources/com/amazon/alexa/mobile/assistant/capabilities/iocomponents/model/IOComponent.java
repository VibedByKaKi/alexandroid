package com.amazon.alexa.mobile.assistant.capabilities.iocomponents.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000223B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0013J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JE\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0010HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001J%\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0001¢\u0006\u0002\b1R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00064"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/IOComponent;", "", "type", "Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/IOComponentType;", "connection", "Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/Connection;", "deviceInfo", "Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/DeviceInfo;", "clusterDevice", "Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/ClusterDevice;", "context", "", "Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/IOComponentContext;", "<init>", "(Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/IOComponentType;Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/Connection;Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/DeviceInfo;Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/ClusterDevice;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/IOComponentType;Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/Connection;Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/DeviceInfo;Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/ClusterDevice;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType", "()Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/IOComponentType;", "getConnection", "()Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/Connection;", "getDeviceInfo", "()Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/DeviceInfo;", "getClusterDevice", "()Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/ClusterDevice;", "getContext", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "write$Self", "", "self", ContactsModuleConstants.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$capabilities_release", "$serializer", "Companion", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes18.dex */
public final /* data */ class IOComponent {

    @Nullable
    private final ClusterDevice clusterDevice;

    @NotNull
    private final Connection connection;

    @Nullable
    private final List<IOComponentContext> context;

    @NotNull
    private final DeviceInfo deviceInfo;

    @NotNull
    private final IOComponentType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {IOComponentType.INSTANCE.serializer(), null, null, null, new ArrayListSerializer(IOComponentContext$$serializer.INSTANCE)};

    public /* synthetic */ IOComponent(int i, IOComponentType iOComponentType, Connection connection, DeviceInfo deviceInfo, ClusterDevice clusterDevice, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, IOComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.type = iOComponentType;
        this.connection = connection;
        this.deviceInfo = deviceInfo;
        if ((i & 8) == 0) {
            this.clusterDevice = null;
        } else {
            this.clusterDevice = clusterDevice;
        }
        if ((i & 16) == 0) {
            this.context = null;
        } else {
            this.context = list;
        }
    }

    public static /* synthetic */ IOComponent copy$default(IOComponent iOComponent, IOComponentType iOComponentType, Connection connection, DeviceInfo deviceInfo, ClusterDevice clusterDevice, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            iOComponentType = iOComponent.type;
        }
        if ((i & 2) != 0) {
            connection = iOComponent.connection;
        }
        if ((i & 4) != 0) {
            deviceInfo = iOComponent.deviceInfo;
        }
        if ((i & 8) != 0) {
            clusterDevice = iOComponent.clusterDevice;
        }
        if ((i & 16) != 0) {
            list = iOComponent.context;
        }
        List list2 = list;
        DeviceInfo deviceInfo2 = deviceInfo;
        return iOComponent.copy(iOComponentType, connection, deviceInfo2, clusterDevice, list2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$capabilities_release(IOComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.type);
        output.encodeSerializableElement(serialDesc, 1, Connection$$serializer.INSTANCE, self.connection);
        output.encodeSerializableElement(serialDesc, 2, DeviceInfo$$serializer.INSTANCE, self.deviceInfo);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.clusterDevice != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, ClusterDevice$$serializer.INSTANCE, self.clusterDevice);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.context == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, kSerializerArr[4], self.context);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IOComponentType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Connection getConnection() {
        return this.connection;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final ClusterDevice getClusterDevice() {
        return this.clusterDevice;
    }

    @Nullable
    public final List<IOComponentContext> component5() {
        return this.context;
    }

    @NotNull
    public final IOComponent copy(@NotNull IOComponentType type, @NotNull Connection connection, @NotNull DeviceInfo deviceInfo, @Nullable ClusterDevice clusterDevice, @Nullable List<IOComponentContext> context) {
        type.getClass();
        connection.getClass();
        deviceInfo.getClass();
        return new IOComponent(type, connection, deviceInfo, clusterDevice, context);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IOComponent)) {
            return false;
        }
        IOComponent iOComponent = (IOComponent) other;
        return this.type == iOComponent.type && Intrinsics.areEqual(this.connection, iOComponent.connection) && Intrinsics.areEqual(this.deviceInfo, iOComponent.deviceInfo) && Intrinsics.areEqual(this.clusterDevice, iOComponent.clusterDevice) && Intrinsics.areEqual(this.context, iOComponent.context);
    }

    @Nullable
    public final ClusterDevice getClusterDevice() {
        return this.clusterDevice;
    }

    @NotNull
    public final Connection getConnection() {
        return this.connection;
    }

    @Nullable
    public final List<IOComponentContext> getContext() {
        return this.context;
    }

    @NotNull
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    public final IOComponentType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (this.deviceInfo.hashCode() + ((this.connection.hashCode() + (this.type.hashCode() * 31)) * 31)) * 31;
        ClusterDevice clusterDevice = this.clusterDevice;
        int hashCode2 = (hashCode + (clusterDevice == null ? 0 : clusterDevice.hashCode())) * 31;
        List<IOComponentContext> list = this.context;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        IOComponentType iOComponentType = this.type;
        Connection connection = this.connection;
        DeviceInfo deviceInfo = this.deviceInfo;
        ClusterDevice clusterDevice = this.clusterDevice;
        List<IOComponentContext> list = this.context;
        StringBuilder sb = new StringBuilder("IOComponent(type=");
        sb.append(iOComponentType);
        sb.append(", connection=");
        sb.append(connection);
        sb.append(", deviceInfo=");
        sb.append(deviceInfo);
        sb.append(", clusterDevice=");
        sb.append(clusterDevice);
        sb.append(", context=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, list, sb);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/IOComponent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/IOComponent;", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<IOComponent> serializer() {
            return IOComponent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public IOComponent(@NotNull IOComponentType iOComponentType, @NotNull Connection connection, @NotNull DeviceInfo deviceInfo, @Nullable ClusterDevice clusterDevice, @Nullable List<IOComponentContext> list) {
        iOComponentType.getClass();
        connection.getClass();
        deviceInfo.getClass();
        this.type = iOComponentType;
        this.connection = connection;
        this.deviceInfo = deviceInfo;
        this.clusterDevice = clusterDevice;
        this.context = list;
    }

    public /* synthetic */ IOComponent(IOComponentType iOComponentType, Connection connection, DeviceInfo deviceInfo, ClusterDevice clusterDevice, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iOComponentType, connection, deviceInfo, (i & 8) != 0 ? null : clusterDevice, (i & 16) != 0 ? null : list);
    }
}
