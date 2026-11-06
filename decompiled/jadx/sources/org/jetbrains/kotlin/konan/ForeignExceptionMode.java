package org.jetbrains.kotlin.konan;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lorg/jetbrains/kotlin/konan/ForeignExceptionMode;", "", "()V", "Companion", "Mode", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class ForeignExceptionMode {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String manifestKey = "foreignExceptionMode";

    /* renamed from: default, reason: not valid java name */
    @NotNull
    private static final Mode f357default = Mode.TERMINATE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lorg/jetbrains/kotlin/konan/ForeignExceptionMode$Mode;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TERMINATE", "OBJC_WRAP", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Mode {
        TERMINATE("terminate"),
        OBJC_WRAP("objc-wrap");


        @NotNull
        private final String value;

        Mode(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lorg/jetbrains/kotlin/konan/ForeignExceptionMode$Companion;", "", "()V", "default", "Lorg/jetbrains/kotlin/konan/ForeignExceptionMode$Mode;", "getDefault", "()Lorg/jetbrains/kotlin/konan/ForeignExceptionMode$Mode;", "manifestKey", "", "getManifestKey", "()Ljava/lang/String;", "byValue", "value", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension({"SMAP\nExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exceptions.kt\norg/jetbrains/kotlin/konan/ForeignExceptionMode$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Mode byValue(@Nullable String value) {
            Mode mode;
            if (value == null) {
                return getDefault();
            }
            Mode[] values = Mode.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    mode = null;
                    break;
                }
                mode = values[i];
                if (Intrinsics.areEqual(mode.getValue(), value)) {
                    break;
                }
                i++;
            }
            if (mode != null) {
                return mode;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Illegal ForeignExceptionMode ".concat(value));
            return null;
        }

        @NotNull
        public final Mode getDefault() {
            return ForeignExceptionMode.f357default;
        }

        @NotNull
        public final String getManifestKey() {
            return ForeignExceptionMode.manifestKey;
        }

        private Companion() {
        }
    }
}
