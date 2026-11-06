package com.amazon.alexa.ra.core.ui.backgroundmode;

import android.content.Context;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.ResourceProvider;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0016J+\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH\u0016¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/backgroundmode/ContextResourceProvider;", "Lcom/amazon/alexa/ra/core/ui/ResourceProvider;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getString", "", "resId", "", "formatArgs", "", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ContextResourceProvider implements ResourceProvider {
    public static final int $stable = 8;

    @NotNull
    private final Context context;

    public ContextResourceProvider(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    @Override // com.amazon.alexa.ra.core.ui.ResourceProvider
    @NotNull
    public String getString(@StringRes int resId, @NotNull Object... formatArgs) {
        formatArgs.getClass();
        String string = this.context.getString(resId, Arrays.copyOf(formatArgs, formatArgs.length));
        string.getClass();
        return string;
    }

    @Override // com.amazon.alexa.ra.core.ui.ResourceProvider
    @NotNull
    public String getString(@StringRes int resId) {
        String string = this.context.getString(resId);
        string.getClass();
        return string;
    }
}
