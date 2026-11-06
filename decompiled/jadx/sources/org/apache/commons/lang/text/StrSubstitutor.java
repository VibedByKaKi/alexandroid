package org.apache.commons.lang.text;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class StrSubstitutor {
    public static final char DEFAULT_ESCAPE = '$';
    public static final StrMatcher DEFAULT_PREFIX = StrMatcher.stringMatcher(StringSubstitutor.DEFAULT_VAR_START);
    public static final StrMatcher DEFAULT_SUFFIX = StrMatcher.stringMatcher(StringSubstitutor.DEFAULT_VAR_END);
    private boolean enableSubstitutionInVariables;
    private char escapeChar;
    private StrMatcher prefixMatcher;
    private StrMatcher suffixMatcher;
    private StrLookup variableResolver;

    public StrSubstitutor(StrLookup strLookup, String str, String str2, char c) {
        setVariableResolver(strLookup);
        setVariablePrefix(str);
        setVariableSuffix(str2);
        setEscapeChar(c);
    }

    private void checkCyclicSubstitution(String str, List list) {
        if (list.contains(str)) {
            StrBuilder strBuilder = new StrBuilder(256);
            strBuilder.append("Infinite loop in property interpolation of ");
            strBuilder.append(list.remove(0));
            strBuilder.append(": ");
            strBuilder.appendWithSeparators(list, "->");
            throw new IllegalStateException(strBuilder.toString());
        }
    }

    public static String replace(Object obj, Properties properties) {
        if (properties == null) {
            return obj.toString();
        }
        HashMap hashMap = new HashMap();
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String str = (String) propertyNames.nextElement();
            hashMap.put(str, properties.getProperty(str));
        }
        return replace(obj, hashMap);
    }

    public static String replaceSystemProperties(Object obj) {
        return new StrSubstitutor(StrLookup.systemPropertiesLookup()).replace(obj);
    }

    private int substitute(StrBuilder strBuilder, int i, int i2, List list) {
        int i3;
        StrMatcher strMatcher;
        StrMatcher strMatcher2;
        int isMatch;
        boolean z;
        StrMatcher variablePrefixMatcher = getVariablePrefixMatcher();
        StrMatcher variableSuffixMatcher = getVariableSuffixMatcher();
        char escapeChar = getEscapeChar();
        boolean z2 = list == null;
        int i4 = i;
        int i5 = i + i2;
        int i6 = 0;
        int i7 = 0;
        char[] cArr = strBuilder.buffer;
        List list2 = list;
        while (i4 < i5) {
            int isMatch2 = variablePrefixMatcher.isMatch(cArr, i4, i, i5);
            if (isMatch2 == 0) {
                i4++;
                strMatcher = variablePrefixMatcher;
                strMatcher2 = variableSuffixMatcher;
            } else {
                if (i4 > i) {
                    i3 = 1;
                    int i8 = i4 - 1;
                    if (cArr[i8] == escapeChar) {
                        strBuilder.deleteCharAt(i8);
                        i6--;
                        i5--;
                        strMatcher = variablePrefixMatcher;
                        strMatcher2 = variableSuffixMatcher;
                        cArr = strBuilder.buffer;
                        i7 = 1;
                    }
                } else {
                    i3 = 1;
                }
                int i9 = i4 + isMatch2;
                int i10 = i9;
                int i11 = 0;
                while (true) {
                    if (i10 >= i5) {
                        strMatcher = variablePrefixMatcher;
                        strMatcher2 = variableSuffixMatcher;
                        i4 = i10;
                        break;
                    }
                    if (!isEnableSubstitutionInVariables() || (isMatch = variablePrefixMatcher.isMatch(cArr, i10, i, i5)) == 0) {
                        isMatch = variableSuffixMatcher.isMatch(cArr, i10, i, i5);
                        if (isMatch == 0) {
                            i10++;
                        } else if (i11 == 0) {
                            strMatcher = variablePrefixMatcher;
                            strMatcher2 = variableSuffixMatcher;
                            String str = new String(cArr, i9, (i10 - i4) - isMatch2);
                            if (isEnableSubstitutionInVariables()) {
                                StrBuilder strBuilder2 = new StrBuilder(str);
                                z = false;
                                substitute(strBuilder2, 0, strBuilder2.length());
                                str = strBuilder2.toString();
                            } else {
                                z = false;
                            }
                            int i12 = i10 + isMatch;
                            list2 = list2;
                            if (list2 == null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(new String(cArr, i, i2));
                                list2 = arrayList;
                            }
                            checkCyclicSubstitution(str, list2);
                            list2.add(str);
                            String resolveVariable = resolveVariable(str, strBuilder, i4, i12);
                            if (resolveVariable != null) {
                                int length = resolveVariable.length();
                                strBuilder.replace(i4, i12, resolveVariable);
                                int substitute = (length - (i12 - i4)) + substitute(strBuilder, i4, length, list2);
                                i12 += substitute;
                                i5 += substitute;
                                i6 += substitute;
                                cArr = strBuilder.buffer;
                                i7 = i3;
                            }
                            i4 = i12;
                            list2.remove(list2.size() - 1);
                        } else {
                            i11--;
                        }
                    } else {
                        i11++;
                    }
                    i10 += isMatch;
                }
                variablePrefixMatcher = strMatcher;
                variableSuffixMatcher = strMatcher2;
                list2 = list2;
            }
            variablePrefixMatcher = strMatcher;
            variableSuffixMatcher = strMatcher2;
            list2 = list2;
        }
        return z2 ? i7 : i6;
    }

    public char getEscapeChar() {
        return this.escapeChar;
    }

    public StrMatcher getVariablePrefixMatcher() {
        return this.prefixMatcher;
    }

    public StrLookup getVariableResolver() {
        return this.variableResolver;
    }

    public StrMatcher getVariableSuffixMatcher() {
        return this.suffixMatcher;
    }

    public boolean isEnableSubstitutionInVariables() {
        return this.enableSubstitutionInVariables;
    }

    public boolean replaceIn(StringBuffer stringBuffer, int i, int i2) {
        if (stringBuffer == null) {
            return false;
        }
        StrBuilder append = new StrBuilder(i2).append(stringBuffer, i, i2);
        if (!substitute(append, 0, i2)) {
            return false;
        }
        stringBuffer.replace(i, i2 + i, append.toString());
        return true;
    }

    public String resolveVariable(String str, StrBuilder strBuilder, int i, int i2) {
        StrLookup variableResolver = getVariableResolver();
        if (variableResolver == null) {
            return null;
        }
        return variableResolver.lookup(str);
    }

    public void setEnableSubstitutionInVariables(boolean z) {
        this.enableSubstitutionInVariables = z;
    }

    public void setEscapeChar(char c) {
        this.escapeChar = c;
    }

    public StrSubstitutor setVariablePrefix(String str) {
        if (str != null) {
            return setVariablePrefixMatcher(StrMatcher.stringMatcher(str));
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Variable prefix must not be null!");
        return null;
    }

    public StrSubstitutor setVariablePrefixMatcher(StrMatcher strMatcher) {
        if (strMatcher != null) {
            this.prefixMatcher = strMatcher;
            return this;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Variable prefix matcher must not be null!");
        return null;
    }

    public void setVariableResolver(StrLookup strLookup) {
        this.variableResolver = strLookup;
    }

    public StrSubstitutor setVariableSuffix(String str) {
        if (str != null) {
            return setVariableSuffixMatcher(StrMatcher.stringMatcher(str));
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Variable suffix must not be null!");
        return null;
    }

    public StrSubstitutor setVariableSuffixMatcher(StrMatcher strMatcher) {
        if (strMatcher != null) {
            this.suffixMatcher = strMatcher;
            return this;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Variable suffix matcher must not be null!");
        return null;
    }

    public StrSubstitutor(Map map) {
        this(StrLookup.mapLookup(map), DEFAULT_PREFIX, DEFAULT_SUFFIX, '$');
    }

    public StrSubstitutor(Map map, String str, String str2) {
        this(StrLookup.mapLookup(map), str, str2, '$');
    }

    public StrSubstitutor(Map map, String str, String str2, char c) {
        this(StrLookup.mapLookup(map), str, str2, c);
    }

    public StrSubstitutor setVariablePrefix(char c) {
        return setVariablePrefixMatcher(StrMatcher.charMatcher(c));
    }

    public StrSubstitutor setVariableSuffix(char c) {
        return setVariableSuffixMatcher(StrMatcher.charMatcher(c));
    }

    public StrSubstitutor(StrLookup strLookup) {
        this(strLookup, DEFAULT_PREFIX, DEFAULT_SUFFIX, '$');
    }

    public StrSubstitutor() {
        this((StrLookup) null, DEFAULT_PREFIX, DEFAULT_SUFFIX, '$');
    }

    public StrSubstitutor(StrLookup strLookup, StrMatcher strMatcher, StrMatcher strMatcher2, char c) {
        setVariableResolver(strLookup);
        setVariablePrefixMatcher(strMatcher);
        setVariableSuffixMatcher(strMatcher2);
        setEscapeChar(c);
    }

    public boolean replaceIn(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return false;
        }
        return replaceIn(stringBuffer, 0, stringBuffer.length());
    }

    public boolean replaceIn(StrBuilder strBuilder) {
        if (strBuilder == null) {
            return false;
        }
        return substitute(strBuilder, 0, strBuilder.length());
    }

    public boolean replaceIn(StrBuilder strBuilder, int i, int i2) {
        if (strBuilder == null) {
            return false;
        }
        return substitute(strBuilder, i, i2);
    }

    public static String replace(Object obj, Map map, String str, String str2) {
        return new StrSubstitutor(map, str, str2).replace(obj);
    }

    public static String replace(Object obj, Map map) {
        return new StrSubstitutor(map).replace(obj);
    }

    public String replace(String str) {
        if (str == null) {
            return null;
        }
        StrBuilder strBuilder = new StrBuilder(str);
        return !substitute(strBuilder, 0, str.length()) ? str : strBuilder.toString();
    }

    public String replace(String str, int i, int i2) {
        if (str == null) {
            return null;
        }
        StrBuilder append = new StrBuilder(i2).append(str, i, i2);
        if (!substitute(append, 0, i2)) {
            return str.substring(i, i2 + i);
        }
        return append.toString();
    }

    public String replace(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        StrBuilder append = new StrBuilder(cArr.length).append(cArr);
        substitute(append, 0, cArr.length);
        return append.toString();
    }

    public String replace(char[] cArr, int i, int i2) {
        if (cArr == null) {
            return null;
        }
        StrBuilder append = new StrBuilder(i2).append(cArr, i, i2);
        substitute(append, 0, i2);
        return append.toString();
    }

    public String replace(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return null;
        }
        StrBuilder append = new StrBuilder(stringBuffer.length()).append(stringBuffer);
        substitute(append, 0, append.length());
        return append.toString();
    }

    public String replace(StringBuffer stringBuffer, int i, int i2) {
        if (stringBuffer == null) {
            return null;
        }
        StrBuilder append = new StrBuilder(i2).append(stringBuffer, i, i2);
        substitute(append, 0, i2);
        return append.toString();
    }

    public String replace(StrBuilder strBuilder) {
        if (strBuilder == null) {
            return null;
        }
        StrBuilder append = new StrBuilder(strBuilder.length()).append(strBuilder);
        substitute(append, 0, append.length());
        return append.toString();
    }

    public String replace(StrBuilder strBuilder, int i, int i2) {
        if (strBuilder == null) {
            return null;
        }
        StrBuilder append = new StrBuilder(i2).append(strBuilder, i, i2);
        substitute(append, 0, i2);
        return append.toString();
    }

    public String replace(Object obj) {
        if (obj == null) {
            return null;
        }
        StrBuilder append = new StrBuilder().append(obj);
        substitute(append, 0, append.length());
        return append.toString();
    }

    public boolean substitute(StrBuilder strBuilder, int i, int i2) {
        return substitute(strBuilder, i, i2, null) > 0;
    }
}
