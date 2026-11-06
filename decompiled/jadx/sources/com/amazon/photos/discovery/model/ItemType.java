package com.amazon.photos.discovery.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/amazon/photos/discovery/model/ItemType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "PHOTO", "VIDEO", "Companion", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ItemType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ItemType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final ItemType PHOTO = new ItemType("PHOTO", 0, 0);
    public static final ItemType VIDEO = new ItemType("VIDEO", 1, 1);
    private final int value;

    private static final /* synthetic */ ItemType[] $values() {
        return new ItemType[]{PHOTO, VIDEO};
    }

    static {
        ItemType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private ItemType(String str, int i, int i2) {
        this.value = i2;
    }

    @NotNull
    public static EnumEntries<ItemType> getEntries() {
        return $ENTRIES;
    }

    public static ItemType valueOf(String str) {
        return (ItemType) Enum.valueOf(ItemType.class, str);
    }

    public static ItemType[] values() {
        return (ItemType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/photos/discovery/model/ItemType$Companion;", "", "()V", "toItemType", "Lcom/amazon/photos/discovery/model/ItemType;", "value", "", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nItemType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemType.kt\ncom/amazon/photos/discovery/model/ItemType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ItemType toItemType(int value) {
            if (value >= 0 && value < ItemType.values().length) {
                return ItemType.values()[value];
            }
            throw new IllegalArgumentException((value + " does not correspond to any ItemType.").toString());
        }

        private Companion() {
        }
    }
}
