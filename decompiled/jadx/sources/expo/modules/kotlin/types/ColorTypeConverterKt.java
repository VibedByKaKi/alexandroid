package expo.modules.kotlin.types;

import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.jetbrains.annotations.NotNull;
import org.openjdk.tools.javac.jvm.ByteCodes;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\" \u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"namedColors", "", "", "", "", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nColorTypeConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorTypeConverter.kt\nexpo/modules/kotlin/types/ColorTypeConverterKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,239:1\n465#2:240\n415#2:241\n1252#3,2:242\n1255#3:248\n11228#4:244\n11563#4,3:245\n*S KotlinDebug\n*F\n+ 1 ColorTypeConverter.kt\nexpo/modules/kotlin/types/ColorTypeConverterKt\n*L\n171#1:240\n171#1:241\n171#1:242,2\n171#1:248\n172#1:244\n172#1:245,3\n*E\n"})
/* loaded from: classes9.dex */
public final class ColorTypeConverterKt {

    @NotNull
    private static final Map<String, List<Float>> namedColors;

    static {
        Integer valueOf = Integer.valueOf(TelnetCommand.EL);
        Pair pair = TuplesKt.to("aliceblue", new Integer[]{240, valueOf, 255, 255});
        Pair pair2 = TuplesKt.to("antiquewhite", new Integer[]{250, 235, 215, 255});
        Pair pair3 = TuplesKt.to("aqua", new Integer[]{0, 255, 255, 255});
        Pair pair4 = TuplesKt.to("aquamarine", new Integer[]{127, 255, Integer.valueOf(FTPReply.DIRECTORY_STATUS), 255});
        Pair pair5 = TuplesKt.to("azure", new Integer[]{240, 255, 255, 255});
        Integer valueOf2 = Integer.valueOf(TelnetCommand.AO);
        Pair pair6 = TuplesKt.to("beige", new Integer[]{valueOf2, valueOf2, 220, 255});
        Pair pair7 = TuplesKt.to("bisque", new Integer[]{255, 228, Integer.valueOf(ByteCodes.wide), 255});
        Pair pair8 = TuplesKt.to("black", new Integer[]{0, 0, 0, 255});
        Pair pair9 = TuplesKt.to("blanchedalmond", new Integer[]{255, 235, 205, 255});
        Pair pair10 = TuplesKt.to("blue", new Integer[]{0, 0, 255, 255});
        Pair pair11 = TuplesKt.to("blueviolet", new Integer[]{138, 43, Integer.valueOf(FTPReply.CLOSING_DATA_CONNECTION), 255});
        Pair pair12 = TuplesKt.to("brown", new Integer[]{165, 42, 42, 255});
        Integer valueOf3 = Integer.valueOf(NNTPReply.ARTICLE_RETRIEVED_BODY_FOLLOWS);
        Pair pair13 = TuplesKt.to("burlywood", new Integer[]{valueOf3, 184, 135, 255});
        Pair pair14 = TuplesKt.to("cadetblue", new Integer[]{95, 158, 160, 255});
        Pair pair15 = TuplesKt.to("chartreuse", new Integer[]{127, 255, 0, 255});
        Pair pair16 = TuplesKt.to("chocolate", new Integer[]{210, 105, 30, 255});
        Pair pair17 = TuplesKt.to("coral", new Integer[]{255, 127, 80, 255});
        Pair pair18 = TuplesKt.to("cornflowerblue", new Integer[]{100, 149, Integer.valueOf(TelnetCommand.SUSP), 255});
        Pair pair19 = TuplesKt.to("cornsilk", new Integer[]{255, valueOf, 220, 255});
        Pair pair20 = TuplesKt.to("crimson", new Integer[]{220, 20, 60, 255});
        Pair pair21 = TuplesKt.to("cyan", new Integer[]{0, 255, 255, 255});
        Pair pair22 = TuplesKt.to("darkblue", new Integer[]{0, 0, 139, 255});
        Pair pair23 = TuplesKt.to("darkcyan", new Integer[]{0, 139, 139, 255});
        Pair pair24 = TuplesKt.to("darkgoldenrod", new Integer[]{184, 134, 11, 255});
        Pair pair25 = TuplesKt.to("darkgray", new Integer[]{169, 169, 169, 255});
        Pair pair26 = TuplesKt.to("darkgreen", new Integer[]{0, 100, 0, 255});
        Pair pair27 = TuplesKt.to("darkgrey", new Integer[]{169, 169, 169, 255});
        Pair pair28 = TuplesKt.to("darkkhaki", new Integer[]{189, 183, 107, 255});
        Pair pair29 = TuplesKt.to("darkmagenta", new Integer[]{139, 0, 139, 255});
        Pair pair30 = TuplesKt.to("darkolivegreen", new Integer[]{85, 107, 47, 255});
        Pair pair31 = TuplesKt.to("darkorange", new Integer[]{255, 140, 0, 255});
        Pair pair32 = TuplesKt.to("darkorchid", new Integer[]{153, 50, 204, 255});
        Pair pair33 = TuplesKt.to("darkred", new Integer[]{139, 0, 0, 255});
        Pair pair34 = TuplesKt.to("darksalmon", new Integer[]{233, 150, 122, 255});
        Pair pair35 = TuplesKt.to("darkseagreen", new Integer[]{143, 188, 143, 255});
        Pair pair36 = TuplesKt.to("darkslateblue", new Integer[]{72, 61, 139, 255});
        Pair pair37 = TuplesKt.to("darkslategray", new Integer[]{47, 79, 79, 255});
        Pair pair38 = TuplesKt.to("darkslategrey", new Integer[]{47, 79, 79, 255});
        Pair pair39 = TuplesKt.to("darkturquoise", new Integer[]{0, 206, 209, 255});
        Pair pair40 = TuplesKt.to("darkviolet", new Integer[]{148, 0, 211, 255});
        Pair pair41 = TuplesKt.to("deeppink", new Integer[]{255, 20, 147, 255});
        Pair pair42 = TuplesKt.to("deepskyblue", new Integer[]{0, 191, 255, 255});
        Pair pair43 = TuplesKt.to("dimgray", new Integer[]{105, 105, 105, 255});
        Pair pair44 = TuplesKt.to("dimgrey", new Integer[]{105, 105, 105, 255});
        Pair pair45 = TuplesKt.to("dodgerblue", new Integer[]{30, 144, 255, 255});
        Pair pair46 = TuplesKt.to("firebrick", new Integer[]{178, 34, 34, 255});
        Pair pair47 = TuplesKt.to("floralwhite", new Integer[]{255, 250, 240, 255});
        Pair pair48 = TuplesKt.to("forestgreen", new Integer[]{34, 139, 34, 255});
        Pair pair49 = TuplesKt.to("fuchsia", new Integer[]{255, 0, 255, 255});
        Pair pair50 = TuplesKt.to("gainsboro", new Integer[]{220, 220, 220, 255});
        Pair pair51 = TuplesKt.to("ghostwhite", new Integer[]{valueOf, valueOf, 255, 255});
        Pair pair52 = TuplesKt.to("gold", new Integer[]{255, 215, 0, 255});
        Pair pair53 = TuplesKt.to("goldenrod", new Integer[]{Integer.valueOf(JfifUtil.MARKER_SOS), 165, 32, 255});
        Pair pair54 = TuplesKt.to("gray", new Integer[]{128, 128, 128, 255});
        Pair pair55 = TuplesKt.to("green", new Integer[]{0, 128, 0, 255});
        Pair pair56 = TuplesKt.to("greenyellow", new Integer[]{173, 255, 47, 255});
        Pair pair57 = TuplesKt.to("grey", new Integer[]{128, 128, 128, 255});
        Pair pair58 = TuplesKt.to("honeydew", new Integer[]{240, 255, 240, 255});
        Pair pair59 = TuplesKt.to("hotpink", new Integer[]{255, 105, 180, 255});
        Pair pair60 = TuplesKt.to("indianred", new Integer[]{205, 92, 92, 255});
        Pair pair61 = TuplesKt.to("indigo", new Integer[]{75, 0, 130, 255});
        Pair pair62 = TuplesKt.to("ivory", new Integer[]{255, 255, 240, 255});
        Pair pair63 = TuplesKt.to("khaki", new Integer[]{240, 230, 140, 255});
        Pair pair64 = TuplesKt.to("lavender", new Integer[]{230, 230, 250, 255});
        Pair pair65 = TuplesKt.to("lavenderblush", new Integer[]{255, 240, valueOf2, 255});
        Pair pair66 = TuplesKt.to("lawngreen", new Integer[]{124, Integer.valueOf(TelnetCommand.WONT), 0, 255});
        Pair pair67 = TuplesKt.to("lemonchiffon", new Integer[]{255, 250, 205, 255});
        Pair pair68 = TuplesKt.to("lightblue", new Integer[]{173, Integer.valueOf(JfifUtil.MARKER_SOI), 230, 255});
        Pair pair69 = TuplesKt.to("lightcoral", new Integer[]{240, 128, 128, 255});
        Pair pair70 = TuplesKt.to("lightcyan", new Integer[]{224, 255, 255, 255});
        Pair pair71 = TuplesKt.to("lightgoldenrodyellow", new Integer[]{250, 250, 210, 255});
        Pair pair72 = TuplesKt.to("lightgray", new Integer[]{211, 211, 211, 255});
        Integer valueOf4 = Integer.valueOf(TelnetCommand.ABORT);
        Map mapOf = MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair28, pair29, pair30, pair31, pair32, pair33, pair34, pair35, pair36, pair37, pair38, pair39, pair40, pair41, pair42, pair43, pair44, pair45, pair46, pair47, pair48, pair49, pair50, pair51, pair52, pair53, pair54, pair55, pair56, pair57, pair58, pair59, pair60, pair61, pair62, pair63, pair64, pair65, pair66, pair67, pair68, pair69, pair70, pair71, pair72, TuplesKt.to("lightgreen", new Integer[]{144, valueOf4, 144, 255}), TuplesKt.to("lightgrey", new Integer[]{211, 211, 211, 255}), TuplesKt.to("lightpink", new Integer[]{255, 182, 193, 255}), TuplesKt.to("lightsalmon", new Integer[]{255, 160, 122, 255}), TuplesKt.to("lightseagreen", new Integer[]{32, 178, 170, 255}), TuplesKt.to("lightskyblue", new Integer[]{135, 206, 250, 255}), TuplesKt.to("lightslategray", new Integer[]{119, 136, 153, 255}), TuplesKt.to("lightslategrey", new Integer[]{119, 136, 153, 255}), TuplesKt.to("lightsteelblue", new Integer[]{176, Integer.valueOf(ByteCodes.wide), valueOf3, 255}), TuplesKt.to("lightyellow", new Integer[]{255, 255, 224, 255}), TuplesKt.to("lime", new Integer[]{0, 255, 0, 255}), TuplesKt.to("limegreen", new Integer[]{50, 205, 50, 255}), TuplesKt.to("linen", new Integer[]{250, 240, 230, 255}), TuplesKt.to("magenta", new Integer[]{255, 0, 255, 255}), TuplesKt.to("maroon", new Integer[]{128, 0, 0, 255}), TuplesKt.to("mediumaquamarine", new Integer[]{102, 205, 170, 255}), TuplesKt.to("mediumblue", new Integer[]{0, 0, 205, 255}), TuplesKt.to("mediumorchid", new Integer[]{186, 85, 211, 255}), TuplesKt.to("mediumpurple", new Integer[]{147, 112, 219, 255}), TuplesKt.to("mediumseagreen", new Integer[]{60, 179, 113, 255}), TuplesKt.to("mediumslateblue", new Integer[]{123, 104, valueOf4, 255}), TuplesKt.to("mediumspringgreen", new Integer[]{0, 250, 154, 255}), TuplesKt.to("mediumturquoise", new Integer[]{72, 209, 204, 255}), TuplesKt.to("mediumvioletred", new Integer[]{199, 21, 133, 255}), TuplesKt.to("midnightblue", new Integer[]{25, 25, 112, 255}), TuplesKt.to("mintcream", new Integer[]{valueOf2, 255, 250, 255}), TuplesKt.to("mistyrose", new Integer[]{255, 228, 225, 255}), TuplesKt.to("moccasin", new Integer[]{255, 228, 181, 255}), TuplesKt.to("navajowhite", new Integer[]{255, valueOf3, 173, 255}), TuplesKt.to("navy", new Integer[]{0, 0, 128, 255}), TuplesKt.to("oldlace", new Integer[]{Integer.valueOf(TelnetCommand.DO), valueOf2, 230, 255}), TuplesKt.to("olive", new Integer[]{128, 128, 0, 255}), TuplesKt.to("olivedrab", new Integer[]{107, 142, 35, 255}), TuplesKt.to("orange", new Integer[]{255, 165, 0, 255}), TuplesKt.to("orangered", new Integer[]{255, 69, 0, 255}), TuplesKt.to("orchid", new Integer[]{Integer.valueOf(JfifUtil.MARKER_SOS), 112, 214, 255}), TuplesKt.to("palegoldenrod", new Integer[]{valueOf4, 232, 170, 255}), TuplesKt.to("palegreen", new Integer[]{152, 251, 152, 255}), TuplesKt.to("paleturquoise", new Integer[]{175, valueOf4, valueOf4, 255}), TuplesKt.to("palevioletred", new Integer[]{219, 112, 147, 255}), TuplesKt.to("papayawhip", new Integer[]{255, Integer.valueOf(TelnetCommand.EOR), Integer.valueOf(FTPReply.FILE_STATUS), 255}), TuplesKt.to("peachpuff", new Integer[]{255, Integer.valueOf(JfifUtil.MARKER_SOS), 185, 255}), TuplesKt.to("peru", new Integer[]{205, 133, 63, 255}), TuplesKt.to("pink", new Integer[]{255, 192, 203, 255}), TuplesKt.to("plum", new Integer[]{221, 160, 221, 255}), TuplesKt.to("powderblue", new Integer[]{176, 224, 230, 255}), TuplesKt.to("purple", new Integer[]{128, 0, 128, 255}), TuplesKt.to("rebeccapurple", new Integer[]{102, 51, 153, 255}), TuplesKt.to("red", new Integer[]{255, 0, 0, 255}), TuplesKt.to("rosybrown", new Integer[]{188, 143, 143, 255}), TuplesKt.to("royalblue", new Integer[]{65, 105, 225, 255}), TuplesKt.to("saddlebrown", new Integer[]{139, 69, 19, 255}), TuplesKt.to("salmon", new Integer[]{250, 128, 114, 255}), TuplesKt.to("sandybrown", new Integer[]{Integer.valueOf(TelnetCommand.IP), 164, 96, 255}), TuplesKt.to("seagreen", new Integer[]{46, 139, 87, 255}), TuplesKt.to("seashell", new Integer[]{255, valueOf2, valueOf4, 255}), TuplesKt.to("sienna", new Integer[]{160, 82, 45, 255}), TuplesKt.to("silver", new Integer[]{192, 192, 192, 255}), TuplesKt.to("skyblue", new Integer[]{135, 206, 235, 255}), TuplesKt.to("slateblue", new Integer[]{106, 90, 205, 255}), TuplesKt.to("slategray", new Integer[]{112, 128, 144, 255}), TuplesKt.to("slategrey", new Integer[]{112, 128, 144, 255}), TuplesKt.to("snow", new Integer[]{255, 250, 250, 255}), TuplesKt.to("springgreen", new Integer[]{0, 255, 127, 255}), TuplesKt.to("steelblue", new Integer[]{70, 130, 180, 255}), TuplesKt.to("tan", new Integer[]{210, 180, 140, 255}), TuplesKt.to("teal", new Integer[]{0, 128, 128, 255}), TuplesKt.to("thistle", new Integer[]{Integer.valueOf(JfifUtil.MARKER_SOI), 191, Integer.valueOf(JfifUtil.MARKER_SOI), 255}), TuplesKt.to("tomato", new Integer[]{255, 99, 71, 255}), TuplesKt.to("transparent", new Integer[]{0, 0, 0, 0}), TuplesKt.to("turquoise", new Integer[]{64, 224, Integer.valueOf(JfifUtil.MARKER_RST0), 255}), TuplesKt.to("violet", new Integer[]{valueOf4, 130, valueOf4, 255}), TuplesKt.to("wheat", new Integer[]{valueOf2, valueOf3, 179, 255}), TuplesKt.to("white", new Integer[]{255, 255, 255, 255}), TuplesKt.to("whitesmoke", new Integer[]{valueOf2, valueOf2, valueOf2, 255}), TuplesKt.to("yellow", new Integer[]{255, 255, 0, 255}), TuplesKt.to("yellowgreen", new Integer[]{154, 205, 50, 255}));
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapOf.size()));
        for (Map.Entry entry : mapOf.entrySet()) {
            Object key = entry.getKey();
            Integer[] numArr = (Integer[]) entry.getValue();
            ArrayList arrayList = new ArrayList(numArr.length);
            for (Integer num : numArr) {
                arrayList.add(Float.valueOf(num.intValue() / 255.0f));
            }
            linkedHashMap.put(key, arrayList);
        }
        namedColors = linkedHashMap;
    }
}
