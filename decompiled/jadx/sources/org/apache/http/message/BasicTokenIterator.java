package org.apache.http.message;

import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.NoSuchElementException;
import org.apache.http.HeaderIterator;
import org.apache.http.ParseException;
import org.apache.http.TokenIterator;
import org.apache.http.util.Args;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class BasicTokenIterator implements TokenIterator {
    public static final String HTTP_SEPARATORS = " ,;=()<>@:\\\"/[]?{}\t";
    protected String currentHeader;
    protected String currentToken;
    protected final HeaderIterator headerIt;
    protected int searchPos = findNext(-1);

    public BasicTokenIterator(HeaderIterator headerIterator) {
        this.headerIt = (HeaderIterator) Args.notNull(headerIterator, "Header iterator");
    }

    public String createToken(String str, int i, int i2) {
        return str.substring(i, i2);
    }

    public int findNext(int i) throws ParseException {
        int findTokenSeparator;
        if (i >= 0) {
            findTokenSeparator = findTokenSeparator(i);
        } else {
            if (!this.headerIt.hasNext()) {
                return -1;
            }
            this.currentHeader = this.headerIt.nextHeader().getValue();
            findTokenSeparator = 0;
        }
        int findTokenStart = findTokenStart(findTokenSeparator);
        if (findTokenStart < 0) {
            this.currentToken = null;
            return -1;
        }
        int findTokenEnd = findTokenEnd(findTokenStart);
        this.currentToken = createToken(this.currentHeader, findTokenStart, findTokenEnd);
        return findTokenEnd;
    }

    public int findTokenEnd(int i) {
        Args.notNegative(i, "Search position");
        int length = this.currentHeader.length();
        do {
            i++;
            if (i >= length) {
                break;
            }
        } while (isTokenChar(this.currentHeader.charAt(i)));
        return i;
    }

    public int findTokenSeparator(int i) {
        int notNegative = Args.notNegative(i, "Search position");
        int length = this.currentHeader.length();
        boolean z = false;
        while (!z && notNegative < length) {
            char charAt = this.currentHeader.charAt(notNegative);
            if (isTokenSeparator(charAt)) {
                z = true;
            } else {
                if (!isWhitespace(charAt)) {
                    if (isTokenChar(charAt)) {
                        StringBuilder m0m = a$$ExternalSyntheticOutline0.m0m(notNegative, "Tokens without separator (pos ", "): ");
                        m0m.append(this.currentHeader);
                        throw new ParseException(m0m.toString());
                    }
                    StringBuilder m0m2 = a$$ExternalSyntheticOutline0.m0m(notNegative, "Invalid character after token (pos ", "): ");
                    m0m2.append(this.currentHeader);
                    throw new ParseException(m0m2.toString());
                }
                notNegative++;
            }
        }
        return notNegative;
    }

    public int findTokenStart(int i) {
        int notNegative = Args.notNegative(i, "Search position");
        boolean z = false;
        while (!z) {
            String str = this.currentHeader;
            if (str == null) {
                break;
            }
            int length = str.length();
            while (!z && notNegative < length) {
                char charAt = this.currentHeader.charAt(notNegative);
                if (isTokenSeparator(charAt) || isWhitespace(charAt)) {
                    notNegative++;
                } else {
                    if (!isTokenChar(this.currentHeader.charAt(notNegative))) {
                        StringBuilder m0m = a$$ExternalSyntheticOutline0.m0m(notNegative, "Invalid character before token (pos ", "): ");
                        m0m.append(this.currentHeader);
                        throw new ParseException(m0m.toString());
                    }
                    z = true;
                }
            }
            if (!z) {
                if (this.headerIt.hasNext()) {
                    this.currentHeader = this.headerIt.nextHeader().getValue();
                    notNegative = 0;
                } else {
                    this.currentHeader = null;
                }
            }
        }
        if (z) {
            return notNegative;
        }
        return -1;
    }

    @Override // org.apache.http.TokenIterator, java.util.Iterator
    public boolean hasNext() {
        return this.currentToken != null;
    }

    public boolean isHttpSeparator(char c) {
        return HTTP_SEPARATORS.indexOf(c) >= 0;
    }

    public boolean isTokenChar(char c) {
        if (Character.isLetterOrDigit(c)) {
            return true;
        }
        return (Character.isISOControl(c) || isHttpSeparator(c)) ? false : true;
    }

    public boolean isTokenSeparator(char c) {
        return c == ',';
    }

    public boolean isWhitespace(char c) {
        return c == '\t' || Character.isSpaceChar(c);
    }

    @Override // java.util.Iterator
    public final Object next() throws NoSuchElementException, ParseException {
        return nextToken();
    }

    @Override // org.apache.http.TokenIterator
    public String nextToken() throws NoSuchElementException, ParseException {
        String str = this.currentToken;
        if (str != null) {
            this.searchPos = findNext(this.searchPos);
            return str;
        }
        PathKt$$ExternalSyntheticBUOutline0.m("Iteration already finished.");
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }
}
