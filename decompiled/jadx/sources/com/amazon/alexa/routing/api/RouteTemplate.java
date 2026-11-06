package com.amazon.alexa.routing.api;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.deecomms.common.Constants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class RouteTemplate implements Parcelable {
    public static final Parcelable.Creator<RouteTemplate> CREATOR = new Parcelable.Creator<RouteTemplate>() { // from class: com.amazon.alexa.routing.api.RouteTemplate.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RouteTemplate createFromParcel(Parcel parcel) {
            return new RouteTemplate(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RouteTemplate[] newArray(int i) {
            return new RouteTemplate[i];
        }
    };
    private static final String DELIMITER = "/";
    private static final String QUERYSTRING_DELIMITER = "&";
    private static final String TAG = "RouteTemplate";
    private final Map<String, Token> queryParams;
    private final String template;
    private final Map<String, Token> tokenMap;
    private final List<Token> tokens;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.routing.api.RouteTemplate$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$routing$api$RouteTemplate$Token$Type;

        static {
            int[] iArr = new int[Token.Type.values().length];
            $SwitchMap$com$amazon$alexa$routing$api$RouteTemplate$Token$Type = iArr;
            try {
                iArr[Token.Type.CatchAll.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$routing$api$RouteTemplate$Token$Type[Token.Type.Optional.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public RouteTemplate(Parcel parcel) {
        HashMap hashMap = new HashMap();
        this.queryParams = hashMap;
        HashMap hashMap2 = new HashMap();
        this.tokenMap = hashMap2;
        ArrayList arrayList = new ArrayList();
        this.tokens = arrayList;
        String readString = parcel.readString();
        this.template = readString;
        parse(readString, hashMap, arrayList, hashMap2);
    }

    private String compilePath(RouteContext routeContext) throws UnsupportedEncodingException {
        ArrayList arrayList = new ArrayList();
        for (Token token : this.tokens) {
            Token.Type type = token.type;
            Token.Type type2 = Token.Type.Literal;
            String str = token.value;
            if (type != type2) {
                Object obj = routeContext.get(str);
                if (obj != null) {
                    arrayList.add(encode(obj.toString()));
                }
            } else {
                arrayList.add(encode(str.toString()));
            }
        }
        return TextUtils.join("/", arrayList);
    }

    private String compileQueryString(RouteContext routeContext) throws UnsupportedEncodingException {
        if (this.queryParams.size() == 0) {
            return routeContext.getString("rawQueryString", "");
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Token> entry : this.queryParams.entrySet()) {
            String key = entry.getKey();
            Token value = entry.getValue();
            if (value.type == Token.Type.Literal) {
                StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(key, "=");
                m1m.append(value.value);
                arrayList.add(m1m.toString());
            } else {
                Object obj = routeContext.get(value.value);
                if (obj != null) {
                    arrayList.add(key + "=" + obj);
                } else if (value.type != Token.Type.Optional) {
                    Log.e(TAG, "Route context is missing parameter");
                    Single$$ExternalSyntheticBUOutline0.m$3("Route context is missing parameter");
                    return null;
                }
            }
        }
        return arrayList.size() > 0 ? TextUtils.join("&", arrayList) : "";
    }

    private String decode(String str) throws UnsupportedEncodingException {
        String[] split = str.split("/");
        String[] strArr = new String[split.length];
        strArr[0] = Uri.decode(split[0]);
        return TextUtils.join("/", strArr);
    }

    private String encode(String str) throws UnsupportedEncodingException {
        String[] split = str.split("/", -1);
        int length = split.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = Uri.encode(split[i]);
        }
        return TextUtils.join("/", strArr);
    }

    private static HashMap<String, Token> extractTokens(HashMap<String, String> hashMap) {
        HashMap<String, Token> hashMap2 = new HashMap<>();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            hashMap2.put(entry.getKey(), parseToken(entry.getValue()));
        }
        return hashMap2;
    }

    private boolean isCorrectSegmentCount(Token.Type type, int i, int i2) {
        int i3 = AnonymousClass2.$SwitchMap$com$amazon$alexa$routing$api$RouteTemplate$Token$Type[type.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i2 != i) {
                    return false;
                }
            } else if (i != i2 - 1 && i != i2) {
                return false;
            }
        } else if (i < i2) {
            return false;
        }
        return true;
    }

    private static boolean isLastSegmentValid(String str) {
        return str.startsWith("{") || !str.contains("{");
    }

    private static boolean isListsUri(String str) {
        return str.startsWith("/lists") | str.startsWith("v2/lists");
    }

    private String joinSegments(String[] strArr) {
        return TextUtils.join("/", strArr);
    }

    private static String[] normalizeTemplateParts(String[] strArr) {
        int length = strArr.length;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, length);
        int i = length - 1;
        strArr2[i] = "?".concat(strArr2[i]);
        return strArr2;
    }

    private String normalizeUrl(String str) {
        String str2 = str.split("/", -1)[r4.length - 1];
        if (str2.length() != 0) {
            for (int i = 0; i < str2.length() - 1; i++) {
                if (str2.charAt(i) == '=') {
                    int lastIndexOf = str.lastIndexOf(47) + 1;
                    StringBuilder sb = new StringBuilder();
                    TableInfo$$ExternalSyntheticOutline0.m(str, 0, lastIndexOf, sb, "?");
                    return a$$ExternalSyntheticOutline0.m(str, lastIndexOf, sb);
                }
                if (str2.charAt(i) == '?') {
                    break;
                }
            }
        }
        return str;
    }

    private static void parse(String str, Map<String, Token> map, List<Token> list, Map<String, Token> map2) {
        boolean z;
        String[] split = str.split("/", -1);
        if (TextUtils.isEmpty(split[split.length - 1])) {
            Log.i(TAG, "Trailing /, appending it to last token");
            split = (String[]) Arrays.copyOf(split, split.length - 1);
            z = true;
        } else {
            z = false;
        }
        if (isListsUri(str) && !isLastSegmentValid(split[split.length - 1])) {
            split = normalizeTemplateParts(split);
        }
        for (int i = 0; i < split.length; i++) {
            String str2 = split[i];
            if (i == split.length - 1) {
                String[] parseLastSegment = parseLastSegment(str2);
                if (TextUtils.isEmpty(parseLastSegment[0])) {
                    z = true;
                } else {
                    Token parseToken = parseToken(parseLastSegment[0]);
                    list.add(parseToken);
                    if (parseToken.type != Token.Type.Literal) {
                        map2.put(parseToken.value, parseToken);
                    }
                }
                Token token = (Token) ErrorUtils$$ExternalSyntheticOutline0.m(list, 1);
                StringBuilder sb = new StringBuilder();
                sb.append(token.value);
                sb.append((z && token.type == Token.Type.Literal) ? "/" : "");
                token.value = sb.toString();
                if (parseLastSegment.length > 1 && parseLastSegment[1].length() > 0) {
                    HashMap<String, Token> extractTokens = extractTokens(parseQueryString(parseLastSegment[1]));
                    map2.putAll(extractTokens);
                    map.putAll(extractTokens);
                }
            } else if (TextUtils.isEmpty(str2)) {
                continue;
            } else {
                Token.Type type = parseToken(str2).type;
                if (type == Token.Type.CatchAll || type == Token.Type.Optional) {
                    Single$$ExternalSyntheticBUOutline0.m$3("Catchall or Optional tokens can only bethe last token in the path.");
                    return;
                }
                Token parseToken2 = parseToken(str2);
                list.add(parseToken2);
                if (parseToken2.type != Token.Type.Literal) {
                    map2.put(parseToken2.value, parseToken2);
                }
            }
        }
    }

    private static String[] parseLastSegment(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.charAt(0) == '{') {
            int indexOf = str.indexOf(125);
            int i = indexOf + 1;
            arrayList.add(str.substring(0, i));
            int i2 = indexOf + 2;
            if (str.length() > i2) {
                if (str.charAt(i) != '?') {
                    Single$$ExternalSyntheticBUOutline0.m$3("Last segment malformed or empty querystring");
                    return null;
                }
                arrayList.add(str.substring(i2));
            }
        } else {
            int i3 = 0;
            while (true) {
                if (i3 >= str.length()) {
                    break;
                }
                if (str.charAt(i3) == '{') {
                    Single$$ExternalSyntheticBUOutline0.m$3("Last segment malformed or empty querystring");
                    return null;
                }
                if (str.charAt(i3) == '?') {
                    arrayList.add(str.substring(0, i3));
                    if (str.length() > i3 + 2) {
                        arrayList.add(str.substring(i3 + 1));
                    }
                } else {
                    i3++;
                }
            }
            arrayList.add(str);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @VisibleForTesting
    public static HashMap<String, String> parseQueryString(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : str.split("&")) {
            String[] split = str2.split("=", 2);
            if (split.length != 0) {
                hashMap.put(split[0], split.length > 1 ? split[1] : null);
            }
        }
        return hashMap;
    }

    private static Token parseToken(String str) {
        return str.charAt(0) == '{' ? parseVariableToken(str) : new Token(str);
    }

    private static Token parseVariableToken(String str) {
        if (AppLaunchChecker$$ExternalSyntheticOutline0.m(1, str) == '}') {
            char m = AppLaunchChecker$$ExternalSyntheticOutline0.m(2, str);
            return m != '*' ? m != '?' ? new Token(AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 1, str), Token.Type.Variable) : new Token(AppLaunchChecker$$ExternalSyntheticOutline0.m(2, 1, str), Token.Type.Optional) : new Token(AppLaunchChecker$$ExternalSyntheticOutline0.m(2, 1, str), Token.Type.CatchAll);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Template variable not properly closed with closing bracket");
        return null;
    }

    public void addParameter(Bundle bundle, String str, String str2) {
        if ("true".equalsIgnoreCase(str2) || "false".equalsIgnoreCase(str2)) {
            bundle.putBoolean(str, Boolean.parseBoolean(str2));
            return;
        }
        try {
            bundle.putInt(str, Integer.parseInt(str2));
        } catch (NumberFormatException unused) {
            bundle.putString(str, str2);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RouteTemplate.class != obj.getClass()) {
            return false;
        }
        return this.template.equals(((RouteTemplate) obj).template);
    }

    public String getTemplateName() {
        return this.template;
    }

    public int hashCode() {
        return this.template.hashCode();
    }

    public boolean isOptional(String str) {
        Token token = this.tokenMap.get(str);
        return token == null || token.type == Token.Type.Optional;
    }

    @Nullable
    public Bundle parseParameters(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (isListsUri(str)) {
            str = normalizeUrl(str);
        }
        String[] split = str.split("\\?", 2);
        String[] split2 = split[0].split("/", -1);
        Bundle bundle = new Bundle();
        Token token = (Token) ErrorUtils$$ExternalSyntheticOutline0.m(this.tokens, 1);
        if (split2.length > 0 && TextUtils.isEmpty(split2[split2.length - 1])) {
            split2 = (String[]) Arrays.copyOf(split2, split2.length - 1);
            StringBuilder sb = new StringBuilder();
            int length = split2.length - 1;
            split2[length] = a$$ExternalSyntheticOutline0.m(sb, split2[length], "/");
        }
        if (!isCorrectSegmentCount(token.type, split2.length, this.tokens.size())) {
            return null;
        }
        for (int i = 0; i < split2.length && i < this.tokens.size(); i++) {
            Token token2 = this.tokens.get(i);
            Token.Type type = token2.type;
            if (type == Token.Type.CatchAll) {
                addParameter(bundle, token2.value, Uri.decode(joinSegments((String[]) Arrays.copyOfRange(split2, i, split2.length))));
            } else {
                Token.Type type2 = Token.Type.Literal;
                String str2 = token2.value;
                if (type != type2) {
                    addParameter(bundle, str2, Uri.decode(split2[i]));
                } else if (!str2.equalsIgnoreCase(split2[i])) {
                    return null;
                }
            }
        }
        if (split.length > 1) {
            HashMap<String, String> parseQueryString = parseQueryString(split[1]);
            bundle.putString("rawQueryString", split[1]);
            Bundle bundle2 = new Bundle();
            for (Map.Entry<String, Token> entry : this.queryParams.entrySet()) {
                String key = entry.getKey();
                Token value = entry.getValue();
                if (!parseQueryString.containsKey(key)) {
                    if (value.type != Token.Type.Optional) {
                        return null;
                    }
                } else if (value.type == Token.Type.Literal) {
                    try {
                        if (!decode(parseQueryString.get(key)).equals(value.value)) {
                            return null;
                        }
                    } catch (UnsupportedEncodingException e) {
                        Log.e(TAG, "Could not decode parameter in url", e);
                        return null;
                    }
                } else {
                    bundle.putString(value.value, parseQueryString.get(key));
                }
            }
            bundle.putBundle("queryParts", bundle2);
        }
        return bundle;
    }

    public String toString(RouteContext routeContext) {
        StringBuilder sb = new StringBuilder();
        try {
            String compilePath = compilePath(routeContext);
            String compileQueryString = compileQueryString(routeContext);
            sb.append(compilePath);
            if (compileQueryString.length() > 0) {
                sb.append(Constants.DEFAULT_IMAGE_CHAR);
                sb.append(compileQueryString);
            }
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.template);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Token {
        Type type;
        String value;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum Type {
            Optional,
            CatchAll,
            Variable,
            Literal
        }

        public Token(String str) {
            this.value = str;
            this.type = Type.Literal;
        }

        public Token(String str, Type type) {
            this.value = str;
            this.type = type;
        }
    }

    public RouteTemplate(String str) {
        HashMap hashMap = new HashMap();
        this.queryParams = hashMap;
        HashMap hashMap2 = new HashMap();
        this.tokenMap = hashMap2;
        ArrayList arrayList = new ArrayList();
        this.tokens = arrayList;
        this.template = str;
        parse(str, hashMap, arrayList, hashMap2);
    }

    public String toString() {
        return this.template;
    }
}
