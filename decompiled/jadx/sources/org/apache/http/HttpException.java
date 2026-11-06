package org.apache.http;

import com.amazon.alexa.ra.core.data.model.Constants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class HttpException extends Exception {
    private static final int FIRST_VALID_CHAR = 32;
    private static final long serialVersionUID = -5437299376222011036L;

    public HttpException(String str, Throwable th) {
        super(clean(str));
        initCause(th);
    }

    public static String clean(String str) {
        char[] charArray = str.toCharArray();
        int i = 0;
        while (i < charArray.length && charArray[i] >= ' ') {
            i++;
        }
        if (i == charArray.length) {
            return str;
        }
        StringBuilder sb = new StringBuilder(charArray.length * 2);
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c = charArray[i2];
            if (c < ' ') {
                sb.append("[0x");
                String hexString = Integer.toHexString(i2);
                if (hexString.length() == 1) {
                    sb.append(Constants.FEEDBACK_TYPE_DISLIKE);
                }
                sb.append(hexString);
                sb.append(MarkdownConstants.RIGHT_BRACKET);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public HttpException(String str) {
        super(clean(str));
    }

    public HttpException() {
    }
}
