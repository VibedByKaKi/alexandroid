package com.amazon.alexa.ra.ui.fragments.smartfragment;

import com.amazon.devicesetupservice.scap.v1.BleConnectionPriority;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/ra/ui/fragments/smartfragment/ContentDensity;", "", "<init>", "(Ljava/lang/String;I)V", BleConnectionPriority.LOW, BleConnectionPriority.HIGH, "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ContentDensity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContentDensity[] $VALUES;
    public static final ContentDensity LOW = new ContentDensity(BleConnectionPriority.LOW, 0);
    public static final ContentDensity HIGH = new ContentDensity(BleConnectionPriority.HIGH, 1);

    private static final /* synthetic */ ContentDensity[] $values() {
        return new ContentDensity[]{LOW, HIGH};
    }

    static {
        ContentDensity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ContentDensity(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ContentDensity> getEntries() {
        return $ENTRIES;
    }

    public static ContentDensity valueOf(String str) {
        return (ContentDensity) Enum.valueOf(ContentDensity.class, str);
    }

    public static ContentDensity[] values() {
        return (ContentDensity[]) $VALUES.clone();
    }
}
