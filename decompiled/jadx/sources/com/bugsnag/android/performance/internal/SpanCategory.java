package com.bugsnag.android.performance.internal;

import androidx.annotation.RestrictTo;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.metrics.VisualShareErrorType;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/bugsnag/android/performance/internal/SpanCategory;", "", "category", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getCategory", "()Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "Companion", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public final class SpanCategory {

    @NotNull
    private final String category;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String CUSTOM = m23825constructorimpl("custom");

    @NotNull
    private static final String VIEW_LOAD = m23825constructorimpl("view_load");

    @NotNull
    private static final String VIEW_LOAD_PHASE = m23825constructorimpl("view_load_phase");

    @NotNull
    private static final String NETWORK = m23825constructorimpl("network");

    @NotNull
    private static final String APP_START = m23825constructorimpl("app_start");

    @NotNull
    private static final String APP_START_PHASE = m23825constructorimpl("app_start_phase");

    private /* synthetic */ SpanCategory(String str) {
        this.category = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SpanCategory m23824boximpl(String str) {
        return new SpanCategory(str);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m23825constructorimpl(@NotNull String str) {
        str.getClass();
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23826equalsimpl(String str, Object obj) {
        return (obj instanceof SpanCategory) && Intrinsics.areEqual(str, ((SpanCategory) obj).m23830unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23827equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23828hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23829toStringimpl(String str) {
        return AppLaunchChecker$$ExternalSyntheticOutline0.m(')', "SpanCategory(category=", str);
    }

    public boolean equals(Object obj) {
        return m23826equalsimpl(this.category, obj);
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    public int hashCode() {
        return m23828hashCodeimpl(this.category);
    }

    public String toString() {
        return m23829toStringimpl(this.category);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m23830unboximpl() {
        return this.category;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Lcom/bugsnag/android/performance/internal/SpanCategory$Companion;", "", "()V", "APP_START", "Lcom/bugsnag/android/performance/internal/SpanCategory;", "getAPP_START-haBhItc", "()Ljava/lang/String;", "Ljava/lang/String;", "APP_START_PHASE", "getAPP_START_PHASE-haBhItc", "CUSTOM", "getCUSTOM-haBhItc", VisualShareErrorType.NETWORK, "getNETWORK-haBhItc", "VIEW_LOAD", "getVIEW_LOAD-haBhItc", "VIEW_LOAD_PHASE", "getVIEW_LOAD_PHASE-haBhItc", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: getAPP_START-haBhItc, reason: not valid java name */
        public final String m23831getAPP_STARThaBhItc() {
            return SpanCategory.APP_START;
        }

        @NotNull
        /* renamed from: getAPP_START_PHASE-haBhItc, reason: not valid java name */
        public final String m23832getAPP_START_PHASEhaBhItc() {
            return SpanCategory.APP_START_PHASE;
        }

        @NotNull
        /* renamed from: getCUSTOM-haBhItc, reason: not valid java name */
        public final String m23833getCUSTOMhaBhItc() {
            return SpanCategory.CUSTOM;
        }

        @NotNull
        /* renamed from: getNETWORK-haBhItc, reason: not valid java name */
        public final String m23834getNETWORKhaBhItc() {
            return SpanCategory.NETWORK;
        }

        @NotNull
        /* renamed from: getVIEW_LOAD-haBhItc, reason: not valid java name */
        public final String m23835getVIEW_LOADhaBhItc() {
            return SpanCategory.VIEW_LOAD;
        }

        @NotNull
        /* renamed from: getVIEW_LOAD_PHASE-haBhItc, reason: not valid java name */
        public final String m23836getVIEW_LOAD_PHASEhaBhItc() {
            return SpanCategory.VIEW_LOAD_PHASE;
        }

        private Companion() {
        }
    }
}
