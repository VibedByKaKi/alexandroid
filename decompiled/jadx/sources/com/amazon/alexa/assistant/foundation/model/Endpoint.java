package com.amazon.alexa.assistant.foundation.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.android.gms.actions.SearchIntents;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.HttpUrl;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 .2\u00020\u0001:\u0007()*+,-.B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005J\u0016\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005J\u0016\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005J\u0006\u0010\u001e\u001a\u00020\u0005J\u000e\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005J\u000e\u0010 \u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005J3\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u00052\b\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&¢\u0006\u0002\b'R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0001\u0006/01234¨\u00065"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/Endpoint;", "", "<init>", "()V", "gatewayUrl", "", "getGatewayUrl", "()Ljava/lang/String;", "capabilityHost", "getCapabilityHost", "webAPIHost", "getWebAPIHost", "capabilityBaseUrl", "getCapabilityBaseUrl", "webAPIBaseUrl", "getWebAPIBaseUrl", "webAPI", "path", "conversationsHost", "getConversationsHost", "cosmoBaseUrl", "Lokhttp3/HttpUrl;", "getCosmoBaseUrl", "()Lokhttp3/HttpUrl;", "conversations", SearchIntents.EXTRA_QUERY, "conversationMetadata", "conversationId", "conversationFragments", "conversationSynchronize", "deleteConversations", "deleteConversation", "deleteFragments", "cardTranscript", "itemId", "before", "after", "paginationMaxResults", "Lkotlin/UInt;", "cardTranscript-tcIDgvQ", "Alpha", "Beta", ExifInterface.TAG_GAMMA, "PreProd", "Prod", "LocalDev", "Companion", "Lcom/amazon/alexa/assistant/foundation/model/Endpoint$Alpha;", "Lcom/amazon/alexa/assistant/foundation/model/Endpoint$Beta;", "Lcom/amazon/alexa/assistant/foundation/model/Endpoint$Gamma;", "Lcom/amazon/alexa/assistant/foundation/model/Endpoint$LocalDev;", "Lcom/amazon/alexa/assistant/foundation/model/Endpoint$PreProd;", "Lcom/amazon/alexa/assistant/foundation/model/Endpoint$Prod;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEndpoint.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Endpoint.kt\ncom/amazon/alexa/assistant/foundation/model/Endpoint\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,318:1\n1#2:319\n1069#3,2:320\n1088#3,2:322\n*S KotlinDebug\n*F\n+ 1 Endpoint.kt\ncom/amazon/alexa/assistant/foundation/model/Endpoint\n*L\n215#1:320,2\n292#1:322,2\n*E\n"})
/* loaded from: classes15.dex */
public abstract class Endpoint {

    @NotNull
    private static final String AUTHORITY_PUNCTUATION = ".-:[]";

    @NotNull
    private static final String CONVERSATIONS_PATH = "/v1/conversations";

    @NotNull
    private static final String COSMO_HOST_EU = "api.prod-zaz.cosmo.alexa.amazon.dev";

    @NotNull
    private static final String COSMO_HOST_NA = "api.prod-iad.cosmo.alexa.amazon.dev";

    @NotNull
    public static final String DEFAULT_LOCAL_DEV_HOST = "localhost:8443";

    @NotNull
    private static final String SCHEME = "https://";

    @NotNull
    private static final String SURFACE_ITEMS_PATH = "v1/surfaces/items";

    @NotNull
    private static final String TRAILING_SLASH = "/";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/Endpoint$Alpha;", "Lcom/amazon/alexa/assistant/foundation/model/Endpoint;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Alpha extends Endpoint {

        @NotNull
        public static final Alpha INSTANCE = new Alpha();

        private Alpha() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Alpha);
        }

        public int hashCode() {
            return -282755731;
        }

        @NotNull
        public String toString() {
            return "Alpha";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/Endpoint$Beta;", "Lcom/amazon/alexa/assistant/foundation/model/Endpoint;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Beta extends Endpoint {

        @NotNull
        public static final Beta INSTANCE = new Beta();

        private Beta() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Beta);
        }

        public int hashCode() {
            return -286192639;
        }

        @NotNull
        public String toString() {
            return "Beta";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/Endpoint$Gamma;", "Lcom/amazon/alexa/assistant/foundation/model/Endpoint;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Gamma extends Endpoint {

        @NotNull
        public static final Gamma INSTANCE = new Gamma();

        private Gamma() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Gamma);
        }

        public int hashCode() {
            return -277545034;
        }

        @NotNull
        public String toString() {
            return ExifInterface.TAG_GAMMA;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/Endpoint$PreProd;", "Lcom/amazon/alexa/assistant/foundation/model/Endpoint;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PreProd extends Endpoint {

        @NotNull
        public static final PreProd INSTANCE = new PreProd();

        private PreProd() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof PreProd);
        }

        public int hashCode() {
            return -556743447;
        }

        @NotNull
        public String toString() {
            return "PreProd";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/Endpoint$Prod;", "Lcom/amazon/alexa/assistant/foundation/model/Endpoint;", "region", "Lcom/amazon/alexa/assistant/foundation/model/EndpointRegion;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/model/EndpointRegion;)V", "getRegion", "()Lcom/amazon/alexa/assistant/foundation/model/EndpointRegion;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Prod extends Endpoint {

        @NotNull
        private final EndpointRegion region;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Prod(@NotNull EndpointRegion endpointRegion) {
            super(null);
            endpointRegion.getClass();
            this.region = endpointRegion;
        }

        public static /* synthetic */ Prod copy$default(Prod prod, EndpointRegion endpointRegion, int i, Object obj) {
            if ((i & 1) != 0) {
                endpointRegion = prod.region;
            }
            return prod.copy(endpointRegion);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final EndpointRegion getRegion() {
            return this.region;
        }

        @NotNull
        public final Prod copy(@NotNull EndpointRegion region) {
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
        public final EndpointRegion getRegion() {
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

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EndpointRegion.values().length];
            try {
                iArr[EndpointRegion.NA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EndpointRegion.EU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ Endpoint(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: cardTranscript-tcIDgvQ$default, reason: not valid java name */
    public static /* synthetic */ String m15049cardTranscripttcIDgvQ$default(Endpoint endpoint, String str, String str2, String str3, UInt uInt, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: cardTranscript-tcIDgvQ");
            return null;
        }
        if ((i & 8) != 0) {
            uInt = null;
        }
        return endpoint.m15050cardTranscripttcIDgvQ(str, str2, str3, uInt);
    }

    private final String getConversationsHost() {
        if ((this instanceof Alpha) || (this instanceof Beta) || (this instanceof Gamma)) {
            return "bob-dispatch-gamma-na.amazon.com";
        }
        if (this instanceof PreProd) {
            return "bob-dispatch-preprod-na.amazon.com";
        }
        if (!(this instanceof Prod)) {
            if (this instanceof LocalDev) {
                return ((LocalDev) this).getConversationServiceHost();
            }
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[((Prod) this).getRegion().ordinal()];
        if (i == 1) {
            return "avs-alexa-12-na.amazon.com";
        }
        if (i == 2) {
            return "avs-alexa-eu.amazon.com";
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    private final HttpUrl getCosmoBaseUrl() {
        boolean contains$default;
        boolean z = this instanceof Alpha;
        String str = COSMO_HOST_NA;
        if (!z && !(this instanceof Beta) && !(this instanceof Gamma) && !(this instanceof PreProd)) {
            if (this instanceof Prod) {
                int i = WhenMappings.$EnumSwitchMapping$0[((Prod) this).getRegion().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        PathKt$$ExternalSyntheticBUOutline0.m();
                        return null;
                    }
                    str = COSMO_HOST_EU;
                }
            } else {
                if (!(this instanceof LocalDev)) {
                    PathKt$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                str = ((LocalDev) this).getCosmoServiceHost();
            }
        }
        if (StringsKt.isBlank(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3("A Cosmo host must not be blank");
            return null;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (!Character.isLetterOrDigit(charAt)) {
                contains$default = StringsKt__StringsKt.contains$default(AUTHORITY_PUNCTUATION, charAt, false, 2, (Object) null);
                if (!contains$default) {
                    Single$$ExternalSyntheticBUOutline0.m$3("A Cosmo host must stand as a URL authority");
                    return null;
                }
            }
        }
        HttpUrl parse = HttpUrl.INSTANCE.parse(SCHEME.concat(str));
        if (parse != null) {
            return parse;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("A Cosmo host must stand as a URL authority");
        return null;
    }

    @NotNull
    /* renamed from: cardTranscript-tcIDgvQ, reason: not valid java name */
    public final String m15050cardTranscripttcIDgvQ(@NotNull String itemId, @Nullable String before, @Nullable String after, @Nullable UInt paginationMaxResults) {
        itemId.getClass();
        String obj = StringsKt.trim((CharSequence) itemId).toString();
        if (StringsKt.isBlank(obj)) {
            Single$$ExternalSyntheticBUOutline0.m$3("A card transcript item id must not be blank");
            return null;
        }
        for (int i = 0; i < obj.length(); i++) {
            if (obj.charAt(i) != '.') {
                HttpUrl.Builder addPathSegment = getCosmoBaseUrl().newBuilder().addPathSegments(SURFACE_ITEMS_PATH).addPathSegment(obj).addPathSegment("fragments");
                if (before != null) {
                    if (before.length() <= 0) {
                        before = null;
                    }
                    if (before != null) {
                        addPathSegment.addQueryParameter("before", before);
                    }
                }
                if (after != null) {
                    if (after.length() <= 0) {
                        after = null;
                    }
                    if (after != null) {
                        addPathSegment.addQueryParameter("after", after);
                    }
                }
                if (paginationMaxResults != null) {
                    addPathSegment.addQueryParameter("maxResults", Integer.toUnsignedString(paginationMaxResults.getData()));
                }
                return addPathSegment.build().getUrl();
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3("A card transcript item id must not consist only of dots");
        return null;
    }

    @NotNull
    public final String conversationFragments(@NotNull String conversationId, @NotNull String query) {
        conversationId.getClass();
        query.getClass();
        return a$$ExternalSyntheticOutline0.m$1(conversationMetadata(conversationId), "/fragments", query);
    }

    @NotNull
    public final String conversationMetadata(@NotNull String conversationId) {
        conversationId.getClass();
        return a$$ExternalSyntheticOutline0.m(SCHEME, getConversationsHost(), "/v1/conversations/", conversationId);
    }

    @NotNull
    public final String conversationSynchronize(@NotNull String conversationId, @NotNull String query) {
        conversationId.getClass();
        query.getClass();
        return a$$ExternalSyntheticOutline0.m$1(conversationMetadata(conversationId), "/fragments/synchronize", query);
    }

    @NotNull
    public final String conversations(@NotNull String query) {
        query.getClass();
        return a$$ExternalSyntheticOutline0.m(SCHEME, getConversationsHost(), CONVERSATIONS_PATH, query);
    }

    @NotNull
    public final String deleteConversation(@NotNull String conversationId) {
        conversationId.getClass();
        return a$$ExternalSyntheticOutline0.m(SCHEME, getConversationsHost(), "/v1/conversations/", conversationId);
    }

    @NotNull
    public final String deleteConversations() {
        return a$$ExternalSyntheticOutline0.m(SCHEME, getConversationsHost(), "/v1/conversations/delete");
    }

    @NotNull
    public final String deleteFragments(@NotNull String conversationId) {
        conversationId.getClass();
        return BitVector$$ExternalSyntheticOutline0.m(conversationMetadata(conversationId), "/fragments/delete");
    }

    @NotNull
    public final String getCapabilityBaseUrl() {
        return a$$ExternalSyntheticOutline0.m(SCHEME, getCapabilityHost(), "/");
    }

    @NotNull
    public final String getCapabilityHost() {
        if ((this instanceof Alpha) || (this instanceof Beta)) {
            return "api-amazonalexa.integ.amazon.com";
        }
        if (this instanceof Gamma) {
            return "hypernova.amazonalexa.com";
        }
        if ((this instanceof PreProd) || (this instanceof Prod)) {
            return "api.amazonalexa.com";
        }
        if (this instanceof LocalDev) {
            return ((LocalDev) this).getCapabilityApiHost();
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @NotNull
    public final String getGatewayUrl() {
        String gatewayHost;
        if (this instanceof Alpha) {
            gatewayHost = "avs-proxy-alpha.integ.amazon.com";
        } else if (this instanceof Beta) {
            gatewayHost = "avs-proxy.integ.amazon.com";
        } else if (this instanceof Gamma) {
            gatewayHost = "polaron.amazon.com";
        } else if (this instanceof PreProd) {
            gatewayHost = "tetryon.amazon.com";
        } else if (this instanceof Prod) {
            int i = WhenMappings.$EnumSwitchMapping$0[((Prod) this).getRegion().ordinal()];
            if (i == 1) {
                gatewayHost = "alexa.na.gateway.devices.a2z.com";
            } else {
                if (i != 2) {
                    PathKt$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                gatewayHost = "alexa.eu.gateway.devices.a2z.com";
            }
        } else {
            if (!(this instanceof LocalDev)) {
                PathKt$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            gatewayHost = ((LocalDev) this).getGatewayHost();
        }
        return a$$ExternalSyntheticOutline0.m(SCHEME, gatewayHost);
    }

    @NotNull
    public final String getWebAPIBaseUrl() {
        return a$$ExternalSyntheticOutline0.m(SCHEME, getWebAPIHost(), "/");
    }

    @NotNull
    public final String getWebAPIHost() {
        if ((this instanceof Alpha) || (this instanceof Beta)) {
            return "projectdee-ui.integ.amazon.com";
        }
        if (this instanceof Gamma) {
            return "polaron.amazon.com";
        }
        if (this instanceof PreProd) {
            return "pitangui.amazon.com";
        }
        if (!(this instanceof Prod)) {
            if (this instanceof LocalDev) {
                return ((LocalDev) this).getWebApiHost();
            }
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[((Prod) this).getRegion().ordinal()];
        if (i == 1) {
            return "alexa.amazon.com";
        }
        if (i == 2) {
            return "layla.amazon.co.uk";
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @NotNull
    public final String webAPI(@NotNull String path) {
        path.getClass();
        return a$$ExternalSyntheticOutline0.m(SCHEME, getWebAPIHost(), path);
    }

    private Endpoint() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/Endpoint$LocalDev;", "Lcom/amazon/alexa/assistant/foundation/model/Endpoint;", "host", "", "gatewayHost", "capabilityApiHost", "webApiHost", "conversationServiceHost", "cosmoServiceHost", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "getGatewayHost", "getCapabilityApiHost", "getWebApiHost", "getConversationServiceHost", "getCosmoServiceHost", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LocalDev extends Endpoint {

        @NotNull
        private final String capabilityApiHost;

        @NotNull
        private final String conversationServiceHost;

        @NotNull
        private final String cosmoServiceHost;

        @NotNull
        private final String gatewayHost;

        @NotNull
        private final String host;

        @NotNull
        private final String webApiHost;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ LocalDev(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r0 = this;
                r8 = r7 & 1
                if (r8 == 0) goto L6
                java.lang.String r1 = "localhost:8443"
            L6:
                r8 = r7 & 2
                if (r8 == 0) goto Lb
                r2 = r1
            Lb:
                r8 = r7 & 4
                if (r8 == 0) goto L10
                r3 = r1
            L10:
                r8 = r7 & 8
                if (r8 == 0) goto L15
                r4 = r1
            L15:
                r8 = r7 & 16
                if (r8 == 0) goto L1a
                r5 = r1
            L1a:
                r7 = r7 & 32
                if (r7 == 0) goto L26
                r8 = r1
                r7 = r5
                r5 = r3
                r3 = r8
            L22:
                r6 = r4
                r4 = r2
                r2 = r0
                goto L2b
            L26:
                r7 = r5
                r8 = r6
                r5 = r3
                r3 = r1
                goto L22
            L2b:
                r2.<init>(r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.assistant.foundation.model.Endpoint.LocalDev.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public static /* synthetic */ LocalDev copy$default(LocalDev localDev, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = localDev.host;
            }
            if ((i & 2) != 0) {
                str2 = localDev.gatewayHost;
            }
            if ((i & 4) != 0) {
                str3 = localDev.capabilityApiHost;
            }
            if ((i & 8) != 0) {
                str4 = localDev.webApiHost;
            }
            if ((i & 16) != 0) {
                str5 = localDev.conversationServiceHost;
            }
            if ((i & 32) != 0) {
                str6 = localDev.cosmoServiceHost;
            }
            String str7 = str5;
            String str8 = str6;
            return localDev.copy(str, str2, str3, str4, str7, str8);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getGatewayHost() {
            return this.gatewayHost;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getCapabilityApiHost() {
            return this.capabilityApiHost;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getWebApiHost() {
            return this.webApiHost;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getConversationServiceHost() {
            return this.conversationServiceHost;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getCosmoServiceHost() {
            return this.cosmoServiceHost;
        }

        @NotNull
        public final LocalDev copy(@NotNull String host, @NotNull String gatewayHost, @NotNull String capabilityApiHost, @NotNull String webApiHost, @NotNull String conversationServiceHost, @NotNull String cosmoServiceHost) {
            Automotive$$ExternalSyntheticOutline0.m(host, gatewayHost, capabilityApiHost, webApiHost, conversationServiceHost);
            cosmoServiceHost.getClass();
            return new LocalDev(host, gatewayHost, capabilityApiHost, webApiHost, conversationServiceHost, cosmoServiceHost);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocalDev)) {
                return false;
            }
            LocalDev localDev = (LocalDev) other;
            return Intrinsics.areEqual(this.host, localDev.host) && Intrinsics.areEqual(this.gatewayHost, localDev.gatewayHost) && Intrinsics.areEqual(this.capabilityApiHost, localDev.capabilityApiHost) && Intrinsics.areEqual(this.webApiHost, localDev.webApiHost) && Intrinsics.areEqual(this.conversationServiceHost, localDev.conversationServiceHost) && Intrinsics.areEqual(this.cosmoServiceHost, localDev.cosmoServiceHost);
        }

        @NotNull
        public final String getCapabilityApiHost() {
            return this.capabilityApiHost;
        }

        @NotNull
        public final String getConversationServiceHost() {
            return this.conversationServiceHost;
        }

        @NotNull
        public final String getCosmoServiceHost() {
            return this.cosmoServiceHost;
        }

        @NotNull
        public final String getGatewayHost() {
            return this.gatewayHost;
        }

        @NotNull
        public final String getHost() {
            return this.host;
        }

        @NotNull
        public final String getWebApiHost() {
            return this.webApiHost;
        }

        public int hashCode() {
            return this.cosmoServiceHost.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.host.hashCode() * 31, 31, this.gatewayHost), 31, this.capabilityApiHost), 31, this.webApiHost), 31, this.conversationServiceHost);
        }

        @NotNull
        public String toString() {
            String str = this.host;
            String str2 = this.gatewayHost;
            String str3 = this.capabilityApiHost;
            String str4 = this.webApiHost;
            String str5 = this.conversationServiceHost;
            String str6 = this.cosmoServiceHost;
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("LocalDev(host=", str, ", gatewayHost=", str2, ", capabilityApiHost=");
            AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", webApiHost=", str4, ", conversationServiceHost=");
            return DoubleList$$ExternalSyntheticOutline0.m(m, str5, ", cosmoServiceHost=", str6, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalDev(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
            super(null);
            Automotive$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
            str6.getClass();
            this.host = str;
            this.gatewayHost = str2;
            this.capabilityApiHost = str3;
            this.webApiHost = str4;
            this.conversationServiceHost = str5;
            this.cosmoServiceHost = str6;
        }

        public LocalDev() {
            this(null, null, null, null, null, null, 63, null);
        }
    }
}
