package org.jetbrains.kotlin.konan.target;

import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"targetSuffix", "", "Lorg/jetbrains/kotlin/konan/target/SanitizerKind;", "getTargetSuffix", "(Lorg/jetbrains/kotlin/konan/target/SanitizerKind;)Ljava/lang/String;", "kotlin-native-utils"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class SanitizerKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SanitizerKind.values().length];
            try {
                iArr[SanitizerKind.THREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SanitizerKind.ADDRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String getTargetSuffix(@Nullable SanitizerKind sanitizerKind) {
        int i = sanitizerKind == null ? -1 : WhenMappings.$EnumSwitchMapping$0[sanitizerKind.ordinal()];
        if (i == -1) {
            return "";
        }
        if (i == 1) {
            return "_tsan";
        }
        if (i == 2) {
            return "_asan";
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
