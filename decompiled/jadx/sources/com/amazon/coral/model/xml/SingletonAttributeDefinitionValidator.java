package com.amazon.coral.model.xml;

import com.amazon.coral.google.common.base.Preconditions;
import com.amazon.coral.google.common.base.Strings;
import com.amazon.coral.google.common.collect.Iterables;
import org.apache.http.cookie.ClientCookie;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class SingletonAttributeDefinitionValidator implements DefinitionVisitor {
    private final String expectedName;

    public SingletonAttributeDefinitionValidator(String str) {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(str), "should not get null/empty string");
        this.expectedName = str;
    }

    public void validateNotEmpty(Definition definition) {
        Iterable<String> attributes = definition.getAttributes();
        if (attributes == null || Iterables.isEmpty(attributes)) {
            throw new DefinitionMissingAttributeException(this.expectedName, definition);
        }
    }

    public void validateOnlyOne(Definition definition) {
        int i = 0;
        for (String str : definition.getAttributes()) {
            if (str.equals(this.expectedName)) {
                i++;
            } else if (!str.equalsIgnoreCase(ClientCookie.COMMENT_ATTR) && !str.startsWith("xmlns:")) {
                throw new DefinitionContainsUnsupportedAttributeException(str, definition);
            }
        }
        if (i == 0) {
            throw new NoMatchingTraitPropertyException(this.expectedName, definition);
        }
        if (i > 1) {
            throw new DuplicateTraitPropertiesException(this.expectedName, definition);
        }
    }

    @Override // com.amazon.coral.model.xml.DefinitionVisitor
    public void visit(Definition definition) {
        Preconditions.checkArgument(definition != null, "should not get null argument");
        validateNotEmpty(definition);
        validateOnlyOne(definition);
    }
}
