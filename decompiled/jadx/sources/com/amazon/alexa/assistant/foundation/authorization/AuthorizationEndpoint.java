package com.amazon.alexa.assistant.foundation.authorization;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.credentiallocker.CustomerRegion;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \r2\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/authorization/AuthorizationEndpoint;", "", "<init>", "()V", "tokenHost", "", "getTokenHost", "()Ljava/lang/String;", "token", "getToken", "Region", "Beta", "Prod", "Companion", "Lcom/amazon/alexa/assistant/foundation/authorization/AuthorizationEndpoint$Beta;", "Lcom/amazon/alexa/assistant/foundation/authorization/AuthorizationEndpoint$Prod;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class AuthorizationEndpoint {

    @NotNull
    private static final String SCHEME = "https://";

    @NotNull
    private static final String TOKEN_EXTENSION = "/auth/O2/token";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/authorization/AuthorizationEndpoint$Beta;", "Lcom/amazon/alexa/assistant/foundation/authorization/AuthorizationEndpoint;", "<init>", "()V", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Beta extends AuthorizationEndpoint {

        @NotNull
        public static final Beta INSTANCE = new Beta();

        private Beta() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/authorization/AuthorizationEndpoint$Prod;", "Lcom/amazon/alexa/assistant/foundation/authorization/AuthorizationEndpoint;", "region", "Lcom/amazon/alexa/assistant/foundation/authorization/AuthorizationEndpoint$Region;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/authorization/AuthorizationEndpoint$Region;)V", "getRegion", "()Lcom/amazon/alexa/assistant/foundation/authorization/AuthorizationEndpoint$Region;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Prod extends AuthorizationEndpoint {

        @NotNull
        private final Region region;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Prod(@NotNull Region region) {
            super(null);
            region.getClass();
            this.region = region;
        }

        public static /* synthetic */ Prod copy$default(Prod prod, Region region, int i, Object obj) {
            if ((i & 1) != 0) {
                region = prod.region;
            }
            return prod.copy(region);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Region getRegion() {
            return this.region;
        }

        @NotNull
        public final Prod copy(@NotNull Region region) {
            region.getClass();
            return new Prod(region);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Prod) && this.region == ((Prod) other).region;
        }

        @NotNull
        public final Region getRegion() {
            return this.region;
        }

        public int hashCode() {
            return this.region.hashCode();
        }

        @NotNull
        public String toString() {
            return "Prod(region=" + this.region + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/authorization/AuthorizationEndpoint$Region;", "", "<init>", "(Ljava/lang/String;I)V", CustomerRegion.NA, CustomerRegion.EU, "FE", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Region {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Region[] $VALUES;
        public static final Region NA = new Region(CustomerRegion.NA, 0);
        public static final Region EU = new Region(CustomerRegion.EU, 1);
        public static final Region FE = new Region("FE", 2);

        private static final /* synthetic */ Region[] $values() {
            return new Region[]{NA, EU, FE};
        }

        static {
            Region[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Region(String str, int i) {
        }

        @NotNull
        public static EnumEntries<Region> getEntries() {
            return $ENTRIES;
        }

        public static Region valueOf(String str) {
            return (Region) Enum.valueOf(Region.class, str);
        }

        public static Region[] values() {
            return (Region[]) $VALUES.clone();
        }
    }

    public /* synthetic */ AuthorizationEndpoint(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final String getToken() {
        return a$$ExternalSyntheticOutline0.m(SCHEME, getTokenHost(), TOKEN_EXTENSION);
    }

    @NotNull
    public final String getTokenHost() {
        if (this instanceof Beta) {
            return "api.integ.amazon.com";
        }
        if (this instanceof Prod) {
            return "api.amazon.com";
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    private AuthorizationEndpoint() {
    }
}
