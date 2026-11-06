package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.amazon.alexa.client.metrics.core.AlexaMetricsConstants;
import com.amazon.comms.config.util.DeviceConfigConstants;
import com.reactcommunity.rndatetimepicker.Common;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Stable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\u0006H'¢\u0006\u0002\u0010\u0007J+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH'¢\u0006\u0002\u0010\rJ+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH'¢\u0006\u0002\u0010\rJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H'¢\u0006\u0002\u0010\u0011J+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\rJ\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'¢\u0006\u0002\u0010\u0007J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H'¢\u0006\u0002\u0010\u0011J+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/compose/material/TextFieldColors;", "", "backgroundColor", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "cursorColor", "isError", "indicatorColor", AlexaMetricsConstants.AssistantSdkDimensions.INTERACTION_SOURCE, "Landroidx/compose/foundation/interaction/InteractionSource;", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "labelColor", "error", "leadingIconColor", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "placeholderColor", Common.TEXT_COLOR, "trailingIconColor", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TextFieldColors {
    @Composable
    @NotNull
    State<Color> backgroundColor(boolean z, @Nullable Composer composer, int i);

    @Composable
    @NotNull
    State<Color> cursorColor(boolean z, @Nullable Composer composer, int i);

    @Composable
    @NotNull
    State<Color> indicatorColor(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i);

    @Composable
    @NotNull
    State<Color> labelColor(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i);

    @Composable
    @NotNull
    default State<Color> leadingIconColor(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        composer.startReplaceGroup(-1036335134);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1036335134, i, -1, "androidx.compose.material.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:128)");
        }
        State<Color> leadingIconColor = leadingIconColor(z, z2, composer, (i & 126) | ((i >> 3) & DeviceConfigConstants.BUFFER_SIZE_IN_SAMPLES_896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return leadingIconColor;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use/implement overload with interactionSource parameter", replaceWith = @ReplaceWith(expression = "leadingIconColor(enabled, isError, interactionSource)", imports = {}))
    @Composable
    @NotNull
    State<Color> leadingIconColor(boolean z, boolean z2, @Nullable Composer composer, int i);

    @Composable
    @NotNull
    State<Color> placeholderColor(boolean z, @Nullable Composer composer, int i);

    @Composable
    @NotNull
    State<Color> textColor(boolean z, @Nullable Composer composer, int i);

    @Composable
    @NotNull
    default State<Color> trailingIconColor(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        composer.startReplaceGroup(454310320);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(454310320, i, -1, "androidx.compose.material.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:161)");
        }
        State<Color> trailingIconColor = trailingIconColor(z, z2, composer, (i & 126) | ((i >> 3) & DeviceConfigConstants.BUFFER_SIZE_IN_SAMPLES_896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return trailingIconColor;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use/implement overload with interactionSource parameter", replaceWith = @ReplaceWith(expression = "trailingIconColor(enabled, isError, interactionSource)", imports = {}))
    @Composable
    @NotNull
    State<Color> trailingIconColor(boolean z, boolean z2, @Nullable Composer composer, int i);
}
