package com.amazon.alexa.ra.apl.deepbrowse.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/NavigationAction;", "", "Wait", "AlreadyThere", "OpenDialog", "CloseDialog", "GoToPage", "PopToPage", "Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/NavigationAction$AlreadyThere;", "Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/NavigationAction$CloseDialog;", "Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/NavigationAction$GoToPage;", "Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/NavigationAction$OpenDialog;", "Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/NavigationAction$PopToPage;", "Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/NavigationAction$Wait;", "AVSMobileFramework-ra-apl-deep-browse-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface NavigationAction {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/NavigationAction$AlreadyThere;", "Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/NavigationAction;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AVSMobileFramework-ra-apl-deep-browse-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AlreadyThere implements NavigationAction {
        public static final int $stable = 0;

        @NotNull
        public static final AlreadyThere INSTANCE = new AlreadyThere();

        private AlreadyThere() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof AlreadyThere);
        }

        public int hashCode() {
            return 753062145;
        }

        @NotNull
        public String toString() {
            return "AlreadyThere";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/NavigationAction$CloseDialog;", "Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/NavigationAction;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AVSMobileFramework-ra-apl-deep-browse-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CloseDialog implements NavigationAction {
        public static final int $stable = 0;

        @NotNull
        public static final CloseDialog INSTANCE = new CloseDialog();

        private CloseDialog() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof CloseDialog);
        }

        public int hashCode() {
            return -1193176405;
        }

        @NotNull
        public String toString() {
            return "CloseDialog";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/NavigationAction$GoToPage;", "Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/NavigationAction;", "pageId", "", "<init>", "(Ljava/lang/String;)V", "getPageId", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AVSMobileFramework-ra-apl-deep-browse-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GoToPage implements NavigationAction {
        public static final int $stable = 0;

        @NotNull
        private final String pageId;

        public GoToPage(@NotNull String str) {
            str.getClass();
            this.pageId = str;
        }

        public static /* synthetic */ GoToPage copy$default(GoToPage goToPage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = goToPage.pageId;
            }
            return goToPage.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPageId() {
            return this.pageId;
        }

        @NotNull
        public final GoToPage copy(@NotNull String pageId) {
            pageId.getClass();
            return new GoToPage(pageId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GoToPage) && Intrinsics.areEqual(this.pageId, ((GoToPage) other).pageId);
        }

        @NotNull
        public final String getPageId() {
            return this.pageId;
        }

        public int hashCode() {
            return this.pageId.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("GoToPage(pageId=", this.pageId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/NavigationAction$OpenDialog;", "Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/NavigationAction;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AVSMobileFramework-ra-apl-deep-browse-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OpenDialog implements NavigationAction {
        public static final int $stable = 0;

        @NotNull
        public static final OpenDialog INSTANCE = new OpenDialog();

        private OpenDialog() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof OpenDialog);
        }

        public int hashCode() {
            return -1506855545;
        }

        @NotNull
        public String toString() {
            return "OpenDialog";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/NavigationAction$PopToPage;", "Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/NavigationAction;", "pageId", "", "<init>", "(Ljava/lang/String;)V", "getPageId", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AVSMobileFramework-ra-apl-deep-browse-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PopToPage implements NavigationAction {
        public static final int $stable = 0;

        @NotNull
        private final String pageId;

        public PopToPage(@NotNull String str) {
            str.getClass();
            this.pageId = str;
        }

        public static /* synthetic */ PopToPage copy$default(PopToPage popToPage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = popToPage.pageId;
            }
            return popToPage.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPageId() {
            return this.pageId;
        }

        @NotNull
        public final PopToPage copy(@NotNull String pageId) {
            pageId.getClass();
            return new PopToPage(pageId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PopToPage) && Intrinsics.areEqual(this.pageId, ((PopToPage) other).pageId);
        }

        @NotNull
        public final String getPageId() {
            return this.pageId;
        }

        public int hashCode() {
            return this.pageId.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("PopToPage(pageId=", this.pageId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/NavigationAction$Wait;", "Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/NavigationAction;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AVSMobileFramework-ra-apl-deep-browse-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Wait implements NavigationAction {
        public static final int $stable = 0;

        @NotNull
        public static final Wait INSTANCE = new Wait();

        private Wait() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Wait);
        }

        public int hashCode() {
            return 2028665482;
        }

        @NotNull
        public String toString() {
            return "Wait";
        }
    }
}
