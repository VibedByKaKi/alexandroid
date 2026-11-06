package com.amazon.alexa.redesign.entity;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.dee.app.contacts.common.constants.Constants;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/redesign/entity/DismissIdentifier;", "", "timestamp", "", "dismissId", "", "<init>", "(JLjava/lang/String;)V", "getTimestamp", "()J", "getDismissId", "()Ljava/lang/String;", "dismissDataStoreId", "getDismissDataStoreId", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class DismissIdentifier {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String DEFAULT_DISMISS_ID = "";
    private static final long DEFAULT_TIMESTAMP = -1;

    @NotNull
    private static final String SEPARATOR = "_";

    @NotNull
    private static final String TAG = "DismissIdentifier";

    @NotNull
    private final String dismissId;
    private final long timestamp;

    public DismissIdentifier(long j, @NotNull String str) {
        str.getClass();
        this.timestamp = j;
        this.dismissId = str;
    }

    public static /* synthetic */ DismissIdentifier copy$default(DismissIdentifier dismissIdentifier, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dismissIdentifier.timestamp;
        }
        if ((i & 2) != 0) {
            str = dismissIdentifier.dismissId;
        }
        return dismissIdentifier.copy(j, str);
    }

    @JvmStatic
    @NotNull
    public static final DismissIdentifier fromDataStoreId(@NotNull String str) {
        return INSTANCE.fromDataStoreId(str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDismissId() {
        return this.dismissId;
    }

    @NotNull
    public final DismissIdentifier copy(long timestamp, @NotNull String dismissId) {
        dismissId.getClass();
        return new DismissIdentifier(timestamp, dismissId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DismissIdentifier)) {
            return false;
        }
        DismissIdentifier dismissIdentifier = (DismissIdentifier) other;
        return this.timestamp == dismissIdentifier.timestamp && Intrinsics.areEqual(this.dismissId, dismissIdentifier.dismissId);
    }

    @NotNull
    public final String getDismissDataStoreId() {
        return this.timestamp + "_" + this.dismissId;
    }

    @NotNull
    public final String getDismissId() {
        return this.dismissId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return this.dismissId.hashCode() + (Long.hashCode(this.timestamp) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("DismissIdentifier(timestamp=", this.timestamp, ", dismissId=", this.dismissId);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0007J\u0006\u0010\r\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/redesign/entity/DismissIdentifier$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "DEFAULT_TIMESTAMP", "", "DEFAULT_DISMISS_ID", "SEPARATOR", "fromDataStoreId", "Lcom/amazon/alexa/redesign/entity/DismissIdentifier;", "dismissDataStoreId", "createDefault", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DismissIdentifier createDefault() {
            return new DismissIdentifier(-1L, "");
        }

        @JvmStatic
        @NotNull
        public final DismissIdentifier fromDataStoreId(@NotNull String dismissDataStoreId) {
            List split$default;
            dismissDataStoreId.getClass();
            try {
                split$default = StringsKt__StringsKt.split$default(dismissDataStoreId, new String[]{"_"}, false, 2, 2, (Object) null);
                return split$default.size() > 1 ? new DismissIdentifier(Long.parseLong((String) split$default.get(0)), (String) split$default.get(1)) : DismissIdentifier.INSTANCE.createDefault();
            } catch (NumberFormatException e) {
                Log.e(DismissIdentifier.TAG, "Cannot parse timestamp from dismiss data store id ".concat(dismissDataStoreId), e);
                return createDefault();
            }
        }

        private Companion() {
        }
    }
}
