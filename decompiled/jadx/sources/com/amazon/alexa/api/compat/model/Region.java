package com.amazon.alexa.api.compat.model;

import com.amazon.credentiallocker.CustomerRegion;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/api/compat/model/Region;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", CustomerRegion.EU, "FE", CustomerRegion.NA, "CN", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Region {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Region[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final Region UNKNOWN = new Region("UNKNOWN", 0);
    public static final Region EU = new Region(CustomerRegion.EU, 1);
    public static final Region FE = new Region("FE", 2);
    public static final Region NA = new Region(CustomerRegion.NA, 3);
    public static final Region CN = new Region("CN", 4);

    private static final /* synthetic */ Region[] $values() {
        return new Region[]{UNKNOWN, EU, FE, NA, CN};
    }

    static {
        Region[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private Region(String str, int i) {
    }

    @JvmStatic
    @NotNull
    public static final Region fromString(@NotNull String str) {
        return INSTANCE.fromString(str);
    }

    @NotNull
    public static EnumEntries<Region> getEntries() {
        return $ENTRIES;
    }

    public static Region valueOf(String str) {
        return (Region) Enum.valueOf(Region.class, str);
    }

    public static Region[] values() {
        return (Region[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/api/compat/model/Region$Companion;", "", "<init>", "()V", "fromString", "Lcom/amazon/alexa/api/compat/model/Region;", "value", "", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRegion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Region.kt\ncom/amazon/alexa/api/compat/model/Region$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n295#2,2:28\n*S KotlinDebug\n*F\n+ 1 Region.kt\ncom/amazon/alexa/api/compat/model/Region$Companion\n*L\n24#1:28,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Region fromString(@NotNull String value) {
            Object obj;
            value.getClass();
            Iterator<E> it2 = Region.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (StringsKt.equals(((Region) obj).name(), value, true)) {
                    break;
                }
            }
            Region region = (Region) obj;
            return region == null ? Region.UNKNOWN : region;
        }

        private Companion() {
        }
    }
}
