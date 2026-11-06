package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.IdRes;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Landroidx/navigation/NavAction;", "", "destinationId", "", "navOptions", "Landroidx/navigation/NavOptions;", "defaultArguments", "Landroid/os/Bundle;", "(ILandroidx/navigation/NavOptions;Landroid/os/Bundle;)V", "getDefaultArguments", "()Landroid/os/Bundle;", "setDefaultArguments", "(Landroid/os/Bundle;)V", "getDestinationId", "()I", "getNavOptions", "()Landroidx/navigation/NavOptions;", "setNavOptions", "(Landroidx/navigation/NavOptions;)V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavAction.kt\nandroidx/navigation/NavAction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n1855#2,2:90\n*S KotlinDebug\n*F\n+ 1 NavAction.kt\nandroidx/navigation/NavAction\n*L\n58#1:87,3\n67#1:90,2\n*E\n"})
/* loaded from: classes14.dex */
public final class NavAction {

    @Nullable
    private Bundle defaultArguments;

    @IdRes
    private final int destinationId;

    @Nullable
    private NavOptions navOptions;

    public /* synthetic */ NavAction(int i, NavOptions navOptions, Bundle bundle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : navOptions, (i2 & 4) != 0 ? null : bundle);
    }

    public boolean equals(@Nullable Object other) {
        Set<String> keySet;
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof NavAction)) {
            NavAction navAction = (NavAction) other;
            if (this.destinationId == navAction.destinationId && Intrinsics.areEqual(this.navOptions, navAction.navOptions)) {
                if (!Intrinsics.areEqual(this.defaultArguments, navAction.defaultArguments)) {
                    Bundle bundle = this.defaultArguments;
                    if (bundle != null && (keySet = bundle.keySet()) != null) {
                        Set<String> set = keySet;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            for (String str : set) {
                                Bundle bundle2 = this.defaultArguments;
                                Object obj = bundle2 != null ? bundle2.get(str) : null;
                                Bundle bundle3 = navAction.defaultArguments;
                                if (!Intrinsics.areEqual(obj, bundle3 != null ? bundle3.get(str) : null)) {
                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final Bundle getDefaultArguments() {
        return this.defaultArguments;
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    @Nullable
    public final NavOptions getNavOptions() {
        return this.navOptions;
    }

    public int hashCode() {
        Set<String> keySet;
        int hashCode = Integer.hashCode(this.destinationId) * 31;
        NavOptions navOptions = this.navOptions;
        int hashCode2 = hashCode + (navOptions != null ? navOptions.hashCode() : 0);
        Bundle bundle = this.defaultArguments;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                int i = hashCode2 * 31;
                Bundle bundle2 = this.defaultArguments;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                hashCode2 = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return hashCode2;
    }

    public final void setDefaultArguments(@Nullable Bundle bundle) {
        this.defaultArguments = bundle;
    }

    public final void setNavOptions(@Nullable NavOptions navOptions) {
        this.navOptions = navOptions;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("NavAction(0x");
        sb.append(Integer.toHexString(this.destinationId));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        if (this.navOptions != null) {
            sb.append(" navOptions=");
            sb.append(this.navOptions);
        }
        return sb.toString();
    }

    @JvmOverloads
    public NavAction(@IdRes int i, @Nullable NavOptions navOptions) {
        this(i, navOptions, null, 4, null);
    }

    @JvmOverloads
    public NavAction(@IdRes int i, @Nullable NavOptions navOptions, @Nullable Bundle bundle) {
        this.destinationId = i;
        this.navOptions = navOptions;
        this.defaultArguments = bundle;
    }

    @JvmOverloads
    public NavAction(@IdRes int i) {
        this(i, null, null, 6, null);
    }
}
