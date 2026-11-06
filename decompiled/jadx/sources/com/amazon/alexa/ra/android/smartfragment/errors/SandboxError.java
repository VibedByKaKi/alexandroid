package com.amazon.alexa.ra.android.smartfragment.errors;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.auth.BuildConfig;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fBA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006 "}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/errors/SandboxError;", "", "name", "", "message", "stack", StackTraceHelper.IS_FATAL_KEY, "", "bridgeId", "viewId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getMessage", "getStack", "()Z", "getBridgeId", "getViewId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class SandboxError {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String bridgeId;
    private final boolean isFatal;

    @NotNull
    private final String message;

    @NotNull
    private final String name;

    @Nullable
    private final String stack;

    @Nullable
    private final String viewId;

    public /* synthetic */ SandboxError(String str, String str2, String str3, boolean z, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, str4, (i & 32) != 0 ? null : str5);
    }

    public static /* synthetic */ SandboxError copy$default(SandboxError sandboxError, String str, String str2, String str3, boolean z, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sandboxError.name;
        }
        if ((i & 2) != 0) {
            str2 = sandboxError.message;
        }
        if ((i & 4) != 0) {
            str3 = sandboxError.stack;
        }
        if ((i & 8) != 0) {
            z = sandboxError.isFatal;
        }
        if ((i & 16) != 0) {
            str4 = sandboxError.bridgeId;
        }
        if ((i & 32) != 0) {
            str5 = sandboxError.viewId;
        }
        String str6 = str4;
        String str7 = str5;
        return sandboxError.copy(str, str2, str3, z, str6, str7);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getStack() {
        return this.stack;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsFatal() {
        return this.isFatal;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getBridgeId() {
        return this.bridgeId;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getViewId() {
        return this.viewId;
    }

    @NotNull
    public final SandboxError copy(@NotNull String name, @NotNull String message, @Nullable String stack, boolean isFatal, @NotNull String bridgeId, @Nullable String viewId) {
        name.getClass();
        message.getClass();
        bridgeId.getClass();
        return new SandboxError(name, message, stack, isFatal, bridgeId, viewId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SandboxError)) {
            return false;
        }
        SandboxError sandboxError = (SandboxError) other;
        return Intrinsics.areEqual(this.name, sandboxError.name) && Intrinsics.areEqual(this.message, sandboxError.message) && Intrinsics.areEqual(this.stack, sandboxError.stack) && this.isFatal == sandboxError.isFatal && Intrinsics.areEqual(this.bridgeId, sandboxError.bridgeId) && Intrinsics.areEqual(this.viewId, sandboxError.viewId);
    }

    @NotNull
    public final String getBridgeId() {
        return this.bridgeId;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getStack() {
        return this.stack;
    }

    @Nullable
    public final String getViewId() {
        return this.viewId;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.message);
        String str = this.stack;
        int m2 = ArcMode$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(this.isFatal, (m + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.bridgeId);
        String str2 = this.viewId;
        return m2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isFatal() {
        return this.isFatal;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.message;
        String str3 = this.stack;
        boolean z = this.isFatal;
        String str4 = this.bridgeId;
        String str5 = this.viewId;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("SandboxError(name=", str, ", message=", str2, ", stack=");
        Automotive$$ExternalSyntheticOutline0.m(m, str3, ", isFatal=", z, ", bridgeId=");
        return DoubleList$$ExternalSyntheticOutline0.m(m, str4, ", viewId=", str5, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/errors/SandboxError$Companion;", "", "<init>", "()V", "fromMap", "Lcom/amazon/alexa/ra/android/smartfragment/errors/SandboxError;", BuildConfig.FLAVOR_authType, "", "", "bridgeId", "viewId", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SandboxError fromMap$default(Companion companion, Map map, String str, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.fromMap(map, str, str2);
        }

        @NotNull
        public final SandboxError fromMap(@NotNull Map<String, ? extends Object> map, @NotNull String bridgeId, @Nullable String viewId) {
            map.getClass();
            bridgeId.getClass();
            Object obj = map.get("name");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                str = "Unknown";
            }
            String str2 = str;
            Object obj2 = map.get("message");
            String str3 = obj2 instanceof String ? (String) obj2 : null;
            if (str3 == null) {
                str3 = "";
            }
            Object obj3 = map.get("stack");
            String str4 = obj3 instanceof String ? (String) obj3 : null;
            Object obj4 = map.get(StackTraceHelper.IS_FATAL_KEY);
            Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
            return new SandboxError(str2, str3, str4, bool != null ? bool.booleanValue() : false, bridgeId, viewId);
        }

        private Companion() {
        }
    }

    public SandboxError(@NotNull String str, @NotNull String str2, @Nullable String str3, boolean z, @NotNull String str4, @Nullable String str5) {
        ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str4);
        this.name = str;
        this.message = str2;
        this.stack = str3;
        this.isFatal = z;
        this.bridgeId = str4;
        this.viewId = str5;
    }
}
