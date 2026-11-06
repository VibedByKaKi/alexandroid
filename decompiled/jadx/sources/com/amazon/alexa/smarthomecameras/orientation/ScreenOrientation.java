package com.amazon.alexa.smarthomecameras.orientation;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/smarthomecameras/orientation/ScreenOrientation;", "", "requestedOrientation", "", "<init>", "(Ljava/lang/String;II)V", "getRequestedOrientation", "()I", "PORTRAIT", "LANDSCAPE", "UNSPECIFIED", "Companion", "AlexaMobileAndroidSmartHomeCameras_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ScreenOrientation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ScreenOrientation[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int requestedOrientation;
    public static final ScreenOrientation PORTRAIT = new ScreenOrientation("PORTRAIT", 0, 1);
    public static final ScreenOrientation LANDSCAPE = new ScreenOrientation("LANDSCAPE", 1, 6);
    public static final ScreenOrientation UNSPECIFIED = new ScreenOrientation("UNSPECIFIED", 2, -1);

    private static final /* synthetic */ ScreenOrientation[] $values() {
        return new ScreenOrientation[]{PORTRAIT, LANDSCAPE, UNSPECIFIED};
    }

    static {
        ScreenOrientation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private ScreenOrientation(String str, int i, int i2) {
        this.requestedOrientation = i2;
    }

    @NotNull
    public static EnumEntries<ScreenOrientation> getEntries() {
        return $ENTRIES;
    }

    public static ScreenOrientation valueOf(String str) {
        return (ScreenOrientation) Enum.valueOf(ScreenOrientation.class, str);
    }

    public static ScreenOrientation[] values() {
        return (ScreenOrientation[]) $VALUES.clone();
    }

    public final int getRequestedOrientation() {
        return this.requestedOrientation;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/smarthomecameras/orientation/ScreenOrientation$Companion;", "", "<init>", "()V", "fromName", "Lcom/amazon/alexa/smarthomecameras/orientation/ScreenOrientation;", "name", "", "AlexaMobileAndroidSmartHomeCameras_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nScreenOrientationController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenOrientationController.kt\ncom/amazon/alexa/smarthomecameras/orientation/ScreenOrientation$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n295#2,2:99\n*S KotlinDebug\n*F\n+ 1 ScreenOrientationController.kt\ncom/amazon/alexa/smarthomecameras/orientation/ScreenOrientation$Companion\n*L\n31#1:99,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final ScreenOrientation fromName(@Nullable String name) {
            Object obj;
            Iterator<E> it2 = ScreenOrientation.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (StringsKt.equals(((ScreenOrientation) obj).name(), name, true)) {
                    break;
                }
            }
            return (ScreenOrientation) obj;
        }

        private Companion() {
        }
    }
}
