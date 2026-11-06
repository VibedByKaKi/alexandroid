package com.amazon.coral.org.json;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class XMLParserConfiguration {
    public static final int DEFAULT_MAXIMUM_NESTING_DEPTH = 512;
    public static final int UNDEFINED_MAXIMUM_NESTING_DEPTH = -1;
    private String cDataTagName;
    private boolean convertNilAttributeToNull;
    private Set<String> forceList;
    private boolean keepStrings;
    private int maxNestingDepth;
    private Map<String, XMLXsiTypeConverter<?>> xsiTypeMap;
    public static final XMLParserConfiguration ORIGINAL = new XMLParserConfiguration();
    public static final XMLParserConfiguration KEEP_STRINGS = new XMLParserConfiguration().withKeepStrings(true);

    private XMLParserConfiguration(boolean z, String str, boolean z2, Map<String, XMLXsiTypeConverter<?>> map, Set<String> set, int i) {
        this.maxNestingDepth = 512;
        this.keepStrings = z;
        this.cDataTagName = str;
        this.convertNilAttributeToNull = z2;
        this.xsiTypeMap = Collections.unmodifiableMap(map);
        this.forceList = Collections.unmodifiableSet(set);
        this.maxNestingDepth = i;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public XMLParserConfiguration m21222clone() {
        return new XMLParserConfiguration(this.keepStrings, this.cDataTagName, this.convertNilAttributeToNull, this.xsiTypeMap, this.forceList, this.maxNestingDepth);
    }

    public Set<String> getForceList() {
        return this.forceList;
    }

    public int getMaxNestingDepth() {
        return this.maxNestingDepth;
    }

    public Map<String, XMLXsiTypeConverter<?>> getXsiTypeMap() {
        return this.xsiTypeMap;
    }

    public String getcDataTagName() {
        return this.cDataTagName;
    }

    public boolean isConvertNilAttributeToNull() {
        return this.convertNilAttributeToNull;
    }

    public boolean isKeepStrings() {
        return this.keepStrings;
    }

    public XMLParserConfiguration withConvertNilAttributeToNull(boolean z) {
        XMLParserConfiguration m21222clone = m21222clone();
        m21222clone.convertNilAttributeToNull = z;
        return m21222clone;
    }

    public XMLParserConfiguration withForceList(Set<String> set) {
        XMLParserConfiguration m21222clone = m21222clone();
        m21222clone.forceList = Collections.unmodifiableSet(new HashSet(set));
        return m21222clone;
    }

    public XMLParserConfiguration withKeepStrings(boolean z) {
        XMLParserConfiguration m21222clone = m21222clone();
        m21222clone.keepStrings = z;
        return m21222clone;
    }

    public XMLParserConfiguration withMaxNestingDepth(int i) {
        XMLParserConfiguration m21222clone = m21222clone();
        if (i > -1) {
            m21222clone.maxNestingDepth = i;
            return m21222clone;
        }
        m21222clone.maxNestingDepth = -1;
        return m21222clone;
    }

    public XMLParserConfiguration withXsiTypeMap(Map<String, XMLXsiTypeConverter<?>> map) {
        XMLParserConfiguration m21222clone = m21222clone();
        m21222clone.xsiTypeMap = Collections.unmodifiableMap(new HashMap(map));
        return m21222clone;
    }

    public XMLParserConfiguration withcDataTagName(String str) {
        XMLParserConfiguration m21222clone = m21222clone();
        m21222clone.cDataTagName = str;
        return m21222clone;
    }

    @Deprecated
    public XMLParserConfiguration(boolean z) {
        this(z, "content", false);
    }

    @Deprecated
    public XMLParserConfiguration(String str) {
        this(false, str, false);
    }

    @Deprecated
    public XMLParserConfiguration(boolean z, String str) {
        this.maxNestingDepth = 512;
        this.keepStrings = z;
        this.cDataTagName = str;
        this.convertNilAttributeToNull = false;
    }

    @Deprecated
    public XMLParserConfiguration(boolean z, String str, boolean z2) {
        this.maxNestingDepth = 512;
        this.keepStrings = z;
        this.cDataTagName = str;
        this.convertNilAttributeToNull = z2;
    }

    public XMLParserConfiguration() {
        this.maxNestingDepth = 512;
        this.keepStrings = false;
        this.cDataTagName = "content";
        this.convertNilAttributeToNull = false;
        this.xsiTypeMap = Collections.EMPTY_MAP;
        this.forceList = Collections.EMPTY_SET;
    }
}
