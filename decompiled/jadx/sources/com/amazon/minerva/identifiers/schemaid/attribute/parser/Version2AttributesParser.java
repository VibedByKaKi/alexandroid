package com.amazon.minerva.identifiers.schemaid.attribute.parser;

import com.amazon.minerva.identifiers.schemaid.attribute.attributes.AttributeEnumV2;
import com.amazon.minerva.identifiers.schemaid.attribute.attributes.VersionedAttributes;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class Version2AttributesParser extends BaseAttributesParser {
    public static String getAttributesHexString(VersionedAttributes versionedAttributes) {
        BitSet createEmptyBitSet = BaseAttributesParser.createEmptyBitSet();
        AttributeEnumV2 attributeEnumV2 = AttributeEnumV2.ALLOW_DSN_INFO;
        boolean booleanValue = versionedAttributes.getBooleanValue(attributeEnumV2).booleanValue();
        BaseAttributesParser.setBitPositionsForValue(createEmptyBitSet, booleanValue ? 1 : 0, attributeEnumV2.getStartIndex(), attributeEnumV2.getEndIndex());
        AttributeEnumV2 attributeEnumV22 = AttributeEnumV2.ALLOW_CUSTOMER_INFO;
        boolean booleanValue2 = versionedAttributes.getBooleanValue(attributeEnumV22).booleanValue();
        BaseAttributesParser.setBitPositionsForValue(createEmptyBitSet, booleanValue2 ? 1 : 0, attributeEnumV22.getStartIndex(), attributeEnumV22.getEndIndex());
        AttributeEnumV2 attributeEnumV23 = AttributeEnumV2.ALLOW_CHILD_PROFILE;
        boolean booleanValue3 = versionedAttributes.getBooleanValue(attributeEnumV23).booleanValue();
        BaseAttributesParser.setBitPositionsForValue(createEmptyBitSet, booleanValue3 ? 1 : 0, attributeEnumV23.getStartIndex(), attributeEnumV23.getEndIndex());
        AttributeEnumV2 attributeEnumV24 = AttributeEnumV2.DEPRECATED_EXEMPT_FROM_3P_OPT_OUT;
        boolean booleanValue4 = versionedAttributes.getBooleanValue(attributeEnumV24).booleanValue();
        BaseAttributesParser.setBitPositionsForValue(createEmptyBitSet, booleanValue4 ? 1 : 0, attributeEnumV24.getStartIndex(), attributeEnumV24.getEndIndex());
        AttributeEnumV2 attributeEnumV25 = AttributeEnumV2.USE_SUBJECT_TO_3P_OPT_OUT;
        boolean booleanValue5 = versionedAttributes.getBooleanValue(attributeEnumV25).booleanValue();
        BaseAttributesParser.setBitPositionsForValue(createEmptyBitSet, booleanValue5 ? 1 : 0, attributeEnumV25.getStartIndex(), attributeEnumV25.getEndIndex());
        AttributeEnumV2 attributeEnumV26 = AttributeEnumV2.SUBJECT_TO_3P_OPT_OUT;
        boolean booleanValue6 = versionedAttributes.getBooleanValue(attributeEnumV26).booleanValue();
        BaseAttributesParser.setBitPositionsForValue(createEmptyBitSet, booleanValue6 ? 1 : 0, attributeEnumV26.getStartIndex(), attributeEnumV26.getEndIndex());
        AttributeEnumV2 attributeEnumV27 = AttributeEnumV2.METRIC_BUSINESS_TYPE;
        BaseAttributesParser.setBitPositionsForValue(createEmptyBitSet, versionedAttributes.getIntegerValue(attributeEnumV27).intValue(), attributeEnumV27.getStartIndex(), attributeEnumV27.getEndIndex());
        AttributeEnumV2 attributeEnumV28 = AttributeEnumV2.UPLOAD_PRIORITY;
        BaseAttributesParser.setBitPositionsForValue(createEmptyBitSet, versionedAttributes.getIntegerValue(attributeEnumV28).intValue(), attributeEnumV28.getStartIndex(), attributeEnumV28.getEndIndex());
        AttributeEnumV2 attributeEnumV29 = AttributeEnumV2.STORAGE_PRIORITY;
        BaseAttributesParser.setBitPositionsForValue(createEmptyBitSet, versionedAttributes.getIntegerValue(attributeEnumV29).intValue(), attributeEnumV29.getStartIndex(), attributeEnumV29.getEndIndex());
        AttributeEnumV2 attributeEnumV210 = AttributeEnumV2.SCHEMA_REVISION;
        BaseAttributesParser.setBitPositionsForValue(createEmptyBitSet, versionedAttributes.getIntegerValue(attributeEnumV210).intValue(), attributeEnumV210.getStartIndex(), attributeEnumV210.getEndIndex());
        return BaseAttributesParser.getAttributesHexString(createEmptyBitSet);
    }

    public static VersionedAttributes parseAttributes(String str) {
        VersionedAttributes versionedAttributes = new VersionedAttributes();
        BitSet createBitSet = BaseAttributesParser.createBitSet(str);
        Objects.requireNonNull(createBitSet, "attrBitSet can not be null");
        AttributeEnumV2 attributeEnumV2 = AttributeEnumV2.ALLOW_DSN_INFO;
        versionedAttributes.setBooleanValue(attributeEnumV2, Boolean.valueOf(BaseAttributesParser.getBoolean(createBitSet, attributeEnumV2.getStartIndex())));
        AttributeEnumV2 attributeEnumV22 = AttributeEnumV2.ALLOW_CUSTOMER_INFO;
        versionedAttributes.setBooleanValue(attributeEnumV22, Boolean.valueOf(BaseAttributesParser.getBoolean(createBitSet, attributeEnumV22.getStartIndex())));
        AttributeEnumV2 attributeEnumV23 = AttributeEnumV2.ALLOW_CHILD_PROFILE;
        versionedAttributes.setBooleanValue(attributeEnumV23, Boolean.valueOf(BaseAttributesParser.getBoolean(createBitSet, attributeEnumV23.getStartIndex())));
        AttributeEnumV2 attributeEnumV24 = AttributeEnumV2.DEPRECATED_EXEMPT_FROM_3P_OPT_OUT;
        versionedAttributes.setBooleanValue(attributeEnumV24, Boolean.valueOf(BaseAttributesParser.getBoolean(createBitSet, attributeEnumV24.getStartIndex())));
        AttributeEnumV2 attributeEnumV25 = AttributeEnumV2.USE_SUBJECT_TO_3P_OPT_OUT;
        versionedAttributes.setBooleanValue(attributeEnumV25, Boolean.valueOf(BaseAttributesParser.getBoolean(createBitSet, attributeEnumV25.getStartIndex())));
        AttributeEnumV2 attributeEnumV26 = AttributeEnumV2.SUBJECT_TO_3P_OPT_OUT;
        versionedAttributes.setBooleanValue(attributeEnumV26, Boolean.valueOf(BaseAttributesParser.getBoolean(createBitSet, attributeEnumV26.getStartIndex())));
        AttributeEnumV2 attributeEnumV27 = AttributeEnumV2.METRIC_BUSINESS_TYPE;
        versionedAttributes.setIntegerValue(attributeEnumV27, Integer.valueOf(BaseAttributesParser.getInteger(createBitSet, attributeEnumV27.getStartIndex(), attributeEnumV27.getEndIndex())));
        AttributeEnumV2 attributeEnumV28 = AttributeEnumV2.UPLOAD_PRIORITY;
        versionedAttributes.setIntegerValue(attributeEnumV28, Integer.valueOf(BaseAttributesParser.getInteger(createBitSet, attributeEnumV28.getStartIndex(), attributeEnumV28.getEndIndex())));
        AttributeEnumV2 attributeEnumV29 = AttributeEnumV2.STORAGE_PRIORITY;
        versionedAttributes.setIntegerValue(attributeEnumV29, Integer.valueOf(BaseAttributesParser.getInteger(createBitSet, attributeEnumV29.getStartIndex(), attributeEnumV29.getEndIndex())));
        AttributeEnumV2 attributeEnumV210 = AttributeEnumV2.SCHEMA_REVISION;
        versionedAttributes.setIntegerValue(attributeEnumV210, Integer.valueOf(BaseAttributesParser.getInteger(createBitSet, attributeEnumV210.getStartIndex(), attributeEnumV210.getEndIndex())));
        return versionedAttributes;
    }
}
