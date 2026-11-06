package com.amazon.alexa.accessoryclient.common.api;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.AccessoryScanRecord;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/api/AccessoryScanResult;", "", ModelTransformer.KEY_ACCESSORY, "Lcom/amazon/alexa/accessory/Accessory;", ModelTransformer.KEY_ACCESSORY_SCAN_RECORD, "Lcom/amazon/alexa/accessory/AccessoryScanRecord;", "rssi", "", "(Lcom/amazon/alexa/accessory/Accessory;Lcom/amazon/alexa/accessory/AccessoryScanRecord;I)V", "getAccessory", "()Lcom/amazon/alexa/accessory/Accessory;", "getAccessoryScanRecord", "()Lcom/amazon/alexa/accessory/AccessoryScanRecord;", "getRssi", "()I", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AccessoryScanResult {

    @NotNull
    private final Accessory accessory;

    @Nullable
    private final AccessoryScanRecord accessoryScanRecord;
    private final int rssi;

    public AccessoryScanResult(@NotNull Accessory accessory, @Nullable AccessoryScanRecord accessoryScanRecord, int i) {
        accessory.getClass();
        this.accessory = accessory;
        this.accessoryScanRecord = accessoryScanRecord;
        this.rssi = i;
    }

    public static /* synthetic */ AccessoryScanResult copy$default(AccessoryScanResult accessoryScanResult, Accessory accessory, AccessoryScanRecord accessoryScanRecord, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            accessory = accessoryScanResult.accessory;
        }
        if ((i2 & 2) != 0) {
            accessoryScanRecord = accessoryScanResult.accessoryScanRecord;
        }
        if ((i2 & 4) != 0) {
            i = accessoryScanResult.rssi;
        }
        return accessoryScanResult.copy(accessory, accessoryScanRecord, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Accessory getAccessory() {
        return this.accessory;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final AccessoryScanRecord getAccessoryScanRecord() {
        return this.accessoryScanRecord;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRssi() {
        return this.rssi;
    }

    @NotNull
    public final AccessoryScanResult copy(@NotNull Accessory accessory, @Nullable AccessoryScanRecord accessoryScanRecord, int rssi) {
        accessory.getClass();
        return new AccessoryScanResult(accessory, accessoryScanRecord, rssi);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessoryScanResult)) {
            return false;
        }
        AccessoryScanResult accessoryScanResult = (AccessoryScanResult) other;
        return Intrinsics.areEqual(this.accessory, accessoryScanResult.accessory) && Intrinsics.areEqual(this.accessoryScanRecord, accessoryScanResult.accessoryScanRecord) && this.rssi == accessoryScanResult.rssi;
    }

    @NotNull
    public final Accessory getAccessory() {
        return this.accessory;
    }

    @Nullable
    public final AccessoryScanRecord getAccessoryScanRecord() {
        return this.accessoryScanRecord;
    }

    public final int getRssi() {
        return this.rssi;
    }

    public int hashCode() {
        int hashCode = this.accessory.hashCode() * 31;
        AccessoryScanRecord accessoryScanRecord = this.accessoryScanRecord;
        return Integer.hashCode(this.rssi) + ((hashCode + (accessoryScanRecord == null ? 0 : accessoryScanRecord.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        Accessory accessory = this.accessory;
        AccessoryScanRecord accessoryScanRecord = this.accessoryScanRecord;
        int i = this.rssi;
        StringBuilder sb = new StringBuilder("AccessoryScanResult(accessory=");
        sb.append(accessory);
        sb.append(", accessoryScanRecord=");
        sb.append(accessoryScanRecord);
        sb.append(", rssi=");
        return a$$ExternalSyntheticOutline0.m(sb, i, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
