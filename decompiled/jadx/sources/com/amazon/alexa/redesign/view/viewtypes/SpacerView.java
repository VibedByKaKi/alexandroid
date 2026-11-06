package com.amazon.alexa.redesign.view.viewtypes;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.R;
import com.amazon.alexa.redesign.entity.viewtypes.SpacerModel;
import com.amazon.alexa.redesign.entity.viewtypes.ViewTypeModel;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\tB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0005\u0010\u000eJ,\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0017\u001a\u00020\u0015H\u0016¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/redesign/view/viewtypes/SpacerView;", "Landroid/widget/LinearLayout;", "Lcom/amazon/alexa/redesign/view/viewtypes/ViewType;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "container", "Landroid/view/ViewGroup;", "inflater", "Landroid/view/LayoutInflater;", "(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)V", "bind", "", "model", "Lcom/amazon/alexa/redesign/entity/viewtypes/ViewTypeModel;", "metricsObject", "", "", "", ViewProps.ACCESSIBILITY_LABEL, "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class SpacerView extends LinearLayout implements ViewType {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpacerView(@Nullable Context context, @Nullable ViewGroup viewGroup, @NotNull LayoutInflater layoutInflater) {
        super(context);
        layoutInflater.getClass();
        layoutInflater.inflate(R.layout.amahc_viewtype_spacer, viewGroup, true);
    }

    @Override // com.amazon.alexa.redesign.view.viewtypes.ViewType
    public void bind(@NotNull ViewTypeModel model, @NotNull Map<String, ? extends Object> metricsObject, @NotNull String accessibilityLabel) {
        model.getClass();
        metricsObject.getClass();
        accessibilityLabel.getClass();
        Log.w(SpacerModel.SPACER_TYPE, "bind");
    }

    public SpacerView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SpacerView(@Nullable Context context) {
        super(context);
    }
}
