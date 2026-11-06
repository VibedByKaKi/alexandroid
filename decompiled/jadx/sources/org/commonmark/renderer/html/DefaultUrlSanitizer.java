package org.commonmark.renderer.html;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class DefaultUrlSanitizer implements UrlSanitizer {
    private Set<String> protocols;

    public DefaultUrlSanitizer() {
        this(Arrays.asList("http", "https", "mailto"));
    }

    private boolean isHtmlSpace(int i) {
        return i == 9 || i == 10 || i == 12 || i == 13 || i == 32;
    }

    private String stripHtmlSpaces(String str) {
        int length = str.length();
        while (length > 0 && isHtmlSpace(str.charAt(length - 1))) {
            length--;
        }
        int i = 0;
        while (i < length && isHtmlSpace(str.charAt(i))) {
            i++;
        }
        return (i == 0 && length == str.length()) ? str : str.substring(i, length);
    }

    @Override // org.commonmark.renderer.html.UrlSanitizer
    public String sanitizeImageUrl(String str) {
        return sanitizeLinkUrl(str);
    }

    @Override // org.commonmark.renderer.html.UrlSanitizer
    public String sanitizeLinkUrl(String str) {
        String stripHtmlSpaces = stripHtmlSpaces(str);
        int length = stripHtmlSpaces.length();
        int i = 0;
        while (true) {
            if (i < length) {
                char charAt = stripHtmlSpaces.charAt(i);
                if (charAt == '#' || charAt == '/') {
                    break;
                }
                if (charAt == ':') {
                    if (!this.protocols.contains(stripHtmlSpaces.substring(0, i).toLowerCase())) {
                        return "";
                    }
                } else {
                    if (charAt == '?') {
                        break;
                    }
                    i++;
                }
            } else {
                break;
            }
        }
        return stripHtmlSpaces;
    }

    public DefaultUrlSanitizer(Collection<String> collection) {
        this.protocols = new HashSet(collection);
    }
}
