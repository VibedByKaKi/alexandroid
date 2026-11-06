package androidx.constraintlayout.core.motion.utils;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperjoin.devicesetupserviceandroidclient.Constants;
import dagger.internal.codegen.base.Formatter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class Utils {
    static DebugHandle sOurHandle;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DebugHandle {
        void message(String str);
    }

    private static int clamp(int i) {
        int i2 = (i & (~(i >> 31))) + Constants.RSSI_MIN;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static void log(String str) {
        StackTraceElement stackTraceElement = AppLaunchChecker$$ExternalSyntheticOutline0.m()[1];
        String substring = (stackTraceElement.getMethodName() + "                  ").substring(0, 17);
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + MarkdownConstants.RIGHT_PARENTHESIS + Formatter.INDENT.substring(Integer.toString(stackTraceElement.getLineNumber()).length()) + substring;
        System.out.println(str2 + " " + str);
        DebugHandle debugHandle = sOurHandle;
        if (debugHandle != null) {
            debugHandle.message(str2 + " " + str);
        }
    }

    public static void logStack(String str, int i) {
        StackTraceElement[] m = AppLaunchChecker$$ExternalSyntheticOutline0.m();
        int min = Math.min(i, m.length - 1);
        String str2 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = m[i2];
            String str3 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName();
            str2 = str2.concat(" ");
            System.out.println(str + str2 + str3 + str2);
        }
    }

    public static void loge(String str, String str2) {
        System.err.println(str + " : " + str2);
    }

    public static int rgbaTocColor(float f, float f2, float f3, float f4) {
        int clamp = clamp((int) (f * 255.0f));
        int clamp2 = clamp((int) (f2 * 255.0f));
        return (clamp << 16) | (clamp((int) (f4 * 255.0f)) << 24) | (clamp2 << 8) | clamp((int) (f3 * 255.0f));
    }

    public static void setDebugHandle(DebugHandle debugHandle) {
        sOurHandle = debugHandle;
    }

    public static void socketSend(String str) {
        try {
            OutputStream outputStream = new Socket("127.0.0.1", 5327).getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.close();
        } catch (IOException e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace(MarkdownConstants.LEFT_BRACKET, "   at ").replace(",", "\n   at").replace(MarkdownConstants.RIGHT_BRACKET, ""));
        }
    }

    public int getInterpolatedColor(float[] fArr) {
        return (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public static void log(String str, String str2) {
        System.out.println(str + " : " + str2);
    }
}
