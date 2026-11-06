package com.bugsnag.android.ndk;

import com.bugsnag.android.JsonStream;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/ndk/OpaqueValue;", "", "json", "", "(Ljava/lang/String;)V", "getJson", "()Ljava/lang/String;", "Companion", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class OpaqueValue {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int MAX_NDK_STRING_LENGTH = 64;
    private static final int US_ASCII_MAX_CODEPOINT = 127;

    @NotNull
    private final String json;

    public OpaqueValue(@NotNull String str) {
        str.getClass();
        this.json = str;
    }

    @NotNull
    public final String getJson() {
        return this.json;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bugsnag/android/ndk/OpaqueValue$Companion;", "", "()V", "MAX_NDK_STRING_LENGTH", "", "US_ASCII_MAX_CODEPOINT", "encode", "", "value", "isStringNDKSupported", "", "makeSafe", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        private final String encode(Object value) {
            StringWriter stringWriter = new StringWriter();
            try {
                new JsonStream(stringWriter).value(value, true);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(stringWriter, null);
                String stringWriter2 = stringWriter.toString();
                stringWriter2.getClass();
                return stringWriter2;
            } finally {
            }
        }

        private final boolean isStringNDKSupported(String value) {
            if (value.length() >= 64) {
                return false;
            }
            for (int i = 0; i < value.length(); i++) {
                if (value.charAt(i) > 127) {
                    byte[] bytes = value.getBytes(Charsets.UTF_8);
                    bytes.getClass();
                    return bytes.length < 64;
                }
            }
            return true;
        }

        @Nullable
        public final Object makeSafe(@Nullable Object value) {
            if (value instanceof Boolean) {
                return value;
            }
            if (value instanceof Number) {
                return value;
            }
            boolean z = value instanceof String;
            if (z && isStringNDKSupported((String) value)) {
                return value;
            }
            if (z || (value instanceof Map) || (value instanceof Collection)) {
                return new OpaqueValue(encode(value));
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
