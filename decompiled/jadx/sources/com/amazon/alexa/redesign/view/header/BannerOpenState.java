package com.amazon.alexa.redesign.view.header;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.dee.app.elements.ElementsRouteKeys;
import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/redesign/view/header/BannerOpenState;", "", "<init>", "()V", ShortcutConstants.METRIC_NAME_KEY, "", "getMetricName", "()Ljava/lang/String;", "setMetricName", "(Ljava/lang/String;)V", "AppUpgrade", "Offline", "Outage", "Lcom/amazon/alexa/redesign/view/header/BannerOpenState$AppUpgrade;", "Lcom/amazon/alexa/redesign/view/header/BannerOpenState$Offline;", "Lcom/amazon/alexa/redesign/view/header/BannerOpenState$Outage;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public abstract class BannerOpenState {
    public static final int $stable = 8;

    @NotNull
    private String metricName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/redesign/view/header/BannerOpenState$AppUpgrade;", "Lcom/amazon/alexa/redesign/view/header/BannerOpenState;", ElementsRouteKeys.ARGS, "Lcom/amazon/alexa/redesign/view/header/NoticeBannerOpenArgs;", "<init>", "(Lcom/amazon/alexa/redesign/view/header/NoticeBannerOpenArgs;)V", "getArgs", "()Lcom/amazon/alexa/redesign/view/header/NoticeBannerOpenArgs;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AppUpgrade extends BannerOpenState {
        public static final int $stable = 0;

        @NotNull
        private final NoticeBannerOpenArgs args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppUpgrade(@NotNull NoticeBannerOpenArgs noticeBannerOpenArgs) {
            super(null);
            noticeBannerOpenArgs.getClass();
            this.args = noticeBannerOpenArgs;
        }

        public static /* synthetic */ AppUpgrade copy$default(AppUpgrade appUpgrade, NoticeBannerOpenArgs noticeBannerOpenArgs, int i, Object obj) {
            if ((i & 1) != 0) {
                noticeBannerOpenArgs = appUpgrade.args;
            }
            return appUpgrade.copy(noticeBannerOpenArgs);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final NoticeBannerOpenArgs getArgs() {
            return this.args;
        }

        @NotNull
        public final AppUpgrade copy(@NotNull NoticeBannerOpenArgs args) {
            args.getClass();
            return new AppUpgrade(args);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AppUpgrade) && Intrinsics.areEqual(this.args, ((AppUpgrade) other).args);
        }

        @NotNull
        public final NoticeBannerOpenArgs getArgs() {
            return this.args;
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        @NotNull
        public String toString() {
            return "AppUpgrade(args=" + this.args + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/redesign/view/header/BannerOpenState$Offline;", "Lcom/amazon/alexa/redesign/view/header/BannerOpenState;", "<init>", "()V", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Offline extends BannerOpenState {
        public static final int $stable = 0;

        @NotNull
        public static final Offline INSTANCE = new Offline();

        private Offline() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/redesign/view/header/BannerOpenState$Outage;", "Lcom/amazon/alexa/redesign/view/header/BannerOpenState;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Outage extends BannerOpenState {
        public static final int $stable = 0;

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Outage(@NotNull String str) {
            super(null);
            str.getClass();
            this.message = str;
        }

        public static /* synthetic */ Outage copy$default(Outage outage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = outage.message;
            }
            return outage.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final Outage copy(@NotNull String message) {
            message.getClass();
            return new Outage(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Outage) && Intrinsics.areEqual(this.message, ((Outage) other).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Outage(message=", this.message, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    private BannerOpenState() {
        String str;
        if (this instanceof AppUpgrade) {
            str = "app_upgrade";
        } else if (this instanceof Offline) {
            str = "offline_mode";
        } else {
            if (!(this instanceof Outage)) {
                PathKt$$ExternalSyntheticBUOutline0.m();
                throw null;
            }
            str = "outage_alert";
        }
        this.metricName = str;
    }

    @NotNull
    public final String getMetricName() {
        return this.metricName;
    }

    public final void setMetricName(@NotNull String str) {
        str.getClass();
        this.metricName = str;
    }

    public /* synthetic */ BannerOpenState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
