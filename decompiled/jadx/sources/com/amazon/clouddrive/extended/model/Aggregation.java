package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Aggregation {
    private Integer count;
    private SearchMetadata metadata;
    private String value;

    public boolean canEqual(Object obj) {
        return obj instanceof Aggregation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Aggregation)) {
            return false;
        }
        Aggregation aggregation = (Aggregation) obj;
        if (!aggregation.canEqual(this)) {
            return false;
        }
        Integer count = getCount();
        Integer count2 = aggregation.getCount();
        if (count != null ? !count.equals(count2) : count2 != null) {
            return false;
        }
        String value = getValue();
        String value2 = aggregation.getValue();
        if (value != null ? !value.equals(value2) : value2 != null) {
            return false;
        }
        SearchMetadata metadata = getMetadata();
        SearchMetadata metadata2 = aggregation.getMetadata();
        return metadata != null ? metadata.equals(metadata2) : metadata2 == null;
    }

    public Integer getCount() {
        return this.count;
    }

    public SearchMetadata getMetadata() {
        return this.metadata;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        Integer count = getCount();
        int hashCode = count == null ? 43 : count.hashCode();
        String value = getValue();
        int i = (hashCode + 59) * 59;
        int hashCode2 = value == null ? 43 : value.hashCode();
        SearchMetadata metadata = getMetadata();
        return ((i + hashCode2) * 59) + (metadata != null ? metadata.hashCode() : 43);
    }

    public void setCount(Integer num) {
        this.count = num;
    }

    public void setMetadata(SearchMetadata searchMetadata) {
        this.metadata = searchMetadata;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        return "Aggregation(count=" + getCount() + ", value=" + getValue() + ", metadata=" + getMetadata() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
