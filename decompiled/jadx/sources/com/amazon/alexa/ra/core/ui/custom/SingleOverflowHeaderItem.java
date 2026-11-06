package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.ui.graphics.vector.ImageVector;
import com.amazon.alexa.ra.core.ui.RaIconSlot;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/SingleOverflowHeaderItem;", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "iconSlot", "Lcom/amazon/alexa/ra/core/ui/RaIconSlot;", "description", "", "testTag", "<init>", "(Landroidx/compose/ui/graphics/vector/ImageVector;Lcom/amazon/alexa/ra/core/ui/RaIconSlot;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getIconSlot", "()Lcom/amazon/alexa/ra/core/ui/RaIconSlot;", "getDescription", "()Ljava/lang/String;", "getTestTag", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
final class SingleOverflowHeaderItem {

    @NotNull
    private final String description;

    @NotNull
    private final ImageVector icon;

    @NotNull
    private final RaIconSlot iconSlot;

    @NotNull
    private final String testTag;

    public SingleOverflowHeaderItem(@NotNull ImageVector imageVector, @NotNull RaIconSlot raIconSlot, @NotNull String str, @NotNull String str2) {
        imageVector.getClass();
        raIconSlot.getClass();
        str.getClass();
        str2.getClass();
        this.icon = imageVector;
        this.iconSlot = raIconSlot;
        this.description = str;
        this.testTag = str2;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final ImageVector getIcon() {
        return this.icon;
    }

    @NotNull
    public final RaIconSlot getIconSlot() {
        return this.iconSlot;
    }

    @NotNull
    public final String getTestTag() {
        return this.testTag;
    }
}
