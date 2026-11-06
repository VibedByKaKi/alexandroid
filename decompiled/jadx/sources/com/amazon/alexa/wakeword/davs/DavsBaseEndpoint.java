package com.amazon.alexa.wakeword.davs;

import com.amazon.alexa.api.Region;
import com.amazon.credentiallocker.CustomerRegion;
import com.amazon.dee.app.elements.bridges.LeapfrogSceneAssetsDownloader;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/wakeword/davs/DavsBaseEndpoint;", "", "baseUrl", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getBaseUrl", "()Ljava/lang/String;", CustomerRegion.NA, "FE", CustomerRegion.EU, "Companion", "AVSAndroidClient-pryonprovider_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class DavsBaseEndpoint {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DavsBaseEndpoint[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String baseUrl;
    public static final DavsBaseEndpoint NA = new DavsBaseEndpoint(CustomerRegion.NA, 0, LeapfrogSceneAssetsDownloader.NA_MANIFEST_BASE_URL);
    public static final DavsBaseEndpoint FE = new DavsBaseEndpoint("FE", 1, "https://api.fe.amazonalexa.com/v2/deviceArtifacts/?artifactFilter=");
    public static final DavsBaseEndpoint EU = new DavsBaseEndpoint(CustomerRegion.EU, 2, "https://api.eu.amazonalexa.com/v2/deviceArtifacts/?artifactFilter=");

    private static final /* synthetic */ DavsBaseEndpoint[] $values() {
        return new DavsBaseEndpoint[]{NA, FE, EU};
    }

    static {
        DavsBaseEndpoint[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private DavsBaseEndpoint(String str, int i, String str2) {
        this.baseUrl = str2;
    }

    @JvmStatic
    @NotNull
    public static final DavsBaseEndpoint fromRegion(@NotNull Region region) {
        return INSTANCE.fromRegion(region);
    }

    @NotNull
    public static EnumEntries<DavsBaseEndpoint> getEntries() {
        return $ENTRIES;
    }

    public static DavsBaseEndpoint valueOf(String str) {
        return (DavsBaseEndpoint) Enum.valueOf(DavsBaseEndpoint.class, str);
    }

    public static DavsBaseEndpoint[] values() {
        return (DavsBaseEndpoint[]) $VALUES.clone();
    }

    @NotNull
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/wakeword/davs/DavsBaseEndpoint$Companion;", "", "()V", "fromRegion", "Lcom/amazon/alexa/wakeword/davs/DavsBaseEndpoint;", "region", "Lcom/amazon/alexa/api/Region;", "AVSAndroidClient-pryonprovider_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Region.values().length];
                try {
                    iArr[Region.FE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Region.CN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Region.EU.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final DavsBaseEndpoint fromRegion(@NotNull Region region) {
            region.getClass();
            int i = WhenMappings.$EnumSwitchMapping$0[region.ordinal()];
            return (i == 1 || i == 2) ? DavsBaseEndpoint.FE : i != 3 ? DavsBaseEndpoint.NA : DavsBaseEndpoint.EU;
        }

        private Companion() {
        }
    }
}
