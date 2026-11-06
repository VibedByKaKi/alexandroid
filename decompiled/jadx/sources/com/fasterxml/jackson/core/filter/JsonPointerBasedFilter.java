package com.fasterxml.jackson.core.filter;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.core.JsonPointer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class JsonPointerBasedFilter extends TokenFilter {
    protected final boolean _includeAllElements;
    protected final JsonPointer _pathToMatch;

    public JsonPointerBasedFilter(String str) {
        this(JsonPointer.compile(str), false);
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public boolean _includeScalar() {
        return this._pathToMatch.matches();
    }

    public JsonPointerBasedFilter construct(JsonPointer jsonPointer, boolean z) {
        return new JsonPointerBasedFilter(jsonPointer, z);
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public TokenFilter includeElement(int i) {
        JsonPointer matchElement = (!this._includeAllElements || this._pathToMatch.mayMatchElement()) ? this._pathToMatch.matchElement(i) : this._pathToMatch.tail();
        if (matchElement == null) {
            return null;
        }
        return matchElement.matches() ? TokenFilter.INCLUDE_ALL : construct(matchElement, this._includeAllElements);
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public TokenFilter includeProperty(String str) {
        JsonPointer matchProperty = this._pathToMatch.matchProperty(str);
        if (matchProperty == null) {
            return null;
        }
        return matchProperty.matches() ? TokenFilter.INCLUDE_ALL : construct(matchProperty, this._includeAllElements);
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public String toString() {
        return "[JsonPointerFilter at: " + this._pathToMatch + MarkdownConstants.RIGHT_BRACKET;
    }

    public JsonPointerBasedFilter(JsonPointer jsonPointer) {
        this(jsonPointer, false);
    }

    public JsonPointerBasedFilter(JsonPointer jsonPointer, boolean z) {
        this._pathToMatch = jsonPointer;
        this._includeAllElements = z;
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public TokenFilter filterStartArray() {
        return this;
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public TokenFilter filterStartObject() {
        return this;
    }
}
