package com.amazon.alexa.ra.core.ui.markdown.parser.extensions;

import android.text.util.Linkify;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.facebook.react.uimanager.ViewProps;
import defpackage.a$$ExternalSyntheticOutline0;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/markdown/parser/extensions/AddressLinkDetector;", "", "pattern", "Ljava/util/regex/Pattern;", ViewProps.TRANSFORM, "Landroid/text/util/Linkify$TransformFilter;", "<init>", "(Ljava/util/regex/Pattern;Landroid/text/util/Linkify$TransformFilter;)V", "getPattern", "()Ljava/util/regex/Pattern;", "getTransform", "()Landroid/text/util/Linkify$TransformFilter;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class AddressLinkDetector {

    @NotNull
    private static final String ADDRESS_PATTERN = "(\\d{1,6}\\s+(?:(?:N|S|E|W|NE|NW|SE|SW|North|South|East|West|Northeast|Northwest|Southeast|Southwest)\\s+)?[A-Za-z0-9.'\\-]+(?:\\s+[A-Za-z0-9.'\\-]+)*\\s+(?:Alameda|Alley|Annex|Arcade|Ave[.]?|Avenue|Bayou|Beach|Bend|Bluff|Bluffs|Blvd|Bottom|Boulevard|Branch|Bridge|Brook|Brooks|Broadway|Burg|Burgs|Bypass|Camino|Camp|Canyon|Cape|Causeway|Center|Centers|Cir|Circle|Circles|Circulo|Cliff|Cliffs|Club|Common|Corner|Corners|Course|Court|Courts|Cove|Coves|Creek|Crescent|Crest|Crossing|Crossroad|Ctr|Curve|Dale|Dam|Divide|Dr|Drive|Drives|Driveway|Estate|Estates|Extension|Extensions|Expy|Expressway|Fall|Falls|Ferry|Field|Fields|Fld|Flat|Flats|Ford|Fords|Forge|Forges|Fork|Forks|Fort|Freeway|Garden|Gardens|Gateway|Glen|Glens|Green|Greens|Grove|Groves|Harbor|Harbors|Haven|Hbr|Heights|Highway|Hill|Hills|Hollow|Holw|Hwy|Inlet|Is|Island|Islands|Isle|Jct|Junction|Junctions|Key|Keys|Knl|Knoll|Knolls|Ky|Lake|Lakes|Land|Landing|Lane|Lck|Ldg|Lf|Lgt|Light|Lights|Lk|Ln|Lndg|Loaf|Lock|Locks|Lodge|Loop|Mall|Manor|Manors|Mdw|Meadow|Meadows|Mews|Mill|Mills|Mission|Ml|Mount|Mountain|Mountains|Motorway|Msn|Mt|Neck|Orch|Orchard|Oval|Overpass|Park|Parks|Parkway|Parkways|Pass|Passage|Path|Pike|Pine|Pines|Pkwy|Pl|Place|Plain|Plains|Plaza|Point|Points|Port|Ports|Pr|Prairie|Privada|Prt|Radial|Radl|Ramp|Ranch|Rapid|Rapids|Rd[.]?|Rdg|Real|Rest|Ridge|Ridges|Riv|River|Road|Roads|Route|Row|Rue|Run|Shoal|Shoals|Shore|Shores|Shr|Skyway|Spg|Spring|Springs|Spur|Spurs|Square|Squares|St[.]?|Sta|Station|Stra|Stravenue|Stream|Street|Streets|Strm|Summit|Speedway|Terrace|Throughway|Tpke|Track|Trafficway|Trail|Trak|Trace|Trce|Tunnel|Tunl|Turnpike|Un|Underpass|Union|Unions|Valley|Valleys|Via|Viaduct|View|Views|Village|Villages|Ville|Vis|Vista|Vl|Vlg|Vly|Vw|Walk|Walks|Wall|Way|Ways|Well|Wells|Wl|Wlk|Xing|Xrd)(?:\\s+(?:N|S|E|W|NE|NW|SE|SW|North|South|East|West|Northeast|Northwest|Southeast|Southwest))?\\s*,?\\s*(?:(?:Apartment|Apt|Suite|Ste|Unit|#)\\s*[A-Za-z0-9\\-]+\\s*)?\\s*,?\\s*[A-Za-z\\s-]+\\s*,?\\s*(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\\s]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\\s]+of[\\s]+columbia)|(de|delaware)|(fl|florida)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\\s]+mariana[\\s]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\\s]+carolina)|(nd|north[\\s]+dakota)|(ne|nebraska)|(nh|new[\\s]+hampshire)|(nj|new[\\s]+jersey)|(nm|new[\\s]+mexico)|(nv|nevada)|(ny|new[\\s]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\\s]+rico)|(ri|rhode[\\s]+island)|(sc|south[\\s]+carolina)|(sd|south[\\s]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\\s]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\\s]+virginia)|(wy|wyoming))\\s*,?\\s*[0-9]{5}(?:-[0-9]{4})?)";

    @NotNull
    private static final String CITY_PATTERN = "[A-Za-z\\s-]+\\s*,?\\s*";

    @NotNull
    private static final String DIRECTIONAL_PATTERN = "(?:N|S|E|W|NE|NW|SE|SW|North|South|East|West|Northeast|Northwest|Southeast|Southwest)";

    @NotNull
    private static final String DIRECTIONAL_PREFIX_PATTERN = "(?:(?:N|S|E|W|NE|NW|SE|SW|North|South|East|West|Northeast|Northwest|Southeast|Southwest)\\s+)?";

    @NotNull
    private static final String DIRECTIONAL_SUFFIX_PATTERN = "(?:\\s+(?:N|S|E|W|NE|NW|SE|SW|North|South|East|West|Northeast|Northwest|Southeast|Southwest))?";

    @NotNull
    private static final String OPTIONAL_COMMA_AND_SPACE = "\\s*,?\\s*";

    @NotNull
    private static final String SPACE_CHARS = "\\s";

    @NotNull
    private static final String STATE_PATTERN = "(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\\s]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\\s]+of[\\s]+columbia)|(de|delaware)|(fl|florida)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\\s]+mariana[\\s]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\\s]+carolina)|(nd|north[\\s]+dakota)|(ne|nebraska)|(nh|new[\\s]+hampshire)|(nj|new[\\s]+jersey)|(nm|new[\\s]+mexico)|(nv|nevada)|(ny|new[\\s]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\\s]+rico)|(ri|rhode[\\s]+island)|(sc|south[\\s]+carolina)|(sd|south[\\s]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\\s]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\\s]+virginia)|(wy|wyoming))";

    @NotNull
    private static final String STREET_NAME_PATTERN = "[A-Za-z0-9.'\\-]+(?:\\s+[A-Za-z0-9.'\\-]+)*\\s+";

    @NotNull
    private static final String STREET_NUMBER_PATTERN = "\\d{1,6}\\s+";

    @NotNull
    private static final String STREET_TYPE_PATTERN = "(?:Alameda|Alley|Annex|Arcade|Ave[.]?|Avenue|Bayou|Beach|Bend|Bluff|Bluffs|Blvd|Bottom|Boulevard|Branch|Bridge|Brook|Brooks|Broadway|Burg|Burgs|Bypass|Camino|Camp|Canyon|Cape|Causeway|Center|Centers|Cir|Circle|Circles|Circulo|Cliff|Cliffs|Club|Common|Corner|Corners|Course|Court|Courts|Cove|Coves|Creek|Crescent|Crest|Crossing|Crossroad|Ctr|Curve|Dale|Dam|Divide|Dr|Drive|Drives|Driveway|Estate|Estates|Extension|Extensions|Expy|Expressway|Fall|Falls|Ferry|Field|Fields|Fld|Flat|Flats|Ford|Fords|Forge|Forges|Fork|Forks|Fort|Freeway|Garden|Gardens|Gateway|Glen|Glens|Green|Greens|Grove|Groves|Harbor|Harbors|Haven|Hbr|Heights|Highway|Hill|Hills|Hollow|Holw|Hwy|Inlet|Is|Island|Islands|Isle|Jct|Junction|Junctions|Key|Keys|Knl|Knoll|Knolls|Ky|Lake|Lakes|Land|Landing|Lane|Lck|Ldg|Lf|Lgt|Light|Lights|Lk|Ln|Lndg|Loaf|Lock|Locks|Lodge|Loop|Mall|Manor|Manors|Mdw|Meadow|Meadows|Mews|Mill|Mills|Mission|Ml|Mount|Mountain|Mountains|Motorway|Msn|Mt|Neck|Orch|Orchard|Oval|Overpass|Park|Parks|Parkway|Parkways|Pass|Passage|Path|Pike|Pine|Pines|Pkwy|Pl|Place|Plain|Plains|Plaza|Point|Points|Port|Ports|Pr|Prairie|Privada|Prt|Radial|Radl|Ramp|Ranch|Rapid|Rapids|Rd[.]?|Rdg|Real|Rest|Ridge|Ridges|Riv|River|Road|Roads|Route|Row|Rue|Run|Shoal|Shoals|Shore|Shores|Shr|Skyway|Spg|Spring|Springs|Spur|Spurs|Square|Squares|St[.]?|Sta|Station|Stra|Stravenue|Stream|Street|Streets|Strm|Summit|Speedway|Terrace|Throughway|Tpke|Track|Trafficway|Trail|Trak|Trace|Trce|Tunnel|Tunl|Turnpike|Un|Underpass|Union|Unions|Valley|Valleys|Via|Viaduct|View|Views|Village|Villages|Ville|Vis|Vista|Vl|Vlg|Vly|Vw|Walk|Walks|Wall|Way|Ways|Well|Wells|Wl|Wlk|Xing|Xrd)";

    @NotNull
    private static final String UNIT_PATTERN = "(?:(?:Apartment|Apt|Suite|Ste|Unit|#)\\s*[A-Za-z0-9\\-]+\\s*)?";

    @NotNull
    private static final String ZIP_CODE_PATTERN = "[0-9]{5}(?:-[0-9]{4})?";

    @NotNull
    private final Pattern pattern;

    @NotNull
    private final Linkify.TransformFilter transform;
    public static final int $stable = 8;

    public /* synthetic */ AddressLinkDetector(Pattern pattern, Linkify.TransformFilter transformFilter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Pattern.compile(ADDRESS_PATTERN, 2) : pattern, (i & 2) != 0 ? new AddressLinkDetector$$ExternalSyntheticLambda0() : transformFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(Matcher matcher, String str) {
        return a$$ExternalSyntheticOutline0.m("geo:0,0?q=", URLEncoder.encode(matcher.group(1), Charsets.UTF_8.name()));
    }

    public static /* synthetic */ AddressLinkDetector copy$default(AddressLinkDetector addressLinkDetector, Pattern pattern, Linkify.TransformFilter transformFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            pattern = addressLinkDetector.pattern;
        }
        if ((i & 2) != 0) {
            transformFilter = addressLinkDetector.transform;
        }
        return addressLinkDetector.copy(pattern, transformFilter);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Pattern getPattern() {
        return this.pattern;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Linkify.TransformFilter getTransform() {
        return this.transform;
    }

    @NotNull
    public final AddressLinkDetector copy(@NotNull Pattern pattern, @NotNull Linkify.TransformFilter transform) {
        pattern.getClass();
        transform.getClass();
        return new AddressLinkDetector(pattern, transform);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressLinkDetector)) {
            return false;
        }
        AddressLinkDetector addressLinkDetector = (AddressLinkDetector) other;
        return Intrinsics.areEqual(this.pattern, addressLinkDetector.pattern) && Intrinsics.areEqual(this.transform, addressLinkDetector.transform);
    }

    @NotNull
    public final Pattern getPattern() {
        return this.pattern;
    }

    @NotNull
    public final Linkify.TransformFilter getTransform() {
        return this.transform;
    }

    public int hashCode() {
        return this.transform.hashCode() + (this.pattern.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AddressLinkDetector(pattern=" + this.pattern + ", transform=" + this.transform + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public AddressLinkDetector(@NotNull Pattern pattern, @NotNull Linkify.TransformFilter transformFilter) {
        pattern.getClass();
        transformFilter.getClass();
        this.pattern = pattern;
        this.transform = transformFilter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddressLinkDetector() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
