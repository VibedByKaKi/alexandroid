package com.amazon.alexa.accessoryclient.common.api;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.AccessoryTransport;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/api/AccessoryTransportChange;", "", "oldAccessory", "Lcom/amazon/alexa/accessory/Accessory;", "oldTransport", "Lcom/amazon/alexa/accessory/AccessoryTransport$Type;", "newAccessory", "newTransport", "(Lcom/amazon/alexa/accessory/Accessory;Lcom/amazon/alexa/accessory/AccessoryTransport$Type;Lcom/amazon/alexa/accessory/Accessory;Lcom/amazon/alexa/accessory/AccessoryTransport$Type;)V", "getNewAccessory", "()Lcom/amazon/alexa/accessory/Accessory;", "getNewTransport", "()Lcom/amazon/alexa/accessory/AccessoryTransport$Type;", "getOldAccessory", "getOldTransport", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AccessoryTransportChange {

    @NotNull
    private final Accessory newAccessory;

    @NotNull
    private final AccessoryTransport.Type newTransport;

    @NotNull
    private final Accessory oldAccessory;

    @NotNull
    private final AccessoryTransport.Type oldTransport;

    public AccessoryTransportChange(@NotNull Accessory accessory, @NotNull AccessoryTransport.Type type, @NotNull Accessory accessory2, @NotNull AccessoryTransport.Type type2) {
        accessory.getClass();
        type.getClass();
        accessory2.getClass();
        type2.getClass();
        this.oldAccessory = accessory;
        this.oldTransport = type;
        this.newAccessory = accessory2;
        this.newTransport = type2;
    }

    public static /* synthetic */ AccessoryTransportChange copy$default(AccessoryTransportChange accessoryTransportChange, Accessory accessory, AccessoryTransport.Type type, Accessory accessory2, AccessoryTransport.Type type2, int i, Object obj) {
        if ((i & 1) != 0) {
            accessory = accessoryTransportChange.oldAccessory;
        }
        if ((i & 2) != 0) {
            type = accessoryTransportChange.oldTransport;
        }
        if ((i & 4) != 0) {
            accessory2 = accessoryTransportChange.newAccessory;
        }
        if ((i & 8) != 0) {
            type2 = accessoryTransportChange.newTransport;
        }
        return accessoryTransportChange.copy(accessory, type, accessory2, type2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Accessory getOldAccessory() {
        return this.oldAccessory;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AccessoryTransport.Type getOldTransport() {
        return this.oldTransport;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Accessory getNewAccessory() {
        return this.newAccessory;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final AccessoryTransport.Type getNewTransport() {
        return this.newTransport;
    }

    @NotNull
    public final AccessoryTransportChange copy(@NotNull Accessory oldAccessory, @NotNull AccessoryTransport.Type oldTransport, @NotNull Accessory newAccessory, @NotNull AccessoryTransport.Type newTransport) {
        oldAccessory.getClass();
        oldTransport.getClass();
        newAccessory.getClass();
        newTransport.getClass();
        return new AccessoryTransportChange(oldAccessory, oldTransport, newAccessory, newTransport);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessoryTransportChange)) {
            return false;
        }
        AccessoryTransportChange accessoryTransportChange = (AccessoryTransportChange) other;
        return Intrinsics.areEqual(this.oldAccessory, accessoryTransportChange.oldAccessory) && this.oldTransport == accessoryTransportChange.oldTransport && Intrinsics.areEqual(this.newAccessory, accessoryTransportChange.newAccessory) && this.newTransport == accessoryTransportChange.newTransport;
    }

    @NotNull
    public final Accessory getNewAccessory() {
        return this.newAccessory;
    }

    @NotNull
    public final AccessoryTransport.Type getNewTransport() {
        return this.newTransport;
    }

    @NotNull
    public final Accessory getOldAccessory() {
        return this.oldAccessory;
    }

    @NotNull
    public final AccessoryTransport.Type getOldTransport() {
        return this.oldTransport;
    }

    public int hashCode() {
        return this.newTransport.hashCode() + ((this.newAccessory.hashCode() + ((this.oldTransport.hashCode() + (this.oldAccessory.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "AccessoryTransportChange(oldAccessory=" + this.oldAccessory + ", oldTransport=" + this.oldTransport + ", newAccessory=" + this.newAccessory + ", newTransport=" + this.newTransport + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
