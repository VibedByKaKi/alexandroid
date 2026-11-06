package com.amazon.alexa.assistant.foundation.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB=\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u0010J\u001a\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0001HÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003JS\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u000fHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/SDKError;", "", "domain", "", "name", "location", JsonFields.COMPONENT, "underlyingError", "metadata", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "error", "fileID", "line", "", "(Ljava/lang/Throwable;Ljava/lang/String;ILjava/util/Map;)V", "getDomain", "()Ljava/lang/String;", "getName", "getLocation", "getComponent", "getUnderlyingError", "()Ljava/lang/Throwable;", "getMetadata", "()Ljava/util/Map;", "copy", "component1", "component2", "component3", "component4", "component5", "component6", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "Companion", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SDKError extends Throwable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String SDK_ERROR_DOMAIN = "amazon.alexa.a4a";

    @NotNull
    private final String component;

    @NotNull
    private final String domain;

    @NotNull
    private final String location;

    @Nullable
    private final Map<String, String> metadata;

    @NotNull
    private final String name;

    @NotNull
    private final Throwable underlyingError;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SDKError(@org.jetbrains.annotations.NotNull java.lang.Throwable r9, @org.jetbrains.annotations.NotNull java.lang.String r10, int r11, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> r12) {
        /*
            r8 = this;
            r9.getClass()
            r10.getClass()
            com.amazon.alexa.assistant.foundation.model.SDKError$Companion r0 = com.amazon.alexa.assistant.foundation.model.SDKError.INSTANCE
            java.lang.String r3 = com.amazon.alexa.assistant.foundation.model.SDKError.Companion.access$nameFromError(r0, r9)
            java.lang.String r0 = ":"
            java.lang.String r4 = androidx.room.util.TableInfo$$ExternalSyntheticOutline0.m(r11, r10, r0)
            java.lang.String r11 = "/"
            java.lang.String[] r11 = new java.lang.String[]{r11}
            r0 = 0
            r1 = 6
            java.util.List r10 = kotlin.text.StringsKt.split$default(r10, r11, r0, r1)
            java.lang.Object r10 = kotlin.collections.CollectionsKt.firstOrNull(r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L28
            java.lang.String r10 = "no component"
        L28:
            r5 = r10
            java.lang.String r2 = "amazon.alexa.a4a"
            r1 = r8
            r6 = r9
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.assistant.foundation.model.SDKError.<init>(java.lang.Throwable, java.lang.String, int, java.util.Map):void");
    }

    public static /* synthetic */ SDKError copy$default(SDKError sDKError, String str, String str2, String str3, String str4, Throwable th, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sDKError.domain;
        }
        if ((i & 2) != 0) {
            str2 = sDKError.name;
        }
        if ((i & 4) != 0) {
            str3 = sDKError.location;
        }
        if ((i & 8) != 0) {
            str4 = sDKError.component;
        }
        if ((i & 16) != 0) {
            th = sDKError.underlyingError;
        }
        if ((i & 32) != 0) {
            map = sDKError.metadata;
        }
        Throwable th2 = th;
        Map map2 = map;
        return sDKError.copy(str, str2, str3, str4, th2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getComponent() {
        return this.component;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Throwable getUnderlyingError() {
        return this.underlyingError;
    }

    @Nullable
    public final Map<String, String> component6() {
        return this.metadata;
    }

    @NotNull
    public final SDKError copy(@NotNull String domain, @NotNull String name, @NotNull String location, @NotNull String component, @NotNull Throwable underlyingError, @Nullable Map<String, String> metadata) {
        domain.getClass();
        name.getClass();
        location.getClass();
        component.getClass();
        underlyingError.getClass();
        return new SDKError(domain, name, location, component, underlyingError, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SDKError)) {
            return false;
        }
        SDKError sDKError = (SDKError) other;
        return Intrinsics.areEqual(this.domain, sDKError.domain) && Intrinsics.areEqual(this.name, sDKError.name) && Intrinsics.areEqual(this.location, sDKError.location) && Intrinsics.areEqual(this.component, sDKError.component) && Intrinsics.areEqual(this.underlyingError, sDKError.underlyingError) && Intrinsics.areEqual(this.metadata, sDKError.metadata);
    }

    @NotNull
    public final String getComponent() {
        return this.component;
    }

    @NotNull
    public final String getDomain() {
        return this.domain;
    }

    @NotNull
    public final String getLocation() {
        return this.location;
    }

    @Nullable
    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Throwable getUnderlyingError() {
        return this.underlyingError;
    }

    public int hashCode() {
        int hashCode = (this.underlyingError.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.domain.hashCode() * 31, 31, this.name), 31, this.location), 31, this.component)) * 31;
        Map<String, String> map = this.metadata;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        String str = this.domain;
        String str2 = this.name;
        String str3 = this.location;
        String str4 = this.component;
        Throwable th = this.underlyingError;
        Map<String, String> map = this.metadata;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("SDKError(domain=", str, ", name=", str2, ", location=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", component=", str4, ", underlyingError=");
        m.append(th);
        m.append(", metadata=");
        m.append(map);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/SDKError$Companion;", "", "<init>", "()V", "SDK_ERROR_DOMAIN", "", "nameFromError", "error", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String nameFromError(Throwable error) {
            return error.getClass().getSimpleName();
        }

        private Companion() {
        }
    }

    @NotNull
    public final SDKError copy(@NotNull String fileID, int line) {
        fileID.getClass();
        return new SDKError(this.underlyingError, fileID, line, this.metadata);
    }

    public static /* synthetic */ SDKError copy$default(SDKError sDKError, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return sDKError.copy(str, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SDKError(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Throwable th, @Nullable Map<String, String> map) {
        super(str2, th);
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        th.getClass();
        this.domain = str;
        this.name = str2;
        this.location = str3;
        this.component = str4;
        this.underlyingError = th;
        this.metadata = map;
    }

    public /* synthetic */ SDKError(Throwable th, String str, int i, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : map);
    }

    public /* synthetic */ SDKError(String str, String str2, String str3, String str4, Throwable th, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, th, (Map<String, String>) ((i & 32) != 0 ? null : map));
    }
}
