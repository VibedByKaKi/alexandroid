package com.amazon.alexa.ra.core.data.fragments;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/ArtifactMimeType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "TEXT_PLAIN", "IMAGE_JPEG", "IMAGE_PNG", "APPLICATION_PDF", "APPLICATION_MS_WORD", "APPLICATION_OPEN_XML", "TEXT_URI_LIST", "TEXT_CALENDER", "TEXT_VCARD", "UNSUPPORTED", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ArtifactMimeType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ArtifactMimeType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String type;
    public static final ArtifactMimeType TEXT_PLAIN = new ArtifactMimeType("TEXT_PLAIN", 0, "text/plain");
    public static final ArtifactMimeType IMAGE_JPEG = new ArtifactMimeType("IMAGE_JPEG", 1, "image/jpeg");
    public static final ArtifactMimeType IMAGE_PNG = new ArtifactMimeType("IMAGE_PNG", 2, "image/png");
    public static final ArtifactMimeType APPLICATION_PDF = new ArtifactMimeType("APPLICATION_PDF", 3, "application/pdf");
    public static final ArtifactMimeType APPLICATION_MS_WORD = new ArtifactMimeType("APPLICATION_MS_WORD", 4, "application/msword");
    public static final ArtifactMimeType APPLICATION_OPEN_XML = new ArtifactMimeType("APPLICATION_OPEN_XML", 5, "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
    public static final ArtifactMimeType TEXT_URI_LIST = new ArtifactMimeType("TEXT_URI_LIST", 6, "text/uri-list");
    public static final ArtifactMimeType TEXT_CALENDER = new ArtifactMimeType("TEXT_CALENDER", 7, "text/calender");
    public static final ArtifactMimeType TEXT_VCARD = new ArtifactMimeType("TEXT_VCARD", 8, "text/vcard");
    public static final ArtifactMimeType UNSUPPORTED = new ArtifactMimeType("UNSUPPORTED", 9, "");

    private static final /* synthetic */ ArtifactMimeType[] $values() {
        return new ArtifactMimeType[]{TEXT_PLAIN, IMAGE_JPEG, IMAGE_PNG, APPLICATION_PDF, APPLICATION_MS_WORD, APPLICATION_OPEN_XML, TEXT_URI_LIST, TEXT_CALENDER, TEXT_VCARD, UNSUPPORTED};
    }

    static {
        ArtifactMimeType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private ArtifactMimeType(String str, int i, String str2) {
        this.type = str2;
    }

    @NotNull
    public static EnumEntries<ArtifactMimeType> getEntries() {
        return $ENTRIES;
    }

    public static ArtifactMimeType valueOf(String str) {
        return (ArtifactMimeType) Enum.valueOf(ArtifactMimeType.class, str);
    }

    public static ArtifactMimeType[] values() {
        return (ArtifactMimeType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/ArtifactMimeType$Companion;", "", "<init>", "()V", "from", "Lcom/amazon/alexa/ra/core/data/fragments/ArtifactMimeType;", "type", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nFragmentData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentData.kt\ncom/amazon/alexa/ra/core/data/fragments/ArtifactMimeType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1375:1\n1#2:1376\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ArtifactMimeType from(@NotNull String type) {
            ArtifactMimeType artifactMimeType;
            type.getClass();
            ArtifactMimeType[] values = ArtifactMimeType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    artifactMimeType = null;
                    break;
                }
                artifactMimeType = values[i];
                if (Intrinsics.areEqual(artifactMimeType.getType(), type)) {
                    break;
                }
                i++;
            }
            return artifactMimeType == null ? ArtifactMimeType.UNSUPPORTED : artifactMimeType;
        }

        private Companion() {
        }
    }
}
