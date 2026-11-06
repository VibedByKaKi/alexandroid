package com.amazon.identity.auth.device;

import android.util.Log;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ds {

    /* renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f586a = new ByteArrayOutputStream();

    public final Document a() {
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(this.f586a.toByteArray()));
        } catch (IOException e) {
            Log.e(yf.a("XMLParser"), Automotive$$ExternalSyntheticOutline0.m(e, new StringBuilder("Could not parse xml because of an IOException: ")));
            return null;
        } catch (ParserConfigurationException e2) {
            Log.e(yf.a("XMLParser"), "Could not parse xml because of parser configuration issue: " + e2.getMessage());
            return null;
        } catch (SAXException e3) {
            String message = e3.getMessage();
            yf.a("XMLParser", "Could not parse xml because it was invalid: " + message, "RegistrationError:SAXException");
            if (!message.contains("Unexpected end of document")) {
                return null;
            }
            jg.a("RegistrationError:SAXException:UnexpectedEndOfDocument");
            return null;
        }
    }
}
