package com.amazon.alexa.redesign.view.header;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/redesign/view/header/NoticeBannerOpenArgs;", "", "title", "", "cta", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getCta", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class NoticeBannerOpenArgs {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String cta;

    @NotNull
    private final String title;

    public NoticeBannerOpenArgs(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.cta = str2;
    }

    public static /* synthetic */ NoticeBannerOpenArgs copy$default(NoticeBannerOpenArgs noticeBannerOpenArgs, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = noticeBannerOpenArgs.title;
        }
        if ((i & 2) != 0) {
            str2 = noticeBannerOpenArgs.cta;
        }
        return noticeBannerOpenArgs.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    @NotNull
    public final NoticeBannerOpenArgs copy(@NotNull String title, @NotNull String cta) {
        title.getClass();
        cta.getClass();
        return new NoticeBannerOpenArgs(title, cta);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoticeBannerOpenArgs)) {
            return false;
        }
        NoticeBannerOpenArgs noticeBannerOpenArgs = (NoticeBannerOpenArgs) other;
        return Intrinsics.areEqual(this.title, noticeBannerOpenArgs.title) && Intrinsics.areEqual(this.cta, noticeBannerOpenArgs.cta);
    }

    @NotNull
    public final String getCta() {
        return this.cta;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.cta.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("NoticeBannerOpenArgs(title=", this.title, ", cta=", this.cta, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/redesign/view/header/NoticeBannerOpenArgs$Companion;", "", "<init>", "()V", "from", "Lcom/amazon/alexa/redesign/view/header/NoticeBannerOpenArgs;", "message", "Lcom/amazon/alexa/eventbus/api/Message;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final NoticeBannerOpenArgs from(@NotNull Message message) {
            message.getClass();
            try {
                JSONObject jSONObject = new JSONObject(message.getPayloadAsString());
                String string = jSONObject.getString("title");
                String optString = jSONObject.optString("cta", "");
                string.getClass();
                optString.getClass();
                return new NoticeBannerOpenArgs(string, optString);
            } catch (Exception e) {
                Log.w("NoticeBannerOpenArgs", "Failed to parse message: " + message, e);
                return null;
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ NoticeBannerOpenArgs(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }
}
