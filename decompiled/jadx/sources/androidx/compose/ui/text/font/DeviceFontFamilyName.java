package androidx.compose.ui.text.font;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/DeviceFontFamilyName;", "", "name", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getName", "()Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nDeviceFontFamilyNameFont.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFontFamilyNameFont.android.kt\nandroidx/compose/ui/text/font/DeviceFontFamilyName\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,134:1\n118#2,4:135\n*S KotlinDebug\n*F\n+ 1 DeviceFontFamilyNameFont.android.kt\nandroidx/compose/ui/text/font/DeviceFontFamilyName\n*L\n78#1:135,4\n*E\n"})
/* loaded from: classes13.dex */
public final class DeviceFontFamilyName {

    @NotNull
    private final String name;

    private /* synthetic */ DeviceFontFamilyName(String str) {
        this.name = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DeviceFontFamilyName m6905boximpl(String str) {
        return new DeviceFontFamilyName(str);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m6906constructorimpl(@NotNull String str) {
        if (!(str.length() > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("name may not be empty");
        }
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6907equalsimpl(String str, Object obj) {
        return (obj instanceof DeviceFontFamilyName) && Intrinsics.areEqual(str, ((DeviceFontFamilyName) obj).m6911unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6908equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6909hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6910toStringimpl(String str) {
        return AppLaunchChecker$$ExternalSyntheticOutline0.m(')', "DeviceFontFamilyName(name=", str);
    }

    public boolean equals(Object obj) {
        return m6907equalsimpl(this.name, obj);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return m6909hashCodeimpl(this.name);
    }

    public String toString() {
        return m6910toStringimpl(this.name);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m6911unboximpl() {
        return this.name;
    }
}
