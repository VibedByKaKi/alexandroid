package com.amazon.alexa.ra.core.data.model;

import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/PillAction;", "", "<init>", "()V", "SendText", "NavigateInternal", "NavigateRecentChats", "LaunchIntent", "UploadContent", "Dismiss", "Lcom/amazon/alexa/ra/core/data/model/PillAction$Dismiss;", "Lcom/amazon/alexa/ra/core/data/model/PillAction$LaunchIntent;", "Lcom/amazon/alexa/ra/core/data/model/PillAction$NavigateInternal;", "Lcom/amazon/alexa/ra/core/data/model/PillAction$NavigateRecentChats;", "Lcom/amazon/alexa/ra/core/data/model/PillAction$SendText;", "Lcom/amazon/alexa/ra/core/data/model/PillAction$UploadContent;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class PillAction {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/PillAction$Dismiss;", "Lcom/amazon/alexa/ra/core/data/model/PillAction;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Dismiss extends PillAction {
        public static final int $stable = 0;

        @NotNull
        public static final Dismiss INSTANCE = new Dismiss();

        private Dismiss() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/PillAction$LaunchIntent;", "Lcom/amazon/alexa/ra/core/data/model/PillAction;", "intent", "Landroid/content/Intent;", "<init>", "(Landroid/content/Intent;)V", "getIntent", "()Landroid/content/Intent;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LaunchIntent extends PillAction {
        public static final int $stable = 8;

        @NotNull
        private final Intent intent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LaunchIntent(@NotNull Intent intent) {
            super(null);
            intent.getClass();
            this.intent = intent;
        }

        public static /* synthetic */ LaunchIntent copy$default(LaunchIntent launchIntent, Intent intent, int i, Object obj) {
            if ((i & 1) != 0) {
                intent = launchIntent.intent;
            }
            return launchIntent.copy(intent);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Intent getIntent() {
            return this.intent;
        }

        @NotNull
        public final LaunchIntent copy(@NotNull Intent intent) {
            intent.getClass();
            return new LaunchIntent(intent);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LaunchIntent) && Intrinsics.areEqual(this.intent, ((LaunchIntent) other).intent);
        }

        @NotNull
        public final Intent getIntent() {
            return this.intent;
        }

        public int hashCode() {
            return this.intent.hashCode();
        }

        @NotNull
        public String toString() {
            return "LaunchIntent(intent=" + this.intent + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/PillAction$NavigateInternal;", "Lcom/amazon/alexa/ra/core/data/model/PillAction;", "route", "", "<init>", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigateInternal extends PillAction {
        public static final int $stable = 0;

        @NotNull
        private final String route;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateInternal(@NotNull String str) {
            super(null);
            str.getClass();
            this.route = str;
        }

        public static /* synthetic */ NavigateInternal copy$default(NavigateInternal navigateInternal, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateInternal.route;
            }
            return navigateInternal.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getRoute() {
            return this.route;
        }

        @NotNull
        public final NavigateInternal copy(@NotNull String route) {
            route.getClass();
            return new NavigateInternal(route);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateInternal) && Intrinsics.areEqual(this.route, ((NavigateInternal) other).route);
        }

        @NotNull
        public final String getRoute() {
            return this.route;
        }

        public int hashCode() {
            return this.route.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("NavigateInternal(route=", this.route, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/PillAction$NavigateRecentChats;", "Lcom/amazon/alexa/ra/core/data/model/PillAction;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateRecentChats extends PillAction {
        public static final int $stable = 0;

        @NotNull
        public static final NavigateRecentChats INSTANCE = new NavigateRecentChats();

        private NavigateRecentChats() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/PillAction$SendText;", "Lcom/amazon/alexa/ra/core/data/model/PillAction;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SendText extends PillAction {
        public static final int $stable = 0;

        @NotNull
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendText(@NotNull String str) {
            super(null);
            str.getClass();
            this.text = str;
        }

        public static /* synthetic */ SendText copy$default(SendText sendText, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sendText.text;
            }
            return sendText.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final SendText copy(@NotNull String text) {
            text.getClass();
            return new SendText(text);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SendText) && Intrinsics.areEqual(this.text, ((SendText) other).text);
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("SendText(text=", this.text, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/PillAction$UploadContent;", "Lcom/amazon/alexa/ra/core/data/model/PillAction;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UploadContent extends PillAction {
        public static final int $stable = 0;

        @NotNull
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UploadContent(@NotNull String str) {
            super(null);
            str.getClass();
            this.text = str;
        }

        public static /* synthetic */ UploadContent copy$default(UploadContent uploadContent, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uploadContent.text;
            }
            return uploadContent.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final UploadContent copy(@NotNull String text) {
            text.getClass();
            return new UploadContent(text);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UploadContent) && Intrinsics.areEqual(this.text, ((UploadContent) other).text);
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("UploadContent(text=", this.text, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public /* synthetic */ PillAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PillAction() {
    }
}
