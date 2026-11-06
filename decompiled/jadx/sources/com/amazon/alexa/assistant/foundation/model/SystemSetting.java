package com.amazon.alexa.assistant.foundation.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/SystemSetting;", "", "<init>", "()V", "SetLocales", "SetTimeZone", "Lcom/amazon/alexa/assistant/foundation/model/SystemSetting$SetLocales;", "Lcom/amazon/alexa/assistant/foundation/model/SystemSetting$SetTimeZone;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class SystemSetting {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/SystemSetting$SetLocales;", "Lcom/amazon/alexa/assistant/foundation/model/SystemSetting;", "systemLocaleSetting", "Lcom/amazon/alexa/assistant/foundation/model/SystemLocaleSetting;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/model/SystemLocaleSetting;)V", "getSystemLocaleSetting", "()Lcom/amazon/alexa/assistant/foundation/model/SystemLocaleSetting;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SetLocales extends SystemSetting {

        @NotNull
        private final SystemLocaleSetting systemLocaleSetting;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetLocales(@NotNull SystemLocaleSetting systemLocaleSetting) {
            super(null);
            systemLocaleSetting.getClass();
            this.systemLocaleSetting = systemLocaleSetting;
        }

        public static /* synthetic */ SetLocales copy$default(SetLocales setLocales, SystemLocaleSetting systemLocaleSetting, int i, Object obj) {
            if ((i & 1) != 0) {
                systemLocaleSetting = setLocales.systemLocaleSetting;
            }
            return setLocales.copy(systemLocaleSetting);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final SystemLocaleSetting getSystemLocaleSetting() {
            return this.systemLocaleSetting;
        }

        @NotNull
        public final SetLocales copy(@NotNull SystemLocaleSetting systemLocaleSetting) {
            systemLocaleSetting.getClass();
            return new SetLocales(systemLocaleSetting);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetLocales) && Intrinsics.areEqual(this.systemLocaleSetting, ((SetLocales) other).systemLocaleSetting);
        }

        @NotNull
        public final SystemLocaleSetting getSystemLocaleSetting() {
            return this.systemLocaleSetting;
        }

        public int hashCode() {
            return this.systemLocaleSetting.hashCode();
        }

        @NotNull
        public String toString() {
            return "SetLocales(systemLocaleSetting=" + this.systemLocaleSetting + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/SystemSetting$SetTimeZone;", "Lcom/amazon/alexa/assistant/foundation/model/SystemSetting;", "timeZone", "", "<init>", "(Ljava/lang/String;)V", "getTimeZone", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SetTimeZone extends SystemSetting {

        @NotNull
        private final String timeZone;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetTimeZone(@NotNull String str) {
            super(null);
            str.getClass();
            this.timeZone = str;
        }

        public static /* synthetic */ SetTimeZone copy$default(SetTimeZone setTimeZone, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setTimeZone.timeZone;
            }
            return setTimeZone.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTimeZone() {
            return this.timeZone;
        }

        @NotNull
        public final SetTimeZone copy(@NotNull String timeZone) {
            timeZone.getClass();
            return new SetTimeZone(timeZone);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetTimeZone) && Intrinsics.areEqual(this.timeZone, ((SetTimeZone) other).timeZone);
        }

        @NotNull
        public final String getTimeZone() {
            return this.timeZone;
        }

        public int hashCode() {
            return this.timeZone.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("SetTimeZone(timeZone=", this.timeZone, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public /* synthetic */ SystemSetting(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SystemSetting() {
    }
}
