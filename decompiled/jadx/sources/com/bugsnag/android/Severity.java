package com.bugsnag.android;

import com.amazon.alexa.enrollment.dialogs.DialogConstants;
import com.amazon.alexa.mobilytics.event.LogLevel;
import com.bugsnag.android.JsonStream;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/bugsnag/android/Severity;", "", "Lcom/bugsnag/android/JsonStream$Streamable;", "str", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toStream", "", "writer", "Lcom/bugsnag/android/JsonStream;", "ERROR", "WARNING", "INFO", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public enum Severity implements JsonStream.Streamable {
    ERROR("error"),
    WARNING("warning"),
    INFO(LogLevel.INFO);


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String str;

    Severity(String str) {
        this.str = str;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(@NotNull JsonStream writer) throws IOException {
        writer.getClass();
        writer.value(this.str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/Severity$Companion;", "", "()V", "fromDescriptor", "Lcom/bugsnag/android/Severity;", DialogConstants.DESC, "", "fromDescriptor$bugsnag_android_core_release", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public final Severity fromDescriptor$bugsnag_android_core_release(@NotNull String desc) {
            desc.getClass();
            for (Severity severity : Severity.values()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(severity.str, desc)) {
                    return severity;
                }
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
