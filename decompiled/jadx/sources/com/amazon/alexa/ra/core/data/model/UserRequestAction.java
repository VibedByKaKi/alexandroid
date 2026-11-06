package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/UserRequestAction;", "", "<init>", "()V", "Copy", "Download", "None", "Lcom/amazon/alexa/ra/core/data/model/UserRequestAction$Copy;", "Lcom/amazon/alexa/ra/core/data/model/UserRequestAction$Download;", "Lcom/amazon/alexa/ra/core/data/model/UserRequestAction$None;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class UserRequestAction {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/UserRequestAction$Copy;", "Lcom/amazon/alexa/ra/core/data/model/UserRequestAction;", ViewProps.ON_CLICK, "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Copy extends UserRequestAction {
        public static final int $stable = 0;

        @NotNull
        private final Function0<Unit> onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Copy(@NotNull Function0<Unit> function0) {
            super(null);
            function0.getClass();
            this.onClick = function0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Copy copy$default(Copy copy, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                function0 = copy.onClick;
            }
            return copy.copy(function0);
        }

        @NotNull
        public final Function0<Unit> component1() {
            return this.onClick;
        }

        @NotNull
        public final Copy copy(@NotNull Function0<Unit> onClick) {
            onClick.getClass();
            return new Copy(onClick);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Copy) && Intrinsics.areEqual(this.onClick, ((Copy) other).onClick);
        }

        @NotNull
        public final Function0<Unit> getOnClick() {
            return this.onClick;
        }

        public int hashCode() {
            return this.onClick.hashCode();
        }

        @NotNull
        public String toString() {
            return "Copy(onClick=" + this.onClick + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/UserRequestAction$Download;", "Lcom/amazon/alexa/ra/core/data/model/UserRequestAction;", ViewProps.ON_CLICK, "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Download extends UserRequestAction {
        public static final int $stable = 0;

        @NotNull
        private final Function0<Unit> onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Download(@NotNull Function0<Unit> function0) {
            super(null);
            function0.getClass();
            this.onClick = function0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Download copy$default(Download download, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                function0 = download.onClick;
            }
            return download.copy(function0);
        }

        @NotNull
        public final Function0<Unit> component1() {
            return this.onClick;
        }

        @NotNull
        public final Download copy(@NotNull Function0<Unit> onClick) {
            onClick.getClass();
            return new Download(onClick);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Download) && Intrinsics.areEqual(this.onClick, ((Download) other).onClick);
        }

        @NotNull
        public final Function0<Unit> getOnClick() {
            return this.onClick;
        }

        public int hashCode() {
            return this.onClick.hashCode();
        }

        @NotNull
        public String toString() {
            return "Download(onClick=" + this.onClick + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/UserRequestAction$None;", "Lcom/amazon/alexa/ra/core/data/model/UserRequestAction;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class None extends UserRequestAction {
        public static final int $stable = 0;

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    public /* synthetic */ UserRequestAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UserRequestAction() {
    }
}
