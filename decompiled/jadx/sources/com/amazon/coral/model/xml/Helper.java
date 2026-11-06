package com.amazon.coral.model.xml;

import com.amazon.coral.model.Model;
import com.amazon.coral.model.ModelIndexFactoryException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class Helper {
    public static Model.Id createId(Definition definition, Definition definition2, String str) {
        String str2 = definition.getAttribute("assembly") + "#";
        String source = definition2.getSource();
        if ("#".equals(str)) {
            return new Model.Id(definition.getAttribute("assembly"), "#", source);
        }
        int indexOf = str.indexOf(36) + 1;
        if (indexOf == str.length()) {
            throw new ModelIndexFactoryException(str.concat(" is a malformed id"));
        }
        if (indexOf == 0) {
            int indexOf2 = str.indexOf(35) + 1;
            if (indexOf2 == str.length()) {
                throw new ModelIndexFactoryException(str.concat(" is a malformed id"));
            }
            if (indexOf2 != 0) {
                str2 = str.substring(0, indexOf2);
                str = str.substring(indexOf2);
            }
            return new Model.Id(str, str2, source);
        }
        String substring = str.substring(indexOf);
        String substring2 = str.substring(0, indexOf);
        int indexOf3 = substring2.indexOf(35) + 1;
        if (indexOf3 == substring2.length()) {
            throw new ModelIndexFactoryException(str.concat(" is a malformed id"));
        }
        if (indexOf3 == 0) {
            substring2 = str2.concat(substring2);
        }
        return new Model.Id(substring, substring2, source);
    }

    public static Model.Id createId(Definition definition, Model.Id id, String str) {
        return new Model.Id(str, id.getNamespace() + id.getName() + '$', definition.getSource());
    }
}
