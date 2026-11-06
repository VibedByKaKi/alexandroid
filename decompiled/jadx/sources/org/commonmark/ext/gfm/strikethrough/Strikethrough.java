package org.commonmark.ext.gfm.strikethrough;

import org.commonmark.node.CustomNode;
import org.commonmark.node.Delimited;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Strikethrough extends CustomNode implements Delimited {
    private static final String DELIMITER = "~~";

    @Override // org.commonmark.node.Delimited
    public String getClosingDelimiter() {
        return "~~";
    }

    @Override // org.commonmark.node.Delimited
    public String getOpeningDelimiter() {
        return "~~";
    }
}
