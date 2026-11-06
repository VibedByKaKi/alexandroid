package com.amazon.comms.calling.domain.usecase.sepia;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.comms.calling.domain.model.dataChannel.sepia.SepiaIcon;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent;", "", "<init>", "()V", "ShowErrorToast", "ShowReactionsMenu", "ShowEffectsMenu", "HideEffectsMenu", "ShowCaptionsMenu", "HideCaptionsMenu", "ShowCaptions", "HideCaptions", "UpdateCaptionsMenu", "UpdateReactionsMenu", "UpdateEffectsMenu", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent$HideCaptions;", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent$HideCaptionsMenu;", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent$HideEffectsMenu;", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent$ShowCaptions;", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent$ShowCaptionsMenu;", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent$ShowEffectsMenu;", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent$ShowErrorToast;", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent$ShowReactionsMenu;", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent$UpdateCaptionsMenu;", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent$UpdateEffectsMenu;", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent$UpdateReactionsMenu;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public abstract class SepiaMenuEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent$HideCaptions;", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent;", "<init>", "()V", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HideCaptions extends SepiaMenuEvent {

        @NotNull
        public static final HideCaptions INSTANCE = new HideCaptions();

        private HideCaptions() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent$HideCaptionsMenu;", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent;", "<init>", "()V", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HideCaptionsMenu extends SepiaMenuEvent {

        @NotNull
        public static final HideCaptionsMenu INSTANCE = new HideCaptionsMenu();

        private HideCaptionsMenu() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent$HideEffectsMenu;", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent;", "<init>", "()V", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HideEffectsMenu extends SepiaMenuEvent {

        @NotNull
        public static final HideEffectsMenu INSTANCE = new HideEffectsMenu();

        private HideEffectsMenu() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent$ShowCaptions;", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent;", "<init>", "()V", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowCaptions extends SepiaMenuEvent {

        @NotNull
        public static final ShowCaptions INSTANCE = new ShowCaptions();

        private ShowCaptions() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent$ShowCaptionsMenu;", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent;", "<init>", "()V", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowCaptionsMenu extends SepiaMenuEvent {

        @NotNull
        public static final ShowCaptionsMenu INSTANCE = new ShowCaptionsMenu();

        private ShowCaptionsMenu() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent$ShowEffectsMenu;", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent;", "<init>", "()V", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowEffectsMenu extends SepiaMenuEvent {

        @NotNull
        public static final ShowEffectsMenu INSTANCE = new ShowEffectsMenu();

        private ShowEffectsMenu() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent$ShowErrorToast;", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent;", "resId", "", "<init>", "(I)V", "getResId", "()I", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShowErrorToast extends SepiaMenuEvent {
        private final int resId;

        public ShowErrorToast(int i) {
            super(null);
            this.resId = i;
        }

        public static /* synthetic */ ShowErrorToast copy$default(ShowErrorToast showErrorToast, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = showErrorToast.resId;
            }
            return showErrorToast.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getResId() {
            return this.resId;
        }

        @NotNull
        public final ShowErrorToast copy(int resId) {
            return new ShowErrorToast(resId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowErrorToast) && this.resId == ((ShowErrorToast) other).resId;
        }

        public final int getResId() {
            return this.resId;
        }

        public int hashCode() {
            return Integer.hashCode(this.resId);
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m(this.resId, "ShowErrorToast(resId=", MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent$ShowReactionsMenu;", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent;", "<init>", "()V", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowReactionsMenu extends SepiaMenuEvent {

        @NotNull
        public static final ShowReactionsMenu INSTANCE = new ShowReactionsMenu();

        private ShowReactionsMenu() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent$UpdateCaptionsMenu;", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent;", "sepiaIcons", "", "Lcom/amazon/comms/calling/domain/model/dataChannel/sepia/SepiaIcon;", "shouldEnable", "", "<init>", "(Ljava/util/List;Z)V", "getSepiaIcons", "()Ljava/util/List;", "getShouldEnable", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateCaptionsMenu extends SepiaMenuEvent {

        @NotNull
        private final List<SepiaIcon> sepiaIcons;
        private final boolean shouldEnable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateCaptionsMenu(@NotNull List<SepiaIcon> list, boolean z) {
            super(null);
            list.getClass();
            this.sepiaIcons = list;
            this.shouldEnable = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UpdateCaptionsMenu copy$default(UpdateCaptionsMenu updateCaptionsMenu, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = updateCaptionsMenu.sepiaIcons;
            }
            if ((i & 2) != 0) {
                z = updateCaptionsMenu.shouldEnable;
            }
            return updateCaptionsMenu.copy(list, z);
        }

        @NotNull
        public final List<SepiaIcon> component1() {
            return this.sepiaIcons;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldEnable() {
            return this.shouldEnable;
        }

        @NotNull
        public final UpdateCaptionsMenu copy(@NotNull List<SepiaIcon> sepiaIcons, boolean shouldEnable) {
            sepiaIcons.getClass();
            return new UpdateCaptionsMenu(sepiaIcons, shouldEnable);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateCaptionsMenu)) {
                return false;
            }
            UpdateCaptionsMenu updateCaptionsMenu = (UpdateCaptionsMenu) other;
            return Intrinsics.areEqual(this.sepiaIcons, updateCaptionsMenu.sepiaIcons) && this.shouldEnable == updateCaptionsMenu.shouldEnable;
        }

        @NotNull
        public final List<SepiaIcon> getSepiaIcons() {
            return this.sepiaIcons;
        }

        public final boolean getShouldEnable() {
            return this.shouldEnable;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldEnable) + (this.sepiaIcons.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "UpdateCaptionsMenu(sepiaIcons=" + this.sepiaIcons + ", shouldEnable=" + this.shouldEnable + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent$UpdateEffectsMenu;", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent;", "sepiaIcons", "", "Lcom/amazon/comms/calling/domain/model/dataChannel/sepia/SepiaIcon;", "shouldEnable", "", "<init>", "(Ljava/util/List;Z)V", "getSepiaIcons", "()Ljava/util/List;", "getShouldEnable", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateEffectsMenu extends SepiaMenuEvent {

        @NotNull
        private final List<SepiaIcon> sepiaIcons;
        private final boolean shouldEnable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateEffectsMenu(@NotNull List<SepiaIcon> list, boolean z) {
            super(null);
            list.getClass();
            this.sepiaIcons = list;
            this.shouldEnable = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UpdateEffectsMenu copy$default(UpdateEffectsMenu updateEffectsMenu, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = updateEffectsMenu.sepiaIcons;
            }
            if ((i & 2) != 0) {
                z = updateEffectsMenu.shouldEnable;
            }
            return updateEffectsMenu.copy(list, z);
        }

        @NotNull
        public final List<SepiaIcon> component1() {
            return this.sepiaIcons;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldEnable() {
            return this.shouldEnable;
        }

        @NotNull
        public final UpdateEffectsMenu copy(@NotNull List<SepiaIcon> sepiaIcons, boolean shouldEnable) {
            sepiaIcons.getClass();
            return new UpdateEffectsMenu(sepiaIcons, shouldEnable);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateEffectsMenu)) {
                return false;
            }
            UpdateEffectsMenu updateEffectsMenu = (UpdateEffectsMenu) other;
            return Intrinsics.areEqual(this.sepiaIcons, updateEffectsMenu.sepiaIcons) && this.shouldEnable == updateEffectsMenu.shouldEnable;
        }

        @NotNull
        public final List<SepiaIcon> getSepiaIcons() {
            return this.sepiaIcons;
        }

        public final boolean getShouldEnable() {
            return this.shouldEnable;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldEnable) + (this.sepiaIcons.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "UpdateEffectsMenu(sepiaIcons=" + this.sepiaIcons + ", shouldEnable=" + this.shouldEnable + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent$UpdateReactionsMenu;", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent;", "sepiaIcons", "", "Lcom/amazon/comms/calling/domain/model/dataChannel/sepia/SepiaIcon;", "shouldEnable", "", "<init>", "(Ljava/util/List;Z)V", "getSepiaIcons", "()Ljava/util/List;", "getShouldEnable", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateReactionsMenu extends SepiaMenuEvent {

        @NotNull
        private final List<SepiaIcon> sepiaIcons;
        private final boolean shouldEnable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateReactionsMenu(@NotNull List<SepiaIcon> list, boolean z) {
            super(null);
            list.getClass();
            this.sepiaIcons = list;
            this.shouldEnable = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UpdateReactionsMenu copy$default(UpdateReactionsMenu updateReactionsMenu, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = updateReactionsMenu.sepiaIcons;
            }
            if ((i & 2) != 0) {
                z = updateReactionsMenu.shouldEnable;
            }
            return updateReactionsMenu.copy(list, z);
        }

        @NotNull
        public final List<SepiaIcon> component1() {
            return this.sepiaIcons;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldEnable() {
            return this.shouldEnable;
        }

        @NotNull
        public final UpdateReactionsMenu copy(@NotNull List<SepiaIcon> sepiaIcons, boolean shouldEnable) {
            sepiaIcons.getClass();
            return new UpdateReactionsMenu(sepiaIcons, shouldEnable);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateReactionsMenu)) {
                return false;
            }
            UpdateReactionsMenu updateReactionsMenu = (UpdateReactionsMenu) other;
            return Intrinsics.areEqual(this.sepiaIcons, updateReactionsMenu.sepiaIcons) && this.shouldEnable == updateReactionsMenu.shouldEnable;
        }

        @NotNull
        public final List<SepiaIcon> getSepiaIcons() {
            return this.sepiaIcons;
        }

        public final boolean getShouldEnable() {
            return this.shouldEnable;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldEnable) + (this.sepiaIcons.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "UpdateReactionsMenu(sepiaIcons=" + this.sepiaIcons + ", shouldEnable=" + this.shouldEnable + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public /* synthetic */ SepiaMenuEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SepiaMenuEvent() {
    }
}
