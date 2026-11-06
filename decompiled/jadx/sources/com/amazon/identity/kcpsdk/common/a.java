package com.amazon.identity.kcpsdk.common;

import android.util.Log;
import com.amazon.identity.auth.device.cm;
import com.amazon.identity.auth.device.gr;
import com.amazon.identity.auth.device.yf;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1122a;
    public gr c;
    public boolean e;
    public ParseError b = ParseError.ParseErrorNoError;
    public WebResponseParser$WebResponseParserState d = WebResponseParser$WebResponseParserState.Before_Parse;

    public a(String str) {
        this.f1122a = str;
    }

    public final void a(WebResponseParser$WebResponseParserState webResponseParser$WebResponseParserState) {
        WebResponseParser$WebResponseParserState webResponseParser$WebResponseParserState2 = this.d;
        WebResponseParser$WebResponseParserState webResponseParser$WebResponseParserState3 = WebResponseParser$WebResponseParserState.Before_Parse;
        if (webResponseParser$WebResponseParserState2 != webResponseParser$WebResponseParserState3 && webResponseParser$WebResponseParserState == WebResponseParser$WebResponseParserState.Begin_Parse) {
            Log.e(yf.a("WebResponseParser"), this.f1122a.concat(": beginParse has been called more than once."));
            return;
        }
        if (webResponseParser$WebResponseParserState2 == webResponseParser$WebResponseParserState3) {
            if (webResponseParser$WebResponseParserState == WebResponseParser$WebResponseParserState.Parsing) {
                Log.e(yf.a("WebResponseParser"), this.f1122a.concat(": parseBodyChunk called before beginParse"));
                return;
            } else if (webResponseParser$WebResponseParserState == WebResponseParser$WebResponseParserState.Completed) {
                Log.e(yf.a("WebResponseParser"), this.f1122a.concat(": endParse called before beginParse"));
                return;
            }
        } else if (webResponseParser$WebResponseParserState2 == WebResponseParser$WebResponseParserState.Begin_Parse) {
            if (webResponseParser$WebResponseParserState == WebResponseParser$WebResponseParserState.Completed && d()) {
                this.e = true;
                return;
            } else if (webResponseParser$WebResponseParserState == WebResponseParser$WebResponseParserState.Parsing && !d()) {
                Log.e(yf.a("WebResponseParser"), this.f1122a.concat(": shouldParseBody is false. parseBodyChunk should not be called"));
                return;
            }
        } else if (webResponseParser$WebResponseParserState2 == WebResponseParser$WebResponseParserState.Completed && webResponseParser$WebResponseParserState == WebResponseParser$WebResponseParserState.Parsing) {
            Log.e(yf.a("WebResponseParser"), this.f1122a.concat(": parseBodyChunk called after endParse"));
            return;
        }
        this.d = webResponseParser$WebResponseParserState;
    }

    public abstract void a(byte[] bArr, long j);

    public final ParseError b(byte[] bArr, long j) {
        a(WebResponseParser$WebResponseParserState.Parsing);
        if (this.b != ParseError.ParseErrorNoError) {
            Log.e(yf.a("WebResponseParser"), this.f1122a.concat(": parseBodyChunk: called after another method returned a parse error."));
            return this.b;
        }
        a(bArr, j);
        if (this.b == ParseError.ParseErrorMalformedBody) {
            yf.a("WebResponseParser", "%s: parseBodyChunk: Malformed response. confirm all received data is being properly passed to the parser, device capabilities are set properly, and no server-side behavior changes have occurred.", this.f1122a);
        }
        return this.b;
    }

    public abstract Object b();

    public abstract void c();

    public boolean d() {
        return this.b != ParseError.ParseErrorHttpError;
    }

    public boolean b(gr grVar) {
        return this instanceof cm;
    }

    public final void a(gr grVar) {
        a(WebResponseParser$WebResponseParserState.Begin_Parse);
        this.c = grVar;
        boolean b = b(grVar);
        long j = this.c.c;
        if (j < 200 || j >= 300) {
            yf.a("WebResponseParser", "%s: HTTP Error: %d", this.f1122a, Long.valueOf(j));
            if (b) {
                return;
            }
            a(ParseError.ParseErrorHttpError);
        }
    }

    public final ParseError a() {
        a(WebResponseParser$WebResponseParserState.Completed);
        if (this.b != ParseError.ParseErrorNoError) {
            Log.e(yf.a("WebResponseParser"), this.f1122a.concat(": endParse: called after another method returned a parse error."));
            return this.b;
        }
        c();
        if (this.b == ParseError.ParseErrorMalformedBody) {
            if (this.e) {
                yf.b("WebResponseParser", "%s: endParse called before parseBodyChunk. Confirm that this is by design.", this.f1122a);
            }
            Log.e(yf.a("WebResponseParser"), this.f1122a.concat(": endParse: Malformed response. Confirm all received data is being properly passed to the parser, device capabilities are set properly, and no server-side behavior changes have occurred."));
        }
        return this.b;
    }

    public final void a(ParseError parseError) {
        ParseError parseError2 = this.b;
        if (parseError2 != ParseError.ParseErrorNoError) {
            yf.a("WebResponseParser", "%s: setParseError has been called more than once.  Was %s, Now %s.", this.f1122a, parseError2.name(), parseError.name());
        }
        this.b = parseError;
    }
}
