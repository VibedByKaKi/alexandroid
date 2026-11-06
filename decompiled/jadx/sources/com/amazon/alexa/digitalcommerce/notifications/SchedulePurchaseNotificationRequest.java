package com.amazon.alexa.digitalcommerce.notifications;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007HÆ\u0003JC\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/notifications/SchedulePurchaseNotificationRequest;", "", "canonicalProductId", "", "title", "body", "configuration", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCanonicalProductId", "()Ljava/lang/String;", "getTitle", "getBody", "getConfiguration", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SchedulePurchaseNotificationRequest {

    @Nullable
    private final String body;

    @NotNull
    private final String canonicalProductId;

    @Nullable
    private final Map<String, Object> configuration;

    @Nullable
    private final String title;

    public SchedulePurchaseNotificationRequest(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, ? extends Object> map) {
        str.getClass();
        this.canonicalProductId = str;
        this.title = str2;
        this.body = str3;
        this.configuration = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SchedulePurchaseNotificationRequest copy$default(SchedulePurchaseNotificationRequest schedulePurchaseNotificationRequest, String str, String str2, String str3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = schedulePurchaseNotificationRequest.canonicalProductId;
        }
        if ((i & 2) != 0) {
            str2 = schedulePurchaseNotificationRequest.title;
        }
        if ((i & 4) != 0) {
            str3 = schedulePurchaseNotificationRequest.body;
        }
        if ((i & 8) != 0) {
            map = schedulePurchaseNotificationRequest.configuration;
        }
        return schedulePurchaseNotificationRequest.copy(str, str2, str3, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCanonicalProductId() {
        return this.canonicalProductId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    @Nullable
    public final Map<String, Object> component4() {
        return this.configuration;
    }

    @NotNull
    public final SchedulePurchaseNotificationRequest copy(@NotNull String canonicalProductId, @Nullable String title, @Nullable String body, @Nullable Map<String, ? extends Object> configuration) {
        canonicalProductId.getClass();
        return new SchedulePurchaseNotificationRequest(canonicalProductId, title, body, configuration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SchedulePurchaseNotificationRequest)) {
            return false;
        }
        SchedulePurchaseNotificationRequest schedulePurchaseNotificationRequest = (SchedulePurchaseNotificationRequest) other;
        return Intrinsics.areEqual(this.canonicalProductId, schedulePurchaseNotificationRequest.canonicalProductId) && Intrinsics.areEqual(this.title, schedulePurchaseNotificationRequest.title) && Intrinsics.areEqual(this.body, schedulePurchaseNotificationRequest.body) && Intrinsics.areEqual(this.configuration, schedulePurchaseNotificationRequest.configuration);
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    @NotNull
    public final String getCanonicalProductId() {
        return this.canonicalProductId;
    }

    @Nullable
    public final Map<String, Object> getConfiguration() {
        return this.configuration;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.canonicalProductId.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.body;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, Object> map = this.configuration;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.canonicalProductId;
        String str2 = this.title;
        String str3 = this.body;
        Map<String, Object> map = this.configuration;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("SchedulePurchaseNotificationRequest(canonicalProductId=", str, ", title=", str2, ", body=");
        m.append(str3);
        m.append(", configuration=");
        m.append(map);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }
}
