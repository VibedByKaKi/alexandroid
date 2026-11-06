package androidx.media3.exoplayer.upstream;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.amazon.alexa.accessory.frames.smartPlay.SmartPlayConstants;
import com.amazon.alexa.biloba.membership.MembershipConstants;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.Errors;
import com.amazon.alexa.mobilytics.configuration.BenefitConstants;
import com.amazon.alexa.mobilytics.configuration.Config;
import com.amazon.clouddrive.model.FilterOperator;
import com.amazon.credentiallocker.CustomerRegion;
import com.amazon.deecomms.common.Constants;
import com.amazon.tarazed.logging.TarazedLogFormatter;
import com.amazon.whispercloak.KeyUtils;
import com.dee.app.cachemanager.DefaultObjectCache;
import com.facebook.imageutils.JfifUtil;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.mapbox.maps.plugin.scalebar.LocaleUnitResolver;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.objectweb.asm.signature.SignatureVisitor;
import org.openjdk.tools.javac.jvm.ByteCodes;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener {
    private static final int BYTES_TRANSFERRED_FOR_ESTIMATE = 524288;
    private static final int COUNTRY_GROUP_INDEX_2G = 1;
    private static final int COUNTRY_GROUP_INDEX_3G = 2;
    private static final int COUNTRY_GROUP_INDEX_4G = 3;
    private static final int COUNTRY_GROUP_INDEX_5G_NSA = 4;
    private static final int COUNTRY_GROUP_INDEX_5G_SA = 5;
    private static final int COUNTRY_GROUP_INDEX_WIFI = 0;
    public static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_3G;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_4G;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA;
    public static final int DEFAULT_SLIDING_WINDOW_MAX_WEIGHT = 2000;
    private static final int ELAPSED_MILLIS_FOR_ESTIMATE = 2000;

    @Nullable
    private static DefaultBandwidthMeter singletonInstance;

    @GuardedBy("this")
    private long bitrateEstimate;
    private final Clock clock;
    private final BandwidthMeter.EventListener.EventDispatcher eventDispatcher;
    private final ImmutableMap<Integer, Long> initialBitrateEstimates;

    @GuardedBy("this")
    private long lastReportedBitrateEstimate;
    private int networkType;
    private int networkTypeOverride;
    private boolean networkTypeOverrideSet;
    private final boolean resetOnNetworkTypeChange;

    @GuardedBy("this")
    private long sampleBytesTransferred;

    @GuardedBy("this")
    private long sampleStartTimeMs;

    @GuardedBy("this")
    private final SlidingPercentile slidingPercentile;

    @GuardedBy("this")
    private int streamCount;

    @GuardedBy("this")
    private long totalBytesTransferred;

    @GuardedBy("this")
    private long totalElapsedTimeMs;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI = ImmutableList.of(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_2G = ImmutableList.of(1500000L, 980000L, 750000L, 520000L, 290000L);

    static {
        Long valueOf = Long.valueOf(SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_3G = ImmutableList.of((long) valueOf, 1300000L, 1000000L, 860000L, 610000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_4G = ImmutableList.of(2500000L, 1700000L, 1200000L, 970000L, 680000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA = ImmutableList.of(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA = ImmutableList.of(2700000L, (long) valueOf, 1600000L, 1300000L, 1000000L);
    }

    private DefaultBandwidthMeter(@Nullable Context context, Map<Integer, Long> map, int i, Clock clock, boolean z) {
        this.initialBitrateEstimates = ImmutableMap.copyOf((Map) map);
        this.eventDispatcher = new BandwidthMeter.EventListener.EventDispatcher();
        this.slidingPercentile = new SlidingPercentile(i);
        this.clock = clock;
        this.resetOnNetworkTypeChange = z;
        if (context == null) {
            this.networkType = 0;
            this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(0);
            return;
        }
        NetworkTypeObserver networkTypeObserver = NetworkTypeObserver.getInstance(context);
        int networkType = networkTypeObserver.getNetworkType();
        this.networkType = networkType;
        this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(networkType);
        networkTypeObserver.register(new DefaultBandwidthMeter$$ExternalSyntheticLambda0(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int[] getInitialBitrateCountryGroupAssignment(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    c = 0;
                    break;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    c = 1;
                    break;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    c = 2;
                    break;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    c = 3;
                    break;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    c = 4;
                    break;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    c = 5;
                    break;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    c = 6;
                    break;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    c = 7;
                    break;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    c = '\b';
                    break;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    c = '\t';
                    break;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    c = '\n';
                    break;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    c = 11;
                    break;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    c = '\f';
                    break;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    c = '\r';
                    break;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    c = 14;
                    break;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    c = 15;
                    break;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    c = 16;
                    break;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    c = 17;
                    break;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    c = 18;
                    break;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    c = 19;
                    break;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    c = 20;
                    break;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    c = 21;
                    break;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    c = 22;
                    break;
                }
                break;
            case 2119:
                if (str.equals(Config.BI_TAG)) {
                    c = 23;
                    break;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    c = 24;
                    break;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    c = 25;
                    break;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    c = 26;
                    break;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    c = 27;
                    break;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    c = TarazedLogFormatter.FILE_SEPARATOR;
                    break;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    c = 29;
                    break;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    c = 30;
                    break;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    c = 31;
                    break;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    c = ' ';
                    break;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    c = '!';
                    break;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    c = '\"';
                    break;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    c = '#';
                    break;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    c = '$';
                    break;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    c = '%';
                    break;
                }
                break;
            case DefaultObjectCache.MAX_SIZE /* 2147 */:
                if (str.equals("CF")) {
                    c = Typography.amp;
                    break;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    c = '\'';
                    break;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    c = '(';
                    break;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    c = ')';
                    break;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    c = '*';
                    break;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    c = SignatureVisitor.EXTENDS;
                    break;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    c = AbstractJsonLexerKt.COMMA;
                    break;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    c = '-';
                    break;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    c = '.';
                    break;
                }
                break;
            case 2159:
                if (str.equals(MembershipConstants.CR)) {
                    c = '/';
                    break;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    c = '0';
                    break;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    c = '1';
                    break;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    c = '2';
                    break;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    c = '3';
                    break;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    c = '4';
                    break;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c = '5';
                    break;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    c = '6';
                    break;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c = '7';
                    break;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    c = '8';
                    break;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    c = '9';
                    break;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    c = AbstractJsonLexerKt.COLON;
                    break;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c = ';';
                    break;
                }
                break;
            case 2206:
                if (str.equals(KeyUtils.ALGORITHM_EC)) {
                    c = Typography.less;
                    break;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    c = '=';
                    break;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    c = Typography.greater;
                    break;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    c = Constants.DEFAULT_IMAGE_CHAR;
                    break;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    c = '@';
                    break;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    c = 'A';
                    break;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    c = 'B';
                    break;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c = 'C';
                    break;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    c = 'D';
                    break;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    c = 'E';
                    break;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    c = 'F';
                    break;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    c = 'G';
                    break;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    c = 'H';
                    break;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    c = 'I';
                    break;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    c = 'J';
                    break;
                }
                break;
            case 2270:
                if (str.equals(FilterOperator.GREATER_THAN_OR_EQUAL)) {
                    c = 'K';
                    break;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    c = Matrix.MATRIX_TYPE_RANDOM_LT;
                    break;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    c = 'M';
                    break;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    c = 'N';
                    break;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    c = 'O';
                    break;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    c = 'P';
                    break;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    c = 'Q';
                    break;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    c = Matrix.MATRIX_TYPE_RANDOM_REGULAR;
                    break;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    c = 'S';
                    break;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c = 'T';
                    break;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    c = Matrix.MATRIX_TYPE_RANDOM_UT;
                    break;
                }
                break;
            case 2285:
                if (str.equals(FilterOperator.GREATER_THAN)) {
                    c = 'V';
                    break;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    c = 'W';
                    break;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    c = 'X';
                    break;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    c = 'Y';
                    break;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    c = Matrix.MATRIX_TYPE_ZERO;
                    break;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    c = AbstractJsonLexerKt.BEGIN_LIST;
                    break;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    c = '\\';
                    break;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    c = AbstractJsonLexerKt.END_LIST;
                    break;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    c = '^';
                    break;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    c = '_';
                    break;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    c = '`';
                    break;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    c = 'a';
                    break;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    c = 'b';
                    break;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    c = 'c';
                    break;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c = 'd';
                    break;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    c = 'e';
                    break;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    c = 'f';
                    break;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    c = 'g';
                    break;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    c = 'h';
                    break;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    c = 'i';
                    break;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    c = 'j';
                    break;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    c = 'k';
                    break;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    c = 'l';
                    break;
                }
                break;
            case 2396:
                if (str.equals(ExpandedProductParsedResult.KILOGRAM)) {
                    c = 'm';
                    break;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    c = 'n';
                    break;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    c = 'o';
                    break;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    c = 'p';
                    break;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    c = 'q';
                    break;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    c = 'r';
                    break;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    c = 's';
                    break;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    c = 't';
                    break;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c = AbstractJsonLexerKt.UNICODE_ESC;
                    break;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    c = 'v';
                    break;
                }
                break;
            case 2422:
                if (str.equals(ExpandedProductParsedResult.POUND)) {
                    c = 'w';
                    break;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    c = 'x';
                    break;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    c = 'y';
                    break;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    c = 'z';
                    break;
                }
                break;
            case 2438:
                if (str.equals(LocaleUnitResolver.ImperialCountryCode.LIBERIA)) {
                    c = AbstractJsonLexerKt.BEGIN_OBJ;
                    break;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    c = '|';
                    break;
                }
                break;
            case 2440:
                if (str.equals(FilterOperator.LESS_THAN)) {
                    c = AbstractJsonLexerKt.END_OBJ;
                    break;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    c = JsonPointer.ESC;
                    break;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    c = 127;
                    break;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    c = 128;
                    break;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    c = 129;
                    break;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    c = 130;
                    break;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    c = 131;
                    break;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    c = 132;
                    break;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    c = 133;
                    break;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    c = 134;
                    break;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    c = 135;
                    break;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    c = 136;
                    break;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    c = 137;
                    break;
                }
                break;
            case 2464:
                if (str.equals(LocaleUnitResolver.ImperialCountryCode.MYANMAR)) {
                    c = 138;
                    break;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    c = 139;
                    break;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    c = 140;
                    break;
                }
                break;
            case 2467:
                if (str.equals(BenefitConstants.PREMIUM_BENEFIT_LABEL_MONEYPENNY)) {
                    c = 141;
                    break;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c = 142;
                    break;
                }
                break;
            case 2469:
                if (str.equals(BenefitConstants.PREMIUM_BENEFIT_LABEL_MOONRAKER)) {
                    c = 143;
                    break;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    c = 144;
                    break;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    c = 145;
                    break;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    c = 146;
                    break;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    c = 147;
                    break;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    c = 148;
                    break;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    c = 149;
                    break;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    c = 150;
                    break;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c = 151;
                    break;
                }
                break;
            case 2483:
                if (str.equals(CustomerRegion.NA)) {
                    c = 152;
                    break;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    c = 153;
                    break;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    c = 154;
                    break;
                }
                break;
            case 2488:
                if (str.equals("NF")) {
                    c = 155;
                    break;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    c = 156;
                    break;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    c = 157;
                    break;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    c = 158;
                    break;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    c = 159;
                    break;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    c = Typography.nbsp;
                    break;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    c = 161;
                    break;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    c = Typography.cent;
                    break;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    c = Typography.pound;
                    break;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    c = 164;
                    break;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    c = 165;
                    break;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    c = 166;
                    break;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    c = Typography.section;
                    break;
                }
                break;
            case 2551:
                if (str.equals("PG")) {
                    c = 168;
                    break;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    c = Typography.copyright;
                    break;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    c = 170;
                    break;
                }
                break;
            case 2556:
                if (str.equals(SmartPlayConstants.SMART_PLAY_CONTENT_TOKEN_TYPE_PLAYLIST_PREFIX_PANDORA)) {
                    c = 171;
                    break;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    c = 172;
                    break;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    c = 173;
                    break;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    c = Typography.registered;
                    break;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    c = 175;
                    break;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    c = Typography.degree;
                    break;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    c = Typography.plusMinus;
                    break;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    c = 178;
                    break;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    c = 179;
                    break;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    c = 180;
                    break;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    c = 181;
                    break;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    c = Typography.paragraph;
                    break;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    c = Typography.middleDot;
                    break;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    c = 184;
                    break;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    c = 185;
                    break;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    c = 186;
                    break;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    c = 187;
                    break;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    c = 188;
                    break;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    c = Typography.half;
                    break;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    c = 190;
                    break;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    c = 191;
                    break;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    c = 192;
                    break;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    c = 193;
                    break;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    c = 194;
                    break;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    c = 195;
                    break;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    c = 196;
                    break;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    c = 197;
                    break;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    c = 198;
                    break;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    c = 199;
                    break;
                }
                break;
            case 2657:
                if (str.equals(SmartPlayConstants.SMART_PLAY_CONTENT_TOKEN_TYPE_STATION_PREFIX_PANDORA)) {
                    c = 200;
                    break;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    c = 201;
                    break;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    c = 202;
                    break;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    c = 203;
                    break;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c = 204;
                    break;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    c = 205;
                    break;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    c = 206;
                    break;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    c = 207;
                    break;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    c = 208;
                    break;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c = 209;
                    break;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    c = 210;
                    break;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    c = 211;
                    break;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    c = 212;
                    break;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    c = 213;
                    break;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    c = 214;
                    break;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    c = Typography.times;
                    break;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    c = 216;
                    break;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    c = 217;
                    break;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c = 218;
                    break;
                }
                break;
            case Errors.CustomMediaSessionErrorCode.ERROR_CODE_STREAMING_UNAVAILABLE /* 2700 */:
                if (str.equals("UA")) {
                    c = 219;
                    break;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    c = 220;
                    break;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    c = 221;
                    break;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    c = 222;
                    break;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c = 223;
                    break;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    c = 224;
                    break;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    c = 225;
                    break;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    c = 226;
                    break;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    c = 227;
                    break;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    c = 228;
                    break;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    c = 229;
                    break;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    c = 230;
                    break;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    c = 231;
                    break;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    c = 232;
                    break;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    c = 233;
                    break;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    c = 234;
                    break;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    c = 235;
                    break;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c = 236;
                    break;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c = 237;
                    break;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c = 238;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 4:
            case 17:
            case 29:
            case '2':
            case '9':
            case 'q':
            case 't':
            case 202:
            case 225:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 2, 3, 4, 1};
            case 2:
            case 204:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 3:
            case ')':
                return new int[]{2, 4, 3, 4, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 6:
            case 165:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{3, 4, 4, 3, 2, 2};
            case '\b':
            case '?':
            case 162:
            case 186:
            case 190:
                return new int[]{4, 2, 2, 2, 2, 2};
            case '\t':
                return new int[]{2, 2, 2, 2, 1, 2};
            case '\n':
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
            case '=':
            case ']':
            case 'f':
            case 127:
            case 145:
            case 188:
                return new int[]{0, 0, 0, 0, 0, 2};
            case '\f':
                return new int[]{0, 3, 1, 1, 3, 0};
            case '\r':
                return new int[]{2, 2, 3, 4, 2, 2};
            case 14:
            case '3':
            case 'y':
            case 144:
            case 172:
            case 195:
            case 224:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case '7':
            case 128:
            case 194:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 16:
            case 'j':
            case 214:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 2, 4, 2};
            case 19:
                return new int[]{0, 0, 1, 0, 1, 2};
            case 20:
            case 187:
            case 203:
            case 206:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 21:
            case 175:
            case 191:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 3, 1, 3, 4, 2};
            case 23:
            case 'T':
            case '\\':
            case 154:
            case FTPReply.CLOSING_DATA_CONNECTION /* 226 */:
            case FTPReply.SECURITY_DATA_EXCHANGE_COMPLETE /* 234 */:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 2, 3, 2, 2};
            case 25:
            case 141:
            case 177:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 26:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 27:
                return new int[]{3, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 30:
                return new int[]{1, 1, 1, 1, 2, 4};
            case 31:
                return new int[]{3, 2, 1, 1, 2, 2};
            case ' ':
                return new int[]{3, 1, 2, 2, 3, 2};
            case '!':
                return new int[]{3, 2, 1, 0, 2, 2};
            case '\"':
                return new int[]{1, 2, 3, 3, 2, 2};
            case '#':
            case '*':
                return new int[]{2, 2, 2, 1, 2, 2};
            case '$':
            case 219:
                return new int[]{0, 2, 1, 2, 3, 3};
            case '%':
            case 137:
                return new int[]{3, 3, 2, 2, 2, 2};
            case '&':
                return new int[]{4, 2, 4, 2, 2, 2};
            case '\'':
            case '>':
            case 134:
                return new int[]{3, 4, 3, 3, 2, 2};
            case '(':
                return new int[]{0, 1, 0, 0, 0, 2};
            case '+':
            case JfifUtil.MARKER_RST0 /* 208 */:
                return new int[]{0, 1, 2, 2, 2, 2};
            case ',':
            case 143:
                return new int[]{4, 3, 3, 4, 2, 2};
            case '-':
                return new int[]{2, 0, 1, 1, 3, 1};
            case '.':
                return new int[]{2, 3, 3, 2, 2, 2};
            case '/':
            case 157:
                return new int[]{2, 4, 4, 4, 2, 2};
            case '0':
            case 'o':
            case 161:
            case 210:
                return new int[]{4, 2, 4, 4, 2, 2};
            case '1':
                return new int[]{2, 3, 0, 1, 2, 2};
            case '4':
                return new int[]{1, 0, 1, 0, 0, 2};
            case '5':
                return new int[]{0, 0, 2, 0, 1, 2};
            case '6':
                return new int[]{0, 1, 4, 2, 2, 1};
            case '8':
                return new int[]{0, 0, 2, 0, 0, 2};
            case ':':
            case '{':
                return new int[]{3, 4, 4, 4, 2, 2};
            case ';':
            case 209:
                return new int[]{3, 3, 4, 4, 2, 2};
            case '<':
                return new int[]{1, 3, 2, 1, 2, 2};
            case '@':
                return new int[]{0, 0, 0, 0, 1, 0};
            case 'A':
                return new int[]{4, 3, 4, 4, 4, 2};
            case 'B':
                return new int[]{0, 0, 0, 1, 0, 2};
            case 'C':
                return new int[]{3, 2, 2, 3, 2, 2};
            case 'D':
            case 155:
            case 192:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 'E':
                return new int[]{4, 2, 4, 0, 2, 2};
            case 'F':
                return new int[]{0, 2, 2, 0, 2, 2};
            case 'G':
                return new int[]{1, 1, 1, 1, 0, 2};
            case 'H':
                return new int[]{3, 4, 0, 0, 2, 2};
            case 'I':
                return new int[]{1, 1, 3, 2, 2, 2};
            case 'J':
                return new int[]{2, 2, 0, 0, 2, 2};
            case 'K':
                return new int[]{1, 1, 0, 2, 2, 2};
            case 'L':
                return new int[]{3, 2, 3, 3, 2, 2};
            case ByteCodes.astore_2 /* 77 */:
                return new int[]{0, 2, 1, 1, 2, 2};
            case 'N':
                return new int[]{3, 3, 3, 2, 2, 2};
            case 'O':
            case 'a':
            case 'h':
                return new int[]{0, 2, 0, 1, 2, 2};
            case 'P':
            case 130:
                return new int[]{1, 2, 2, 0, 2, 2};
            case 'Q':
            case 199:
                return new int[]{4, 3, 2, 4, 2, 2};
            case 'R':
                return new int[]{3, 4, 4, 2, 2, 2};
            case 'S':
                return new int[]{2, 1, 1, 3, 2, 2};
            case 'U':
                return new int[]{1, 0, 0, 0, 1, 2};
            case 'V':
                return new int[]{2, 1, 2, 1, 2, 2};
            case 'W':
                return new int[]{2, 2, 4, 3, 3, 2};
            case 'X':
                return new int[]{4, 4, 1, 2, 2, 2};
            case 'Y':
                return new int[]{3, 1, 1, 3, 2, 2};
            case 'Z':
                return new int[]{0, 1, 0, 1, 1, 0};
            case '[':
            case 's':
                return new int[]{1, 0, 0, 0, 0, 2};
            case '^':
                return new int[]{3, 1, 3, 3, 2, 4};
            case '_':
                return new int[]{1, 1, 1, 1, 1, 2};
            case '`':
                return new int[]{1, 2, 2, 3, 4, 2};
            case 'b':
                return new int[]{1, 1, 3, 2, 2, 3};
            case 'c':
                return new int[]{3, 2, 2, 0, 2, 2};
            case 'd':
                return new int[]{3, 2, 3, 2, 2, 2};
            case 'e':
                return new int[]{4, 2, 3, 3, 4, 3};
            case 'g':
                return new int[]{0, 1, 1, 2, 1, 2};
            case 'i':
                return new int[]{2, 4, 3, 1, 2, 2};
            case 'k':
                return new int[]{0, 3, 2, 3, 4, 2};
            case 'l':
                return new int[]{3, 2, 1, 1, 1, 2};
            case 'm':
                return new int[]{2, 1, 1, 2, 2, 2};
            case 'n':
                return new int[]{1, 0, 4, 2, 2, 2};
            case 'p':
            case 230:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 'r':
                return new int[]{0, 2, 2, 4, 4, 4};
            case 'u':
                return new int[]{2, 1, 2, 2, 3, 2};
            case 'v':
                return new int[]{1, 2, 1, 3, 2, 2};
            case 'w':
                return new int[]{3, 1, 1, 2, 2, 2};
            case 'x':
                return new int[]{2, 2, 1, 1, 2, 2};
            case 'z':
            case 138:
                return new int[]{3, 2, 3, 3, 4, 2};
            case '|':
            case 168:
                return new int[]{4, 3, 3, 3, 2, 2};
            case '}':
                return new int[]{0, 1, 0, 1, 0, 2};
            case '~':
                return new int[]{4, 0, 3, 2, 1, 3};
            case 129:
                return new int[]{3, 3, 1, 1, 2, 2};
            case 131:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 132:
                return new int[]{2, 0, 0, 1, 3, 2};
            case 133:
                return new int[]{1, 2, 2, 3, 2, 2};
            case 135:
            case 211:
            case JfifUtil.MARKER_SOI /* 216 */:
            case 231:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 136:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 139:
                return new int[]{2, 0, 2, 2, 2, 2};
            case 140:
                return new int[]{0, 2, 4, 4, 3, 1};
            case 142:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 146:
                return new int[]{3, 1, 0, 2, 2, 2};
            case 147:
                return new int[]{3, 2, 1, 3, 4, 2};
            case 148:
                return new int[]{3, 2, 2, 1, 2, 2};
            case 149:
                return new int[]{2, 4, 4, 4, 3, 2};
            case 150:
                return new int[]{1, 0, 4, 1, 1, 0};
            case 151:
            case 232:
                return new int[]{3, 1, 2, 2, 2, 2};
            case 152:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 153:
            case 235:
                return new int[]{2, 3, 3, 4, 2, 2};
            case 156:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 158:
                return new int[]{2, 1, 4, 3, 0, 4};
            case 159:
                return new int[]{0, 0, 3, 0, 0, 2};
            case 160:
                return new int[]{2, 2, 4, 3, 2, 2};
            case 163:
                return new int[]{0, 0, 1, 2, 4, 2};
            case 164:
                return new int[]{2, 3, 1, 2, 4, 2};
            case 166:
                return new int[]{1, 2, 4, 4, 3, 2};
            case 167:
                return new int[]{2, 2, 3, 1, 2, 2};
            case 169:
                return new int[]{2, 1, 2, 3, 2, 1};
            case 170:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 171:
                return new int[]{1, 0, 2, 2, 4, 4};
            case 173:
                return new int[]{2, 0, 2, 1, 2, 0};
            case 174:
                return new int[]{3, 4, 1, 3, 2, 2};
            case 176:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 178:
                return new int[]{1, 4, 4, 4, 4, 2};
            case 179:
                return new int[]{0, 3, 2, 3, 1, 2};
            case 180:
                return new int[]{0, 0, 1, 1, 3, 2};
            case 181:
                return new int[]{1, 0, 0, 1, 2, 2};
            case 182:
                return new int[]{1, 0, 0, 1, 3, 3};
            case 183:
                return new int[]{3, 3, 2, 0, 2, 2};
            case 184:
                return new int[]{3, 1, 1, 2, 2, 0};
            case 185:
            case TelnetCommand.ABORT /* 238 */:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 189:
                return new int[]{2, 3, 3, 3, 1, 1};
            case 193:
                return new int[]{0, 1, 1, 1, 2, 2};
            case ByteCodes.wide /* 196 */:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 197:
                return new int[]{2, 2, 3, 4, 4, 2};
            case 198:
                return new int[]{2, 4, 4, 1, 2, 2};
            case 200:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 201:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 205:
                return new int[]{3, 2, 1, 2, 2, 2};
            case 207:
                return new int[]{3, 4, 1, 0, 2, 2};
            case FTPReply.DIRECTORY_STATUS /* 212 */:
                return new int[]{3, 1, 1, 1, 2, 2};
            case FTPReply.FILE_STATUS /* 213 */:
                return new int[]{3, 2, 4, 3, 2, 2};
            case 215:
                return new int[]{2, 4, 1, 0, 2, 2};
            case JfifUtil.MARKER_EOI /* 217 */:
                return new int[]{0, 0, 0, 0, 0, 0};
            case JfifUtil.MARKER_SOS /* 218 */:
                return new int[]{3, 4, 2, 1, 3, 2};
            case 220:
                return new int[]{3, 3, 2, 3, 4, 2};
            case 221:
                return new int[]{2, 2, 4, 1, 3, 1};
            case NNTPReply.ARTICLE_RETRIEVED_BODY_FOLLOWS /* 222 */:
                return new int[]{2, 1, 1, 2, 1, 2};
            case NNTPReply.ARTICLE_RETRIEVED_REQUEST_TEXT_SEPARATELY /* 223 */:
                return new int[]{1, 2, 3, 4, 3, 2};
            case FTPReply.ENTERING_PASSIVE_MODE /* 227 */:
                return new int[]{2, 2, 1, 1, 2, 4};
            case 228:
                return new int[]{0, 2, 1, 2, 2, 2};
            case FTPReply.ENTERING_EPSV_MODE /* 229 */:
                return new int[]{0, 0, 1, 2, 2, 2};
            case 233:
                return new int[]{1, 2, 1, 1, 2, 2};
            case TelnetCommand.EOF /* 236 */:
                return new int[]{2, 4, 2, 1, 1, 2};
            case TelnetCommand.SUSP /* 237 */:
                return new int[]{4, 4, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    private long getInitialBitrateEstimateForNetworkType(int i) {
        Long l = this.initialBitrateEstimates.get(Integer.valueOf(i));
        if (l == null) {
            l = this.initialBitrateEstimates.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    public static synchronized DefaultBandwidthMeter getSingletonInstance(Context context) {
        DefaultBandwidthMeter defaultBandwidthMeter;
        synchronized (DefaultBandwidthMeter.class) {
            try {
                if (singletonInstance == null) {
                    singletonInstance = new Builder(context).build();
                }
                defaultBandwidthMeter = singletonInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return defaultBandwidthMeter;
    }

    private static boolean isTransferAtFullNetworkSpeed(DataSpec dataSpec, boolean z) {
        return z && !dataSpec.isFlagSet(8);
    }

    @GuardedBy("this")
    private void maybeNotifyBandwidthSample(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.lastReportedBitrateEstimate) {
            return;
        }
        this.lastReportedBitrateEstimate = j2;
        this.eventDispatcher.bandwidthSample(i, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onNetworkTypeChanged(int i) {
        DefaultBandwidthMeter defaultBandwidthMeter;
        Throwable th;
        try {
            try {
                int i2 = this.networkType;
                if (i2 != 0) {
                    try {
                        if (!this.resetOnNetworkTypeChange) {
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        defaultBandwidthMeter = this;
                        throw th;
                    }
                }
                if (this.networkTypeOverrideSet) {
                    i = this.networkTypeOverride;
                }
                if (i2 == i) {
                    return;
                }
                this.networkType = i;
                if (i == 1 || i == 0 || i == 8) {
                    return;
                }
                this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(i);
                long elapsedRealtime = this.clock.elapsedRealtime();
                maybeNotifyBandwidthSample(this.streamCount > 0 ? (int) (elapsedRealtime - this.sampleStartTimeMs) : 0, this.sampleBytesTransferred, this.bitrateEstimate);
                this.sampleStartTimeMs = elapsedRealtime;
                this.sampleBytesTransferred = 0L;
                this.totalBytesTransferred = 0L;
                this.totalElapsedTimeMs = 0L;
                this.slidingPercentile.reset();
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            defaultBandwidthMeter = this;
            th = th;
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        Assertions.checkNotNull(handler);
        Assertions.checkNotNull(eventListener);
        this.eventDispatcher.addListener(handler, eventListener);
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public synchronized long getBitrateEstimate() {
        return this.bitrateEstimate;
    }

    @Override // androidx.media3.datasource.TransferListener
    public synchronized void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z, int i) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
            this.sampleBytesTransferred += i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r10.totalBytesTransferred >= 524288) goto L22;
     */
    @Override // androidx.media3.datasource.TransferListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void onTransferEnd(androidx.media3.datasource.DataSource r11, androidx.media3.datasource.DataSpec r12, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r11 = isTransferAtFullNetworkSpeed(r12, r13)     // Catch: java.lang.Throwable -> L72
            if (r11 != 0) goto L9
            monitor-exit(r10)
            return
        L9:
            int r11 = r10.streamCount     // Catch: java.lang.Throwable -> L72
            r12 = 1
            if (r11 <= 0) goto L10
            r11 = r12
            goto L11
        L10:
            r11 = 0
        L11:
            androidx.media3.common.util.Assertions.checkState(r11)     // Catch: java.lang.Throwable -> L72
            androidx.media3.common.util.Clock r11 = r10.clock     // Catch: java.lang.Throwable -> L72
            long r0 = r11.elapsedRealtime()     // Catch: java.lang.Throwable -> L72
            long r2 = r10.sampleStartTimeMs     // Catch: java.lang.Throwable -> L72
            long r2 = r0 - r2
            int r5 = (int) r2     // Catch: java.lang.Throwable -> L72
            long r2 = r10.totalElapsedTimeMs     // Catch: java.lang.Throwable -> L72
            long r6 = (long) r5     // Catch: java.lang.Throwable -> L72
            long r2 = r2 + r6
            r10.totalElapsedTimeMs = r2     // Catch: java.lang.Throwable -> L72
            long r2 = r10.totalBytesTransferred     // Catch: java.lang.Throwable -> L72
            long r6 = r10.sampleBytesTransferred     // Catch: java.lang.Throwable -> L72
            long r2 = r2 + r6
            r10.totalBytesTransferred = r2     // Catch: java.lang.Throwable -> L72
            if (r5 <= 0) goto L75
            float r11 = (float) r6     // Catch: java.lang.Throwable -> L72
            r13 = 1174011904(0x45fa0000, float:8000.0)
            float r11 = r11 * r13
            float r13 = (float) r5     // Catch: java.lang.Throwable -> L72
            float r11 = r11 / r13
            androidx.media3.exoplayer.upstream.SlidingPercentile r13 = r10.slidingPercentile     // Catch: java.lang.Throwable -> L72
            double r2 = (double) r6     // Catch: java.lang.Throwable -> L72
            double r2 = java.lang.Math.sqrt(r2)     // Catch: java.lang.Throwable -> L72
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L72
            r13.addSample(r2, r11)     // Catch: java.lang.Throwable -> L72
            long r2 = r10.totalElapsedTimeMs     // Catch: java.lang.Throwable -> L72
            r6 = 2000(0x7d0, double:9.88E-321)
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 >= 0) goto L55
            long r2 = r10.totalBytesTransferred     // Catch: java.lang.Throwable -> L51
            r6 = 524288(0x80000, double:2.590327E-318)
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 < 0) goto L60
            goto L55
        L51:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L7d
        L55:
            androidx.media3.exoplayer.upstream.SlidingPercentile r11 = r10.slidingPercentile     // Catch: java.lang.Throwable -> L72
            r13 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11.getPercentile(r13)     // Catch: java.lang.Throwable -> L72
            long r2 = (long) r11     // Catch: java.lang.Throwable -> L72
            r10.bitrateEstimate = r2     // Catch: java.lang.Throwable -> L72
        L60:
            long r6 = r10.sampleBytesTransferred     // Catch: java.lang.Throwable -> L72
            long r8 = r10.bitrateEstimate     // Catch: java.lang.Throwable -> L72
            r4 = r10
            r4.maybeNotifyBandwidthSample(r5, r6, r8)     // Catch: java.lang.Throwable -> L6f
            r4.sampleStartTimeMs = r0     // Catch: java.lang.Throwable -> L6f
            r10 = 0
            r4.sampleBytesTransferred = r10     // Catch: java.lang.Throwable -> L6f
            goto L76
        L6f:
            r0 = move-exception
        L70:
            r11 = r0
            goto L7d
        L72:
            r0 = move-exception
            r4 = r10
            goto L70
        L75:
            r4 = r10
        L76:
            int r10 = r4.streamCount     // Catch: java.lang.Throwable -> L6f
            int r10 = r10 - r12
            r4.streamCount = r10     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r4)
            return
        L7d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6f
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.onTransferEnd(androidx.media3.datasource.DataSource, androidx.media3.datasource.DataSpec, boolean):void");
    }

    @Override // androidx.media3.datasource.TransferListener
    public synchronized void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z) {
        try {
            if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
                if (this.streamCount == 0) {
                    this.sampleStartTimeMs = this.clock.elapsedRealtime();
                }
                this.streamCount++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        this.eventDispatcher.removeListener(eventListener);
    }

    public synchronized void setNetworkTypeOverride(int i) {
        this.networkTypeOverride = i;
        this.networkTypeOverrideSet = true;
        onNetworkTypeChanged(i);
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public TransferListener getTransferListener() {
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private Clock clock;

        @Nullable
        private final Context context;
        private Map<Integer, Long> initialBitrateEstimates;
        private boolean resetOnNetworkTypeChange;
        private int slidingWindowMaxWeight;

        public Builder(Context context) {
            this.context = context == null ? null : context.getApplicationContext();
            this.initialBitrateEstimates = getInitialBitrateEstimatesForCountry(Util.getCountryCode(context));
            this.slidingWindowMaxWeight = 2000;
            this.clock = Clock.DEFAULT;
            this.resetOnNetworkTypeChange = true;
        }

        private static Map<Integer, Long> getInitialBitrateEstimatesForCountry(String str) {
            int[] initialBitrateCountryGroupAssignment = DefaultBandwidthMeter.getInitialBitrateCountryGroupAssignment(str);
            HashMap hashMap = new HashMap(8);
            hashMap.put(0, 1000000L);
            ImmutableList<Long> immutableList = DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI;
            hashMap.put(2, immutableList.get(initialBitrateCountryGroupAssignment[0]));
            hashMap.put(3, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_2G.get(initialBitrateCountryGroupAssignment[1]));
            hashMap.put(4, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_3G.get(initialBitrateCountryGroupAssignment[2]));
            hashMap.put(5, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_4G.get(initialBitrateCountryGroupAssignment[3]));
            hashMap.put(10, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA.get(initialBitrateCountryGroupAssignment[4]));
            hashMap.put(9, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA.get(initialBitrateCountryGroupAssignment[5]));
            hashMap.put(7, immutableList.get(initialBitrateCountryGroupAssignment[0]));
            return hashMap;
        }

        public DefaultBandwidthMeter build() {
            return new DefaultBandwidthMeter(this.context, this.initialBitrateEstimates, this.slidingWindowMaxWeight, this.clock, this.resetOnNetworkTypeChange);
        }

        @CanIgnoreReturnValue
        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setInitialBitrateEstimate(long j) {
            Iterator<Integer> it2 = this.initialBitrateEstimates.keySet().iterator();
            while (it2.hasNext()) {
                setInitialBitrateEstimate(it2.next().intValue(), j);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setResetOnNetworkTypeChange(boolean z) {
            this.resetOnNetworkTypeChange = z;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSlidingWindowMaxWeight(int i) {
            this.slidingWindowMaxWeight = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setInitialBitrateEstimate(int i, long j) {
            this.initialBitrateEstimates.put(Integer.valueOf(i), Long.valueOf(j));
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setInitialBitrateEstimate(String str) {
            this.initialBitrateEstimates = getInitialBitrateEstimatesForCountry(Ascii.toUpperCase(str));
            return this;
        }
    }

    @Override // androidx.media3.datasource.TransferListener
    public void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z) {
    }
}
