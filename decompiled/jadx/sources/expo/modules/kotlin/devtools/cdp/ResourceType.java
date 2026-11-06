package expo.modules.kotlin.devtools.cdp;

import com.amazon.coral.profiler.ProfilerCategory;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lexpo/modules/kotlin/devtools/cdp/ResourceType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "IMAGE", "MEDIA", "FONT", "SCRIPT", "FETCH", "OTHER", "Companion", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ResourceType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ResourceType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String value;
    public static final ResourceType IMAGE = new ResourceType("IMAGE", 0, "Image");
    public static final ResourceType MEDIA = new ResourceType("MEDIA", 1, "Media");
    public static final ResourceType FONT = new ResourceType("FONT", 2, "Font");
    public static final ResourceType SCRIPT = new ResourceType("SCRIPT", 3, "Script");
    public static final ResourceType FETCH = new ResourceType("FETCH", 4, "Fetch");
    public static final ResourceType OTHER = new ResourceType("OTHER", 5, ProfilerCategory.OTHER);

    private static final /* synthetic */ ResourceType[] $values() {
        return new ResourceType[]{IMAGE, MEDIA, FONT, SCRIPT, FETCH, OTHER};
    }

    static {
        ResourceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private ResourceType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<ResourceType> getEntries() {
        return $ENTRIES;
    }

    public static ResourceType valueOf(String str) {
        return (ResourceType) Enum.valueOf(ResourceType.class, str);
    }

    public static ResourceType[] values() {
        return (ResourceType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/kotlin/devtools/cdp/ResourceType$Companion;", "", "<init>", "()V", "fromMimeType", "Lexpo/modules/kotlin/devtools/cdp/ResourceType;", "mimeType", "", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ResourceType fromMimeType(@NotNull String mimeType) {
            boolean startsWith$default;
            boolean startsWith$default2;
            boolean startsWith$default3;
            boolean startsWith$default4;
            mimeType.getClass();
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(mimeType, "image/", false, 2, null);
            if (startsWith$default) {
                return ResourceType.IMAGE;
            }
            startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(mimeType, "audio", false, 2, null);
            if (!startsWith$default2) {
                startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(mimeType, "video", false, 2, null);
                if (!startsWith$default3) {
                    startsWith$default4 = StringsKt__StringsJVMKt.startsWith$default(mimeType, "font", false, 2, null);
                    return startsWith$default4 ? ResourceType.FONT : ResourceType.OTHER;
                }
            }
            return ResourceType.MEDIA;
        }

        private Companion() {
        }
    }
}
