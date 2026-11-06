package com.amazon.alexa.ra.android.smartfragment.views;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/views/NativeFailure;", "", "name", "", "errorInfo", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getErrorInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
final /* data */ class NativeFailure {

    @NotNull
    private final Map<String, Object> errorInfo;

    @NotNull
    private final String name;

    public NativeFailure(@NotNull String str, @NotNull Map<String, ? extends Object> map) {
        str.getClass();
        map.getClass();
        this.name = str;
        this.errorInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NativeFailure copy$default(NativeFailure nativeFailure, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeFailure.name;
        }
        if ((i & 2) != 0) {
            map = nativeFailure.errorInfo;
        }
        return nativeFailure.copy(str, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Map<String, Object> component2() {
        return this.errorInfo;
    }

    @NotNull
    public final NativeFailure copy(@NotNull String name, @NotNull Map<String, ? extends Object> errorInfo) {
        name.getClass();
        errorInfo.getClass();
        return new NativeFailure(name, errorInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeFailure)) {
            return false;
        }
        NativeFailure nativeFailure = (NativeFailure) other;
        return Intrinsics.areEqual(this.name, nativeFailure.name) && Intrinsics.areEqual(this.errorInfo, nativeFailure.errorInfo);
    }

    @NotNull
    public final Map<String, Object> getErrorInfo() {
        return this.errorInfo;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.errorInfo.hashCode() + (this.name.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "NativeFailure(name=" + this.name + ", errorInfo=" + this.errorInfo + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
