package com.mapbox.maps.attribution;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000  2\u00020\u0001:\n\u001e\u001f !\"#$%&'B7\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u001b\u001a\u00020\u0007J\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000eR\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000e¨\u0006("}, d2 = {"Lcom/mapbox/maps/attribution/AttributionMeasure;", "", "snapshot", "Landroid/graphics/Bitmap;", "logo", "logoSmall", "textView", "Landroid/widget/TextView;", "textViewShort", ViewProps.MARGIN, "", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/widget/TextView;Landroid/widget/TextView;F)V", "logoContainerWidth", "getLogoContainerWidth", "()F", "logoSmallContainerWidth", "getLogoSmallContainerWidth", "maxSize", "getMaxSize", "maxSizeShort", "getMaxSizeShort", "shorterText", "", "textViewContainerWidth", "getTextViewContainerWidth", "textViewShortContainerWidth", "getTextViewShortContainerWidth", "getTextView", "measure", "Lcom/mapbox/maps/attribution/AttributionLayout;", "Chain", "Command", "Companion", "FullLogoLongTextCommand", "FullLogoShortTextCommand", "LongTextCommand", "NoTextCommand", "ShortTextCommand", "SmallLogoLongTextCommand", "SmallLogoShortTextCommand", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class AttributionMeasure {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Bitmap logo;

    @NotNull
    private final Bitmap logoSmall;
    private final float margin;
    private boolean shorterText;

    @NotNull
    private final Bitmap snapshot;

    @NotNull
    private final TextView textView;

    @NotNull
    private final TextView textViewShort;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/attribution/AttributionMeasure$Chain;", "", "commands", "", "Lcom/mapbox/maps/attribution/AttributionMeasure$Command;", "(Lcom/mapbox/maps/attribution/AttributionMeasure;[Lcom/mapbox/maps/attribution/AttributionMeasure$Command;)V", "", "getCommands", "()Ljava/util/List;", "setCommands", "(Ljava/util/List;)V", "start", "Lcom/mapbox/maps/attribution/AttributionLayout;", "measure", "Lcom/mapbox/maps/attribution/AttributionMeasure;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class Chain {

        @NotNull
        private List<? extends Command> commands;
        final /* synthetic */ AttributionMeasure this$0;

        public Chain(@NotNull AttributionMeasure attributionMeasure, Command... commandArr) {
            commandArr.getClass();
            this.this$0 = attributionMeasure;
            this.commands = CollectionsKt.listOf(Arrays.copyOf(commandArr, commandArr.length));
        }

        @NotNull
        public final List<Command> getCommands() {
            return this.commands;
        }

        public final void setCommands(@NotNull List<? extends Command> list) {
            list.getClass();
            this.commands = list;
        }

        @Nullable
        public final AttributionLayout start(@NotNull AttributionMeasure measure) {
            measure.getClass();
            Iterator<? extends Command> it2 = this.commands.iterator();
            AttributionLayout attributionLayout = null;
            while (it2.hasNext() && (attributionLayout = it2.next().execute(measure)) == null) {
            }
            return attributionLayout;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J6\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/attribution/AttributionMeasure$Command;", "", "execute", "Lcom/mapbox/maps/attribution/AttributionLayout;", "measure", "Lcom/mapbox/maps/attribution/AttributionMeasure;", "width", "", "maxSize", "logo", "Landroid/graphics/Bitmap;", "isShortText", "", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface Command {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class DefaultImpls {
            @Nullable
            public static AttributionLayout execute(@NotNull Command command, @NotNull AttributionMeasure attributionMeasure, float f, float f2, @Nullable Bitmap bitmap, boolean z) {
                attributionMeasure.getClass();
                if (f <= f2) {
                    return new AttributionLayout(bitmap, AttributionMeasure.INSTANCE.calculateAnchor(attributionMeasure.snapshot, attributionMeasure.textView, attributionMeasure.margin), z);
                }
                return null;
            }

            public static /* synthetic */ AttributionLayout execute$default(Command command, AttributionMeasure attributionMeasure, float f, float f2, Bitmap bitmap, boolean z, int i, Object obj) {
                if (obj != null) {
                    Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: execute");
                    return null;
                }
                if ((i & 16) != 0) {
                    z = false;
                }
                return command.execute(attributionMeasure, f, f2, bitmap, z);
            }
        }

        @Nullable
        AttributionLayout execute(@NotNull AttributionMeasure measure);

        @Nullable
        AttributionLayout execute(@NotNull AttributionMeasure measure, float width, float maxSize, @Nullable Bitmap logo, boolean isShortText);
    }

    public AttributionMeasure(@NotNull Bitmap bitmap, @NotNull Bitmap bitmap2, @NotNull Bitmap bitmap3, @NotNull TextView textView, @NotNull TextView textView2, float f) {
        bitmap.getClass();
        bitmap2.getClass();
        bitmap3.getClass();
        textView.getClass();
        textView2.getClass();
        this.snapshot = bitmap;
        this.logo = bitmap2;
        this.logoSmall = bitmap3;
        this.textView = textView;
        this.textViewShort = textView2;
        this.margin = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getLogoContainerWidth() {
        return (2 * this.margin) + this.logo.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getLogoSmallContainerWidth() {
        return (2 * this.margin) + this.logoSmall.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getMaxSize() {
        return (this.snapshot.getWidth() * 8) / 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getMaxSizeShort() {
        return this.snapshot.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getTextViewContainerWidth() {
        return this.textView.getMeasuredWidth() + this.margin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getTextViewShortContainerWidth() {
        return this.textViewShort.getMeasuredWidth() + this.margin;
    }

    @NotNull
    public final TextView getTextView() {
        return this.shorterText ? this.textViewShort : this.textView;
    }

    @Nullable
    public final AttributionLayout measure() {
        AttributionLayout start = new Chain(this, new FullLogoLongTextCommand(), new FullLogoShortTextCommand(), new SmallLogoLongTextCommand(), new SmallLogoShortTextCommand(), new LongTextCommand(), new ShortTextCommand(), new NoTextCommand()).start(this);
        if (start != null) {
            this.shorterText = start.isShortText();
        }
        return start;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/attribution/AttributionMeasure$Companion;", "", "()V", "calculateAnchor", "Landroid/graphics/PointF;", "snapshot", "Landroid/graphics/Bitmap;", "textView", "Landroid/widget/TextView;", ViewProps.MARGIN, "", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final PointF calculateAnchor(Bitmap snapshot, TextView textView, float margin) {
            return new PointF((snapshot.getWidth() - textView.getMeasuredWidth()) - margin, (snapshot.getHeight() - textView.getMeasuredHeight()) - margin);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/attribution/AttributionMeasure$NoTextCommand;", "Lcom/mapbox/maps/attribution/AttributionMeasure$Command;", "()V", "execute", "Lcom/mapbox/maps/attribution/AttributionLayout;", "measure", "Lcom/mapbox/maps/attribution/AttributionMeasure;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class NoTextCommand implements Command {
        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        @Nullable
        public AttributionLayout execute(@NotNull AttributionMeasure measure) {
            measure.getClass();
            return new AttributionLayout(null, null, false);
        }

        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        @Nullable
        public AttributionLayout execute(@NotNull AttributionMeasure attributionMeasure, float f, float f2, @Nullable Bitmap bitmap, boolean z) {
            return Command.DefaultImpls.execute(this, attributionMeasure, f, f2, bitmap, z);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/attribution/AttributionMeasure$ShortTextCommand;", "Lcom/mapbox/maps/attribution/AttributionMeasure$Command;", "()V", "execute", "Lcom/mapbox/maps/attribution/AttributionLayout;", "measure", "Lcom/mapbox/maps/attribution/AttributionMeasure;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ShortTextCommand implements Command {
        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        @Nullable
        public AttributionLayout execute(@NotNull AttributionMeasure measure) {
            measure.getClass();
            return execute(measure, measure.margin + measure.getTextViewShortContainerWidth(), measure.getMaxSizeShort(), null, true);
        }

        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        @Nullable
        public AttributionLayout execute(@NotNull AttributionMeasure attributionMeasure, float f, float f2, @Nullable Bitmap bitmap, boolean z) {
            return Command.DefaultImpls.execute(this, attributionMeasure, f, f2, bitmap, z);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/attribution/AttributionMeasure$FullLogoShortTextCommand;", "Lcom/mapbox/maps/attribution/AttributionMeasure$Command;", "()V", "execute", "Lcom/mapbox/maps/attribution/AttributionLayout;", "measure", "Lcom/mapbox/maps/attribution/AttributionMeasure;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class FullLogoShortTextCommand implements Command {
        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        @Nullable
        public AttributionLayout execute(@NotNull AttributionMeasure measure) {
            measure.getClass();
            return execute(measure, measure.getTextViewShortContainerWidth() + measure.getLogoContainerWidth(), measure.getMaxSizeShort(), measure.logo, true);
        }

        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        @Nullable
        public AttributionLayout execute(@NotNull AttributionMeasure attributionMeasure, float f, float f2, @Nullable Bitmap bitmap, boolean z) {
            return Command.DefaultImpls.execute(this, attributionMeasure, f, f2, bitmap, z);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/attribution/AttributionMeasure$LongTextCommand;", "Lcom/mapbox/maps/attribution/AttributionMeasure$Command;", "()V", "execute", "Lcom/mapbox/maps/attribution/AttributionLayout;", "measure", "Lcom/mapbox/maps/attribution/AttributionMeasure;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class LongTextCommand implements Command {
        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        @Nullable
        public AttributionLayout execute(@NotNull AttributionMeasure measure) {
            measure.getClass();
            return Command.DefaultImpls.execute$default(this, measure, measure.margin + measure.getTextViewContainerWidth(), measure.getMaxSize(), null, false, 16, null);
        }

        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        @Nullable
        public AttributionLayout execute(@NotNull AttributionMeasure attributionMeasure, float f, float f2, @Nullable Bitmap bitmap, boolean z) {
            return Command.DefaultImpls.execute(this, attributionMeasure, f, f2, bitmap, z);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/attribution/AttributionMeasure$SmallLogoShortTextCommand;", "Lcom/mapbox/maps/attribution/AttributionMeasure$Command;", "()V", "execute", "Lcom/mapbox/maps/attribution/AttributionLayout;", "measure", "Lcom/mapbox/maps/attribution/AttributionMeasure;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class SmallLogoShortTextCommand implements Command {
        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        @Nullable
        public AttributionLayout execute(@NotNull AttributionMeasure measure) {
            measure.getClass();
            return execute(measure, measure.getTextViewShortContainerWidth() + measure.getLogoContainerWidth(), measure.getMaxSizeShort(), measure.logoSmall, true);
        }

        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        @Nullable
        public AttributionLayout execute(@NotNull AttributionMeasure attributionMeasure, float f, float f2, @Nullable Bitmap bitmap, boolean z) {
            return Command.DefaultImpls.execute(this, attributionMeasure, f, f2, bitmap, z);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/attribution/AttributionMeasure$FullLogoLongTextCommand;", "Lcom/mapbox/maps/attribution/AttributionMeasure$Command;", "()V", "execute", "Lcom/mapbox/maps/attribution/AttributionLayout;", "measure", "Lcom/mapbox/maps/attribution/AttributionMeasure;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class FullLogoLongTextCommand implements Command {
        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        @Nullable
        public AttributionLayout execute(@NotNull AttributionMeasure measure) {
            measure.getClass();
            return Command.DefaultImpls.execute$default(this, measure, measure.getTextViewContainerWidth() + measure.getLogoContainerWidth(), measure.getMaxSize(), measure.logo, false, 16, null);
        }

        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        @Nullable
        public AttributionLayout execute(@NotNull AttributionMeasure attributionMeasure, float f, float f2, @Nullable Bitmap bitmap, boolean z) {
            return Command.DefaultImpls.execute(this, attributionMeasure, f, f2, bitmap, z);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/attribution/AttributionMeasure$SmallLogoLongTextCommand;", "Lcom/mapbox/maps/attribution/AttributionMeasure$Command;", "()V", "execute", "Lcom/mapbox/maps/attribution/AttributionLayout;", "measure", "Lcom/mapbox/maps/attribution/AttributionMeasure;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class SmallLogoLongTextCommand implements Command {
        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        @Nullable
        public AttributionLayout execute(@NotNull AttributionMeasure measure) {
            measure.getClass();
            return Command.DefaultImpls.execute$default(this, measure, measure.getTextViewContainerWidth() + measure.getLogoSmallContainerWidth(), measure.getMaxSize(), measure.logoSmall, false, 16, null);
        }

        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        @Nullable
        public AttributionLayout execute(@NotNull AttributionMeasure attributionMeasure, float f, float f2, @Nullable Bitmap bitmap, boolean z) {
            return Command.DefaultImpls.execute(this, attributionMeasure, f, f2, bitmap, z);
        }
    }
}
