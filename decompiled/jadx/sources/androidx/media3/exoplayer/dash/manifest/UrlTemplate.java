package androidx.media3.exoplayer.dash.manifest;

import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public final class UrlTemplate {
    private static final String BANDWIDTH = "Bandwidth";
    private static final int BANDWIDTH_ID = 3;
    private static final String DEFAULT_FORMAT_TAG = "%01d";
    private static final String ESCAPED_DOLLAR = "$$";
    private static final String NUMBER = "Number";
    private static final int NUMBER_ID = 2;
    private static final String REPRESENTATION = "RepresentationID";
    private static final int REPRESENTATION_ID = 1;
    private static final String TIME = "Time";
    private static final int TIME_ID = 4;
    private final List<String> identifierFormatTags;
    private final List<Integer> identifiers;
    private final List<String> urlPieces;

    private UrlTemplate(List<String> list, List<Integer> list2, List<String> list3) {
        this.urlPieces = list;
        this.identifiers = list2;
        this.identifierFormatTags = list3;
    }

    public static UrlTemplate compile(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        parseTemplate(str, arrayList, arrayList2, arrayList3);
        return new UrlTemplate(arrayList, arrayList2, arrayList3);
    }

    private static void parseTemplate(String str, List<String> list, List<Integer> list2, List<String> list3) {
        String str2;
        list.add("");
        int i = 0;
        while (i < str.length()) {
            int indexOf = str.indexOf("$", i);
            if (indexOf == -1) {
                list.set(list2.size(), list.get(list2.size()) + str.substring(i));
                i = str.length();
            } else if (indexOf != i) {
                list.set(list2.size(), list.get(list2.size()) + str.substring(i, indexOf));
                i = indexOf;
            } else if (str.startsWith(ESCAPED_DOLLAR, i)) {
                list.set(list2.size(), list.get(list2.size()) + "$");
                i += 2;
            } else {
                list3.add("");
                int i2 = i + 1;
                int indexOf2 = str.indexOf("$", i2);
                String substring = str.substring(i2, indexOf2);
                if (substring.equals(REPRESENTATION)) {
                    list2.add(1);
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                            str2 = str2.concat("d");
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = DEFAULT_FORMAT_TAG;
                    }
                    switch (substring) {
                        case "Number":
                            list2.add(2);
                            break;
                        case "Time":
                            list2.add(4);
                            break;
                        case "Bandwidth":
                            list2.add(3);
                            break;
                        default:
                            Single$$ExternalSyntheticBUOutline0.m$3("Invalid template: ".concat(str));
                            return;
                    }
                    list3.set(list2.size() - 1, str2);
                }
                list.add("");
                i = indexOf2 + 1;
            }
        }
    }

    public String buildUri(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int size = this.identifiers.size();
            List<String> list = this.urlPieces;
            if (i2 >= size) {
                sb.append(list.get(this.identifiers.size()));
                return sb.toString();
            }
            sb.append(list.get(i2));
            if (this.identifiers.get(i2).intValue() == 1) {
                sb.append(str);
            } else if (this.identifiers.get(i2).intValue() == 2) {
                sb.append(String.format(Locale.US, this.identifierFormatTags.get(i2), Long.valueOf(j)));
            } else if (this.identifiers.get(i2).intValue() == 3) {
                sb.append(String.format(Locale.US, this.identifierFormatTags.get(i2), Integer.valueOf(i)));
            } else if (this.identifiers.get(i2).intValue() == 4) {
                sb.append(String.format(Locale.US, this.identifierFormatTags.get(i2), Long.valueOf(j2)));
            }
            i2++;
        }
    }
}
