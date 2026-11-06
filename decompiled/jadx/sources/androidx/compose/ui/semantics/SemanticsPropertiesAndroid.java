package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertiesAndroid;", "", "<init>", "()V", "TestTagsAsResourceId", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "getTestTagsAsResourceId", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "AccessibilityClassName", "", "getAccessibilityClassName", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSemanticsProperties.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.android.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesAndroid\n+ 2 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt\n*L\n1#1,96:1\n481#2:97\n*S KotlinDebug\n*F\n+ 1 SemanticsProperties.android.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesAndroid\n*L\n30#1:97\n*E\n"})
/* loaded from: classes13.dex */
public final class SemanticsPropertiesAndroid {

    @NotNull
    public static final SemanticsPropertiesAndroid INSTANCE = new SemanticsPropertiesAndroid();

    @NotNull
    private static final SemanticsPropertyKey<Boolean> TestTagsAsResourceId = new SemanticsPropertyKey<>("TestTagsAsResourceId", false, new Function2<Boolean, Boolean, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesAndroid$TestTagsAsResourceId$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2) {
            return invoke(bool, bool2.booleanValue());
        }

        public final Boolean invoke(Boolean bool, boolean z) {
            return bool;
        }
    }, null, 8, null);

    @NotNull
    private static final SemanticsPropertyKey<String> AccessibilityClassName = new SemanticsPropertyKey<>("AccessibilityClassName", true, new Function2<String, String, String>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesAndroid$AccessibilityClassName$1
        @Override // kotlin.jvm.functions.Function2
        public final String invoke(String str, String str2) {
            return str;
        }
    }, null, 8, null);
    public static final int $stable = 8;

    private SemanticsPropertiesAndroid() {
    }

    @NotNull
    public final SemanticsPropertyKey<String> getAccessibilityClassName() {
        return AccessibilityClassName;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getTestTagsAsResourceId() {
        return TestTagsAsResourceId;
    }
}
