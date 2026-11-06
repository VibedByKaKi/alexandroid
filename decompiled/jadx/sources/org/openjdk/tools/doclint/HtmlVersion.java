package org.openjdk.tools.doclint;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum HtmlVersion {
    HTML4,
    HTML5,
    ALL;

    public static HtmlVersion getHtmlVersion(String str) {
        str.getClass();
        if (str.equals("html4")) {
            return HTML4;
        }
        if (str.equals("html5")) {
            return HTML5;
        }
        return null;
    }
}
