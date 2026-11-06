package org.jetbrains.kotlin.konan;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lorg/jetbrains/kotlin/konan/KonanExternalToolFailure;", "Lorg/jetbrains/kotlin/konan/KonanException;", "message", "", "toolName", "cause", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getToolName", "()Ljava/lang/String;", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class KonanExternalToolFailure extends KonanException {

    @NotNull
    private final String toolName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KonanExternalToolFailure(@NotNull String str, @NotNull String str2, @Nullable Throwable th) {
        super(str, th);
        str.getClass();
        str2.getClass();
        this.toolName = str2;
    }

    @NotNull
    public final String getToolName() {
        return this.toolName;
    }

    public /* synthetic */ KonanExternalToolFailure(String str, String str2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : th);
    }
}
